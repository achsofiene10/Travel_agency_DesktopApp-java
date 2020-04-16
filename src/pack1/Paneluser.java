package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;

public class Paneluser extends JFrame implements MouseListener{
	JPanel panel ;
	JLabel lblreservation;
	JLabel lblsignout;
	Maconnection m ;
	
	public Paneluser() {
		initialize();
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		lblreservation = new JLabel("Mes reservations\r\n");
		lblsignout = new JLabel("Deconnexion\r\n");
		m=new Maconnection();

		
		panel = new JPanel();
		panel.setBackground(new Color(101, 240, 11));
		panel.setBounds(8, 47, 180, 1);
		getContentPane().add(panel);
		
		lblreservation.setForeground(Color.LIGHT_GRAY);
		lblreservation.setFont(new Font("Segoe UI Semilight", Font.BOLD | Font.ITALIC, 15));
		lblreservation.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\black-suitcase.png"));
		lblreservation.setBounds(10, 10, 190, 31);
		getContentPane().add(lblreservation);
		
		lblsignout.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\sign-out-option.png"));
		lblsignout.setBounds(10, 51,  190, 39);
		lblsignout.setFont(new Font("Segoe UI Semilight", Font.BOLD | Font.ITALIC, 15));
		lblsignout.setForeground(Color.LIGHT_GRAY);
		getContentPane().add(lblsignout);
		lblreservation.addMouseListener(this);
		lblsignout.addMouseListener(this);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		this.setBounds(980, 100, 200, 100);
		this.setUndecorated(true);
		this.setVisible(false);
		this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==lblsignout) {
			Window[] windows = getWindows();
			for (Window window : windows)
		    {
		        if (window instanceof JFrame)
		        {
		            window.dispose();
		        }}
			String req="UPDATE client set etat ='0'";
			try {
				m.modify(req);
				Acceuil a=new Acceuil();
				a.setVisible(true);
				this.setVisible(false);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (e.getSource()==lblreservation) {
			  Window[] windows = getWindows();
				for (Window window : windows)
			    {
			        if (window instanceof JFrame)
			        {
			            window.dispose();
			        }
			    }
				Mesreservations m;
				try {
					m = new Mesreservations();
					m.setVisible(true);
					this.setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		if(e.getSource()==lblreservation) {
			lblreservation.setForeground(Color.decode("#65F00B"));
		}
		if(e.getSource()==lblsignout) {
			lblsignout.setForeground(Color.decode("#65F00B"));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==lblreservation) {
			lblreservation.setForeground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==lblsignout) {
			lblsignout.setForeground(Color.LIGHT_GRAY);
		}
		
	}
}
