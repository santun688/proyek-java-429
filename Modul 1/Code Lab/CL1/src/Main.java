import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>(Arrays.asList("Adi", "Budi", "Cahyo", "Diana","eva"));
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.println("nama terpanjang adalah: " + namaTerpanjang);
    }

    public static ArrayList<String> cariNamaTerpanjang (ArrayList<String>list) {

        ArrayList<String> hasil = new ArrayList<>();
        int maxnama = 0;

        for (String nama : list) {
            if (nama.length() > maxnama) {
                maxnama = nama.length();
            }
        }

        for (String nama : list) {
            if (nama.length() == maxnama) {
                hasil.add(nama);
            }
        }

        return hasil;
    }

}

