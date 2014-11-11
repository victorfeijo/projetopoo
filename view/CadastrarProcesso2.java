package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import controle.Faixada;
import exception.CampoVazioEX;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarProcesso2 extends JFrame {

	private JPanel contentPane;
	private JTextField numeroProceField;
	private JTextField comarcaField;
	private JTextField tipoAcaoField;
	private JTextField varaField;
	private JTextField valorTotalPagoField;
	private JTextField parcelamentoField;
	private JTextField dataAjuizaField;
	private JTextField dataAudieField;
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField enderecoField;
	private JTextField obsField;
	private JTextField valorDaCausaField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public CadastrarProcesso2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDoProcesso = new JLabel("Numero do Processo");
		lblNumeroDoProcesso.setBounds(32, 60, 161, 15);
		contentPane.add(lblNumeroDoProcesso);
		
		JLabel lblComarca = new JLabel("Comarca");
		lblComarca.setBounds(32, 87, 70, 15);
		contentPane.add(lblComarca);
		
		JLabel lblVara = new JLabel("Vara");
		lblVara.setBounds(340, 121, 70, 15);
		contentPane.add(lblVara);
		
		JLabel lblTipoDaAo = new JLabel("Tipo da Ação");
		lblTipoDaAo.setBounds(32, 114, 100, 15);
		contentPane.add(lblTipoDaAo);
		
		JLabel lblFoiPago = new JLabel("Foi pago");
		lblFoiPago.setBounds(32, 141, 70, 15);
		contentPane.add(lblFoiPago);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setBounds(116, 137, 62, 23);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNo = new JRadioButton("Não");
		rdbtnNo.setBounds(182, 137, 53, 23);
		contentPane.add(rdbtnNo);
		
		JLabel lblValorTotalPago = new JLabel("Valor Total Pago");
		lblValorTotalPago.setBounds(32, 168, 125, 15);
		contentPane.add(lblValorTotalPago);
		
		JLabel lblParcelamento = new JLabel("Parcelamento");
		lblParcelamento.setBounds(32, 195, 111, 15);
		contentPane.add(lblParcelamento);
		
		JLabel lblDataDeAjuizamento = new JLabel("Data de Ajuizamento");
		lblDataDeAjuizamento.setBounds(32, 222, 161, 15);
		contentPane.add(lblDataDeAjuizamento);
		
		JLabel lblDataDeAudincia = new JLabel("Data de Audiência");
		lblDataDeAudincia.setBounds(32, 249, 143, 15);
		contentPane.add(lblDataDeAudincia);
		
		JLabel lblNomeParteContrria = new JLabel("Parte Contrária");
		lblNomeParteContrria.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNomeParteContrria.setBounds(22, 276, 185, 32);
		contentPane.add(lblNomeParteContrria);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(32, 320, 70, 15);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setBounds(32, 347, 70, 15);
		contentPane.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(32, 374, 70, 15);
		contentPane.add(lblEndereo);
		
		JLabel lblObservaes = new JLabel("Observações");
		lblObservaes.setBounds(355, 320, 100, 15);
		contentPane.add(lblObservaes);
		
		JLabel lblProcesso = new JLabel("Processo");
		lblProcesso.setFont(new Font("Dialog", Font.BOLD, 19));
		lblProcesso.setBounds(22, 12, 161, 32);
		contentPane.add(lblProcesso);
		
		numeroProceField = new JTextField();
		numeroProceField.setBounds(198, 58, 114, 19);
		contentPane.add(numeroProceField);
		numeroProceField.setColumns(10);
		
		comarcaField = new JTextField();
		comarcaField.setBounds(120, 85, 192, 19);
		contentPane.add(comarcaField);
		comarcaField.setColumns(10);
		
		tipoAcaoField = new JTextField();
		tipoAcaoField.setBounds(146, 112, 166, 19);
		contentPane.add(tipoAcaoField);
		tipoAcaoField.setColumns(10);
		
		varaField = new JTextField();
		varaField.setBounds(407, 121, 172, 19);
		contentPane.add(varaField);
		varaField.setColumns(10);
		
		valorTotalPagoField = new JTextField();
		valorTotalPagoField.setBounds(175, 168, 137, 19);
		contentPane.add(valorTotalPagoField);
		valorTotalPagoField.setColumns(10);
		
		parcelamentoField = new JTextField();
		parcelamentoField.setBounds(161, 195, 151, 19);
		contentPane.add(parcelamentoField);
		parcelamentoField.setColumns(10);
		
		dataAjuizaField = new JTextField();
		dataAjuizaField.setBounds(198, 220, 114, 19);
		contentPane.add(dataAjuizaField);
		dataAjuizaField.setColumns(10);
		
		dataAudieField = new JTextField();
		dataAudieField.setBounds(198, 247, 114, 19);
		contentPane.add(dataAudieField);
		dataAudieField.setColumns(10);
		
		nomeField = new JTextField();
		nomeField.setBounds(116, 320, 211, 19);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		cpfField = new JTextField();
		cpfField.setBounds(116, 345, 114, 19);
		contentPane.add(cpfField);
		cpfField.setColumns(10);
		
		enderecoField = new JTextField();
		enderecoField.setBounds(116, 372, 114, 19);
		contentPane.add(enderecoField);
		enderecoField.setColumns(10);
		
		obsField = new JTextField();
		obsField.setBounds(365, 345, 190, 70);
		contentPane.add(obsField);
		obsField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelar();
			}
		});
		btnCancelar.setBounds(133, 439, 117, 25);
		contentPane.add(btnCancelar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionar();
			}
		});
		btnAdicionar.setBounds(383, 439, 117, 25);
		contentPane.add(btnAdicionar);
		
		JLabel lblValorDaCausa = new JLabel("Valor da Causa");
		lblValorDaCausa.setBounds(340, 94, 111, 15);
		contentPane.add(lblValorDaCausa);
		
		valorDaCausaField = new JTextField();
		valorDaCausaField.setBounds(465, 90, 114, 19);
		contentPane.add(valorDaCausaField);
		valorDaCausaField.setColumns(10);
	}
	
	public void cancelar(){
		dispose();
	}
	public void adicionar(){
		
		try{Faixada.cadastrarProcesso(numeroProceField.getText(), comarcaField.getText(),
				tipoAcaoField.getText(), valorDaCausaField.getText(), varaField.getText(),
				true, // arrumar radio button, caso clicado em sim, manda true, else false
				Double.parseDouble(valorTotalPagoField.getText()), parcelamentoField.getText(), dataAjuizaField.getText(),
				dataAudieField.getText(), nomeField.getText(), cpfField.getText(), enderecoField.getText(),
				obsField.getText());
		dispose();
		JOptionPane.showMessageDialog(null, "O cadastro do Processo foi realizado com sucesso!");
		}
		catch(CampoVazioEX e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
}
