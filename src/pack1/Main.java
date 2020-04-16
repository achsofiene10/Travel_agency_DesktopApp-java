package pack1;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Splach l=new Splach();
		l.setVisible(true);
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		l.setVisible(false);
		Acceuil a=new Acceuil();
		a.setVisible(true);
	}
}
