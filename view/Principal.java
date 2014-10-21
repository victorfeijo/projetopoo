package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame {
	
	private JButton adicionarCliente, procurarCliente, audiencias;
	private Container container;
	private FlowLayout layout;
	private JLabel labelLogo, labelUsuario;

	public Principal(){
		
		super( "Advocacia" );
		layout = new FlowLayout();

		container = getContentPane();
		container.setLayout(layout);
		
		labelUsuario = new JLabel("Nome: " + "Algum Usuario"); //MestreView retorna usuario atual
		container.add(labelUsuario);
		
		Icon logo = new ImageIcon( "logo.jpg" );
		labelLogo = new JLabel( logo, SwingConstants.RIGHT);
		container.add(labelLogo);

		adicionarCliente = new JButton ( "Cadastrar Cliente" );
		adicionarCliente.addActionListener(

			new ActionListener(){

				public void actionPerformed (ActionEvent event){
					// metodo da ViewMestre que adiconar cliente
					CadastrarCliente application = new CadastrarCliente();
					application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			}
			);

		container.add( adicionarCliente );
		
		procurarCliente = new JButton( "Procurar Cliente" );
		procurarCliente.addActionListener(

			new ActionListener(){

				public void actionPerformed( ActionEvent event){
					//metodo da MestreView que procurar cliente
				}
			}
			);

		container.add(procurarCliente);
		
		audiencias = new JButton( "Audiências" );
		audiencias.addActionListener(

			new ActionListener(){

				public void actionPerformed( ActionEvent event){
					//metodo da MestreView que mostra a listra de próximas audiências
				}
			}
			);

		container.add(audiencias);
		
		
		setSize( 900, 600 );
		setLocation(450, 350);
		setVisible ( true ); 

	}
	
}