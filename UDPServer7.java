import java.net.*;
public class UDPServer 
{
    public static void main(String[] args)throws Exception 
    {
        DatagramSocket ds=new DatagramSocket(5600);

        byte[] b1=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b1,b1.length);
        ds.receive(dp);

        String str=new String(dp.getData());

        System.out.println(str);

    }
    
}
