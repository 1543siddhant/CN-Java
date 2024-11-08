import java.io.*;
import java.net.*;
import java.util.*;

class Server
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(9999);
        System.out.println("Waiting for client");
        Socket server=ss.accept();
        System.out.println("Connected");

        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(server.getOutputStream());
        System.out.println("Enter data");
        String str=sc.nextLine();
        pw.println(str);
        pw.flush();

        FileInputStream f=new FileInputStream("D:\\Labs\\CN_LAB\\Sidd8b\\temp.txt");

        byte[] b=new byte[100];
        f.read(b,0,b.length);

        OutputStream os=server.getOutputStream();
        os.write(b,0,b.length);

        System.out.println("File sent");
    }
}

