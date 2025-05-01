package studentmanagement;

public class MahasiswaS2 extends Mahasiswa {
    public MahasiswaS2(String nim, String nama) {
        super(nim, nama);
    }
    
    @Override
    public double getJumlahBeasiswa() {
        return 3000000.0;
    }
}