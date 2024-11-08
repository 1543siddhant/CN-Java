import java.util.Scanner;

 class SimpleSubnetting {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the IP address : ");
        String ipAddress = sc.nextLine();
        
        System.out.print("Enter the subnet mask: ");
        int subnetBits = sc.nextInt();


        int subnetMask = (int) (Math.pow(2, subnetBits) - 1) << (32 - subnetBits);
        String subnetMaskString = convertToDottedDecimal(subnetMask);


        int hostBits = 32 - subnetBits;
        int numberOfHosts = (int) Math.pow(2, hostBits) - 2; 

        // Print results
        System.out.println("\nIP Address: " + ipAddress);
        System.out.println("Subnet Mask: " + subnetMaskString);
        System.out.println("Total number of hosts per subnet: " + numberOfHosts);

        sc.close();
    }

    // Function to convert a subnet mask integer to dotted decimal format
    public static String convertToDottedDecimal(int mask) {
        return ((mask >> 24) & 0xFF) + "." +
               ((mask >> 16) & 0xFF) + "." +
               ((mask >> 8) & 0xFF) + "." +
               (mask & 0xFF);
    }
}
