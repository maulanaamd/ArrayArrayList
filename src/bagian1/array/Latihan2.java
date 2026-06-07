package bagian1.array;

public class Latihan2 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85};
        System.out.println(nilai.length);

        System.out.println("=== Menggunakan For ===");
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks : " + i + "=" + nilai[i]);
        }

        System.out.println("\n=== Menggunakan For Each ===");
        int total = 0;
        for(int n: nilai){
            total =+ n;
        }
        double rata = (double)total / nilai.length;
        System.out.println("Total : " + total);
        System.out.println("Rata - Rata : " + rata);
        
    }
}
