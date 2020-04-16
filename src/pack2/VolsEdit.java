package pack2;

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.EventObject;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VolsEdit extends JFrame implements ActionListener {

	JTable t;
	Maconnection m;
	Monmodel mod;
	ResultSet rs;
	JButton btnDelete ;
	JButton btnNew ;
	JButton btnEdit ;
	JButton btnRefresh;
	JButton btnReservations ;
	JButton btnClients ;
	JButton buttonMsg;
	JPanel panel ;
	JLabel label ;
	JButton btnvol;
	JButton btnX ;
	JLabel lblNewLabel ;
	JPanel panel_1 ;
	JPanel panel_2;
	JScrollPane scrollPane ;
	JLabel lblLaListeDe ;

    
	public VolsEdit() {
		initialize();
	}


	void initialize() {

		this.setBounds(250, 50, 1024, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.getContentPane().setLayout(null);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		t=new JTable();
		m=new Maconnection();
		btnNew = new JButton("Nouveau vol");
		btnEdit = new JButton("Modifier vol");
		btnDelete = new JButton("Supprimer vol");
		btnRefresh = new JButton("Actualiser");
		btnReservations = new JButton("Reservations");
		btnClients = new JButton("Clients");
		

		btnNew.setText("<html>Nouveau<br />vol</html>");
		btnEdit.setText("<html>Modifier<br />vol</html>");
		btnDelete.setText("<html>Supprimer<br />vol</html>");



		panel = new JPanel();
		panel.setBackground(new Color(232, 235, 239));
		panel.setBounds(0, 0, 1024, 105);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		 label = new JLabel("");
		 label.setForeground(Color.BLACK);
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\conversation-speech-bubbles-.png"));
		label.setBounds(757, 47, 35, 25);
		panel.add(label);

		 btnvol = new JButton("Vols");
		btnvol.setBorder(emptyBorder);
		btnvol.setBackground(new Color(45, 229, 119));
		btnvol.setForeground(Color.WHITE);
		btnvol.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnvol.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\airplane.png"));
		btnvol.setBounds(93, 39, 120, 44);
		panel.add(btnvol);

		btnReservations.setBorder(emptyBorder);
		btnReservations.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack2\\white suitcase.png"));
		btnReservations.setForeground(Color.WHITE);
		btnReservations.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnReservations.setBackground(new Color(199, 21, 133));
		btnReservations.setBounds(254, 39, 193, 44);
		panel.add(btnReservations);

		btnClients.setBorder(emptyBorder);
		btnClients.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Projet\\src\\pack1\\user.png"));
		btnClients.setForeground(Color.WHITE);
		btnClients.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnClients.setBackground(new Color(30, 144, 255));
		btnClients.setBounds(482, 39, 137, 44);
		panel.add(btnClients);

		btnX = new JButton("X");
		btnX.setForeground(new Color(0, 0, 0));
		btnX.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		btnX.setBackground(new Color(232, 235, 239));
		btnX.setBounds(982, 0, 42, 25);
		btnX.setBorder(emptyBorder);
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnX) {
					dispose();
				}
				// TODO Auto-generated method stub

			}
		});
		panel.add(btnX);

		lblNewLabel = new JLabel("Tables");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(93, 8, 114, 25);
		panel.add(lblNewLabel);
	
		buttonMsg = new JButton("Messagerie");
		buttonMsg.setForeground(Color.BLACK);
		buttonMsg.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		buttonMsg.setContentAreaFilled(false);
		buttonMsg.setBorder(emptyBorder);
		buttonMsg.setBounds(757, 42, 142, 30);
		panel.add(buttonMsg);
		this.buttonMsg.addActionListener(this);

		 panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 102, 1024, 446);
		getContentPane().add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 562, 1024, 78);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		panel_1.setLayout(null);

		String req_select="select * from  vols ;";  
		ResultSet rs;
		try {
			rs = m.selection(req_select);
			mod=new Monmodel(rs);
			t.setModel(mod);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.setRowHeight(30);
		t.setDefaultRenderer(Object.class, new YourTableCellRenderer());

		scrollPane = new JScrollPane(t);
		scrollPane.setBounds(54, 37, 910, 426);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane);

		lblLaListeDe = new JLabel("La liste de vols disponibles");
		lblLaListeDe.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
		lblLaListeDe.setBounds(54, 10, 310, 25);
		panel_1.add(lblLaListeDe);


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
		
		
		this.btnReservations.addActionListener(this);
		this.btnClients.addActionListener(this);

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
			if (row == 0 && column ==0) {
				c.setFont(null);
				c.setForeground(Color.black);
				c.setBackground(new Color(224, 255, 232));
			}
			return c;
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNew) {
			Newvol newvol=new Newvol(mod);
			newvol.setVisible(true);
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
		if (e.getSource()==btnReservations ) {
			this.setVisible(false);
			ReservationsEdit r=new ReservationsEdit();
			r.setVisible(true);
		}
		if (e.getSource()==btnClients ) {
			this.setVisible(false);
			ClientsEdit r=new ClientsEdit();
			r.setVisible(true);
		}
       
		
		
	}
}

