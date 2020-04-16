

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;

import pack1.MonAdmin;
import pack1.MonClient;
import pack2.Maconnection;
import pack2.Monmodel;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.EventObject;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Accueil extends JFrame implements ActionListener {

	JTable t;
	Maconnection m;
	Monmodelp mod;
	ResultSet rs;
	JButton btnDelete ;
	JButton btnNew ;
	JButton btnEdit ;
	JButton btnRefresh;
	JButton btnplanning ;
	JButton btnchefs ;
	JPanel panel ;
	JButton btnX ;
	JPanel panel_1 ;
	JPanel panel_2;
	JScrollPane scrollPane ;
	JLabel lblLaListeDe ;
	private JLabel lblSelectionnerLePlanning;
	JComboBox Mois ;
	JScrollPane scroll;
	private JLabel label;
	private JLabel lblDashboardSdl;

    
	public Accueil() {
		initialize();
	}


	void initialize() {

		this.setBounds(250, 50, 1024, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.getContentPane().setLayout(null);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		t=new JTable();
		label = new JLabel("...");
		m=new Maconnection();
		btnNew = new JButton("Nouveau vol");
		btnEdit = new JButton("Modifier vol");
		btnDelete = new JButton("Supprimer vol");
		btnRefresh = new JButton("Actualiser");
		btnplanning = new JButton("Planning des t\u00E2ches mensuel\r\n");
		btnchefs = new JButton("Chefs des projets");
		Mois = new JComboBox();

		btnNew.setText("<html> Ajouter <br> t\u00E2che</html>");
		btnEdit.setText("<html>Modifier<br />t\u00E2che</html>");
		btnDelete.setText("<html>Supprimer<br />t\u00E2che</html>");



		panel = new JPanel();
		panel.setBackground(new Color(232, 235, 239));
		panel.setBounds(0, 0, 1024, 105);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnplanning.setBorder(emptyBorder);
		btnplanning.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\white suitcase.png"));
		btnplanning.setForeground(Color.WHITE);
		btnplanning.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnplanning.setBackground(new Color(30, 144, 255));
		btnplanning.setBounds(174, 39, 300, 44);
		panel.add(btnplanning);
		
		

		btnchefs.setBorder(emptyBorder);
		btnchefs.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\user.png"));
		btnchefs.setForeground(Color.WHITE);
		btnchefs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnchefs.setBackground(new Color(199, 21, 133));
		btnchefs.setBounds(519, 39, 218, 44);
		panel.add(btnchefs);

		btnX = new JButton("X");
		btnX.setForeground(new Color(0, 0, 0));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		btnX.setBackground(new Color(232, 235, 239));
		btnX.setBounds(982, 0, 42, 25);
		btnX.setBorder(emptyBorder);
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					dispose();
				
				// TODO Auto-generated method stub

			}
		});
		panel.add(btnX);
		
		lblDashboardSdl = new JLabel("Dashboard SDL\r\n");
		lblDashboardSdl.setForeground(Color.BLACK);
		lblDashboardSdl.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 28));
		lblDashboardSdl.setBounds(10, 10, 226, 25);
		panel.add(lblDashboardSdl);

		 panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(0, 102, 1024, 446);
		getContentPane().add(panel_1);

		panel_2 = new JPanel();
		panel_2.setForeground(new Color(153, 204, 255));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 546, 1024, 94);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		panel_1.setLayout(null);

		
		t.setRowHeight(50);
		t.setDefaultRenderer(Object.class, new YourTableCellRenderer());

		scrollPane = new JScrollPane(t);
		scrollPane.setBounds(265, 51, 727, 385);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane);

		lblLaListeDe = new JLabel("Le planning des t\u00E2ches pour le mois du ");
		lblLaListeDe.setForeground(new Color(0, 0, 0));
		lblLaListeDe.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 28));
		lblLaListeDe.setBounds(265, 0, 503, 41);
		panel_1.add(lblLaListeDe);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 255));
		panel_3.setBounds(0, 123, 254, 146);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		lblSelectionnerLePlanning = new JLabel("<html> Le planning \u00E0 \u00E9diter </html>");
		lblSelectionnerLePlanning.setBounds(10, 20, 250, 65);
		panel_3.add(lblSelectionnerLePlanning);
		lblSelectionnerLePlanning.setForeground(new Color(255, 255, 255));
		lblSelectionnerLePlanning.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		
		Mois.setBounds(10, 74, 220, 40);
		panel_3.add(Mois);
		Mois.setModel(new DefaultComboBoxModel(new String[] {"Janvier ", "Fevrier", "Mars", "Avril ", "Mai", "Juin ", "Juillet ", "Aout", "Septembre ", "Novembre ", "Decembre"}));
		Mois.setSelectedIndex(0);
		
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 28));
		label.setBounds(744, 0, 200, 41);
		panel_1.add(label);


		btnNew.addActionListener(this);
		btnNew.setBackground(Color.DARK_GRAY);
		btnNew.setBorder(emptyBorder);
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		btnNew.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\add-new-page.png"));
		btnNew.setBounds(175, 10, 109, 59);
		panel_2.add(btnNew);

		btnEdit.setBorder(emptyBorder);
		btnEdit.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\new-file.png"));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		btnEdit.setBackground(Color.DARK_GRAY);
		btnEdit.setBounds(345, 10, 109, 59);
		panel_2.add(btnEdit);
		btnEdit.addActionListener(this);

		btnDelete.setBorder(emptyBorder);
		btnDelete.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\delete.png"));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		btnDelete.setBackground(Color.DARK_GRAY);
		btnDelete.setBounds(536, 12, 127, 55);
		btnDelete.addActionListener(this);
		panel_2.add(btnDelete);

		 btnRefresh = new JButton("Actualiser");
		btnRefresh.setBorder(emptyBorder);
		btnRefresh.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\refresh-page-option.png"));
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		btnRefresh.setBackground(Color.DARK_GRAY);
		btnRefresh.setBounds(723, 10, 127, 59);
		panel_2.add(btnRefresh);
		this.setBackground(Color.white);
		this.setResizable(false);
		
		
		this.btnplanning.addActionListener(this);
		this.btnchefs.addActionListener(this);
		
		Mois.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String selectedValue = (String) Mois.getSelectedItem();
				String req_select="SELECT  `IDprojet`, `Mois`, `IDtâche`, `Titredutâche`, `Datededébut`, `DateLimite`, `Description`, `TauxAvancement`, `ChefDuprojet` FROM `planning` where Mois='"+selectedValue+"'";  
				label.setText(selectedValue);
				ResultSet rs;
				try {
					rs = m.selection(req_select);
					mod=new Monmodelp(rs);
					t.setModel(mod);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		

	}


	public class YourTableCellRenderer
	extends DefaultTableCellRenderer {
		public Component getTableCellRendererComponent(JTable table,
				Object value,
				boolean isSelected,
				boolean hasFocus,
				int row,
				int column) {
			Component c = 
					super.getTableCellRendererComponent(table, value,
							isSelected, hasFocus,
							row, column);

			// Only for specific cell
			//if (row ==  && column ==10) {
				c.setFont(null);
				c.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 15));
				c.setForeground(new Color(122, 26, 191));
				//c.setBackground(new Color(224, 236, 255));
			//}
			return c;
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNew) {
			Newtask newtask=new Newtask(mod);
			newtask.setVisible(true);
		}
		if (e.getSource()==btnEdit) {
			int rowIndex = t.getSelectedRow();
			int colIndex = t.getSelectedColumn();
			if (rowIndex==-1 || colIndex==-1) {
				JOptionPane.showMessageDialog(null, "Selectionner la ligne que vous voulez modifier");
			}else {
			t.editCellAt(rowIndex, colIndex);}
		}
		if (e.getSource()==btnDelete) {
			int col=t.getSelectedColumn();
			int row=t.getSelectedRow();
			if (row==-1 || col==-1) {
				JOptionPane.showMessageDialog(null, "Selectionner la ligne que vous voulez supprimer");
			}else {
			this.mod.supprimer(row, col);
			mod.fireTableDataChanged();	}
		}
		if (e.getSource()==btnRefresh) {
			mod.fireTableDataChanged();	}
		if (e.getSource()==btnplanning ) {
			//this.setVisible(false);
			//ReservationsEdit r=new ReservationsEdit();
			//r.setVisible(true);
		}
		if (e.getSource()==btnchefs ) {
			//this.setVisible(false);
			//ClientsEdit r=new ClientsEdit();
			//r.setVisible(true);
		}
       
		
		
	}
}

