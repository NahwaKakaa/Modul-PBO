package studentmanagement;

public abstract class Mahasiswa implements Beasiswa {
    protected String nim;
    protected String nama;
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
    
    public abstract double getJumlahBeasiswa();
}