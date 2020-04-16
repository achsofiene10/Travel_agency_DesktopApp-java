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

public class NewRes extends JFrame implements ActionListener{
	JTextField txt1;
	JTextField txt2;
	JTextField txt4;
	JTextField txt5;
	JTextField txt6;
	JTextField txt7;
	JTextField txt8;
	ButtonGroup btngroup;
	JButton btnX ;
	JLabel label;
	JLabel lblNewLabel ;
	JPanel trait;
	JLabel lblVotreVoyage ;
	JLabel lblDestionation ;
	JLabel lblConfirmezLadresseEmail ;
	JLabel lblNewLabel_1 ;
	JLabel lblNom;
	JButton btnajouter ;
	JLabel lblNumeroDeTlphone;
	JLabel lblAdresseEmail ;
	JLabel lblAdresse ;
	
	String prix;
	String arrive;
	JTextField txt9;
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
	private JTextField txt10;
	Monmodel1 m;
	private JTextField txt11;
	

	public NewRes(Monmodel1 m) {
		this.m=m;
		initialize();	

	}
	
	
	void initialize() {
		btnX = new JButton("X");
		label = new JLabel("SHvoyages ");
		lblNewLabel = new JLabel("");
		trait = new JPanel();
		lblVotreVoyage = new JLabel("Ajouter une nouvelle reservation\r\n");
		lblDestionation = new JLabel("Destination\r\n");
		txt1 = new JTextField();
		txt1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt2 = new JTextField();
		txt2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblConfirmezLadresseEmail = new JLabel("Destination");
		lblNom = new JLabel("Origine");
		txt9 = new JTextField();
		btnajouter = new JButton("Ajouter ");
		lblNumeroDeTlphone = new JLabel("Dur\u00E9e de vol");
		txt4 = new JTextField();
		txt4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblAdresseEmail = new JLabel("Email");
		txt7 = new JTextField();
		txt7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt5 = new JTextField();
		txt5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt8 = new JTextField();
		txt8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblAdresse = new JLabel("Date de d\u00E9part");
		
		
		this.setBounds(400, 100, 700, 500);
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

		txt1.setBounds(463, 20, 144, 31);
		getContentPane().add(txt1);
		txt1.setColumns(10);

		txt2.setColumns(10);
		txt2.setBounds(50, 115, 213, 31);
		getContentPane().add(txt2);

		lblNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNom.setBounds(50, 145, 112, 25);
		getContentPane().add(lblNom);

		txt4.setColumns(10);
		txt4.setBounds(50, 170, 213, 31);
		getContentPane().add(txt4);

		txt5.setColumns(10);
		txt5.setBounds(363, 170, 213, 31);
		getContentPane().add(txt5);

		lblAdresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresseEmail.setBounds(50, 92, 261, 25);
		getContentPane().add(lblAdresseEmail);

		lblConfirmezLadresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblConfirmezLadresseEmail.setBounds(363, 145, 238, 25);
		getContentPane().add(lblConfirmezLadresseEmail);

		txt6 = new JTextField();
		txt6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt6.setColumns(10);
		txt6.setBounds(50, 233, 213, 31);
		getContentPane().add(txt6);

		lblAdresse.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresse.setBounds(50, 211, 128, 25);
		getContentPane().add(lblAdresse);

		txt7.setColumns(10);
		txt7.setBounds(363, 233, 213, 31);
		getContentPane().add(txt7);

		JLabel lblVille = new JLabel("Date de retour");
		lblVille.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblVille.setBounds(363, 211, 150, 25);
		getContentPane().add(lblVille);

		txt8.setColumns(10);
		txt8.setBounds(50, 300, 213, 31);
		getContentPane().add(txt8);

		lblNumeroDeTlphone.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumeroDeTlphone.setBounds(50, 274, 218, 25);
		getContentPane().add(lblNumeroDeTlphone);

		btnajouter.setOpaque(true);
		btnajouter.setForeground(Color.WHITE);
		btnajouter.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnajouter.setBackground(new Color(102, 153, 102));
		btnajouter.setBounds(218, 459, 238, 31);
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
		
		txt9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt9.setColumns(10);
		txt9.setBounds(358, 300, 213, 31);
		getContentPane().add(txt9);
		
		JLabel lblNumroDuPassport = new JLabel("Passport num:");
		lblNumroDuPassport.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumroDuPassport.setBounds(358, 274, 218, 25);
		getContentPane().add(lblNumroDuPassport);
		lblNewLabel_1 = new JLabel("Reservation num :");
		lblNewLabel_1.setBounds(303, 20, 150, 27);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));

		lblMinutesDeVol = new JLabel("Numero de vol");
		lblMinutesDeVol.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblMinutesDeVol.setBounds(363, 92, 218, 25);
		getContentPane().add(lblMinutesDeVol);

		txt3 = new JTextField();
		txt3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt3.setColumns(10);
		txt3.setBounds(363, 115, 213, 31);
		getContentPane().add(txt3);

		JLabel lblPrixBillet = new JLabel("Nom et prenom");
		lblPrixBillet.setForeground(new Color(0, 0, 128));
		lblPrixBillet.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblPrixBillet.setBounds(50, 356, 218, 25);
		getContentPane().add(lblPrixBillet);

		txt10 = new JTextField();
		txt10.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt10.setColumns(10);
		txt10.setBounds(50, 391, 213, 31);
		getContentPane().add(txt10);
		
		txt11 = new JTextField();
		txt11.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txt11.setColumns(10);
		txt11.setBounds(358, 391, 213, 31);
		getContentPane().add(txt11);
		
		JLabel txtcom = new JLabel("Compagnie aerienne");
		txtcom.setForeground(new Color(0, 0, 128));
		txtcom.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		txtcom.setBounds(358, 356, 218, 25);
		getContentPane().add(txtcom);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnajouter) {
			if (txt2.getText().isEmpty() || txt7.getText().isEmpty() || txt6.getText().isEmpty() || txt5.getText().isEmpty() || 
					txt8.getText().isEmpty() || txt3.getText().isEmpty() || txt9.getText().isEmpty() || txt4.getText().isEmpty() || txt10.getText().isEmpty() ||  
					 txt1.getText().isEmpty() ){
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
			
				Object t1[]= {txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(),
						txt11.getText(),txt6.getText(),txt7.getText(),txt8.getText(),txt9.getText(),txt10.getText()};
				m.ajouter(t1);
				Window[] windows = getWindows();
				for (Window window : windows)
			    {
			        if (window instanceof JFrame)
			        {
			            window.dispose();
			        }
			    }
				ReservationsEdit v=new ReservationsEdit();
				v.setVisible(true);
				m.fireTableDataChanged();
			}
		}
	}
}
