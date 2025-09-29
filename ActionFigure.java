package model;

public class ActionFigure extends MainanKoleksi {

    private String karakter;

    public ActionFigure(String nama, String merek, double harga, String kategori, String edisi, String karakter) {
        super(nama, merek, harga, kategori, edisi);
        this.karakter = karakter;
    }

    public String getKarakter() {
        return karakter;
    }

    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Action Figure ===");
        super.tampilkanInfo();
        System.out.println("Karakter    : " + karakter);
        System.out.println("----------------------");
    }
}
