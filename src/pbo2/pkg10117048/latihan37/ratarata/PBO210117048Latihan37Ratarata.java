/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan37.ratarata;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini tentang menghitung rata-rata bilangan dengan 
 *                      OO.
 */
public class PBO210117048Latihan37Ratarata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jmlSiswa;
        Scanner scn = new Scanner(System.in);
        Value rata2 = new Value();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlSiswa = scn.nextInt();
        
        rata2.hitungNilai(jmlSiswa);
        System.out.println("Maka, Rata-rata nilainya adalah : " 
                + rata2.hitungRata2Nilai (rata2.jmlNilai, jmlSiswa));
    }
    
}
