package pack1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MonServeur extends Remote {
	
	//public void setMesg(String m)throws RemoteException;
	//Note getMesg()throws RemoteException;
	//void setMesg(Note n) throws RemoteException;
	
	//String getMesg()throws RemoteException;
	//void setMesg(String msg) throws RemoteException;
	void send(String msg)throws RemoteException;
	String getAllMsg()throws RemoteException;

}
