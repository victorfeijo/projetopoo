package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadastrarCliente extends JFrame {
	private JTextField nameField, cpfField, telefoneField, rgField, enderecoField, emailField ;
	private JButton cancelar, proximo;
	private Container container;
	private FlowLayout layout;
	private JLabel labelName, labelCpf, labelTelefone, labelRg, labelEndereco, labelEmail;

	public CadastrarCliente() {

		super("Cadastrar Cliente");
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);

		// Nome
		labelName = new JLabel("Nome    ");
		container.add(labelName);

		nameField = new JTextField(17);
		container.add(nameField);

		// CPF/CNPJ
		labelCpf = new JLabel("CPF/CNPJ");
		container.add(labelCpf);

		cpfField = new JTextField(17);
		container.add(cpfField);

		// Telefone
		labelTelefone = new JLabel("Telefone");
		container.add(labelTelefone);

		telefoneField = new JTextField(17);
		container.add(telefoneField);

		// RG
		labelRg = new JLabel("RG      ");
		container.add(labelRg);

		rgField = new JTextField(17);
		container.add(rgField);
		
		// Endereco
		labelEndereco = new JLabel("Endereço");
		container.add(labelEndereco);

		enderecoField = new JTextField(17);
		container.add(enderecoField);
		
		// Email
		labelEmail = new JLabel("Email   ");
		container.add(labelEmail);

		emailField = new JTextField(17);
		container.add(emailField);
		

		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});

		container.add(cancelar);

		proximo = new JButton("Pŕoximo");
		proximo.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				//método da mestre para receber dados do clientes, e criar processo
				QuerContinuar application = new QuerContinuar();
				application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});

		container.add(proximo);

		setSize(217, 300);
		setLocation(450, 350);
		setVisible(true);

	}

}