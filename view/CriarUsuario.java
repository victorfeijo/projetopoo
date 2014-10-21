package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.Faixada;
import exception.SenhaInvalidaEX;

public class CriarUsuario extends JFrame {
	private JTextField nameField, loginField;
	private JPasswordField passwordField, admPassField;
	private JButton cancelar, criarFuncionario;
	private Container container;
	private FlowLayout layout;
	private JLabel labelName, labelLogin, labelPassword, labelAdmPass;

	public CriarUsuario() {

		super("Criar Usuário");
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);

		// Nome
		labelName = new JLabel("Nome");
		container.add(labelName);

		nameField = new JTextField(20);
		container.add(nameField);

		// Login
		labelLogin = new JLabel("Usuário");
		container.add(labelLogin);

		loginField = new JTextField(17);
		container.add(loginField);

		// Password
		labelPassword = new JLabel("Senha");
		container.add(labelPassword);

		passwordField = new JPasswordField(17);
		container.add(passwordField);

		// Password Administrador
		labelAdmPass = new JLabel("Senha do Administrador");
		container.add(labelAdmPass);

		admPassField = new JPasswordField(17);
		container.add(admPassField);

		criarFuncionario = new JButton("Criar Funcionário(a)");
		criarFuncionario.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				cadastrarFuncionario();
			}
		});

		container.add(criarFuncionario);

		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});

		container.add(cancelar);

		setSize(235, 250);
		setLocation(450, 350);
		setVisible(true);

	}

	public void cadastrarFuncionario() {
		try {
			Faixada.cadastrarFuncionario(nameField.getText(),
					loginField.getText(), passwordField.getText(),
					admPassField.getText());
			dispose();
		} catch (SenhaInvalidaEX e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}