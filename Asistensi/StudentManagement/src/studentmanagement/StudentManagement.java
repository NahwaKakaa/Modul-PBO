package studentmanagement;

public class StudentManagement {
    public static void main(String[] args) {
        MahasiswaS1 mhs1 = new MahasiswaS1("S1-0123", "Nas");
        MahasiswaS2 mhs2 = new MahasiswaS2("S2-0456", "Fulanah");
        
        mhs1.tampilkanInfo();
        System.out.println("Beasiswa: " + mhs1.getJumlahBeasiswa());
        System.out.println();
        
        mhs2.tampilkanInfo();
        System.out.println("Beasiswa: " + mhs2.getJumlahBeasiswa());
    }
}