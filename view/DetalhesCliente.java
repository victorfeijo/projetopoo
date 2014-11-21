package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.Faixada;
import controle.GerenciadorDeJanelas;

import modelo.Cliente;
import modelo.EscritorioDeAdvocacia;
import modelo.Processo;

public class DetalhesCliente extends JFrame{
	
		private JPanel contentPane;
		private JPanel processPane;
		private JPanel matchesPanel;
		private JButton adcionarProcesso;
		private JButton removerCliente;
		private JLabel label;
		private JTable table;
		private Cliente clienteDetalhado;
		
		
	public DetalhesCliente(Cliente cliente){
	
		this.clienteDetalhado = cliente;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 50, 700, 700);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel(""+cliente.getNome());
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(50, 20, 500, 50);
		contentPane.add(label);
		
		label = new JLabel("Nome: "+cliente.getNome());
		label.setBounds(50, 60, 700, 50);
		contentPane.add(label);
		
		label = new JLabel("Telefone: "+cliente.getTelefone());
		label.setBounds(50, 80, 700, 50);
		contentPane.add(label);
		
		label = new JLabel("CPF: "+cliente.getCpf());
		label.setBounds(50, 100, 700, 50);
		contentPane.add(label);
		
		label = new JLabel("RG: "+cliente.getRg());
		label.setBounds(50, 120, 700, 50);
		contentPane.add(label);
		
		label = new JLabel("Endereço: "+cliente.getEndereco());
		label.setBounds(50, 140, 700, 50);
		contentPane.add(label);
		
		label = new JLabel("E-mail: "+cliente.getEmail());
		label.setBounds(50, 160, 700, 50);
		contentPane.add(label);
		
		adcionarProcesso = new JButton("Novo Processo");
		adcionarProcesso.setFont(new Font("Dialog", Font.PLAIN, 12));
		adcionarProcesso.setBounds(50, 200, 150, 20);
		adcionarProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					GerenciadorDeJanelas.telaCadastroDeProcesso();
					dispose();
				}
			});
		contentPane.add(adcionarProcesso);
		
		removerCliente = new JButton("Remover Cliente");
		removerCliente.setFont(new Font("Dialog", Font.BOLD, 12));
		removerCliente.setBounds(500, 20, 150, 20);
		removerCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(
					    contentPane,
					    "Tem certeza que deseja remover cliente?",
					    "Deletar Cliente",
					    JOptionPane.YES_NO_OPTION);
				if (resp==0){
					Faixada.removerCliente(clienteDetalhado);
					dispose();
				}
				else{	
				}
				
				}
			});
		contentPane.add(removerCliente);
		
		processPane = new JPanel();
        GridBagConstraints constraints;
        GridBagLayout layout = new GridBagLayout();
        processPane.setLayout(layout);
		
		 table =
	                new JTable(new DefaultTableModel(new Object[][]{},
	                new String[]{"Processos","Data Audiência"}) {
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        });
		 
		 populateTable(cliente);
		 
		 	matchesPanel = new JPanel();
		 	matchesPanel.setBorder(
	                BorderFactory.createTitledBorder("Processos"));
		 	matchesPanel.setLayout(new BorderLayout());
		 	matchesPanel.add(new JScrollPane(table));
	        
	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(processPane, BorderLayout.CENTER);
	        getContentPane().add(matchesPanel, BorderLayout.SOUTH);
		
	}


	private void populateTable(Cliente cliente) {
		java.util.List<Processo> listaProcessos = cliente.getProcessos();
		for(Processo processo : listaProcessos){
			DefaultTableModel model =
					(DefaultTableModel) table.getModel();
			model.addRow(new Object[]{processo.getNumero(),processo.getDatasDoProcesso().getDataDeAudiencia()});
		}
		
		
	}
}
