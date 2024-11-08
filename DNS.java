import java.net.*;
import java.util.Scanner;

public class DNS 
{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. IP to URL\n2. URL to IP");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                System.out.println("Enter the IP address: ");
                String ip = scanner.nextLine();
                InetAddress inetAddressIP = InetAddress.getByName(ip);
                System.out.println("The URL associated with the IP address " + ip + " is: " + inetAddressIP.getHostName());
                break;
                
            case 2:
                System.out.println("Enter the URL: ");
                String url = scanner.nextLine();
                InetAddress inetAddressURL = InetAddress.getByName(url);
                System.out.println("The IP address associated with the URL " + url + " is: " + inetAddressURL.getHostAddress());
                break;
                
            default:
                System.out.println("Invalid choice! Please enter '1' or '2'.");
        }
        
        scanner.close();
    }
}
