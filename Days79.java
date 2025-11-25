package day70coding;
import java.util.Scanner;
public class day79Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";

        // Membuat akun
        System.out.println("Membuat Akun");
        System.out.print("Masukkan username: ");
        username = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();

        // Login ke akun
        System.out.println("Login ke Akun");
        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.print("Masukkan username: ");
            String inputUsername = sc.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }
    }
}
