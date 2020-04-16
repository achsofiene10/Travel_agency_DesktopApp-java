package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
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

public class Panneau extends JPanel implements MouseListener, ActionListener{
	JButton btnRserver;
	JLabel lblArr ;
	JLabel Tempsdep ;
	JLabel lblCompagnieAerienne;
	JLabel tempsarr;
	JLabel lblDureDeVoyage ;
	JLabel lblduree ;
	JLabel lblEscale;
	JLabel Datevol ;
	JLabel lblPrix ;
	JLabel lblprice ;
	JLabel lblDpart;
	ResultSet rs;
	ResultSetMetaData rsmd;
	Maconnection m ;
	String numvol;
	String email;



	Panneau(String numvol,String origine, String destination,String jdepart,String jarrivee,String hdepart, String harrivee,String duree,String escale,String prix,String company,String email) {
		setBackground(new Color(255, 255, 255));
		initialize();
		this.lblprice.setText(prix+"€");
		this.Datevol.setText(jdepart);
		this.lblCompagnieAerienne.setText(company);
		this.Tempsdep.setText(hdepart);
		this.tempsarr.setText(harrivee);
		this.lblArr.setText(destination);
		this.lblEscale.setText(escale);
		this.lblDpart.setText(origine);
		this.lblduree.setText(duree);
		this.numvol=numvol;
		this.email=email;
		
		JLabel lbldash = new JLabel("-");
		lbldash.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lbldash.setBounds(71, 4, 22, 17);
		add(lbldash);
		
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
		 Datevol = new JLabel("Date du vol");
		 lblPrix = new JLabel("Prix billet\r\n");
		 lblPrix.setForeground(new Color(153, 0, 153));
		 lblprice = new JLabel("556,55\u00A3");
		 lblDpart = new JLabel("D\u00E9part ");
		 m=new Maconnection();
		
		this.setSize(804,140);
		setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(new Color(102, 153, 102)));
		this.setVisible(true);
		lblDpart.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblDpart.setBounds(33, 23, 114, 26);
		add(lblDpart);
		
		lblArr.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblArr.setBounds(33, 95, 114, 26);
		add(lblArr);
		
		Tempsdep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		Tempsdep.setBounds(0, 0, 66, 21);
		add(Tempsdep);
		
		lblCompagnieAerienne.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblCompagnieAerienne.setBounds(193, 58, 148, 26);
		add(lblCompagnieAerienne);
		
		tempsarr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		tempsarr.setBounds(93, 0, 95, 21);
		add(tempsarr);
		
		lblDureDeVoyage.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblDureDeVoyage.setBounds(381, 31, 148, 26);
		add(lblDureDeVoyage);
		
		lblduree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblduree.setBounds(407, 66, 76, 13);
		add(lblduree);
		
		lblEscale.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblEscale.setBounds(532, 58, 105, 26);
		add(lblEscale);
		
		Datevol.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		Datevol.setBounds(31, 59, 89, 26);
		add(Datevol);
		
		lblPrix.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 24));
		lblPrix.setBounds(672, 22, 115, 23);
		add(lblPrix);
		
		lblprice.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblprice.setBounds(673, 55, 114, 26);
		add(lblprice);
		
		btnRserver.setOpaque(true);
		btnRserver.setForeground(Color.WHITE);
		btnRserver.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRserver.setBackground(new Color(102, 204, 51));
		btnRserver.setBounds(656, 93, 138, 32);
		add(btnRserver);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\timeline.png"));
		lblNewLabel_1.setBounds(0, 27, 26, 94);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\clock.png"));
		lblNewLabel_2.setBounds(381, 58, 26, 26);
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
		if (e.getSource()==this) {
			this.setBackground(new Color(237, 240, 244));
		}
		if(e.getSource()==btnRserver) {
			btnRserver.setForeground(Color.black);
		}
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
				JOptionPane.showMessageDialog(null, "Vous devez connecter pour réserver des tickets ");
			}
			else {
			Reservation r=new Reservation(this);
			r.setVisible(true);}
		}}
		
	}

