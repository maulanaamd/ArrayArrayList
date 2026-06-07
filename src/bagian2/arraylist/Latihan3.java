package bagian2.arraylist;
import java.util.ArrayList;


public class Latihan3 {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Isi List: " + mahasiswa);
        System.out.println("Jumlah : " + mahasiswa.size());
        System.out.println("Index 1 : " + mahasiswa.get(1));
    }
}
