package view;
import modelo.*;
import controle.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import exception.SenhaInvalidaEX;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;
	private JLabel lblUsurio;
	private JLabel lblSenha;
	private JButton btnEntrar;
	private JButton btnCadastrar;;
	/**

	/**
	 * Create the frame.
	 */
	public Login2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginField = new JTextField();
		loginField.setBounds(122, 20, 140, 19);
		contentPane.add(loginField);
		loginField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 51, 140, 19);
		contentPane.add(passwordField);
		
		lblUsurio = new JLabel("Usuário");
		lblUsurio.setBounds(50, 20, 70, 15);
		contentPane.add(lblUsurio);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(50, 51, 70, 15);
		contentPane.add(lblSenha);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				entrar();
			}
		});
		btnEntrar.setBounds(54, 91, 117, 25);
		contentPane.add(btnEntrar);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(225, 91, 117, 25);
		contentPane.add(btnCadastrar);
	}
	
	public void entrar(){
		try {
			Faixada.autentica(loginField.getText(), passwordField.getText());
			dispose();
		}catch(SenhaInvalidaEX e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void cadastrar(){
		GerenciadorDeJanelas.telaCadastroFuncionario();
	}
}
