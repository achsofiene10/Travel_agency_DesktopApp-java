package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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

public class Reservation extends JFrame implements ActionListener{
	JTextField txtprenom;
	JTextField txtnom;
	JTextField txtmail1;
	JTextField txtmail2;
	JTextField txtadr;
	JTextField txtville;
	JTextField txtpays;
	JTextField txtcodepostal;
	JTextField txtphone;
	ButtonGroup btngroup;
	JButton btnX ;
	JLabel label;
	JLabel lblNewLabel ;
	JPanel trait;
	JLabel lblVotreVoyage ;
	JLabel lblDestionation ;
	JRadioButton rdnbtnMr ;
	JRadioButton rdbtnMme ;
	JLabel lblConfirmezLadresseEmail ;
	JLabel lblNewLabel_1 ;
	JLabel lblCoordonns ;
	JLabel lblNom;
	JButton btnpaiement ;
	JLabel lblNumeroDeTlphone;
	JLabel lblAdresseEmail ;
	JLabel lblCodePostal ;
	JLabel lblAdresse ;
	Panneau p ;
	Volsimple v;
	VolAllerretour vr;
	String prix;
	String arrive;
	JTextField txtpassport;
	boolean simple=true;
	String numvol;
	String email;
	String depart;
	String datealler;
	String dateretour;
	String duree;
	String compagny;
	String temps;
	

	/**
	 * @wbp.parser.constructor
	 */
	public Reservation(Panneau p) {
		this.p=p;
		this.prix=p.lblprice.getText();
		this.arrive=p.lblArr.getText();
		this.numvol=p.numvol;
		this.email=p.email;
		this.depart=p.lblDpart.getText();
		this.datealler=p.Datevol.getText();
		this.dateretour="0000-00-00";
		this.duree=p.lblduree.getText();
		this.compagny=p.lblCompagnieAerienne.getText();
		this.temps=p.Tempsdep.getText();
		initialize();	

	}
	
