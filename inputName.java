import java.util.Scanner;
public class inputName {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        
        System.out.println("Masukkan nama: ");
        String name = scanners.nextLine();

        System.out.println("Masukkan NIM: ");
        int nim = scanners.nextInt();

        scanners.close();

        System.out.println("Nama anda adalah : " + name);
        System.out.println("NIM anda adalah: " + nim); 
    }
}

