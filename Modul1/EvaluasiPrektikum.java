package Modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluasiPrektikum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> Nama = new ArrayList<>();
        ArrayList<String> Harga = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("1. Tambah Item Belanjaan");
            System.out.println("2. Hapus Item Belanjaan");
            System.out.println("3. Tampilkan Seluruh Item Belanjaan");
            System.out.println("0. Keluar dari program");

            System.out.print("Pilihan Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Item Belanjaan: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Harga Item Belanjaan: ");
                    String harga = input.nextLine();

                    Nama.add(nama);
                    Harga.add(harga);
                    System.out.println("Item Belanjaan Telah Ditambahkan!");
                    break;
                case 2:
                    System.out.print("Masukkan Nama Item Belanjaan yang Akan Dihapus : ");


                    System.out.println("Tidak ");
            }
        }
    }
}
