package view;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MostreMensagem extends JFrame{
	private JLabel mostrador;
	private JButton ok;
	private Container container;
	private FlowLayout layout;
	
	public MostreMensagem(String mensagem, String titulo){
		
		super(titulo);
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);
		
		mostrador = new JLabel(mensagem);
		container.add(mostrador);
		
		ok = new JButton("OK");
		ok.addActionListener(

		new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
		
		container.add(ok);
		
		setSize(300, 70);
		setLocation(450, 350);
		setVisible(true);
	}

}
