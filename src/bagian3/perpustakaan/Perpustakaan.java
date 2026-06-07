package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    // Diubah ke private agar enkapsulasi lebih baik, namun tetap bisa diakses lewat method
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) { // Menggunakan equalsIgnoreCase agar lebih fleksibel
                if (b.isDipinjam()) {
                    System.out.println("Buku \"" + judul + "\" sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }

    // 1. Tambahkan method kembalikanBuku(String judul) (Poin 1)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (!b.isDipinjam()) {
                    System.out.println("Buku \"" + judul + "\" sebenarnya tidak sedang dipinjam.");
                } else {
                    b.setDipinjam(false);
                    System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }

    // 3. Tambahkan method cariPenulis(String penulis) (Poin 3)
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        int nomor = 1;
        
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(nomor + ". " + b.info());
                nomor++;
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan dari penulis " + penulis);
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}