package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadastrarProcesso extends JFrame {
	private JTextField numeroField, comarcaField, tipoDeAcaoField, valorField,
			dataDeAjuizamentoField, dataDeAudienciaField, parcelamentoField,
			valorTotalPagoField, nomePCField, cpfPCField, enderecoPCField;
	private JButton cancelar, cadastrar;
	private JComboBox<String> foiPago;
	private Container container, containerBotao;
	private FlowLayout layout;
	private JLabel numeroLabel, comarcaLabel, tipoDeAcaoLabel, valorLabel,
			dataDeAjuizamentoLabel, dataDeAudienciaLabel, parcelamentoLabel,
			valorTotalPagoLabel, foiPagoLabel, nomePCLabel, cpfPCLabel,
			enderecoPCLabel;

	public CadastrarProcesso() {

		super("Cadastrar Processo");
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);

		containerBotao = getContentPane();
		containerBotao.setLayout(layout);

		// Numero
		numeroLabel = new JLabel("Numero");
		container.add(numeroLabel);

		numeroField = new JTextField(12);
		container.add(numeroField);

		// Comarca
		comarcaLabel = new JLabel("Comarca");
		container.add(comarcaLabel);

		comarcaField = new JTextField(17);
		container.add(comarcaField);

		// TipoDeAçao
		tipoDeAcaoLabel = new JLabel("Tipo de Ação");
		container.add(tipoDeAcaoLabel);

		tipoDeAcaoField = new JTextField(17);
		container.add(tipoDeAcaoField);

		// Data de Ajuizamento
		dataDeAjuizamentoLabel = new JLabel("Data de Ajuizamento");
		container.add(dataDeAjuizamentoLabel);

		dataDeAjuizamentoField = new JTextField(5);
		container.add(dataDeAjuizamentoField);

		// Data de Audiência
		dataDeAudienciaLabel = new JLabel("Data de Audiência");
		container.add(dataDeAudienciaLabel);

		dataDeAudienciaField = new JTextField(5);
		container.add(dataDeAudienciaField);

		// Valor do Processo
		valorLabel = new JLabel("Valor do Processo");
		container.add(valorLabel);

		valorField = new JTextField(5);
		container.add(valorField);

		// Foi Pago
		foiPagoLabel = new JLabel("Foi pago");
		container.add(foiPagoLabel);

		String[] choices = { "Sim", "Não" };
		foiPago = new JComboBox<String>(choices);
		container.add(foiPago);

		// Parcelamento do Processo
		parcelamentoLabel = new JLabel("Parcelamento");
		container.add(parcelamentoLabel);

		parcelamentoField = new JTextField(10);
		container.add(parcelamentoField);

		// Valor total Pago
		valorTotalPagoLabel = new JLabel("Valor Total Pago");
		container.add(valorTotalPagoLabel);

		valorTotalPagoField = new JTextField(5);
		container.add(valorTotalPagoField);

		// Nome Parte Contrária
		nomePCLabel = new JLabel("Nome Parte Contrária");
		container.add(nomePCLabel);

		nomePCField = new JTextField(17);
		container.add(nomePCField);

		// CPF Parte Contrária
		cpfPCLabel = new JLabel("CPF/CNPJ Parte Contrária");
		container.add(cpfPCLabel);

		cpfPCField = new JTextField(10);
		container.add(cpfPCField);

		// Endereço Parte Contrária
		enderecoPCLabel = new JLabel("Endereço Parte Contrária");
		container.add(enderecoPCLabel);

		enderecoPCField = new JTextField(20);
		container.add(enderecoPCField);

		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});

		containerBotao.add(cancelar);

		cadastrar = new JButton("Cadastrar Processo");
		cadastrar.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				// método da mestre para receber dados do clientes, e criar
				// processo
				MostreMensagem application = new MostreMensagem(
						"O processo foi cadastrador com sucesso!",
						"Cadastrar Processo");
				application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				dispose();

			}
		});

		containerBotao.add(cadastrar);

		setSize(770, 170);
		setLocation(450, 350);
		setVisible(true);

	}

}