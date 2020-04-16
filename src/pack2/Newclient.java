package pack2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Newclient extends JFrame implements ActionListener{
	JTextField txt2;
	JTextField txt4;
	ButtonGroup btngroup;
	JButton btnX ;
	JLabel label;
	JLabel lblNewLabel ;
	JPanel trait;
	JLabel lblVotreVoyage ;
	JLabel lblDestionation ;
	JLabel lblNom;
	JButton btnajouter ;
	JLabel lblAdresseEmail ;
	String prix;
	String arrive;
	boolean simple=true;
	String numvol;
	String email;
	String depart;
	String datealler;
	String dateretour;
	String duree;
	String compagny;
	String temps;
	private JLabel lblMinutesDeVol;
	private JTextField txt3;
	Monmodel2 m;
	

	public Newclient(Monmodel2 m) {
		this.m=m;
		initialize();	

	}
	
	
	void initialize() {
		btnX = new JButton("X");
		label = new JLabel("SHvoyages ");
		lblNewLabel = new JLabel("");
		trait = new JPanel();
		lblVotreVoyage = new JLabel("Ajouter un nouveau client\r\n\r\n");
		lblDestionation = new JLabel("Destination\r\n");
		txt2 = new JTextField();
		txt2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblNom = new JLabel("Mot de passe");
		btnajouter = new JButton("Ajouter ");
		txt4 = new JTextField();
		txt4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblAdresseEmail = new JLabel("ID client");
		
		
		this.setBounds(400, 100, 700, 300);
		this.setUndecorated(true);
		getContentPane().setBackground(new Color(245, 245, 245));
		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 153, 102)));
		getContentPane().setLayout(null);
		btngroup=new ButtonGroup();		

		label.setForeground(new Color(102, 153, 102));
		label.setFont(new Font("Times New Roman", Font.BOLD, 40));
		label.setBounds(64, 0, 247, 56);
		getContentPane().add(label);

		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\airplane-shape.png"));
		lblNewLabel.setBounds(24, 9, 82, 38);
		getContentPane().add(lblNewLabel);

		trait.setBackground(new Color(102, 153, 102));
		trait.setBounds(50, 54, 600, 2);
		getContentPane().add(trait);

		lblVotreVoyage.setForeground(Color.BLACK);
		lblVotreVoyage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblVotreVoyage.setBounds(34, 66, 388, 25);
		getContentPane().add(lblVotreVoyage);

		lblDestionation.setForeground(Color.BLACK);
		lblDestionation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDestionation.setBounds(166, 66, 112, 25);
		getContentPane().add(lblDestionation);

		txt2.setColumns(10);
		txt2.setBounds(50, 115, 213, 31);
		getContentPane().add(txt2);

		lblNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNom.setBounds(50, 145, 112, 25);
		getContentPane().add(lblNom);

		txt4.setColumns(10);
		txt4.setBounds(50, 170, 213, 31);
		getContentPane().add(txt4);

		lblAdresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresseEmail.setBounds(50, 92, 261, 25);
		getContentPane().add(lblAdresseEmail);

		btnajouter.setOpaque(true);
		btnajouter.setForeground(Color.WHITE);
		btnajouter.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnajouter.setBackground(new Color(102, 153, 102));
		btnajouter.setBounds(198, 221, 238, 31);
		getContentPane().add(btnajouter);


		btnX.setForeground(new Color(102, 153, 102));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.setBackground(new Color(245, 245, 245));
		btnX.setBounds(658, 0, 42, 25);
		btnX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==btnX) {
					dispose();
				}
			}
		});
		getContentPane().add(btnX);

		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setBorder(emptyBorder);
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.addActionListener(this);
		btnajouter.addActionListener(this);
		lblDestionation.setText(this.arrive);

		lblMinutesDeVol = new JLabel("Email");
		lblMinutesDeVol.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblMinutesDeVol.setBounds(363, 92, 218, 25);
		getContentPane().add(lblMinutesDeVol);

		txt3 = new JTextField();
		txt3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt3.setColumns(10);
		txt3.setBounds(363, 115, 213, 31);
		getContentPane().add(txt3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnajouter) {
			if (txt2.getText().isEmpty() || txt3.getText().isEmpty() || txt4.getText().isEmpty()  ){
						JOptionPane.showMessageDialog(null, "veuillez remplir toutes les champs");
					}
			else {
				/* Window[] windows = getWindows();
					for (Window window : windows)
				    {
				        if (window instanceof JFrame)
				        {
				            window.dispose();
				        }
				    }*/
			
				Object t1[]= {txt2.getText(),txt3.getText(),txt4.getText(),"0"};
				m.ajouter(t1);
				Window[] windows = getWindows();
				for (Window window : windows)
			    {
			        if (window instanceof JFrame)
			        {
			            window.dispose();
			        }
			    }
				ClientsEdit v=new ClientsEdit();
				v.setVisible(true);
				m.fireTableDataChanged();
			}
		}
	}
}
