package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonAdmin extends JFrame implements  KeyListener, ActionListener{
    static String username1 ;
	private JPanel contentPane;
	String msg="";
	String ch="";
	
	JScrollPane scroll;
	
	 javax.swing.JLabel label1;
	 static javax.swing.JTextArea display1;
	 JButton btnsend;
	 static JTextArea text1;
	 JButton clear1;
	 static ServerSocket serveurSocket  ;
     static Socket clientSocket ;
     static BufferedReader in;
     static PrintWriter out;
	
	public static void main(String[] args) {
		
					MonAdmin frame = new MonAdmin();
					frame.setVisible(true);
		
	    // final Scanner sc=new Scanner(System.in);
	    
	     try {
	    	 serveurSocket = new ServerSocket(4006);
	         clientSocket = serveurSocket.accept();
	         out = new PrintWriter(clientSocket.getOutputStream());
	         in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
	       
	     
	         Thread recevoir= new Thread(new Runnable() {
	            String msg ;
	            @Override
	            public void run() {
	               try {
	                  msg = in.readLine();
	                  //tant que le client est connecté
	                  while(msg!=null){
	                	  if(!msg.equals("")) {
	                	 display1.append("Client : "+msg+"\n");}
	                     //System.out.println("Client : "+msg);
	                     msg = in.readLine();
	                  }
	                  //sortir de la boucle si le client a déconecté
	                  System.out.println("Client déconecté");
	                  //fermer le flux et la session socket
	                  out.close();
	                  clientSocket.close();
	                  serveurSocket.close();
	               } catch (IOException e) {
	                    e.printStackTrace();
	               }
	           }
	            
	            
	        });
	        recevoir.start();
	        }catch (IOException e) {
	           e.printStackTrace();
	        }
	     }
	   
	

	public MonAdmin() {
		setBounds(100, 100, 442, 470);
		this.setTitle("Admin");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(46, 205, 182)));
		setContentPane(contentPane);
		Border border = BorderFactory.createLineBorder(new Color(46, 205, 182), 1);
		contentPane.setLayout(null);
		

		display1 = new JTextArea();
		display1.setBounds(10, 44, 422, 348);
		display1.setBorder(border);


		scroll=new JScrollPane(display1);
		scroll.setBounds(5, 64, 422, 319);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		contentPane.add(scroll);

		text1 = new JTextArea();
		text1.setBorder(border);
		text1.setBounds(5, 393, 322, 26);
		contentPane.add(text1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label1 = new JLabel("Discutez avec un client");
		label1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label1.setBounds(23, 41, 139, 26);
		contentPane.add(label1);

		JButton clear2 = new JButton("CLEAR");
		clear2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear2.setBounds(342, 15, 85, 25);
		contentPane.add(clear2);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\Testrmi\\user.png"));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		lblNewLabel.setBounds(23, 10, 139, 26);
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
				String msg=text1.getText();
				display1.append(msg+"\n");
				out.println(msg);
				out.flush();
				text1.setText("");
			}
		});
		
		
		text1.addKeyListener(this);
//		
//		  try {
//		    	 serveurSocket = new ServerSocket(4005);
//		         clientSocket = serveurSocket.accept();
//		         out = new PrintWriter(clientSocket.getOutputStream());
//		         in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
//		       
//		     
//		         Thread recevoir= new Thread(new Runnable() {
//		            String msg ;
//		            @Override
//		            public void run() {
//		               try {
//		                  msg = in.readLine();
//		                  //tant que le client est connecté
//		                  while(msg!=null){
//		                	  if(!msg.equals("")) {
//		                	 display1.append("Client : "+msg+"\n");}
//		                     //System.out.println("Client : "+msg);
//		                     msg = in.readLine();
//		                  }
//		                  //sortir de la boucle si le client a déconecté
//		                  System.out.println("Client déconecté");
//		                  //fermer le flux et la session socket
//		                  out.close();
//		                  clientSocket.close();
//		                  serveurSocket.close();
//		               } catch (IOException e) {
//		                    e.printStackTrace();
//		               }
//		           }
//		            
//		            
//		        });
//		        recevoir.start();
//		        }catch (IOException e) {
//		           e.printStackTrace();
//		        }
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
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			msg=text1.getText();
			display1.append(msg);
      	    out.println(msg);
            out.flush();
			text1.setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	 
}
