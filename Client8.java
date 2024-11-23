import java.net.*;
import java.util.*;
import java.io.*;

class Client
{
    public static void main(String[] args) throws Exception
    {
        Socket client=new Socket("localhost",9999);
        System.out.println("Client connected");

        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));

        String str=br.readLine();
        System.out.println(str);

        InputStream is=client.getInputStream();
        FileOutputStream fo=new FileOutputStream("E:\\t.txt");

        byte[] b=new byte[1000];
        is.read(b,0,b.length);
        fo.write(b,0,b.length);

        System.out.println("File recieved");

    }
}
// client

