package pack1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Acceuil extends JFrame implements MouseListener, FocusListener, ActionListener {

	JTextField txtOrigine;
	JTextField txtDestination;
	JTextField txtDepart;
	JTextField txtRetour;
	JLabel lblNewLabel_2;
	JLabel lblGovoyages;
	JButton btnX;
	JLabel imguser;
	JButton lblAide;
	JTabbedPane tabbedPane ;
	JRadioButton btnAllersimple;
	JRadioButton btnAllerretour;
	JPanel panel_1;
	ButtonGroup Btngroup;
	JPanel panel_3;
	JPanel panel_4;
	JLabel lblNewLabel;
	JPanel panel_2 ;
	JLabel lblRservezVotreVol;
	JButton btnRechVol;
	JTextField txtville;
	JTextField txthotelAr;
	JTextField txthoteldep;
	JLabel lblDpart;
	JLabel lblNewLabel_4;
	JLabel lblChambres;
	JLabel lblNewLabel_3;
	JComboBox nbchambre;
	JComboBox nbadultes;
	JComboBox nbEnf;
	JLabel lblArrive;
	JButton btnRechhotel;
	JLabel lblNewLabel_5;
	JLabel lblLocationsDeVoitures;
	JLabel lblVols;
	JLabel lblHtels;
	JLabel lblConx;
	boolean enligne;
	JLabel lblNewLabel_6;
	JLabel lblTunisshvoyagestn;
	JLabel lblSigeSocial;
	JTextField txtvoitureplace;
	JTextField datedebvoit;
	JTextField datefinvoit;
	JComboBox heuredebvoit ;
	JComboBox heurefinvoit;
	JButton btnRechvoi;
	Maconnection m;
	ResultSet rs;
	ResultSetMetaData rsmd;
	Paneluser p;
	Signin s;
	MonClient v;

	public Acceuil() throws SQLException {
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}
	void initialize() throws SQLException {
		lblGovoyages = new JLabel("SHvoyages ");
		btnX = new JButton("X");
		imguser = new JLabel("");
		heuredebvoit = new JComboBox();
		heurefinvoit = new JComboBox();
		tabbedPane = new JTabbedPane();
		datedebvoit = new JTextField();
		datefinvoit=new JTextField();
		Btngroup=new ButtonGroup();
		panel_3 = new JPanel();
		txtvoitureplace = new JTextField();
		panel_4 = new JPanel();
		lblNewLabel = new JLabel("");
		lblRservezVotreVol = new JLabel("R\u00E9servez votre vol et s\u00E9jours avec les meilleurs prix");
		txtville = new JTextField();
		lblArrive = new JLabel("Arriv\u00E9e");
		btnRechhotel = new JButton("Rechercher un h\u00F4tel");
		txthoteldep = new JTextField();
		lblDpart = new JLabel("D\u00E9part");
		lblNewLabel_4 = new JLabel("Enfants");
		txthotelAr = new JTextField();
		lblChambres = new JLabel("Chambres");
		lblNewLabel_3 = new JLabel("Adultes");
		nbchambre = new JComboBox();
		nbadultes = new JComboBox();
		nbEnf = new JComboBox();
		lblLocationsDeVoitures = new JLabel("Locations de voitures");
		lblVols = new JLabel("Vols");
		lblHtels = new JLabel("H\u00F4tels");
		lblConx = new JLabel("Connexion");
		btnRechvoi = new JButton("Rechercher une voiture");
		m=new Maconnection();
		p=new Paneluser();
		s=new Signin();
	


		this.setBounds(250, 50, 1024, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.getContentPane().setLayout(null);
		this.setBackground(Color.white);
		this.setResizable(false);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 102));
		panel.setBounds(0, 0, 1024, 67);
		getContentPane().add(panel);
		panel.setLayout(null);


		lblGovoyages.setBounds(43, 10, 118, 37);
		panel.add(lblGovoyages);
		lblGovoyages.setForeground(new Color(255, 255, 255));
		lblGovoyages.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\conversation-speech-bubbles-.png"));
		lblNewLabel_10.setBounds(901, 20, 35, 25);
		panel.add(lblNewLabel_10);
		lblAide = new JButton("Contact");
		
		lblAide.setBackground(new Color(102, 204, 102));
		lblAide.setContentAreaFilled(false);
		lblAide.setBorder(emptyBorder);
		
		
				lblAide.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				lblAide.setForeground(new Color(255, 255, 255));
				lblAide.setBounds(919, 17, 85, 30);
				panel.add(lblAide);
				
						lblAide.addMouseListener(this);
						
						lblAide.addActionListener(this);


		btnX.setBounds(982, 0, 42, 25);
		panel.add(btnX);
		btnX.setBorder(emptyBorder);
		btnX.setBackground(new Color(102, 204, 102));
		btnX.setForeground(new Color(255, 255, 255));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));


		imguser.setForeground(new Color(255, 255, 255));
		imguser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		imguser.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\user.png"));
		imguser.setBounds(715, 16, 24, 31);
		panel.add(imguser);
		lblConx.addMouseListener(this);

		lblVols.setForeground(Color.WHITE);
		lblVols.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblVols.setBounds(206, 20, 64, 25);
		panel.add(lblVols);

		lblHtels.setForeground(Color.WHITE);
		lblHtels.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblHtels.setBounds(280, 20, 72, 25);
		panel.add(lblHtels);

		lblLocationsDeVoitures.setForeground(Color.WHITE);
		lblLocationsDeVoitures.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblLocationsDeVoitures.setBounds(360, 20, 223, 25);
		panel.add(lblLocationsDeVoitures);

		lblVols.addMouseListener(this);
		lblHtels.addMouseListener(this);
		lblLocationsDeVoitures.addMouseListener(this);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\airplane.png"));
		lblNewLabel_5.setBounds(15, 10, 64, 41);
		panel.add(lblNewLabel_5);

		lblConx.setForeground(Color.WHITE);
		lblConx.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblConx.setBounds(743, 22, 148, 22);
		panel.add(lblConx);
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnX) {
					dispose();
				}
				// TODO Auto-generated method stub

			}
		});


		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(138, 123, 549, 365);
		getContentPane().add(tabbedPane);
		txthoteldep.addFocusListener(this);
		txthotelAr.addFocusListener(this);
		txtville.addFocusListener(this);

		Border border = BorderFactory.createLineBorder(new Color(102, 204, 51), 1);
		btnAllersimple = new JRadioButton("Aller-simple");
		btnAllerretour = new JRadioButton("Aller-retour");
		panel_1 = new JPanel();
		txtDestination = new JTextField();
		txtOrigine = new JTextField();
		lblNewLabel_2 = new JLabel("");
		txtDepart = new JTextField();
		txtRetour = new JTextField();
		btnRechVol = new JButton("Rechercher des vols");


		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Vol", null, panel_1, null);
		panel_1.setLayout(null);


		btnAllersimple.setBounds(137, 7, 111, 25);
		btnAllersimple.setBackground(new Color(255, 255, 255));
		btnAllersimple.setFont(new Font("Tahoma", Font.ITALIC, 13));
		panel_1.add(btnAllersimple);


		btnAllersimple.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtRetour.setVisible(false);
				}}});
		btnAllerretour.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED) {
					txtRetour.setVisible(true);
				}}});

		btnAllerretour.setBackground(new Color(255, 255, 255));
		btnAllerretour.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnAllerretour.setBounds(250, 9, 105, 21);
		panel_1.add(btnAllerretour);

		Btngroup.add(btnAllerretour);
		Btngroup.add(btnAllersimple);



		txtOrigine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtOrigine.setText("Origine");
		txtOrigine.setBounds(59, 52, 169, 32);
		panel_1.add(txtOrigine);
		txtOrigine.setColumns(10);


		txtDestination.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDestination.setText("Destination");
		txtDestination.setBounds(294, 52, 169, 32);
		panel_1.add(txtDestination);
		txtDestination.setColumns(10);


		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\swap-horizontal-orientation-arrows.png"));
		lblNewLabel_2.setBounds(250, 52, 24, 25);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.addMouseListener(this);


		txtDepart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDepart.setText("D\u00E9part le aaaa-mm-jj");
		txtDepart.setBounds(59, 106, 170, 32);
		panel_1.add(txtDepart);
		txtDepart.setColumns(10);


		txtRetour.setText("Retour le aaaa-mm-jj");
		txtRetour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRetour.setColumns(10);
		txtRetour.setBounds(294, 106, 170, 32);
		panel_1.add(txtRetour);


		txtOrigine.addFocusListener(this);
		txtDepart.addFocusListener(this);
		txtDestination.addFocusListener(this);
		txtRetour.addFocusListener(this);

		txtRetour.setBorder(border);
		txtDepart.setBorder(border);
		txtDestination.setBorder(border);
		txtOrigine.setBorder(border);

		btnRechVol.setOpaque(true);
		btnRechVol.setForeground(new Color(255, 255, 255));
		btnRechVol.setBackground(new Color(102, 204, 102));
		btnRechVol.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRechVol.setBounds(168, 187, 185, 32);
		btnRechVol.addMouseListener(this);
		btnRechVol.addActionListener(this);
		panel_1.add(btnRechVol);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\rsz_mondes-pluriels-logos-vols-compagnies-aeriennes-2.png"));
		lblNewLabel_9.setBounds(10, 260, 524, 78);
		panel_1.add(lblNewLabel_9);

		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Hôtels", null, panel_3, null);
		panel_3.setLayout(null);

		txtville.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtville.setText("Pays,ville,quartier,....");
		txtville.setBorder(border);
		txtville.setBounds(24, 32, 471, 32);
		panel_3.add(txtville);
		txtville.setColumns(10);

		lblArrive.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblArrive.setBounds(35, 91, 82, 23);
		panel_3.add(lblArrive);

		lblDpart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDpart.setBounds(225, 94, 89, 16);
		panel_3.add(lblDpart);

		txthotelAr.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txthotelAr.setText("aaaa-mm-jj");
		txthotelAr.setBounds(24, 122, 128, 32);
		txthotelAr.setBorder(border);
		panel_3.add(txthotelAr);
		txthotelAr.setColumns(10);

		txthoteldep.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txthoteldep.setText("aaaa-mm-jj");
		txthoteldep.setBounds(218, 122, 128, 32);
		txthoteldep.setBorder(border);
		panel_3.add(txthoteldep);
		txthoteldep.setColumns(10);

		lblChambres.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblChambres.setBounds(24, 170, 76, 23);
		panel_3.add(lblChambres);

		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(127, 170, 63, 23);
		panel_3.add(lblNewLabel_3);

		nbchambre.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		nbchambre.setSelectedIndex(0);
		nbchambre.setBounds(24, 203, 50, 21);
		panel_3.add(nbchambre);

		nbadultes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		nbadultes.setSelectedIndex(0);
		nbadultes.setBounds(127, 203, 50, 21);
		panel_3.add(nbadultes);

		nbEnf.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2"}));
		nbEnf.setBounds(218, 203, 50, 21);
		panel_3.add(nbEnf);

		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(218, 177, 82, 13);
		panel_3.add(lblNewLabel_4);

		btnRechhotel.setBackground(new Color(51, 204, 51));
		btnRechhotel.setForeground(Color.WHITE);
		btnRechhotel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRechhotel.setBounds(244, 245, 212, 36);
		panel_3.add(btnRechhotel);
		btnRechhotel.addMouseListener(this);
	


		panel_4.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Locations de voitures", null, panel_4, null);
		panel_4.setLayout(null);


		txtvoitureplace.setText("Pays,ville,quartier,aeroport,....");
		txtvoitureplace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtvoitureplace.setColumns(10);
		txtvoitureplace.setBounds(54, 43, 426, 32);
		panel_4.add(txtvoitureplace);

		txtvoitureplace.addFocusListener(this);

		datedebvoit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		datedebvoit.setText("Date de d\u00E9but");
		datedebvoit.setBounds(54, 101, 106, 32);
		panel_4.add(datedebvoit);
		datedebvoit.setColumns(10);


		datefinvoit.setText("Date de fin");
		datefinvoit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		datefinvoit.setBounds(282, 101, 106, 32);
		panel_4.add(datefinvoit);
		datefinvoit.setColumns(10);

		datedebvoit.addMouseListener(this);
		datefinvoit.addMouseListener(this);


		heuredebvoit.setModel(new DefaultComboBoxModel(new String[] {"00:00", "02:00", "04:00", "06:00", "08:00", "10:00", "12:00", "14:00", "16:00", "18:00", "20:00", "22:00"}));
		heuredebvoit.setBounds(172, 101, 56, 32);
		panel_4.add(heuredebvoit);

		heurefinvoit.setModel(new DefaultComboBoxModel(new String[] {"00:00", "02:00", "04:00", "06:00", "08:00", "10:00", "12:00", "14:00", "16:00", "18:00", "20:00", "22:00"}));
		heurefinvoit.setBounds(398, 101, 56, 32);
		panel_4.add(heurefinvoit);

		btnRechvoi.setOpaque(true);
		btnRechvoi.setForeground(new Color(255, 255, 255));
		btnRechvoi.setBackground(new Color(102, 204, 51));
		btnRechvoi.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRechvoi.setBounds(143, 173, 216, 32);
		panel_4.add(btnRechvoi);
		btnRechvoi.addMouseListener(this);

		btnRechvoi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txtvoitureplace.getText().isEmpty() || datedebvoit.getText().isEmpty() || datefinvoit.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs");
				}

			}
		});

		lblRservezVotreVol.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRservezVotreVol.setForeground(Color.BLACK);
		lblRservezVotreVol.setBounds(140, 88, 462, 25);
		getContentPane().add(lblRservezVotreVol);


		lblNewLabel.setBounds(0, 0, 1024, 596);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\rsz_aiplane-wing-sky-clouds-fly-wallpapersbyte-com-1920x1200.jpg"));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 204, 102));
		panel_5.setBounds(0, 510, 1024, 130);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);

		lblNewLabel_6 = new JLabel("50 100 100  | 73 500 100");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(862, 97, 162, 33);
		panel_5.add(lblNewLabel_6);

		lblTunisshvoyagestn = new JLabel("Tunis@shvoyages.tn\r\n");
		lblTunisshvoyagestn.setForeground(Color.BLACK);
		lblTunisshvoyagestn.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblTunisshvoyagestn.setBounds(31, 95, 138, 37);
		panel_5.add(lblTunisshvoyagestn);

		lblSigeSocial = new JLabel("Si\u00E8ge Social : ISSAT Sousse \r\nCit\u00E9 Taffala (Ibn Khaldoun)\r\n 4003 Sousse\r\n Tunisie");
		lblSigeSocial.setForeground(new Color(0, 0, 0));
		lblSigeSocial.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 15));
		lblSigeSocial.setBounds(265, 97, 496, 33);
		panel_5.add(lblSigeSocial);

		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\facebook-placeholder-for-locate-places-on-maps.png"));
		lblNewLabel_1.setBounds(247, 103, 20, 26);
		panel_5.add(lblNewLabel_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\close-envelope.png"));
		lblNewLabel_7.setBounds(10, 103, 20, 27);
		panel_5.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\telephone.png"));
		lblNewLabel_8.setBounds(842, 103, 27, 23);
		panel_5.add(lblNewLabel_8);
		panel_2 = new JPanel();
		panel_2.setBounds(790, 483, -791, 113);
		getContentPane().add(panel_2);
		lblGovoyages.addMouseListener(this);

		String req_select="select * from  client ;";  
		try {
			rs = m.selection(req_select);
			rsmd=rs.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		boolean Ok=false;
		while ((this.rs.next()) &&(!Ok)) {
			int nbcol=rsmd.getColumnCount();
			String [] t=new String[nbcol];
			for (int i=0;i<nbcol;i++) {
				t[i]=rs.getString(i+1);
			}
			if(t[3].contentEquals("1")) {
				Ok=true;
				lblConx.setText(t[1]);
				enligne=true;
			}
		}	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		

		// TODO Auto-generated method stub
		if (e.getSource()==lblNewLabel_2) {
			String ch=txtOrigine.getText();
			txtOrigine.setText(txtDestination.getText());
			txtDestination.setText(ch);	
		}
		if (e.getSource()==lblConx) {
			
			if(enligne==false && (!s.isVisible())){
				s.setVisible(true);}
			if(enligne==true) {
			if (p.isVisible()) {
				p.setVisible(false);}
			else {p.setVisible(true);}}
		}
		if (e.getSource()==lblVols) {
			Vols v;
			try {
				v = new Vols();			
				v.setVisible(true);

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);
		}
		if ( e.getSource()==lblHtels) {
			Hotels h;
			try {
				h = new Hotels();
				h.setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);
		}
		if (e.getSource()==lblLocationsDeVoitures) {
			Voitures v;
			try {
				v = new Voitures();
				v.setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);
		}

	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		/*if (e.getSource()== lblAide) {
			v = new MonClient();	
			if(!v.isVisible()) {
				v.setVisible(true);
			}
	}*/
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()==lblGovoyages) {
			lblGovoyages.setForeground(new Color(51, 153, 102));
		}
		if(e.getSource()==lblVols) {
			lblVols.setForeground(new Color(51, 153, 102));
		}
		if (e.getSource()==lblHtels) {
			lblHtels.setForeground(new Color(51, 153, 102));
		}
		if(e.getSource()==lblLocationsDeVoitures) {
			lblLocationsDeVoitures.setForeground(new Color(51, 153, 102));
		}
		if(e.getSource()==lblAide) {
			lblAide.setForeground(new Color(51, 153, 102));
		}
		if(e.getSource()==lblConx) {
			lblConx.setForeground(new Color(51, 153, 102));
		}

		if (e.getSource()==btnRechVol) {
			btnRechVol.setBackground(Color.white);
			btnRechVol.setForeground(new Color(51, 204, 51));
			
		}
		if (e.getSource()==btnRechvoi) {
			btnRechvoi.setBackground(Color.white);
			btnRechvoi.setForeground(new Color(51, 204, 51));
		}
		if (e.getSource()==btnRechhotel) {
			btnRechhotel.setBackground(Color.white);
			btnRechhotel.setForeground(new Color(51, 204, 51));
		}


	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()==lblGovoyages) {
			lblGovoyages.setForeground(Color.white);
		}
		if(e.getSource()==lblVols) {
			lblVols.setForeground(Color.white);
		}
		if (e.getSource()==lblHtels) {
			lblHtels.setForeground(Color.white);
		}
		if(e.getSource()==lblLocationsDeVoitures) {
			lblLocationsDeVoitures.setForeground(Color.white);
		}
		if(e.getSource()==lblAide) {
			lblAide.setForeground(Color.white);
		}
		if(e.getSource()==lblConx) {
			lblConx.setForeground(Color.white);
		}
		if (e.getSource()==btnRechVol) {
			btnRechVol.setBackground(new Color(102, 204, 102));
			btnRechVol.setForeground(Color.white);
		}
		if (e.getSource()==btnRechhotel) {
			btnRechhotel.setBackground(new Color(102, 204, 102));
			btnRechhotel.setForeground(Color.white);
		}
		if (e.getSource()==btnRechvoi) {
			btnRechvoi.setBackground(new Color(102, 204, 102));
			btnRechvoi.setForeground(Color.white);
		}
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==txtvoitureplace) {
			txtvoitureplace.setText("");
		}
		if (e.getSource()==datedebvoit) {
			datedebvoit.setText("");
		}
		if (e.getSource()==datefinvoit) {
			datefinvoit.setText("");
		}
		if (e.getSource()==txtDepart) {
			txtDepart.setText("");
		}
		if (e.getSource()==txtDestination) {
			txtDestination.setText("");
		}
		if (e.getSource()==txtOrigine) {
			txtOrigine.setText("");
		}
		if (e.getSource()==txtRetour) {
			txtRetour.setText("");
		}
		if (e.getSource()==txthotelAr) {
			txthotelAr.setText("");
		}
		if (e.getSource()==txthoteldep) {
			txthoteldep.setText("");
		}
		if (e.getSource()==txtville) {
			txtville.setText("");
		}

	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==txtvoitureplace) {
			if (txtvoitureplace.getText().isEmpty()) {
			txtvoitureplace.setText("Pays,ville,quartier,aeroport,....");}
		}
		if (e.getSource()==datedebvoit) {
			if (datedebvoit.getText().isEmpty()) {
			datedebvoit.setText("Date de début");}
		}
		if (e.getSource()==datefinvoit) {
			if (datefinvoit.getText().isEmpty()) {
			datefinvoit.setText("Date de fin");}
		}
		if (e.getSource()==txtDepart) {
			if (txtDepart.getText().isEmpty()) {
			txtDepart.setText("Départ le jj/mm/aa");}
		}
		if (e.getSource()==txtDestination) {
			if (txtDestination.getText().isEmpty()) {
			txtDestination.setText("Destination");}
		}
		if (e.getSource()==txtOrigine) {
			if (txtOrigine.getText().isEmpty()) {
			txtOrigine.setText("Origine");}
		}
		if (e.getSource()==txtRetour) {
			if (txtRetour.getText().isEmpty()) {
			txtRetour.setText("Retour le jj/mm/aa");}
		}
		if (e.getSource()==txthotelAr) {
			if (txthotelAr.getText().isEmpty()) {
			txthotelAr.setText("jj/mm/aa");}
		}
		if (e.getSource()==txthoteldep) {
			if (txthoteldep.getText().isEmpty()) {
			txthoteldep.setText("jj/mm/aa");}
		}
		if (e.getSource()==txtville) {
			if (txtville.getText().isEmpty()) {
			txtville.setText("Pays,ville,quartier,....");}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnRechVol) {
			if(txtOrigine.getText().isEmpty() || txtDestination.getText().isEmpty() || txtDepart.getText().isEmpty()  || txtRetour.getText().isEmpty() || (!btnAllerretour.isSelected() && !btnAllersimple.isSelected()) ) {
				JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs ");
			}
			else {
				boolean simple=true;
				if(btnAllerretour.isSelected()) {
					simple=false;
				}
				try {
					ResultatRechVol res=new ResultatRechVol(simple,txtOrigine.getText(),txtDestination.getText(),txtDepart.getText(),txtRetour.getText());
					res.setVisible(true);
					this.setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		
		if (e.getSource()== lblAide) {
			v = new MonClient();	
			if(!v.isVisible()) {
				v.setVisible(true);
			}
	}
		}
	}



