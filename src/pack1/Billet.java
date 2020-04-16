package pack1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class Billet extends JPanel {
	
	String numvol;
	String depart ;
	 String arrivee;
	 String compagnie;
	 String datealler;
	 String dateretour;
	 String duree;
	 String passport;
	 String nomprenom;
	public Billet(String numvol, String depart, String arrivee, String compagnie, String datealler, String dateretour , String duree, String passport, String nomprenom) {
		setBackground(Color.WHITE);
		this.numvol=numvol;
		this.depart=depart;
		this.arrivee=arrivee;
		this.compagnie=compagnie;
		this.datealler=datealler;
		this.dateretour=dateretour;
		this.duree=duree;
		this.passport=passport;
		this.nomprenom=nomprenom;
		initialize();
	}

	
	 void initialize() {
	    JPanel p1 = new RoundedPanel(30, new Color(232, 236, 242),this);
	    this.setBackground(Color.white);
		this.setBounds(10, 10, 980, 300);
        p1.setBounds(10,10,980,300);
		this.add(p1);
		setLayout(null);
	}
}
