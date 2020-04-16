package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class MonClient extends JFrame implements KeyListener {
	String username2 ;
	JLabel label2;
	JScrollPane scroll;
	static JTextArea display2;
	static JTextArea text2;
	JPanel contentPane;
	static Socket clientSocket;
	static BufferedReader in;
	static PrintWriter out;
	private JButton btnsend;


	public static void main(String[] args) {
	MonClient frame = new MonClient();
		frame.setVisible(true);

	}
		// final Scanner sc = new Scanner(System.in);//pour lire à partir du clavier

//		try {
//			/*
//			 * les informations du serveur ( port et adresse IP ou nom d'hote
//			 * 127.0.0.1 est l'adresse local de la machine
//			 */
//			clientSocket = new Socket("127.0.0.1",4003);
//
//			//flux pour envoyer
//			out = new PrintWriter(clientSocket.getOutputStream());
//			//flux pour recevoir
//			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//
//			
//
//			Thread recevoir = new Thread(new Runnable() {
//				String msg;
//				@Override
//				public void run() {
//					try {
//						msg = in.readLine();
//						while(msg!=null){
//							if(!msg.equals("")) {
//							display2.append("Serveur :"+msg+"\n");}
//							//System.out.println("Serveur : "+msg);
//							msg = in.readLine();
//						}
//						System.out.println("Serveur déconecté");
//						out.close();
//						clientSocket.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//			recevoir.start();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	//}
	public MonClient() {
		Border border = BorderFactory.createLineBorder(new Color(46, 205, 182), 1);
		setBounds(100, 100, 442, 470);
		this.setTitle("Client");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(46, 205, 182)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        
		display2 = new JTextArea();
		display2.setBounds(10, 44, 422, 348);
		display2.setBorder(border);


		scroll=new JScrollPane(display2);
		scroll.setBounds(5, 64, 422, 319);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		contentPane.add(scroll);

		text2 = new JTextArea();
		text2.setBorder(border);
		text2.setBounds(5, 393, 322, 26);
		contentPane.add(text2);

		label2 = new JLabel("Discutez avec l'admin");
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label2.setBounds(23, 41, 322, 26);
		contentPane.add(label2);

		JButton clear2 = new JButton("CLEAR");
		clear2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear2.setBounds(342, 15, 85, 25);
		contentPane.add(clear2);
		
		JLabel lblNewLabel = new JLabel("Client");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\Testrmi\\user.png"));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 10, 139, 26);
		contentPane.add(lblNewLabel);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		
		btnsend = new JButton("Send");
		btnsend.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnsend.setBackground(new Color(245, 245, 245));
		btnsend.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\Testrmi\\send-button.png"));
		btnsend.setBounds(337, 393, 90, 25);
		contentPane.add(btnsend);
		
		btnsend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg=text2.getText();
				display2.append(msg+"\n");
				out.println(msg);
				out.flush();
				text2.setText("");
			}
		});
		
		
		text2.addKeyListener(this);
		try {
			/*
			 * les informations du serveur ( port et adresse IP ou nom d'hote
			 * 127.0.0.1 est l'adresse local de la machine
			 */
			clientSocket = new Socket("127.0.0.1",4006);

			//flux pour envoyer
			out = new PrintWriter(clientSocket.getOutputStream());
			//flux pour recevoir
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


			Thread recevoir = new Thread(new Runnable() {
				String msg;
				@Override
				public void run() {
					try {
						msg = in.readLine();
						while(msg!=null){
							if(!msg.equals("")) {
							display2.append("Admin :"+msg+"\n");}
							//System.out.println("Serveur : "+msg);
							msg = in.readLine();
						}
						System.out.println("Serveur déconecté");
						out.close();
						clientSocket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			recevoir.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			String msg=text2.getText();
			display2.append(msg);
			out.println(msg);
			out.flush();
			text2.setText("");
		}
	}
}
