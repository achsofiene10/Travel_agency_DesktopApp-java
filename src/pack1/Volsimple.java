package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Volsimple extends JPanel implements MouseListener, ActionListener{
	JButton btnRserver;
	JLabel lblArr ;
	JLabel Tempsdep ;
	JLabel lblCompagnieAerienne;
	JLabel tempsarr;
	JLabel lblDureDeVoyage ;
	JLabel lblduree ;
	JLabel lblEscale;
	JLabel Datevol ;
	JLabel lblprice ;
	JLabel lblDpart;
	Maconnection m;
	ResultSetMetaData rsmd;
	ResultSet rs;
	String numvol;
	String email;
	

	Volsimple(String num ,String origine, String destination,String jdepart,String jarrivee,String hdepart, String harrivee,String duree,String escale,String prix,String company,String email) {
		setBackground(new Color(255, 255, 255));
		initialize();
		this.lblprice.setText(prix+"£");
		this.Datevol.setText(jdepart);
		this.lblCompagnieAerienne.setText(company);
		this.Tempsdep.setText(hdepart);
		this.tempsarr.setText(harrivee);
		this.lblArr.setText(destination);
		this.lblEscale.setText(escale);
		this.lblDpart.setText(origine);
		this.lblduree.setText(duree);
		this.numvol=num;
		this.email=email;
		
		JLabel lblBagageMain = new JLabel("Bagage \u00E0 main inclus");
		lblBagageMain.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\black-suitcase.png"));
		lblBagageMain.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblBagageMain.setBounds(413, 115, 182, 26);
		add(lblBagageMain);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\takeoff-the-plane.png"));
		lblNewLabel.setBounds(37, 41, 32, 26);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 908, 2);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 108, 908, 2);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(622, 40, 2, 66);
		add(panel_2);
		
	}

	 void initialize() {
		 btnRserver = new JButton("R\u00E9server\r\n");
		 lblArr = new JLabel("Arriv\u00E9");
		 Tempsdep = new JLabel("00:00 - ");
		 lblCompagnieAerienne = new JLabel("Compagnie aerienne");
		 tempsarr = new JLabel("12:00");
		 lblDureDeVoyage = new JLabel("Dur\u00E9e de voyage");
		 lblduree = new JLabel("1h;45 min");
		 lblEscale = new JLabel("Escale");
		 lblEscale.setForeground(Color.GREEN);
		 Datevol = new JLabel("Date du vol");
		 lblprice = new JLabel("556,55\u00A3");
		 lblDpart = new JLabel("D\u00E9part ");
		 m=new Maconnection();
		
		this.setSize(804,140);
		setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(new Color(66, 244, 104)));
		this.setVisible(true);
		lblDpart.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblDpart.setBounds(142, 59, 148, 26);
		add(lblDpart);
		
		lblArr.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblArr.setBounds(356, 59, 170, 26);
		add(lblArr);
		
		Tempsdep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		Tempsdep.setBounds(149, 41, 82, 21);
		add(Tempsdep);
		
		lblCompagnieAerienne.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		lblCompagnieAerienne.setBounds(10, 53, 148, 39);
		add(lblCompagnieAerienne);
		
		tempsarr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		tempsarr.setBounds(356, 41, 95, 21);
		add(tempsarr);
		
		lblDureDeVoyage.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblDureDeVoyage.setBounds(656, 10, 148, 26);
		add(lblDureDeVoyage);
		
		lblduree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblduree.setBounds(666, 45, 76, 13);
		add(lblduree);
		
		lblEscale.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblEscale.setBounds(656, 66, 105, 26);
		add(lblEscale);
		
		Datevol.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		Datevol.setBounds(235, 84, 170, 26);
		add(Datevol);
		
		lblprice.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblprice.setBounds(0, 7, 114, 26);
		add(lblprice);
		
		btnRserver.setOpaque(true);
		btnRserver.setForeground(Color.WHITE);
		btnRserver.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRserver.setBackground(new Color(102, 204, 51));
		btnRserver.setBounds(645, 115, 138, 28);
		add(btnRserver);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\rsz_flightcircuit.png"));
		lblNewLabel_1.setBounds(241, 41, 105, 30);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\clock.png"));
		lblNewLabel_2.setBounds(628, 10, 25, 25);
		add(lblNewLabel_2);
		
		this.addMouseListener(this);
		btnRserver.addMouseListener(this);
		btnRserver.addActionListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==this) {
			this.setBackground(Color.white);
		}
		if(e.getSource()==btnRserver) {
			btnRserver.setForeground(Color.white);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()==btnRserver) {
			boolean Ok=false;
			String req_select="select * from  client ;";  
			try {
				rs = m.selection(req_select);
				rsmd=rs.getMetaData();
				while ((this.rs.next()) &&(!Ok)) {
					int nbcol=rsmd.getColumnCount();
					String [] t=new String[nbcol];
					for (int i=0;i<nbcol;i++) {
						t[i]=rs.getString(i+1);
					}
					if(t[3].contentEquals("1")) {
						Ok=true;
					}
				}	
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (Ok==false) {
				JOptionPane.showMessageDialog(null, "Vous devez connecter pour réserver des tickets ensuite réessayez votre recherche ");
			}
			else {
			
			Reservation r=new Reservation(this);
			r.setVisible(true);}
		}
		
	}
}
