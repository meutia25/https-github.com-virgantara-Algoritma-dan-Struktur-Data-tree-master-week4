public class soal1 {

    // Soal 1: Menghitung Σ xi^2 dari i = 0 hingga i = 10
    public static void soal1() {
        // Membuat array x untuk menyimpan nilai xi
        int[] x = new int[11]; // Array dengan panjang 11 (indeks 0 sampai 10)

        // Mengisi array x dengan nilai xi = i
        for (int i = 0; i <= 10; i++) {
            x[i] = i; // Nilai xi sama dengan i
        }

        int sum = 0; // Variabel untuk menghitung jumlah Σ xi^2

        // Perulangan untuk menghitung Σ xi^2
        for (int i = 0; i <= 10; i++) {
            sum += x[i] * x[i]; // Menambah kuadrat dari xi ke dalam sum
        }

        // Menampilkan hasil akhir
        System.out.println("Hasil Soal 1 (Σ xi^2 dari i=0 hingga i=10): " + sum);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Memanggil metode soal1 untuk menjalankan perhitungan
        soal1();
    }
}
