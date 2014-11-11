package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.Faixada;
import controle.GerenciadorDeJanelas;
import exception.CampoVazioEX;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarCliente2 extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField cpfFied;
	private JTextField rgField;
	private JTextField telefoneField;
	private JTextField enderecoField;
	private JTextField emailField;

	/**
	 * Create the frame.
	 */
	public CadastrarCliente2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(35, 22, 70, 15);
		contentPane.add(lblNome);

		JLabel lblCpf = new JLabel("CPF/CNPJ");
		lblCpf.setBounds(35, 74, 70, 15);
		contentPane.add(lblCpf);

		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setBounds(35, 178, 70, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setBounds(35, 230, 70, 15);
		contentPane.add(lblNewLabel_1);

		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(35, 126, 70, 15);
		contentPane.add(lblRg);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(35, 282, 70, 15);
		contentPane.add(lblEmail);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastrar();
			}
		});
		btnNewButton.setBounds(271, 327, 117, 25);
		contentPane.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		btnCancelar.setBounds(77, 327, 117, 25);
		contentPane.add(btnCancelar);

		nomeField = new JTextField();
		nomeField.setBounds(145, 20, 243, 19);
		contentPane.add(nomeField);
		nomeField.setColumns(10);

		cpfFied = new JTextField();
		cpfFied.setBounds(145, 72, 243, 19);
		contentPane.add(cpfFied);
		cpfFied.setColumns(10);

		rgField = new JTextField();
		rgField.setBounds(145, 124, 243, 19);
		contentPane.add(rgField);
		rgField.setColumns(10);

		telefoneField = new JTextField();
		telefoneField.setBounds(145, 176, 243, 19);
		contentPane.add(telefoneField);
		telefoneField.setColumns(10);

		enderecoField = new JTextField();
		enderecoField.setBounds(145, 228, 243, 19);
		contentPane.add(enderecoField);
		enderecoField.setColumns(10);

		emailField = new JTextField();
		emailField.setBounds(145, 280, 243, 19);
		contentPane.add(emailField);
		emailField.setColumns(10);
	}

	public void cadastrar(){
		try {
			Faixada.cadastrarCliente(nomeField.getText(), cpfFied.getText(), rgField.getText(),
				telefoneField.getText(), enderecoField.getText(), emailField.getText());
		GerenciadorDeJanelas.telaCadastroDeProcesso();
		dispose();
		}
		catch (CampoVazioEX e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
			
	}

	public void cancelar() {
		dispose();
	}
}
