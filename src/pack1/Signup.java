package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener, MouseListener, KeyListener{

	JPanel panel;
	JButton btnX;
	JLabel lblSeConnecter;
	JTextField txtmail;
	JPasswordField txtmdp1;
	JPasswordField textmdp2;
	JButton btnsignup;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	ResultSet rs;
	ResultSetMetaData rsmd;
	int nbcol;
	Maconnection m;

	/**
	 * Launch the application.
	 */

	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		 	panel=new JPanel();
		 	JLabel lblNewLabel_3 = new JLabel("New label");
			lblSeConnecter = new JLabel("S'inscrire ");
			btnsignup = new JButton("Créer mon compte");
			txtmdp1 = new JPasswordField();
			textmdp2 = new JPasswordField();
			btnX=new JButton("X");
			m=new Maconnection();
			

			this.setBounds(600, 100, 400, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setUndecorated(true);
			this.setVisible(true);
			
			lblSeConnecter.setForeground(new Color(255, 255, 255));
			lblSeConnecter.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 26));
			lblSeConnecter.setBounds(10, 10, 175, 47);
			panel.add(lblSeConnecter);

			panel.setBackground(Color.WHITE);
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			btnX.setForeground(new Color(255, 255, 255));
			btnX.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnX.setBackground(UIManager.getColor("Label.disabledShadow"));
			btnX.setBounds(361, 0, 39, 38);
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnX.setContentAreaFilled(false);
			btnX.setBorder(emptyBorder);
			panel.add(btnX);
			
			btnX.addActionListener(this);
			
			txtmail = new JTextField();
			txtmail.setBackground(Color.WHITE);
			txtmail.setText("");
			txtmail.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 15));
			txtmail.setBounds(79, 168, 244, 47);
			panel.add(txtmail);
			
			txtmdp1.setText("");
			panel.add(txtmdp1);
			txtmdp1.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 15));
			txtmdp1.setBounds(79, 248, 244, 47);
			txtmdp1.setColumns(10);
			panel.add(txtmdp1);
			
			
			textmdp2.setText("");
			textmdp2.setBounds(79, 328, 244, 47);
			textmdp2.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 15));
			panel.add(textmdp2);
			textmdp2.setColumns(10);
			
			txtmail.addKeyListener(this);
			txtmdp1.addKeyListener(this);
			textmdp2.addKeyListener(this);
			
			btnsignup.setBackground(new Color(102, 204, 102));
			btnsignup.setForeground(new Color(255, 255, 255));
			btnsignup.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
			btnsignup.setBounds(112, 417, 167, 47);
			btnsignup.addMouseListener(this);
			btnsignup.addActionListener(this);
			panel.add(btnsignup);
			
			
			JLabel lblNewLabel = new JLabel("Adresse e-mail");
			lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
			lblNewLabel.setBounds(80, 134, 144, 33);
			lblNewLabel.setForeground(Color.WHITE);
			panel.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel("Mot de passe");
			lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(79, 225, 111, 23);
			panel.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("Retaper le mot de passe");
			lblNewLabel_2.setBounds(79, 305, 167, 24);
			lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
			lblNewLabel_2.setForeground(Color.WHITE);
			panel.add(lblNewLabel_2);

			
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\Aircraft.jpg"));
			lblNewLabel_3.setBounds(0, 0, 400, 600);
			panel.add(lblNewLabel_3);
			
	
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnX) {
			dispose();
		}
		if ( e.getSource()==btnsignup) {
			String pass1=String.valueOf(txtmdp1.getPassword());
			String pass2=String.valueOf(textmdp2.getPassword());

			if (!pass1.equals(pass2) || pass1.equals("") || pass2.equals("") || txtmail.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs");	
			}
			else {
			String req="Insert into client values( "+"15563"+",'"+txtmail.getText().toString()+"','"+pass1+"','0') ; ";
			try {
				m.ajout(req);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Inscription effectué avec succés");	
			dispose();}
		}
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
		if  (e.getSource()==btnsignup) {
			btnsignup.setForeground(new Color(102, 204, 102));
			btnsignup.setBackground(Color.white);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if  (e.getSource()==btnsignup) {
			btnsignup.setForeground(Color.white);
			btnsignup.setBackground(new Color(102, 204, 102));
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
			String pass1=String.valueOf(txtmdp1.getPassword());
			String pass2=String.valueOf(textmdp2.getPassword());

			if (!pass1.equals(pass2) || pass1.equals("") || pass2.equals("") || txtmail.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Merci de verifier tous les champs");	
			}
			else {
			String req="Insert into client values( "+"15563"+",'"+txtmail.getText().toString()+"','"+pass1+"','0') ; ";
			try {
				m.ajout(req);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Inscription effectué avec succés");	
			dispose();}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
