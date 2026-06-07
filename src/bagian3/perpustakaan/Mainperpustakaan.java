package bagian3.perpustakaan;

public class Mainperpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku dengan tahun terbit lalu memasukkannya ke koleksi (Poin 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan untuk tes cariPenulis

        // Tampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // Uji Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Uji Pengembalian Buku (Poin 1)
        System.out.println("--- Menguji Method kembalikanBuku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia setelah dikembalikan: " + perpus.jumlahTersedia());
        System.out.println();

        // Uji Pencarian Penulis (Poin 3)
        System.out.println("--- Menguji Method cariPenulis ---");
        perpus.cariPenulis("Pramoedya");
    }
}