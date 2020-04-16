package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

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
import javax.swing.UIManager;

public class Payment extends JFrame implements ActionListener{
	 JTextField Numcarte;
	 JTextField nomcarte;
	 JTextField codecarte;
	JButton btnX ;
	JLabel label;
	JLabel lblNewLabel ;
	JPanel trait;
	JLabel lblNewLabel_1 ;
	JLabel lblCoordonns ;
	JButton btnpayer ;
	JLabel lblNumeroDeTlphone;
	JLabel lblAdresseEmail ;
	JLabel lblAdresse ;
	Reservation r;
	Maconnection m;
	JComboBox combobox1 ;
	JComboBox comboBox2 ;

	public Payment(Reservation r ) {
		this.r=r;
		initialize();	
	}

	void initialize() {
		comboBox2 = new JComboBox();
		combobox1 = new JComboBox();
		btnX = new JButton("X");
		label = new JLabel("SHvoyages ");
		lblNewLabel = new JLabel("");
		trait = new JPanel();
		Numcarte = new JTextField();
		Numcarte.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel_1 = new JLabel("Entrer le num\u00E9ro de carte");
	    lblCoordonns = new JLabel("Donn\u00E9es de paiement\r\n");
		btnpayer = new JButton("Valider et Payer");
		lblNumeroDeTlphone = new JLabel("Date d'expiration ");
		nomcarte = new JTextField();
		nomcarte.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblAdresseEmail = new JLabel("\r\n");
		lblAdresseEmail.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\mastercard.png"));
		lblAdresse = new JLabel("Entrer le nom du titulaire de la carte");
		m=new Maconnection();
		
		this.setBounds(200, 100, 800, 600);
		this.setUndecorated(true);
		getContentPane().setBackground(new Color(245, 245, 245));
		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 153, 102)));
		getContentPane().setLayout(null);
		
		label.setForeground(new Color(102, 153, 102));
		label.setFont(new Font("Times New Roman", Font.BOLD, 40));
		label.setBounds(64, 0, 247, 56);
		getContentPane().add(label);
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\airplane-shape.png"));
		lblNewLabel.setBounds(24, 9, 82, 38);
		getContentPane().add(lblNewLabel);
		
		trait.setBackground(new Color(102, 153, 102));
		trait.setBounds(50, 54, 700, 2);
		getContentPane().add(trait);
		
		Numcarte.setBounds(35, 113, 213, 31);
		getContentPane().add(Numcarte);
		Numcarte.setColumns(10);
		
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(35, 78, 252, 25);
		getContentPane().add(lblNewLabel_1);
		
		lblCoordonns.setForeground(Color.BLACK);
		lblCoordonns.setFont(new Font("Californian FB", Font.BOLD, 24));
		lblCoordonns.setBounds(498, 25, 227, 25);
		getContentPane().add(lblCoordonns);
		
		nomcarte.setColumns(10);
		nomcarte.setBounds(35, 210, 213, 31);
		getContentPane().add(nomcarte);
		
		lblAdresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresseEmail.setBounds(470, 64, 320, 25);
		getContentPane().add(lblAdresseEmail);
		
		lblAdresse.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresse.setBounds(34, 165, 309, 25);
		getContentPane().add(lblAdresse);
		
		codecarte = new JTextField();
		codecarte.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		codecarte.setColumns(10);
		codecarte.setBounds(35, 386, 101, 31);
		getContentPane().add(codecarte);
		
		JLabel lblPays = new JLabel("Code de s\u00E9curit\u00E9");
		lblPays.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblPays.setBounds(33, 351, 160, 25);
		getContentPane().add(lblPays);
		
		lblNumeroDeTlphone.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumeroDeTlphone.setBounds(30, 262, 218, 25);
		getContentPane().add(lblNumeroDeTlphone);
		
		btnpayer.setOpaque(true);
		btnpayer.setForeground(Color.WHITE);
		btnpayer.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnpayer.setBackground(new Color(66, 182, 244));
		btnpayer.setBounds(498, 434, 242, 74);
		getContentPane().add(btnpayer);
		
		
		btnX.setForeground(new Color(102, 153, 102));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.setBackground(new Color(245, 245, 245));
		btnX.setBounds(758, 0, 42, 25);
		getContentPane().add(btnX);
		
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setBorder(emptyBorder);
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		
		combobox1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		combobox1.setBounds(35, 303, 42, 21);
		getContentPane().add(combobox1);
		
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"19", "20", "21", "22", "23", "24", "25"}));
		comboBox2.setBounds(102, 303, 42, 21);
		getContentPane().add(comboBox2);
		
		JLabel lblVotrePaiementEst = new JLabel("Votre paiement est 100 % s\u00E9curis\u00E9");
		lblVotrePaiementEst.setForeground(Color.BLACK);
		lblVotrePaiementEst.setFont(new Font("Californian FB", Font.BOLD, 24));
		lblVotrePaiementEst.setBounds(64, 565, 384, 25);
		getContentPane().add(lblVotrePaiementEst);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\check.png"));
		lblNewLabel_2.setBounds(24, 561, 42, 29);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblPrixTotal = new JLabel("Prix Total");
		lblPrixTotal.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
		lblPrixTotal.setBounds(548, 351, 153, 56);
		getContentPane().add(lblPrixTotal);
		
		JLabel lblprix = new JLabel("300,45\u00A3");
		lblprix.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		lblprix.setBounds(548, 381, 163, 56);
		getContentPane().add(lblprix);
		
		lblprix.setText(r.prix);
		btnX.addActionListener(this);
		btnpayer.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()==btnX) {
			dispose();
		}
		if (e.getSource()==btnpayer) {
			if (codecarte.getText().isEmpty() || nomcarte.getText().isEmpty() || Numcarte.getText().isEmpty() || combobox1.getSelectedIndex()==-1 || comboBox2.getSelectedIndex()==-1) {
				JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs");
				
			}
			else {	//verifier si un vol est aller retour si aller retour on doit décrementer le nb places dans les deux vols avec la variable simple venant du class reservation
				if (r.simple==false) {
					String req="Update vols set Nbplaces=Nbplaces-1 where num='"+this.r.vr.numvol1+"'";
					String req1="Update vols set Nbplaces=Nbplaces-1 where num='"+this.r.vr.numvol2+"'";
					try {
						m.modify(req);
						m.modify(req1);} catch (SQLException e1) {
						// TODO Auto-generated catch block
							e1.printStackTrace();}
					Random random = new Random();
					int numRes = random.nextInt(999) + 1;
					String req_reservation="Insert into reservations values('"+String.valueOf(numRes)+"','"+this.r.email+"','"+this.r.numvol+"','"
					+r.depart+"','"+r.arrive+"','"+r.compagny+"','"+r.temps+" "+r.datealler+"','"+r.dateretour+"','"+r.duree+"','"+r.txtpassport.getText()+"','"+(r.txtprenom.getText()+" "+r.txtnom.getText())+"' )";
					try {
						m.ajout(req_reservation);
						} catch (SQLException e1) {
						// TODO Auto-generated catch block
							e1.printStackTrace();}
					JOptionPane.showMessageDialog(null, "Payement et réservation effectué avec succès");
					dispose();
				}
				else {
					String req="Update vols set Nbplaces=Nbplaces-1 where num='"+this.r.numvol+"'";
					try {
						m.modify(req);
						} catch (SQLException e1) {
						// TODO Auto-generated catch block
							e1.printStackTrace();}
					Random random = new Random();
					int numRes = random.nextInt(999) + 1;
					String req_reservation="Insert into reservations values('"+String.valueOf(numRes)+"','"+this.r.email+"','"+this.r.numvol+"','"
					+r.depart+"','"+r.arrive+"','"+r.compagny+"','"+r.temps+" "+r.datealler+"','"+r.dateretour+"','"+r.duree+"','"+r.txtpassport.getText()+"','"+(r.txtprenom.getText()+" "+r.txtnom.getText())+"' )";
					try {
						m.ajout(req_reservation);
						} catch (SQLException e1) {
						// TODO Auto-generated catch block
							e1.printStackTrace();}
					
					JOptionPane.showMessageDialog(null, "Payement et réservation effectué avec succès");
					dispose();
				}
			}
		}
	}
}
