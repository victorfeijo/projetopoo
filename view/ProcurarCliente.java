package view;

import modelo.*;
import controle.*;

import java.awt.*;
import java.awt.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;


public class ProcurarCliente extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private JLabel label;
	private JLabel lblClientes;
	private JTextField campoPesquisa;
	private JButton okButton;
	private JTable table;
	private  static JPanel searchPanel;
	private  static JPanel matchesPanel;
	private ButtonGroup group;
	private JRadioButton radio;
	
	public ProcurarCliente(){
		setResizable(false);
		table=null;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		label = new JLabel("Procurar");
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(50, 10, 150, 30);
		contentPane.add(label);
		
		label = new JLabel("Pesquisar: ");
		label.setBounds(50,60,150,15);
		contentPane.add(label);
		
		campoPesquisa = new JTextField();
		campoPesquisa.setBounds(150, 60, 243, 19);
		contentPane.add(campoPesquisa);
		campoPesquisa.setColumns(10);
		
		final JRadioButton rdbtnNome = new JRadioButton("Nome");
		rdbtnNome.setBounds(50, 100, 70, 15);
		
		final JRadioButton rdbtnCpf = new JRadioButton("CPF");
		rdbtnCpf.setBounds(150, 100, 70, 15);
		
		final JRadioButton rdbtnProcesso = new JRadioButton("Processo");
		rdbtnProcesso.setBounds(250, 100, 100, 15);
		
		group = new ButtonGroup();
		group.add(rdbtnNome);
		group.add(rdbtnCpf);
		group.add(rdbtnProcesso);
		
		group.setSelected(rdbtnNome.getModel(), true);
		
		contentPane.add(rdbtnNome);
		contentPane.add(rdbtnCpf);
		contentPane.add(rdbtnProcesso);
		
		okButton = new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
				String selection="";
				if(rdbtnNome.isSelected() == true){
					selection = "Nome";
				}
				else if(rdbtnCpf.isSelected() == true){
					selection = "Cpf";
				}
				else if(rdbtnProcesso.isSelected() == true){
					selection = "Processo";
				}
				procurar(campoPesquisa.getText(),selection);
			}
		});
		okButton.setBounds(410, 60, 70, 20);
		contentPane.add(okButton);
		
		
		searchPanel = new JPanel();
        GridBagConstraints constraints;
        GridBagLayout layout = new GridBagLayout();
        searchPanel.setLayout(layout);
		
		 table =
	                new JTable(new DefaultTableModel(new Object[][]{},
	                new String[]{"Nome","CPF","RG"}) {
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        });
		 
		 table.addMouseListener(new MouseAdapter(){
			 public void mouseClicked(MouseEvent evt){
				 int row = table.rowAtPoint(evt.getPoint());
				 //int col = table.columnAtPoint(evt.getPoint());
				 detalhes(row);
				 dispose();
				 
			 }
		 });
	        
	        matchesPanel = new JPanel();
	        matchesPanel.setBorder(
	                BorderFactory.createTitledBorder("Resultados"));
	        matchesPanel.setLayout(new BorderLayout());
	        matchesPanel.add(new JScrollPane(table),
	                BorderLayout.SOUTH);
	        
	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(searchPanel, BorderLayout.CENTER);
	        getContentPane().add(matchesPanel, BorderLayout.SOUTH);
	    }
		
	
	
	public void procurar(String pesquisa,String selection){
		java.util.List<Cliente> clientes = new ArrayList<Cliente>();
		if(selection=="Nome"){
			clientes = Faixada.procurarNome(pesquisa); 
		}
		else if(selection=="Cpf"){
			clientes = Faixada.procurarCpf(pesquisa); 
		}
		else{
			clientes = Faixada.procurarProcesso(pesquisa); 
		}
		
		for(Cliente cliente : clientes){
			DefaultTableModel model =
					(DefaultTableModel) table.getModel();
			model.addRow(new Object[]{cliente.getNome(),cliente.getCpf(),cliente.getRg()});
		}
	}
	public void limpar(){ 
		DefaultTableModel model =
				(DefaultTableModel) table.getModel();
		model.setRowCount(0);
		
	}
	public void detalhes(int row){
		DefaultTableModel model =
				(DefaultTableModel) table.getModel();
		String cpf =(String) model.getValueAt(row, 1);
		Cliente cliente = Faixada.clienteCpfCompleto(cpf);
<<<<<<< HEAD
		Faixada.setClienteAtual(cliente);
		GerenciadorDeJanelas.telaDeDetalhes();
=======
		GerenciadorDeJanelas.telaDeDetalhes(cliente);
>>>>>>> 2ce48b1f41e53c6e458253161c2ab3c1388bf5ae
		
	}
	


	
}