package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {

	private JTextField loginField;
	private JPasswordField passwordField;
	private JButton entrar, criarFuncionario;
	private Container container;
	private FlowLayout layout;
	private JLabel labelLogin, labelPassword;

	public Login() {

		super("Login  ");
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);

		labelLogin = new JLabel("Usuário");
		container.add(labelLogin);

		loginField = new JTextField(20);
		container.add(loginField);

		labelPassword = new JLabel("Senha");
		container.add(labelPassword);

		passwordField = new JPasswordField(17);
		container.add(passwordField);

		entrar = new JButton("Entrar");
		entrar.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				String login = loginField.getText();
				char[] password = passwordField.getPassword();
				String realPassword = new String(password);
				// metodo da ViewMestre que recebe usuario e senha
				dispose();
				Principal application = new Principal();

				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});

		container.add(entrar);

		criarFuncionario = new JButton("Criar Funcionário(a)");
		criarFuncionario.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				// Cmetodo da ViewMestre que abre a janela de criação de
				// funcionario
				CriarUsuario application = new CriarUsuario();

				application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});

		container.add(criarFuncionario);

		setSize(325, 95);
		setLocation(350, 350);
		setVisible(true);

	}

	public static void main(String[] args) {

		Login application = new Login();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}