	public Reservation(Volsimple v) {
		this.v=v;
		this.numvol=v.numvol;
		this.prix=v.lblprice.getText();
		this.arrive=v.lblArr.getText();
		this.email=v.email;
		this.depart=v.lblDpart.getText();
		this.duree=v.lblduree.getText();
		this.dateretour="0000-00-00";
		this.temps=v.Tempsdep.getText();
		this.datealler=v.Datevol.getText();
		this.compagny=v.lblCompagnieAerienne.getText();
		initialize();
	}
	
	
	public Reservation(VolAllerretour vr) {
		this.vr=vr;
		this.prix=vr.lblprice.getText();
		this.arrive=vr.lblArr.getText();
		this.simple=false;
		this.temps=vr.Tempsdep.getText();
		this.email=vr.email;
		this.numvol=vr.numvol1+" And "+vr.numvol2;
		this.duree=vr.lblduree.getText();
		this.depart=vr.lblDpart.getText();
		this.datealler=vr.Datevol.getText();
		this.dateretour=vr.DateRetour.getText();
		this.compagny=vr.lblCompagnieAerienne.getText();
		initialize();
	}
	void initialize() {
		btnX = new JButton("X");
		label = new JLabel("SHvoyages ");
		lblNewLabel = new JLabel("");
		trait = new JPanel();
		lblVotreVoyage = new JLabel("Votre voyage \u00E0");
		lblDestionation = new JLabel("Destination\r\n");
		rdnbtnMr = new JRadioButton("Mr.");
		rdbtnMme = new JRadioButton("Mme");
		txtprenom = new JTextField();
		txtprenom.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtnom = new JTextField();
		txtnom.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblConfirmezLadresseEmail = new JLabel("Confirmez l'adresse email\r\n");
		lblNewLabel_1 = new JLabel("Pr\u00E9nom\r\n");
		lblCoordonns = new JLabel("Coordonn\u00E9es:");
		lblNom = new JLabel("Nom");
		txtpassport = new JTextField();
		btnpaiement = new JButton("Continuer vers le paiement");
		lblNumeroDeTlphone = new JLabel("Num\u00E9ro de t\u00E9l\u00E9phone\r\n");
		txtcodepostal = new JTextField();
		txtcodepostal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtmail1 = new JTextField();
		txtmail1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblAdresseEmail = new JLabel("Adresse email\r\n");
		txtville = new JTextField();
		txtville.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtmail2 = new JTextField();
		txtmail2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtphone = new JTextField();
		txtphone.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblCodePostal = new JLabel("Code postal\r\n");
		lblAdresse = new JLabel("Adresse\r\n\r\n");
		this.setBounds(200, 100, 800, 600);
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
		trait.setBounds(50, 54, 700, 2);
		getContentPane().add(trait);

		lblVotreVoyage.setForeground(Color.BLACK);
		lblVotreVoyage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblVotreVoyage.setBounds(34, 66, 388, 25);
		getContentPane().add(lblVotreVoyage);

		lblDestionation.setForeground(Color.BLACK);
		lblDestionation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDestionation.setBounds(166, 66, 112, 25);
		getContentPane().add(lblDestionation);

		rdnbtnMr.setBackground(new Color(245, 245, 245));
		rdnbtnMr.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 22));
		rdnbtnMr.setBounds(34, 109, 59, 25);
		getContentPane().add(rdnbtnMr);

		rdbtnMme.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 22));
		rdbtnMme.setBackground(new Color(245, 245, 245));
		rdbtnMme.setBounds(111, 109, 88, 25);
		getContentPane().add(rdbtnMme);

		btngroup.add(rdbtnMme);
		btngroup.add(rdnbtnMr);

		txtprenom.setBounds(35, 166, 298, 31);
		getContentPane().add(txtprenom);
		txtprenom.setColumns(10);

		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(34, 143, 82, 25);
		getContentPane().add(lblNewLabel_1);

		txtnom.setColumns(10);
		txtnom.setBounds(423, 166, 315, 31);
		getContentPane().add(txtnom);

		lblNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNom.setBounds(423, 143, 82, 25);
		getContentPane().add(lblNom);

		lblCoordonns.setForeground(Color.BLACK);
		lblCoordonns.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblCoordonns.setBounds(34, 214, 152, 25);
		getContentPane().add(lblCoordonns);

		txtmail1.setColumns(10);
		txtmail1.setBounds(35, 272, 298, 31);
		getContentPane().add(txtmail1);

		txtmail2.setColumns(10);
		txtmail2.setBounds(423, 272, 315, 31);
		getContentPane().add(txtmail2);

		lblAdresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresseEmail.setBounds(34, 249, 165, 25);
		getContentPane().add(lblAdresseEmail);

		lblConfirmezLadresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblConfirmezLadresseEmail.setBounds(423, 249, 238, 25);
		getContentPane().add(lblConfirmezLadresseEmail);

		txtadr = new JTextField();
		txtadr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtadr.setColumns(10);
		txtadr.setBounds(34, 337, 299, 31);
		getContentPane().add(txtadr);

		lblAdresse.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresse.setBounds(34, 315, 72, 25);
		getContentPane().add(lblAdresse);

		txtville.setColumns(10);
		txtville.setBounds(423, 337, 315, 31);
		getContentPane().add(txtville);

		JLabel lblVille = new JLabel("Ville");
		lblVille.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblVille.setBounds(423, 315, 47, 25);
		getContentPane().add(lblVille);

		txtpays = new JTextField();
		txtpays.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtpays.setColumns(10);
		txtpays.setBounds(34, 411, 299, 31);
		getContentPane().add(txtpays);

		JLabel lblPays = new JLabel("Pays");
		lblPays.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblPays.setBounds(34, 387, 47, 25);
		getContentPane().add(lblPays);

		lblCodePostal.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblCodePostal.setBounds(423, 387, 119, 25);
		getContentPane().add(lblCodePostal);

		txtcodepostal.setColumns(10);
		txtcodepostal.setBounds(423, 411, 315, 31);
		getContentPane().add(txtcodepostal);

		txtphone.setColumns(10);
		txtphone.setBounds(34, 483, 298, 31);
		getContentPane().add(txtphone);

		lblNumeroDeTlphone.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumeroDeTlphone.setBounds(30, 458, 218, 25);
		getContentPane().add(lblNumeroDeTlphone);

		btnpaiement.setOpaque(true);
		btnpaiement.setForeground(Color.WHITE);
		btnpaiement.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnpaiement.setBackground(new Color(102, 153, 102));
		btnpaiement.setBounds(227, 533, 315, 44);
		getContentPane().add(btnpaiement);


		btnX.setForeground(new Color(102, 153, 102));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.setBackground(new Color(245, 245, 245));
		btnX.setBounds(758, 0, 42, 25);
		getContentPane().add(btnX);

		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setBorder(emptyBorder);
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.addActionListener(this);
		btnpaiement.addActionListener(this);
		lblDestionation.setText(this.arrive);
		
		txtpassport.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtpassport.setColumns(10);
		txtpassport.setBounds(423, 483, 315, 31);
		getContentPane().add(txtpassport);
		
		JLabel lblNumroDuPassport = new JLabel("Num\u00E9ro du passport\r\n");
		lblNumroDuPassport.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumroDuPassport.setBounds(423, 458, 218, 25);
		getContentPane().add(lblNumroDuPassport);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnpaiement) {
			if (txtadr.getText().isEmpty() || txtcodepostal.getText().isEmpty() || txtmail1.getText().isEmpty() || txtmail2.getText().isEmpty() || txtnom.getText().isEmpty() || txtpays.getText().isEmpty() || txtphone.getText().isEmpty() || txtprenom.getText().isEmpty() || txtville.getText().isEmpty() || (!rdnbtnMr.isSelected() && !rdbtnMme.isSelected()) || txtpassport.getText().isEmpty())  {
				JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs");
			}
			else {
				Payment p=new Payment(this);
				p.setVisible(true);
				dispose();  }
		}
		if ( e.getSource()==btnX) {
			dispose();
		}
	}
}
