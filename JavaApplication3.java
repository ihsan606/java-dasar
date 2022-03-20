/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 62859
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        boolean izin = false;

        String username, password;

        while (izin == false) {
            System.out.println("UII GATEWAY LOGIN \n");
            System.out.println("masukkan username");
            username = sc.nextLine();
            System.out.println("masukkan pasword");
            password = sc.nextLine();

            if (username.equals("dosen")) {
                if (password.equals("DsnUII")) {
                    izin = true;
                    System.out.println("\n------Selamat Datang Dosen------");

                } else {

                    System.out.println("\n------password dosen salah------");
                    
                }
            } else if (username.equals("mahasiswa")) {
                if (password.equals("MhsUII")) {
                    izin = true;
                    System.out.println("\n-----Selamat Datang Mahasiswa-----");
                } else {
                    System.out.println("\n------password mahasiswa salah------");
                }
            } else {
//                                    loginCount++;

                System.out.println("---------warning!!---------");
                System.out.println("username dan password anda salah");
            }
        }

    }

}
