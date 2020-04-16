package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Splach extends JFrame {


	/**
	 * Launch the application.
	 */
	
	public Splach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		this.setUndecorated(true);
		this.setBounds(250, 50, 1024, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setBackground(Color.white);
		
		
		JButton btnX = new JButton("X");
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setBorder(emptyBorder);
		btnX.setBackground(new Color(135, 206, 250));
		btnX.setForeground(new Color(255, 255, 255));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.setBounds(982, 0, 42, 25);
		this.getContentPane().add(btnX);
		
		JLabel lblAvecLapplicationGovoyages = new JLabel("avec l'application Shvoyages ");
		lblAvecLapplicationGovoyages.setForeground(Color.WHITE);
		lblAvecLapplicationGovoyages.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		lblAvecLapplicationGovoyages.setBackground(Color.WHITE);
		lblAvecLapplicationGovoyages.setBounds(541, 0, 393, 136);
		getContentPane().add(lblAvecLapplicationGovoyages);
		
		JLabel lblPrparerVotreVoyage = new JLabel("Planifiez le voyage parfait ");
		lblPrparerVotreVoyage.setForeground(Color.WHITE);
		lblPrparerVotreVoyage.setBackground(Color.WHITE);
		lblPrparerVotreVoyage.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		lblPrparerVotreVoyage.setBounds(541, -44, 393, 136);
		getContentPane().add(lblPrparerVotreVoyage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -17, 1024, 698);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\5154536-travel-wallpaper.jpg"));
		
		
		btnX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnX) {
					dispose();
				}
				// TODO Auto-generated method stub
				
			}
		});
	}
}
