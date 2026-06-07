package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk inisialisasi awal
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk nama, npm, dan nilai
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method mengecek kelulusan (Poin 1)
    public boolean lulus() {
        return nilai >= 60; // Mengembalikan true jika nilai 60 ke atas
    }
}