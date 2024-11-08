import java.net.*;
import java.security.spec.ECFieldF2m;
import java.io.*;
import java.util.*;

public class TCPServer
{
    public static void main(String args[]) throws Exception
    {
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Wait for client");
            Socket server=ss.accept();
            System.out.println("Server connected");

            Scanner sc=new Scanner(System.in);
            PrintWriter pw=new PrintWriter(server.getOutputStream());
            while(true)
            {
                System.out.println("Enter data");
                String data=sc.nextLine();
                pw.println(data);
                pw.flush();
            }
    
    }
}