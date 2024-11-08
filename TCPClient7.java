import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient
{
    public static void main(String args[])throws Exception
    {

           Socket client=new Socket("localhost",5000);
           System.out.println("Client is coonected");

            
           BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
           while(true)
           {
                String data=br.readLine();
                System.out.println("Data from server:"+data);
           }
    }
}