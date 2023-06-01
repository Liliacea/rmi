import java.rmi.*;


public interface IMath extends Remote {
    public int add(int a, int b) throws RemoteException;
}
