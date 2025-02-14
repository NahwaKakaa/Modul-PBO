package Modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluasiBModul1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> mahasiswa = new ArrayList<>();

        int pilihan;

        do{
            System.out.println("Daftar Mahasiswa :");
            System.out.println("1. Tambah Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar dari Program");

            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.print("Masukkan Nama Mahasiswa");
                    String mhs = input.nextLine();

                    mahasiswa.add(mhs);
                    System.out.println("Mahasiswa Telah Ditambahkan");
                    break;
                case 2 :
                    System.out.println("Daftar Seluruh Mahasiswa");
                    for (var value : mahasiswa){
                        System.out.println("Nama : " + value);
                    }
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
        }while (pilihan !=0 );
    }

}
