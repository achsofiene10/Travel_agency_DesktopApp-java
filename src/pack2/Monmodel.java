package pack2;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class Monmodel extends AbstractTableModel {
	ResultSet rs;
	ResultSetMetaData rsmd ;
	ArrayList<Object[]> tab ;
	int nblig;
	int nbcol;
	Maconnection maconx;
	public Monmodel (ResultSet rs) throws SQLException{
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
				if (i==8) { 
					Object c=rs.getObject(i+1);
					if(c.toString().contentEquals("0")) {
						ch="Vol direct";
					}else {
						 ch="Avec escale";
					}
					t[i]=ch;
				}
				else {
				t[i]=rs.getObject(i+1);}
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
		String ch="UPDATE vols set "+name+"= '"+aValue.toString()+"' where num = "+t[0];
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
		String sup="DELETE FROM `vols` WHERE "+c+" = '"+t.toString()+"' ;";
		
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
		String ajout="Insert into vols values( "+t1[0]+",'"+t1[1]+"','"+t1[2]+"','"+t1[3]+"','"+t1[4]+"','"+t1[5]+"','"+t1[6]+"','"+t1[7]+"','"+t1[8]+"','"+t1[9]+"','"+t1[10]+"','"+t1[11]+"','"+t1[12]+"','"+t1[13]+"')" ; 
		try {
			this.maconx.ajout(ajout);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
