package Modul1;

import java.util.Scanner;

public class EvaluasiAModul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Kalkulator Sederhana");
        System.out.println("Masukkan Angka Pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih Operasi Matematika");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan Pilihan Anda: ");
        int pilihan = input.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operasi Matematika Tidak Tersedia");
                break;
        }
        System.out.println("Hasil : " + hasil);
    }
}