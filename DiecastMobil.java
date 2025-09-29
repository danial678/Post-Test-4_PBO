package model;

public class DiecastMobil extends MainanKoleksi {

    private String skala; // pilihan 1:18, 1:24, 1:32

    public DiecastMobil(String nama, String merek, double harga, String kategori, String edisi, String skala) {
        super(nama, merek, harga, kategori, edisi);
        this.skala = skala;
    }

    public String getSkala() {
        return skala;
    }

    public void setSkala(String skala) {
        this.skala = skala;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Diecast Mobil ===");
        super.tampilkanInfo();
        System.out.println("Skala       : " + skala);
        System.out.println("----------------------");
    }
}
