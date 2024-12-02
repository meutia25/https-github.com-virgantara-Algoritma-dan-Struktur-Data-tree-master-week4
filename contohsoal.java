public class contohsoal {
    public static void main(String[] args) {
        // Contoh array untuk nilai x_i
        int[] x = {1, 2, 3, 4}; // Ubah nilai ini sesuai kebutuhan
        
        // Hitung jumlah dari i=0 hingga i=3
        int jumlah = 0;
        for (int i = 0; i <= 3; i++) {
            jumlah += x[i];
        }
        
        // Tampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan adalah: " + jumlah);
    }
}
