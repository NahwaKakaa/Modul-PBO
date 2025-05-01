package studentmanagement;

public class MahasiswaS1 extends Mahasiswa {
    public MahasiswaS1(String nim, String nama) {
        super(nim, nama);
    }
    
    @Override
    public double getJumlahBeasiswa() {
        return 2000000.0;
    }
}