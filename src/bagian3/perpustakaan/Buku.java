package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Tambah atribut tahunTerbit (Poin 2)

    // Lengkapi constructor dengan parameter tahunTerbit (Poin 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    // Tambah getter untuk tahunTerbit (Poin 2)
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Tambah getter untuk penulis (Dibutuhkan untuk Poin 3)
    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Tampilkan tahun terbit di dalam method info (Poin 2)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}