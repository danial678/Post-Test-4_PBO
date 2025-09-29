package model;

public abstract class MainanKoleksi extends Mainan implements TampilkanKategori {

    private String merek;
    private String kategori;
    private String edisi;

    public MainanKoleksi(String nama, String merek, double harga, String kategori, String edisi) {
        super(nama, harga);
        this.merek = merek;
        this.kategori = kategori;
        this.edisi = edisi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    @Override
    public void tampilkanKategori() {
        System.out.println("Kategori Koleksi: " + kategori);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Mainan : " + getNama());
        System.out.println("Merek       : " + merek);
        System.out.println("Harga       : Rp " + getHarga());
        System.out.println("Kategori    : " + kategori);
        System.out.println("Edisi       : " + edisi);
    }
}
