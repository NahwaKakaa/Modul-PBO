package Modul2;

public class StudiKasusA {
    int[][] dataPenjualan = {
            {10, 20, 30},
            {15, 25, 35},
            {20, 30, 40},
            {25, 35, 45},
            {30, 40, 50},
            {35, 45, 55},
            {40, 50, 60},
    };

    public int[] hitungTotalPenjualanJenisBaju() {
        int[] totalPenjualanPerJenisBaju = new int[dataPenjualan[0].length];
        for (int i=0; i < dataPenjualan.length; i++) {
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualanPerJenisBaju[j] += dataPenjualan[i][j];
            }
        }
        return totalPenjualanPerJenisBaju;
    }

    public int hitungTotalPenjualanSelamaSatuMinggu() {
        int[] totalPenjualanPerJenisBaju = hitungTotalPenjualanJenisBaju();
        int totalPenjualan = 0;
        for (int i = 0; i < totalPenjualanPerJenisBaju.length; i++) {
            totalPenjualan += totalPenjualanPerJenisBaju[i];
        }
        return totalPenjualan;
    }

    public static void main(String[] args) {
        StudiKasusA penjualanBaju = new StudiKasusA();
        int[] totalPerJenis = penjualanBaju.hitungTotalPenjualanJenisBaju();
        int totalPenjualan = penjualanBaju.hitungTotalPenjualanSelamaSatuMinggu();

        System.out.println("Total penjualan baju jenis A: " + totalPerJenis[0]);
        System.out.println("Total penjualan baju jenis B: " + totalPerJenis[1]);
        System.out.println("Total penjualan baju jenis C: " + totalPerJenis[2]);
        System.out.println("Total penjualan selama satu minggu: " + totalPenjualan);
    }
}
