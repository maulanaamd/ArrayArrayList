package bagian2.arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class LatihanMandiriArrayList {
    public static void main(String[] args){
        // latihan mandiri membuat daftar belanja

        System.out.println("=== Latihan 1 membuat dan Menghapus Daftar Belanja ===");

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Bayam");
        daftarBelanja.add("Ayam");
        daftarBelanja.add("Tahu");
        daftarBelanja.add("Tempe");
        System.out.println("Daftar Belanja Awal : " + daftarBelanja);
        
        // Menghapus item ke dua (index 1) "Ayam"
        
        daftarBelanja.remove(1);
        System.out.println("Daftar Belanja Hapus item ke 2 : " + daftarBelanja);
        System.out.println("Jumlah Daftar Belanja Akhir : " + daftarBelanja.size());

        System.out.println("\n");

        System.out.println("=== Latihan 2 menampilkan nilai terbesar dengan cara menelusuri seluruh elemen ===");

        
        ArrayList<Integer> angka = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer max = angka.get(0);
        System.out.println("isi dari angka : "+ angka);
        int i = 0;
        
        for(; i < angka.size(); i++) {
            
            
            if(angka.get(i) > max ) {
                max = angka.get(i);
            }
        }
        System.out.println("Nilai Terbesar adalah : " + i);
        
        
        // System.out.println("index sebelum : " + indexSebelum );
        // System.out.println("index sesudah : " + indexBerikut );
        
        System.out.println("\n");

        System.out.println("=== Latihan 3 menampilkan nama yang hanya di awali huruf A ===");

        ArrayList<String> daftarNama = new ArrayList<>();

        // 2. Menambah 6 nama ke dalam ArrayList
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Aris");
        daftarNama.add("Dewi");

        System.out.println("Nama-nama yang diawali huruf 'A':");

        // 3. Melakukan iterasi dan mengecek setiap nama
        for (String nama : daftarNama) {
            // Menggunakan method startsWith untuk filter
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }


    }
}
