import java.io.*;
import java.net.*;

class Client
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket client=new DatagramSocket();

        FileInputStream f=new FileInputStream( "D:\\Labs\\CN_LAB\\Sidd8b\\temp.txt");

        byte[] b=new byte[1000];
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,ia,5700);

        f.read(b);
        client.send(dp);
        client.close();
    }
}