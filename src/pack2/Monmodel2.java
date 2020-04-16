package pack2;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class Monmodel2 extends AbstractTableModel {
	ResultSet rs;
	ResultSetMetaData rsmd ;
	ArrayList<Object[]> tab ;
	int nblig;
	int nbcol;
	Maconnection maconx;
	public Monmodel2 (ResultSet rs) throws SQLException{
		this.rs=rs;
		maconx=new Maconnection();
		this.rsmd=rs.getMetaData();
		nbcol=rsmd.getColumnCount();
		tab=new ArrayList<Object[]>();
		while (this.rs.next()) {
			Object [] t=new Object[nbcol];
			nblig++;
			String ch;
			for (int i=0;i<nbcol;i++) {
				t[i]=rs.getObject(i+1);
			}
			tab.add(t);
		}
	}
	@Override
	public int getRowCount() {
		
		return nblig;
	}

	@Override
	public int getColumnCount() {
		int a=0;
		// TODO Auto-generated method stub
		try {
			 a=this.rsmd.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Object [] t = tab.get(rowIndex);
		return t[columnIndex] ;
		
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return super.getColumnClass(columnIndex);
	}
	
	
	
	public void setValueAt(Object aValue, int rowIndex,int  columnIndex) {
		// TODO Auto-generated method stub
		Object [] t =(Object[]) tab.get(rowIndex);
		String name=this.getColumnName(columnIndex);
		String type=this.getColumnClass(columnIndex).getTypeName();
		String ch="UPDATE client set "+name+"= '"+aValue.toString()+"' where idclient = "+t[0];
		try {
			this.maconx.modify(ch);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t[columnIndex]=aValue;
		tab.set(rowIndex, t);
		
	}
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		String ch="";
		try {
			ch=rsmd.getColumnName(column+1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ch; 
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void supprimer(int row,int col) {
		Object t= this.getValueAt(row, col);
		String c=this.getColumnName(col);
		String sup="DELETE FROM `client` WHERE "+c+" = '"+t.toString()+"' ;";
		
		try {
			this.maconx.suppression(sup);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tab.remove(row);
		nblig--;
	}

	public void ajouter(Object[] t1) {
		// TODO Auto-generated method stub
		tab.add(t1);
		nblig++;
		String ajout="Insert into client values("+t1[0]+",'"+t1[1]+"','"+t1[2]+"','"+t1[3]+"')" ; 
		try {
			this.maconx.ajout(ajout);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
