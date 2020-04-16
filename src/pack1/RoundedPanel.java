package pack1;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;


class RoundedPanel extends JPanel implements ActionListener
{
    private Color backgroundColor;
    private int cornerRadius = 30;
    JButton btnimprimer ;
    JLabel lblNamepassenger;


    public RoundedPanel(int radius, Color bgColor, Billet b) {
        super();
        setBackground(new Color(255, 255, 255));
        cornerRadius = radius;
        backgroundColor = bgColor;
        this.setBounds(0,0,1000,300);
        setLayout(null);
        btnimprimer = new JButton("Imprimer ticket");
        lblNamepassenger = new JLabel("Sofiene Achour");
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(45, 229, 119));
        panel.setBounds(10, 10, 60, 280);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("\r\n");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\earth-globe-with-continents-maps.png"));
        lblNewLabel_1.setBounds(15, 220, 57, 41);
        panel.add(lblNewLabel_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(45, 229, 119));
        panel_1.setBounds(60, 29, 915, 10);
        add(panel_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\blackberry-qr-code-variant.png"));
        lblNewLabel_2.setBounds(872, 191, 103, 99);
        add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\takeoff-the-plane.png"));
        lblNewLabel_3.setBounds(920, 3, 55, 39);
        add(lblNewLabel_3);
        
        JLabel lblPassengerName = new JLabel("Passenger Name");
        lblPassengerName.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblPassengerName.setBounds(102, 49, 227, 39);
        add(lblPassengerName);
        
        JLabel lblFrom = new JLabel("From");
        lblFrom.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblFrom.setBounds(354, 49, 67, 39);
        add(lblFrom);
        
        JLabel lblTo = new JLabel("To");
        lblTo.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblTo.setBounds(541, 49, 67, 39);
        add(lblTo);
        
        JLabel lblDepart = new JLabel("Paris");
        lblDepart.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblDepart.setText(b.depart);
        lblDepart.setBounds(345, 86, 216, 31);
        add(lblDepart);
        
        JLabel lblArrivée = new JLabel("Tunis");
        lblArrivée.setText(b.arrivee);
        lblArrivée.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblArrivée.setBounds(541, 86, 225, 31);
        add(lblArrivée);
        
        JLabel lblNamepassenger = new JLabel("Sofiene Achour");
        lblNamepassenger.setText(b.nomprenom);
        lblNamepassenger.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblNamepassenger.setBounds(104, 86, 153, 31);
        add(lblNamepassenger);
        
        JLabel lblFlightNumber = new JLabel("Flight Number ");
        lblFlightNumber.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblFlightNumber.setBounds(102, 127, 227, 39);
        add(lblFlightNumber);
        
        JLabel lblCompagny = new JLabel("Compagny");
        lblCompagny.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblCompagny.setBounds(311, 127, 171, 39);
        add(lblCompagny);
        
        JLabel lblDeparture = new JLabel("Departure time");
        lblDeparture.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblDeparture.setBounds(539, 127, 171, 39);
        add(lblDeparture);
        
        JLabel lblPassportNumber = new JLabel("Passport N\u00B0\r\n");
        lblPassportNumber.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblPassportNumber.setBounds(776, 78, 192, 39);
        add(lblPassportNumber);
        
        JLabel lblflightnumber = new JLabel("Ak8456");
        lblflightnumber.setText(b.numvol);
        lblflightnumber.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblflightnumber.setBounds(80, 176, 221, 31);
        add(lblflightnumber);
        
        JLabel lblcompagny = new JLabel("Tunisair");
        lblcompagny.setText(b.compagnie);
        lblcompagny.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblcompagny.setBounds(311, 176, 153, 31);
        add(lblcompagny);
        
        JLabel lbltime = new JLabel("13:00 2019-04-24");
        lbltime.setText(b.datealler);
        lbltime.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lbltime.setBounds(535, 176, 192, 31);
        add(lbltime);
        
        JLabel lblTitle = new JLabel("PLANE TICKET / TRANSPORTATION\r\n");
        lblTitle.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 28));
        lblTitle.setBounds(450, 0, 480, 33);
        add(lblTitle);
        
        JLabel lblpassport = new JLabel("956256356");
        lblpassport.setText(b.passport);
        lblpassport.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblpassport.setBounds(777, 113, 153, 31);
        add(lblpassport);
        
        JLabel lblhmin = new JLabel("3h00min");
        lblhmin.setText(b.duree);
        lblhmin.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblhmin.setBounds(174, 247, 153, 31);
        add(lblhmin);
        
        JLabel lblFlyingTime = new JLabel("Flying time\r\n");
        lblFlyingTime.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblFlyingTime.setBounds(174, 217, 192, 39);
        add(lblFlyingTime);
        
        JLabel lblRoundTrip = new JLabel("Round trip");
        if (b.dateretour.equals("0000-00-00")) {
        	lblRoundTrip.setText("Simple Trip");
        }
        lblRoundTrip.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
        lblRoundTrip.setBounds(745, 191, 192, 39);
        add(lblRoundTrip);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setBounds(740, 42, 5, 236);
        add(panel_2);
        
        JLabel lblretour = new JLabel("");
        if (!b.dateretour.equals("0000-00-00")){
        	lblretour.setText("Return Date :"+b.dateretour);
        }
        lblretour.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
        lblretour.setBounds(462, 206, 192, 31);
        add(lblretour);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\flat-world-map.png"));
        lblNewLabel.setBounds(232, 10, 512, 300);
        add(lblNewLabel);
        
        btnimprimer.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        btnimprimer.setBounds(488, 247, 171, 32);
        add(btnimprimer);
        
        JLabel lblNewLabel_4 = new JLabel("If you will have a round trip you will get your return ticket at the airport");
        lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
        lblNewLabel_4.setBounds(394, 261, 441, 49);
        add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\airplane-flight.png"));
        lblNewLabel_5.setBounds(795, 218, 67, 44);
        add(lblNewLabel_5);
        
        btnimprimer.addActionListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        
        
      
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnimprimer) {
			FileWriter f;
			try {
				f = new FileWriter(new File(this.lblNamepassenger.getText()+".html"));
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
		}
	}
}
