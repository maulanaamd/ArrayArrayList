package bagian1.latihan1;

// izin pak, disini saya menggunakan package class Arrays 
// yang ada didalam package bawaan built in package java.util
import java.util.Arrays;

public class LatihanMandiri {
    public static void main(String[] args) {
        System.out.println("\n");


        // 1.4 Latihan Mandiri Modul Latihan Terbimbing Mata Kuliah Pemrograman Berbasis Objek
        System.out.println("--- Menampilkan Suhu Harian Tertinggi dan Terendah ---");
        
        // menentukkan nilai tertinggi dan terendah menggunakan fungsi bawaan dari java
        // cara ini lebih modern karna menggunakan built in function java untuk meng assign 
        // nilai Tertinggi dan Terendah nya.
        
        double[] suhu = {24.1, 33.4, 28.5, 32.8, 24.3, 36.5};
        double suhuMax = Arrays.stream(suhu).max().getAsDouble();
        double suhuMin = Arrays.stream(suhu).min().getAsDouble();

        // for loop digunakan untuk mengiterasi semua index array suhu
        // if dan else if digunakna untuk mengecek apakah sebuah array suhu
        // merupakan nilai tertinggi atau terendah

        for(int i = 0; i < suhu.length; i++) { 
            if(suhu[i] == suhuMax){

                System.out.println("Suhu tertinggi harian adalah : " + suhu[i]);

            } else if(suhu[i] == suhuMin) {
                System.out.println("Suhu terenFdah harian adalah : " + suhu[i]);
            }
        }

        System.out.println("\n");
        
        System.out.println("--- Menampilkan Nama Hari Yang Memiliki Panjang Karakter > 5 ---");
        
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        for(int i = 0 ; i < hari.length; i++) {
            if(hari[i].length() > 5) {
                System.out.println(hari[i] + " Merupakan Hari yang mempunyai panjang karakter > 5");
            }
        }
        System.out.println("\n");
        
        
        System.out.println("--- Menampilkan Jumlah Bilangan Genap Yang Ada Di Variabel Angka ---");
        // latihan mandiri array nomor 3
        int[] angka = {4, 8, 15, 16, 23, 42};
        System.out.print("Isi variabel Angka : ");
        
        System.out.print("{ ");
        for(int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println(" }");
        // System.out.print("\n");
        
        // logic pencari variabel angka yang yang merupakan angka genap
        
        int jmlBilanganGenap = 0;
        for(int i = 0; i < angka.length; i++){
            if(angka[i] % 2 == 0){
                jmlBilanganGenap += 1;
            }
        }
        System.out.println("Jumalah bilangan genap diangka : " + jmlBilanganGenap);
        System.out.println("\n");




    }

}
