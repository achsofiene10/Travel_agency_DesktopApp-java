package pack1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
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
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.AbstractTableModel;

import pack1.Maconnection;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class Mesreservations extends JFrame implements MouseListener, FocusListener, ActionListener {

	 JFrame frame;
	 JLabel lblGovoyages;
	 JButton btnX;
	 JLabel imguser;
	 JButton lblAide;
	 ButtonGroup Btngroup;
	  JLabel lblNewLabel_5;
	 JLabel lblLocationsDeVoitures;
	 JLabel lblVols;
	 JLabel lblHtels;
	 JLabel lblConx;
	 boolean enligne;
	 JLabel lblNewLabel_6;
	 JLabel lblEmailUs;
	 JLabel lblTunisshvoyagestn;
	 JLabel lblSigeSocial;
	 JLabel lblNewLabel_7;
	 JLabel lblNewLabel_8;
	 JLabel lblNewLabel_9;
	 JPanel panelscroll;
	 Maconnection m;
	 ResultSet rs;
	 ResultSetMetaData rsmd;
	 JLabel lblVolsDiponibles;
	 Signin s;
	 Paneluser p;
	 JLabel label;
		MonClient v;

	 
	public Mesreservations() throws SQLException {
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}
	 void initialize() throws SQLException  {
			m=new Maconnection();
		 lblGovoyages = new JLabel("SHvoyages ");
		 btnX = new JButton("X");
		 imguser = new JLabel("");
		 Btngroup=new ButtonGroup();
		 lblLocationsDeVoitures = new JLabel("Locations de voitures");
		 lblVols = new JLabel("Vols");
		 lblHtels = new JLabel("H\u00F4tels");
		 lblConx = new JLabel("Connexion");
		 panelscroll=new JPanel();
		 s=new Signin();
		 p=new Paneluser();
		 
		this.setBounds(250, 50, 1024, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.getContentPane().setLayout(null);
		this.setBackground(Color.white);
		this.setResizable(false);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		getContentPane().setLayout(null);
		
        lblVolsDiponibles = new JLabel("Vols diponibles \u00E0 r\u00E9server");

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 102));
		panel.setBounds(0, 0, 1024, 67);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		String req_selct="select * from  client ;";  
		try {
			rs = m.selection(req_selct);
			rsmd=rs.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean Ok=false;
		while ((this.rs.next()) &&(!Ok)) {
			int nbcol1=rsmd.getColumnCount();
			String [] t=new String[nbcol1];
			for (int i=0;i<nbcol1;i++) {
				t[i]=rs.getString(i+1);
			}
			if(t[3].contentEquals("1")) {
				Ok=true;
				lblConx.setText(t[1]);
				enligne=true;
				lblVolsDiponibles.setText(t[1]+" > Mes billets réservés");
				
			}
		}
		
		lblGovoyages.setBounds(43, 10, 118, 37);
		panel.add(lblGovoyages);
		lblGovoyages.setForeground(new Color(255, 255, 255));
		lblGovoyages.setFont(new Font("Times New Roman", Font.BOLD, 24));
			
		
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
		
	lblAide = new JButton("Contact");
		
		lblAide.setBackground(new Color(102, 204, 102));
		lblAide.setContentAreaFilled(false);
		lblAide.setBorder(emptyBorder);
		
		
				lblAide.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				lblAide.setForeground(new Color(255, 255, 255));
				lblAide.setBounds(919, 17, 85, 30);
				panel.add(lblAide);
				
						
						lblAide.addActionListener(this);
		lblAide.addMouseListener(this);
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
		lblGovoyages.addMouseListener(this);
		
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
		
		Border border = BorderFactory.createLineBorder(new Color(102, 204, 51), 1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 64, 1024, 540);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 1010, 480);
		panel_1.add(scrollPane);
		
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelscroll.setLayout(new BoxLayout(panelscroll,BoxLayout.PAGE_AXIS));

		String req_select="select * from  reservations where email='"+lblConx.getText()+"' ;";  
		try {
			rs = m.selection(req_select);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rsmd=rs.getMetaData();
		int nbcol=rsmd.getColumnCount();
		int nblig=0;
		while (this.rs.next()) {
			String [] t=new String[nbcol];
			nblig++;
			for (int i=0;i<nbcol;i++) {
				t[i]=rs.getString(i+1);
				
			}
			String ch="Avec escale";
			if (t[8].contentEquals("0")) {
				ch="Vol direct";
			}
			Billet p=new Billet(t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9],t[10]);
			panelscroll.add(p);
		}
        
        panelscroll.setPreferredSize(new Dimension(850,nblig*320)); // Height doit etre proportionnele aux nombres de panneaux
	        scrollPane.setViewportView(panelscroll);
	        
	        lblVolsDiponibles.setForeground(Color.BLACK);
	        lblVolsDiponibles.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	        lblVolsDiponibles.setBounds(10, 15, 367, 25);
	        panel_1.add(lblVolsDiponibles);
	        
	        JLabel lblmesBilletsRservs = new JLabel((String) null);
	        lblmesBilletsRservs.setForeground(Color.BLACK);
	        lblmesBilletsRservs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	        lblmesBilletsRservs.setBounds(247, 15, 298, 25);
	        panel_1.add(lblmesBilletsRservs);
	        
	        label = new JLabel("");
	        label.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\rsz_aiplane-wing-sky-clouds-fly-wallpapersbyte-com-1920x1200.jpg"));
	        label.setBounds(0, 0, 1024, 596);
	        panel_1.add(label);
	
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(51, 204, 102));
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
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\conversation-speech-bubbles-.png"));
		lblNewLabel_10.setBounds(901, 20, 35, 25);
		panel.add(lblNewLabel_10);
		
		
	}
	 
	 

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==lblConx) {
			Signin s;
			try {if (enligne==false) {
				s = new Signin();
				s.setVisible(true);}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
		if ( e.getSource()==lblGovoyages) {
			Acceuil a;
			try {
				a = new Acceuil();
				a.setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);
		}
	if (e.getSource()==lblConx) {
			
			if(enligne==false && (!s.isVisible())){
				s.setVisible(true);}
			if(enligne==true) {
			if (p.isVisible()) {
				p.setVisible(false);}
			else {p.setVisible(true);}}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==lblGovoyages) {
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
	}
	@Override
	public void focusGained(FocusEvent e) {
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method st		
		if (e.getSource()== lblAide) {
		v = new MonClient();	
		if(!v.isVisible()) {
			v.setVisible(true);
		}

       }
	}
}



