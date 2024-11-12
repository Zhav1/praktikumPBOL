import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Map<String, String> namaNim = new HashMap<>();

        boolean test = true;

        while (test) {
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Manajemen Sistem Informasi Mahasiswa");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("Input Anda: ");
            int choice = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Silahkan Input NIM : ");
                    String key = inputScanner.nextLine();
                    if (namaNim.containsKey(key)) {
                        System.out.println("NIM sudah ada.");
                        
                    }
                    System.out.println("Silahkan Input Nama Mahasiswa : ");
                    String value = inputScanner.nextLine();
                    namaNim.put(key, value);
                    break;
                case 2: 
                    for (Map.Entry<String, String> data : namaNim.entrySet()) {
                    System.out.println("NIM: " + data.getKey() + ", Nama: " + data.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Silahkan Input NIM untuk nama yang ingin diubah: ");
                    String key2 = inputScanner.nextLine();
                     if (namaNim.containsKey(key2)) {
                            System.out.println("Silahkan Input nama yang baru: ");
                            String valueString = inputScanner.nextLine();
                            namaNim.put(key2, valueString);
                        }
                    break;
                case 4:
                    System.out.println("Silahkan Input NIM yang akan dihapus: ");
                    String key3 = inputScanner.nextLine();

                        if (namaNim.containsKey(key3)) {
                            namaNim.remove(key3);
                        }
                default:
                    
                    break;
            }

        }
    }
}
