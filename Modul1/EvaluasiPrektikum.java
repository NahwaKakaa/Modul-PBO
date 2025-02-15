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
            System.out.println("4. Cari Item Belanjaan");
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
                    String hapusItem = input.nextLine();

                    int index = Nama.indexOf(hapusItem);

                    if (index != -1) {
                        Nama.remove(index);
                        Harga.remove(index);
                        System.out.println("Itema Belanjaan Telah Dihapus!");
                    } else {
                        System.out.println("Tidak ada item yang di hapus, harap masukkan nama item yang benar!");
                    }
                    break;
                case 3:
                    System.out.println("Seluruh Item");
                    System.out.println("==============");
                    for (int i = 0; i < Nama.size(); i++) {
                        System.out.println(Nama.get(i) + " - " + Harga.get(i));
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Item Belanjaan yang Dicari: ");
                    String cariItem = input.nextLine();

                    int indexx = Nama.indexOf(cariItem);

                    if (indexx != -1) {
                        System.out.println(Nama.get(indexx) + " - " + Harga.get(indexx));
                    } else {
                        System.out.println("Tidak ada item yang di cari, harap masukkan nama item yang benar!");
                    }
                    break;
                default:
                    System.out.println("Nomor yang Anda Masukkan Tidak Valid!!");
                    break;
            }
        }while (pilihan !=0);
    }
}
