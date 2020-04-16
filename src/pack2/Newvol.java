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

public class Newvol extends JFrame implements ActionListener{
	JTextField txtvolnum;
	JTextField txtcompagnie;
	JTextField txtorigine;
	JTextField txtdest;
	JTextField txtdatedepart;
	JTextField txtdatearr;
	JTextField txttempsdepart;
	JTextField txttempsarr;
	JTextField txtdureevol;
	ButtonGroup btngroup;
	JButton btnX ;
	JLabel label;
	JLabel lblNewLabel ;
	JComboBox voltype;
	JPanel trait;
	JLabel lblVotreVoyage ;
	JLabel lblDestionation ;
	JLabel lblConfirmezLadresseEmail ;
	JLabel lblNewLabel_1 ;
	JLabel lblNom;
	JButton btnajouter ;
	JLabel lblNumeroDeTlphone;
	JLabel lblAdresseEmail ;
	JLabel lblCodePostal ;
	JLabel lblAdresse ;
	
	String prix;
	String arrive;
	JTextField txtnumavion;
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
	private JTextField txtminutes;
	private JTextField txtprix;
	Monmodel m;
	

	public Newvol(Monmodel m) {
		this.m=m;
		initialize();	

	}
	
	
	void initialize() {
		btnX = new JButton("X");
		voltype = new JComboBox();
		label = new JLabel("SHvoyages ");
		lblNewLabel = new JLabel("");
		trait = new JPanel();
		lblVotreVoyage = new JLabel("Ajouter un nouveau Vol");
		lblDestionation = new JLabel("Destination\r\n");
		txtvolnum = new JTextField();
		txtvolnum.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtcompagnie = new JTextField();
		txtcompagnie.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblConfirmezLadresseEmail = new JLabel("Destination");
		lblNom = new JLabel("Origine");
		txtnumavion = new JTextField();
		btnajouter = new JButton("Ajouter ce nouveau vol\r\n");
		lblNumeroDeTlphone = new JLabel("Dur\u00E9e de vol");
		txttempsarr = new JTextField();
		txttempsarr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtorigine = new JTextField();
		txtorigine.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblAdresseEmail = new JLabel("Compagnie Aerienne");
		txtdatearr = new JTextField();
		txtdatearr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtdest = new JTextField();
		txtdest.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtdureevol = new JTextField();
		txtdureevol.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblCodePostal = new JLabel("Temps d'arriv\u00E9e");
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

		txtvolnum.setBounds(463, 20, 144, 31);
		getContentPane().add(txtvolnum);
		txtvolnum.setColumns(10);

		txtcompagnie.setColumns(10);
		txtcompagnie.setBounds(50, 115, 213, 31);
		getContentPane().add(txtcompagnie);

		lblNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNom.setBounds(50, 145, 112, 25);
		getContentPane().add(lblNom);

		txtorigine.setColumns(10);
		txtorigine.setBounds(50, 170, 213, 31);
		getContentPane().add(txtorigine);

		txtdest.setColumns(10);
		txtdest.setBounds(363, 170, 213, 31);
		getContentPane().add(txtdest);

		lblAdresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresseEmail.setBounds(50, 92, 261, 25);
		getContentPane().add(lblAdresseEmail);

		lblConfirmezLadresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblConfirmezLadresseEmail.setBounds(363, 145, 238, 25);
		getContentPane().add(lblConfirmezLadresseEmail);

		txtdatedepart = new JTextField();
		txtdatedepart.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtdatedepart.setColumns(10);
		txtdatedepart.setBounds(50, 233, 213, 31);
		getContentPane().add(txtdatedepart);

		lblAdresse.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresse.setBounds(50, 211, 128, 25);
		getContentPane().add(lblAdresse);

		txtdatearr.setColumns(10);
		txtdatearr.setBounds(363, 233, 213, 31);
		getContentPane().add(txtdatearr);

		JLabel lblVille = new JLabel("Date d'arriv\u00E9e");
		lblVille.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblVille.setBounds(363, 211, 150, 25);
		getContentPane().add(lblVille);

		txttempsdepart = new JTextField();
		txttempsdepart.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txttempsdepart.setColumns(10);
		txttempsdepart.setBounds(50, 296, 213, 31);
		getContentPane().add(txttempsdepart);

		JLabel lblPays = new JLabel("Temps de d\u00E9part");
		lblPays.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblPays.setBounds(50, 274, 144, 25);
		getContentPane().add(lblPays);

		lblCodePostal.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblCodePostal.setBounds(363, 274, 185, 25);
		getContentPane().add(lblCodePostal);

		txttempsarr.setColumns(10);
		txttempsarr.setBounds(363, 296, 213, 31);
		getContentPane().add(txttempsarr);

		txtdureevol.setColumns(10);
		txtdureevol.setBounds(50, 352, 213, 31);
		getContentPane().add(txtdureevol);

		lblNumeroDeTlphone.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumeroDeTlphone.setBounds(50, 328, 218, 25);
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
		
		txtnumavion.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtnumavion.setColumns(10);
		txtnumavion.setBounds(363, 352, 213, 31);
		getContentPane().add(txtnumavion);
		
		JLabel lblNumroDuPassport = new JLabel("Num\u00E9ro d'avion");
		lblNumroDuPassport.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumroDuPassport.setBounds(363, 328, 218, 25);
		getContentPane().add(lblNumroDuPassport);
		lblNewLabel_1 = new JLabel("Vol Numero:");
		lblNewLabel_1.setBounds(336, 20, 119, 27);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));

		voltype.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 17));
		voltype.setModel(new DefaultComboBoxModel(new String[] {"Vol direct", "Avec escale"}));
		voltype.setSelectedIndex(0);
		voltype.setBounds(363, 111, 202, 37);
		getContentPane().add(voltype);

		lblMinutesDeVol = new JLabel("Minutes de vol");
		lblMinutesDeVol.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblMinutesDeVol.setBounds(50, 393, 218, 25);
		getContentPane().add(lblMinutesDeVol);

		txtminutes = new JTextField();
		txtminutes.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtminutes.setColumns(10);
		txtminutes.setBounds(50, 418, 213, 31);
		getContentPane().add(txtminutes);

		JLabel lblPrixBillet = new JLabel("Prix Billet(\u20AC)");
		lblPrixBillet.setForeground(new Color(0, 0, 128));
		lblPrixBillet.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblPrixBillet.setBounds(363, 393, 218, 25);
		getContentPane().add(lblPrixBillet);

		txtprix = new JTextField();
		txtprix.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		txtprix.setColumns(10);
		txtprix.setBounds(363, 418, 213, 31);
		getContentPane().add(txtprix);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnajouter) {
			if (txtcompagnie.getText().isEmpty() || txtdatearr.getText().isEmpty() || txtdatedepart.getText().isEmpty() || txtdest.getText().isEmpty() || 
					txtdureevol.getText().isEmpty() || txtminutes.getText().isEmpty() || txtnumavion.getText().isEmpty() || txtorigine.getText().isEmpty() || txtprix.getText().isEmpty() || txttempsarr.getText().isEmpty() || 
					txttempsdepart.getText().isEmpty() || txtvolnum.getText().isEmpty() || voltype.getSelectedIndex()==-1){
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
				String ch="0";
				if(voltype.getSelectedIndex()==1) {
					 ch="1";
				}
				Object t1[]= {txtvolnum.getText(),txtorigine.getText(),txtdest.getText(),txtdatedepart.getText(),txtdatearr.getText(),txttempsdepart.getText()
						,txttempsarr.getText(),txtdureevol.getText(),ch,txtprix.getText(),"50",txtcompagnie.getText(),txtnumavion.getText(),txtminutes.getText()};
				m.ajouter(t1);
				Window[] windows = getWindows();
				for (Window window : windows)
			    {
			        if (window instanceof JFrame)
			        {
			            window.dispose();
			        }
			    }
				VolsEdit v=new VolsEdit();
				v.setVisible(true);
				m.fireTableDataChanged();
			}
		}
	}
}
