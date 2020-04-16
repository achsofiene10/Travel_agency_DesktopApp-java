package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class Signin extends JFrame implements ActionListener,MouseListener, KeyListener {
	JTextField txtmail;
	JPasswordField txtpassword;
	JButton btnX ;
	JLabel lblSeConnecter;
	JLabel Signup;
	JPanel panel;
	JButton btnCnx;
	Acceuil Acc;
	Maconnection m;
	ResultSet rs;
	ResultSetMetaData rsmd;
	int nbcol;
	public Signin() throws SQLException {
		initialize();
		
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	void initialize() throws SQLException {
		btnX = new JButton("X");
		panel = new JPanel();
		btnCnx = new JButton("Connexion");
		txtmail = new JTextField();
		txtpassword = new JPasswordField();
		lblSeConnecter = new JLabel("Se connecter ");
		Signup = new JLabel("S'inscrire gratuitement");
		m=new Maconnection();
	

		this.setBounds(600, 100, 400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		
		
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		lblSeConnecter.setForeground(new Color(255, 255, 255));
		lblSeConnecter.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 26));
		lblSeConnecter.setBounds(10, 10, 175, 47);
		panel.add(lblSeConnecter);
		
		btnX.setForeground(new Color(255, 255, 255));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnX.setBackground(UIManager.getColor("Label.disabledShadow"));
		btnX.setBounds(361, 0, 39, 38);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setContentAreaFilled(false);
		btnX.setBorder(emptyBorder);
		panel.add(btnX);
		
		btnX.addActionListener(this);
		
		txtmail.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 15));
		txtmail.setBounds(78, 279, 244, 47);
		panel.add(txtmail);
		txtmail.setColumns(10);
		
		txtpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpassword.setBounds(78, 361, 245, 47);
		panel.add(txtpassword);
		
		txtmail.addKeyListener(this);
		txtpassword.addKeyListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(78, 336, 107, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse e-mail");
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(80, 255, 105, 23);
		panel.add(lblNewLabel_2);
		
		btnCnx.setBackground(new Color(102, 204, 102));
		btnCnx.setForeground(new Color(255, 255, 255));
		btnCnx.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnCnx.setBounds(113, 429, 167, 47);
		btnCnx.addMouseListener(this);
		panel.add(btnCnx);
		
		JLabel lblPasEncoreDe = new JLabel("Pas encore de compte? ");
		lblPasEncoreDe.setForeground(Color.WHITE);
		lblPasEncoreDe.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblPasEncoreDe.setBounds(41, 492, 157, 24);
		panel.add(lblPasEncoreDe);
		
		Signup.setForeground(new Color(255, 255, 255));
		Signup.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		Signup.setBounds(198, 492, 192, 22);
		panel.add(Signup);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\Aircraft.jpg"));
		lblNewLabel_3.setBounds(0, 0, 400, 600);
		panel.add(lblNewLabel_3);
		
		Signup.addMouseListener(this);
		btnCnx.addActionListener(this);
		
		
		
		
		 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnX) {
			dispose();
		
		}
		if (e.getSource()==btnCnx) {
			String req_select="select * from  client ;";  
			try {
				rs = m.selection(req_select);
				rsmd=rs.getMetaData();
				nbcol=rsmd.getColumnCount();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			String pass=String.valueOf(txtpassword.getPassword());
			if (txtmail.getText().isEmpty() || pass.equals("")) {
				JOptionPane.showMessageDialog(null, "Merci de verifier les deux champs");
			}
			else {
			boolean Ok=false;
			try {
				while ((this.rs.next()) &&(!Ok)) {
					String [] t=new String[nbcol];
					for (int i=0;i<nbcol;i++) {
						t[i]=rs.getString(i+1);
					}
					if(txtmail.getText().equals(t[1]) && pass.equals(t[2])) {
						Ok=true;
						JOptionPane.showMessageDialog(null, "Connexion effectué avec succes");
					    Window[] windows = getWindows();
						for (Window window : windows)
					    {
					        if (window instanceof JFrame)
					        {
					            window.dispose();
					        }
					    }
					}
				}
				rs.beforeFirst();
				if (Ok==false) {
					JOptionPane.showMessageDialog(null, "Compte inexistant");
				}
				else {
					String req="UPDATE client set etat ='1' where email ='"+txtmail.getText().toString()+"'";
					m.modify(req);
					Acceuil a=new Acceuil();
					a.setVisible(true);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==Signup) {
			Signup s=new Signup();
			s.setVisible(true);
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
		if  (e.getSource()==btnCnx) {
			btnCnx.setForeground(new Color(102, 204, 102));
			btnCnx.setBackground(Color.white);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if  (e.getSource()==btnCnx) {
			btnCnx.setForeground(Color.white);
			btnCnx.setBackground(new Color(102, 204, 102));
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			String pass=String.valueOf(txtpassword.getPassword());
			if (txtmail.getText().isEmpty() || pass.equals("")) {
				JOptionPane.showMessageDialog(null, "Merci de verifier les deux champs");
			}
			else {
				String req_select="select * from  client ;";  
				try {
					rs = m.selection(req_select);
					rsmd=rs.getMetaData();
					nbcol=rsmd.getColumnCount();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			boolean Ok=false;
			try {
				while ((this.rs.next()) &&(!Ok)) {
					String [] t=new String[nbcol];
					for (int i=0;i<nbcol;i++) {
						t[i]=rs.getString(i+1);
					}
					if(txtmail.getText().equals(t[1]) && pass.equals(t[2])) {
						Ok=true;
						JOptionPane.showMessageDialog(null, "Connexion effectué avec succes");
					    Window[] windows = getWindows();
						for (Window window : windows)
					    {
					        if (window instanceof JFrame)
					        {
					            window.dispose();
					        }
					    }
					}
				}
				rs.beforeFirst();
				if (Ok==false) {
					JOptionPane.showMessageDialog(null, "Compte inexistant");
				}
				else {
					String req="UPDATE client set etat ='1' where email ='"+txtmail.getText().toString()+"'";
					m.modify(req);
					Acceuil a=new Acceuil();
					a.setVisible(true);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			}
		}
		}
			
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}


