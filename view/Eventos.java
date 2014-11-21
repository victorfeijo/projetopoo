package view;

import modelo.*;
import controle.*;

import java.awt.*;
import java.awt.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class Eventos extends JFrame{

	private JPanel contentPane;
	private JLabel label;
	private JTable table;
	private JScrollPane scrollPane;
	private static final EscritorioDeAdvocacia escritorio = new EscritorioDeAdvocacia();
	
	public Eventos(){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Eventos");
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(50, 20, 100, 50);
		contentPane.add(label);
		
		String[] nomeColunas = {
				"Data","Processo","Nome","Parte Contrária","Pagamento"
		};
		
		
		String[][] dados = {
				{"null","null","null","null","null"},
				{"null","null","null","null","null"},
				{"null","null","null","null","null"},
				{"null","null","null","null","null"}
		};
		
		table = new JTable(dados,nomeColunas);
		//table.setPreferredScrollableViewportSize(new Dimension(500,50));
		//table.setFillsViewportHeight(true);
		
		scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		
		contentPane.add(scrollPane);
		contentPane.add(table);
		
	}
}
