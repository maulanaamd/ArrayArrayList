// Nama : Ahmad Maulana
// NPM : 2410010174
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Array String mata kuliah (ukuran tetap, minimal 3) lalu menampilkannya
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data", "Logika Algoritma"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Poin 3: Membuat objek pengelola
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 objek Mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi Setiawan", "231001", 75.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "231002", 55.0)); // Tidak lulus
        kelas.tambahMahasiswa(new Mahasiswa("Citra Kirana", "231003", 88.0));
        kelas.tambahMahasiswa(new Mahasiswa("Deni Pratama", "231004", 45.0)); // Tidak lulus
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri", "231005", 92.0));

        // Menampilkan semua mahasiswa
        kelas.tampilkanSemua();
        System.out.println();

        // Poin 5: Menampilkan rata-rata nilai dan jumlah yang lulus
        System.out.println("== Statistik Kelas ==");
        System.out.println("Rata-rata Nilai Kelas : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // Poin 6: Tambah 1 objek baru, lalu tampilkan jumlah data terbaru
        System.out.println("== Menambahkan Data Mahasiswa Baru ==");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Siddiq", "231006", 80.0));
        
        System.out.println("Data berhasil ditambahkan!");
        System.out.println("Total data mahasiswa terbaru saat ini: " + kelas.getTotalData());
    }
}