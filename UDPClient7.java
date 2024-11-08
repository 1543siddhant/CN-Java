import java.net.*;

public class UDPClient 
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket();

        String str="hii";
        byte[] b=str.getBytes();
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,ia,5600);
        ds.send(dp);
    }
}
