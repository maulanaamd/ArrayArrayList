package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan ArrayList Mahasiswa (Poin 2)
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double totalNilai = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            totalNilai += mhs.getNilai();
        }
        return totalNilai / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                lulus++;
            }
        }
        return lulus;
    }

    public void tampilkanSemua() {
        System.out.println("== Data Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + mhs.getNama() + " (" + mhs.getNpm() + ") - Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
    }
    
    // Method tambahan untuk mengambil jumlah total data (untuk Poin 6)
    public int getTotalData() {
        return daftarMahasiswa.size();
    }
}