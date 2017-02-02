package mattern.william;

import java.util.ArrayList;

/**
 * Created by williammattern on 2/2/17.
 */
public class ConnectionManager implements mattern.william.Connection{

    ArrayList<ManagedConnection> connectionArrayList;
    int MAX_CONNECTIONS = 3;

    class ManagedConnection{
        String ip;
        String protocol = "HTTP";
        int port = 80;

        ManagedConnection(String ip, String protocol, int port){
            this.ip = ip;
            this.protocol = protocol;
            this.port = port;
        }

        ManagedConnection(String ip, String protocol){
            this.ip = ip;
            this.protocol = protocol;
        }

        ManagedConnection(String ip, int port){
            this.ip = ip;
            this.port = port;
        }

        public String connect() {
            return null;
        }

        public String getIP() {
            return this.ip;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public int getPort() {
            return this.port;
        }

        void close(){

        }
    }

    void buildConnection(String ip, String protocol){
        connectionArrayList.add(this.new ManagedConnection(ip,protocol));
    }

    void buildConnection(String ip, int port){
        connectionArrayList.add(this.new ManagedConnection(ip,port));
    }

    void buildConnection(String ip, String protocol, int port){
        connectionArrayList.add(this.new ManagedConnection(ip,protocol,port));
    }

    ManagedConnection getConnectionByIp(int ip){
        return this.connectionArrayList.get(ip);
    }

    boolean checkMax(){
        return false;
    }

    void removeClosedConnection(ManagedConnection managedConnection){
    }

    public String connect() {
        return null;
    }

    public String getIP() {
        return null;
    }

    public String getProtocol() {
        return null;
    }

    public int getPort() {
        return 0;
    }
}
