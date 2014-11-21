package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Faixada;
import controle.GerenciadorDeJanelas;

public class Principal2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Icon logo = new ImageIcon("logo.jpg");
		JLabel label = new JLabel(logo);
		label.setBounds(35, 63, 634, 342);
		contentPane.add(label);

		JButton btnAdicionarCliente = new JButton("Adicionar Cliente");
		btnAdicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarCliente();
			}
		});
		btnAdicionarCliente.setBounds(55, 432, 161, 25);
		contentPane.add(btnAdicionarCliente);

		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurar();
			}
		});
		btnProcurar.setBounds(271, 432, 161, 25);
		contentPane.add(btnProcurar);

		JButton btnEventos = new JButton("Eventos");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventos();
			}
		});
		btnEventos.setBounds(487, 432, 161, 25);
		contentPane.add(btnEventos);

		JLabel usuarioAtual = new JLabel(Faixada.getUsuarioAtual().getNome());
		usuarioAtual.setFont(new Font("Serif", Font.ITALIC, 16));
		usuarioAtual.setBounds(268, 12, 292, 15);
		contentPane.add(usuarioAtual);

		Calendar c = Calendar.getInstance();
		JLabel lblDate = new JLabel(c.get(Calendar.DAY_OF_MONTH) + "/"
				+ c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
		lblDate.setFont(new Font("Serif", Font.ITALIC, 16));
		lblDate.setBounds(579, 13, 100, 15);
		contentPane.add(lblDate);
	}

	public void adicionarCliente() {
		GerenciadorDeJanelas.telaCadastroDeCliente();
	}

	public void procurar() {
		GerenciadorDeJanelas.telaDeProcura();

	}

	public void eventos() {
		GerenciadorDeJanelas.telaDeEventos();
	}
}
