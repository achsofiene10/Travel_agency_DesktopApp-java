
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Newtask extends JFrame implements ActionListener {
	JTextField idprojet;
	JTextField idtache;
	JTextField titretache;
	JTextField datedebut;
	JTextField datefin;
	ButtonGroup btngroup;
	JButton btnX;
	JComboBox Mois;
	JPanel trait;
	JLabel lblVotreVoyage;
	JLabel lblDestionation;
	JLabel lblConfirmezLadresseEmail;
	JLabel lblNewLabel_1;
	JLabel lblNom;
	JButton btnajouter;
	JLabel lblCodePostal;
	JLabel lblAdresse;

	String prix;
	String arrive;
	boolean simple = true;
	String numvol;
	String email;
	String depart;
	String datealler;
	String dateretour;
	String duree;
	String compagny;
	String temps;
	Monmodelp m;
	JScrollPane scroll;
	JTextArea description;
	private JComboBox chefprojet;


	public Newtask(Monmodelp m) {
		this.m = m;
		initialize();

	}

	void initialize() {
		description = new JTextArea();
		btnX = new JButton("X");
		Mois = new JComboBox();
		trait = new JPanel();
		lblVotreVoyage = new JLabel("Ajouter une nouvelle t\u00E2che");
		lblDestionation = new JLabel("Destination\r\n");
		idprojet = new JTextField();
		idprojet.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblConfirmezLadresseEmail = new JLabel("Titre du t\u00E2che");
		lblNom = new JLabel("ID t\u00E2che");
		btnajouter = new JButton("Ajouter cette t\u00E2che\r\n");
		idtache = new JTextField();
		idtache.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		datefin = new JTextField();
		datefin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		titretache = new JTextField();
		titretache.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		lblCodePostal = new JLabel("Chef concern\u00E9");
		lblAdresse = new JLabel("Date de d\u00E9but");
		scroll=new JScrollPane(description);
		scroll.setBounds(50, 381, 600, 68);
		getContentPane().add(scroll);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		

		this.setBounds(400, 100, 700, 500);
		this.setUndecorated(true);
		getContentPane().setBackground(new Color(245, 245, 245));
		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,new Color(0, 153, 255)));
		getContentPane().setLayout(null);
		btngroup = new ButtonGroup();

		trait.setBackground(new Color(0, 153, 255));
		trait.setBounds(50, 54, 600, 2);
		getContentPane().add(trait);

		lblVotreVoyage.setForeground(Color.BLACK);
		lblVotreVoyage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblVotreVoyage.setBounds(312, 19, 388, 25);
		getContentPane().add(lblVotreVoyage);

		lblDestionation.setForeground(Color.BLACK);
		lblDestionation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDestionation.setBounds(166, 66, 112, 25);
		getContentPane().add(lblDestionation);

		idprojet.setBounds(130, 17, 144, 31);
		getContentPane().add(idprojet);
		idprojet.setColumns(10);

		lblNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNom.setBounds(50, 70, 128, 25);
		getContentPane().add(lblNom);

		idtache.setColumns(10);
		idtache.setBounds(50, 101, 128, 31);
		getContentPane().add(idtache);

		titretache.setColumns(10);
		titretache.setBounds(50, 163, 238, 31);
		getContentPane().add(titretache);

		lblConfirmezLadresseEmail.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblConfirmezLadresseEmail.setBounds(50, 132, 238, 25);
		getContentPane().add(lblConfirmezLadresseEmail);

		datedebut = new JTextField();
		datedebut.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		datedebut.setColumns(10);
		datedebut.setBounds(50, 233, 171, 31);
		getContentPane().add(datedebut);

		lblAdresse.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblAdresse.setBounds(50, 204, 128, 25);
		getContentPane().add(lblAdresse);

		datefin.setColumns(10);
		datefin.setBounds(286, 233, 213, 31);
		getContentPane().add(datefin);

		JLabel lblVille = new JLabel("Date limite");
		lblVille.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblVille.setBounds(286, 204, 150, 25);
		getContentPane().add(lblVille);

		lblCodePostal.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblCodePostal.setBounds(50, 279, 185, 25);
		getContentPane().add(lblCodePostal);

		btnajouter.setOpaque(true);
		btnajouter.setForeground(Color.WHITE);
		btnajouter.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnajouter.setBackground(new Color(102, 153, 102));
		btnajouter.setBounds(218, 459, 238, 31);
		getContentPane().add(btnajouter);

		btnX.setForeground(new Color(102, 153, 102));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.setBackground(new Color(245, 245, 245));
		btnX.setBounds(658, 0, 42, 25);
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btnX) {
					dispose();
				}
			}
		});
		getContentPane().add(btnX);

		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnX.setBorder(emptyBorder);
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		btnX.addActionListener(this);
		btnajouter.addActionListener(this);
		lblDestionation.setText(this.arrive);

		JLabel lblNumroDuPassport = new JLabel("Description du t\u00E2che :");
		lblNumroDuPassport.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));
		lblNumroDuPassport.setBounds(50, 346, 218, 25);
		getContentPane().add(lblNumroDuPassport);
		lblNewLabel_1 = new JLabel("IDprojet");
		lblNewLabel_1.setBounds(43, 17, 119, 27);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 18));

		Mois.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 17));
		Mois.setModel(new DefaultComboBoxModel(new String[] {"Janvier ", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet ", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"}));
		Mois.setSelectedIndex(0);
		Mois.setBounds(363, 66, 202, 37);
		getContentPane().add(Mois);
		
		chefprojet = new JComboBox();
		chefprojet.setModel(new DefaultComboBoxModel(new String[] {"Chef1", "Chef2", "Chef3"}));
		chefprojet.setSelectedIndex(0);
		chefprojet.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 17));
		chefprojet.setBounds(50, 309, 202, 37);
		getContentPane().add(chefprojet);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnajouter) {
			if (idprojet.getText().isEmpty() || idtache.getText().isEmpty()
					|| datedebut.getText().isEmpty()  ||
					 datefin.getText().isEmpty() || 
					description.getText().isEmpty() || Mois.getSelectedIndex() == -1 || titretache.getText().isEmpty() || chefprojet.getSelectedIndex()==-1) {
				JOptionPane.showMessageDialog(null, "veuillez remplir toutes les champs");
			} else {
				/*
				 * Window[] windows = getWindows(); for (Window window : windows) { if (window
				 * instanceof JFrame) { window.dispose(); } }
				 */
				
				
				Object t1[] = {idprojet.getText(),Mois.getSelectedItem(), idtache.getText(),titretache.getText(),
						datedebut.getText(),
						 datefin.getText(),
						description.getText(),"0%",chefprojet.getSelectedItem()};
				m.ajouter(t1);
				Window[] windows = getWindows();
				for (Window window : windows) {
					if (window instanceof JFrame) {
						window.dispose();
					}
				}
				Accueil v = new Accueil();
				v.setVisible(true);
				m.fireTableDataChanged();
			}
		}
	}
}
