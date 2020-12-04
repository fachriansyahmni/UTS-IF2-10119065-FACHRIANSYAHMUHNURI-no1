package uts.if2.pkg10119065.fachriansyahmuhnuri.no1;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tandanya kamu
 */
public class UTSIF210119065FACHRIANSYAHMUHNURINo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Age age = new Age(2020);
        System.out.print("Masukkan tahun lahir anda : ");
        age.setYearBirth(sc.nextInt());
        System.out.println("\n===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun lahir : "+age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu lagi "+age.tandanyaKamu(age.hitungUmur()));
    }
    
}
