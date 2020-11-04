import java.util.Scanner;

/**
 * Latihan33
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : User Login
 */

public class PBO10k10119176Latihan33 {
    public static void main(String[] args) {
        user login = new user();
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukan Username: ");
       String user = scanner.next();
       System.out.print("Masukan Password: ");
       String password = scanner.next();
       System.out.println("");
       
       login.pengecekanLogin(user, password);
   }
}
