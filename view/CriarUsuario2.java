package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import controle.Faixada;
import exception.SenhaInvalidaEX;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarUsuario2 extends JFrame {

	private JPanel contentPane;
	private JPasswordField admPasswordField;
	private JPasswordField passwordField;
	private JTextField usuarioField;
	private JTextField nameField;

	/**
	 * Create the frame.
	 */
	public CriarUsuario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(35, 30, 70, 15);
		contentPane.add(lblNome);
		
		JLabel lblUsurio = new JLabel("Usuário");
		lblUsurio.setBounds(35, 72, 70, 15);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(35, 116, 70, 15);
		contentPane.add(lblSenha);
		
		JLabel lblSenhaAdm = new JLabel("Senha Adm.");
		lblSenhaAdm.setBounds(35, 159, 84, 15);
		contentPane.add(lblSenhaAdm);
		
		admPasswordField = new JPasswordField();
		admPasswordField.setBounds(145, 155, 180, 19);
		contentPane.add(admPasswordField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 112, 180, 19);
		contentPane.add(passwordField);
		
		usuarioField = new JTextField();
		usuarioField.setBounds(145, 70, 180, 19);
		contentPane.add(usuarioField);
		usuarioField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(145, 26, 180, 19);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(227, 208, 117, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		btnCancelar.setBounds(55, 208, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	public void cadastrar(){
		try {
			Faixada.cadastrarFuncionario(nameField.getText(),
					usuarioField.getText(), passwordField.getText(),
					admPasswordField.getText());
			dispose();
		} catch (SenhaInvalidaEX e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		  }
	}
	
	public void cancelar(){
		dispose();
	}
}
