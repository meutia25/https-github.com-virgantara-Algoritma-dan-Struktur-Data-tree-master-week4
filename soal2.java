public class soal2 {
    public static void main(String[] args) {
        // Contoh array untuk nilai x_i
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21}; // Ubah nilai ini sesuai kebutuhan
        
        // Hitung jumlah dari (x_i - 1)^2 dari i=0 hingga i=20
        int jumlah = 0;
        for (int i = 0; i <= 20; i++) {
            jumlah += (x[i] - 1) * (x[i] - 1);
        }
        
        // Tampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan (x_i - 1)^2 adalah: " + jumlah);
    }
}
