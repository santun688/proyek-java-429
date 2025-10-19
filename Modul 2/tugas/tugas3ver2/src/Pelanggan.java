import java.util.Scanner;

// Refactoring 1 & 6: Pisahkan menjadi class Pelanggan
class Pelanggan {
    private String nama;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
abstract class LayananLaundry {
    protected double berat;

    public LayananLaundry(double berat) {
        this.berat = berat;
    }

    public abstract String getNamaLayanan();
    public abstract double hitungBiaya();
}

class CuciKering extends LayananLaundry {
    private static final double HARGA_PER_KG = 7000;

    public CuciKering(double berat) {
        super(berat);
    }

    @Override
    public String getNamaLayanan() {
        return "Cuci Kering";
    }

    @Override
    public double hitungBiaya() {
        return HARGA_PER_KG * berat;
    }
}

class CuciSetrika extends LayananLaundry {
    private static final double HARGA_PER_KG = 10000;

    public CuciSetrika(double berat) {
        super(berat);
    }

    @Override
    public String getNamaLayanan() {
        return "Cuci Setrika";
    }

    @Override
    public double hitungBiaya() {
        return HARGA_PER_KG * berat;
    }
}

class SetrikaSaja extends LayananLaundry {
    private static final double HARGA_PER_KG = 5000;

    public SetrikaSaja(double berat) {
        super(berat);
    }

    @Override
    public String getNamaLayanan() {
        return "Setrika Saja";
    }

    @Override
    public double hitungBiaya() {
        return HARGA_PER_KG * berat;
    }
}

// Refactoring utama di sini (2, 3, 7)
