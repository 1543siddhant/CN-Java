import java.io.*;
import java.net.*;

class Server
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket server=new DatagramSocket(5700);

        byte[] b=new byte[1000];
        DatagramPacket dp=new DatagramPacket(b,b.length);
        server.receive(dp);

        FileOutputStream f=new FileOutputStream("D:\\Labs\\CN_LAB\\Sidd8b\\temp.txt");

        f.write(dp.getData(),0,dp.getLength());
        System.out.println("File recieved");  
        
        
    
    }
}