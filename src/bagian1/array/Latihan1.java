package bagian1.array;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("halo dari java");

        int[] nilai = new int[5];
        nilai[0] = 80;
        nilai[1] = 75;
        nilai[2] = 90;
        nilai[3] = 60;
        nilai[4] = 85;

        String[] nama = {"Andi", "Budi", "Citra"};
        System.out.println("Nilai Pertama : " + nilai[0]);
        System.out.println("Nilai Ketiga : " + nilai[3]);
        System.out.println("Mahasiswa ke-2 : " + nama[1]);
        System.out.println("Jumlah Nilai : " + nilai.length);

    }
}