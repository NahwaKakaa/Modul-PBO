package Modul2;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

class Peminjaman {
    Buku buku;
    String namaPeminjaman;
    String tanggalPeminjaman;
    String tanggalPengembalian;

    public Peminjaman(Buku buku, String namaPeminjaman, String tanggalPeminjaman) {
        this.buku = buku;
        this.namaPeminjaman = namaPeminjaman;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = null;
    }

    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
}

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();

    public void tambahBuku(String judul, String penulis) {
        daftarBuku.add(new Buku(judul, penulis));
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void lihatBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
            return;
        }

        System.out.println("Daftar Buku:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku buku = daftarBuku.get(i);
            System.out.println((i + 1) + ". " + buku.judul + " - " + buku.penulis);
        }
    }

    public void pinjamBuku(int indeksBuku, String namaPeminjam, String tanggalPeminjaman) {
        if (indeksBuku < 1 || indeksBuku > daftarBuku.size()) {
            System.out.println("Indeks buku tidak valid.");
            return;
        }

        Buku buku = daftarBuku.get(indeksBuku - 1);
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.buku.equals(buku) && peminjaman.tanggalPengembalian == null) {
                System.out.println("Buku ini sedang dipinjam");
                return;
            }
        }

        daftarPeminjaman.add(new Peminjaman(buku, namaPeminjam, tanggalPeminjaman));
        System.out.println("Buku berhasil dipinjam!");
    }

    public void lihatPeminjaman() {
        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
            return;
        }

        System.out.println("Daftar Peminjaman:");
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.tanggalPengembalian == null) {
                System.out.println("Buku: " + peminjaman.buku.judul + ", peminjam: " + peminjaman.namaPeminjaman + ", Tanggal: " + peminjaman.tanggalPeminjaman);
            }
        }
    }

    public void kembalikanBuku(int indeksBuku, String tanggalPengembalian) {
        if (indeksBuku < 1 || indeksBuku > daftarPeminjaman.size()) {
            System.out.println("Indeks buku tidak valis.");
            return;
        }

        Peminjaman peminjaman = daftarPeminjaman.get(indeksBuku - 1);
        if (peminjaman.tanggalPengembalian != null) {
            system.out.println("Buku ini sudah dikembalikan.");
            return;
        }

        peminjaman.kembalikanBuku((tanggalPengembalian));
        System.out.println("Buku berhasil dikembalikan!");
    }
}

public class EvaluasiPraktikum {

}
