package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuerContinuar extends JFrame {

	private JButton sim, nao;
	private Container container;
	private FlowLayout layout;
	private JLabel labelInformacao;

	public QuerContinuar() {

		super("Cadastrar Usuário ");
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);

		labelInformacao = new JLabel("Tem certeza dos dados?", SwingConstants.CENTER);
		container.add(labelInformacao);


		sim = new JButton("Sim");
		sim.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				//Metodo para criar cliente
				CadastrarProcesso application = new CadastrarProcesso();
				application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				dispose();
			}
		});

		container.add(sim);

		nao = new JButton("Não");
		nao.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				
				dispose();

			}
		});

		container.add(nao);

		setSize(325, 95);
		setLocation(350, 350);
		setVisible(true);

	}
}