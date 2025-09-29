package service;

import java.util.ArrayList;
import model.Mainan;

public class MainanService {

    private ArrayList<Mainan> daftarMainan = new ArrayList<>();

    // Polymorphism: Overloading contoh tambahMainan
    public void tambahMainan(Mainan mainan) {
        daftarMainan.add(mainan);
        System.out.println("Mainan berhasil ditambahkan!");
    }

    public void tambahMainan(Mainan mainan, boolean cetakInfo) {
        daftarMainan.add(mainan);
        if (cetakInfo) {
            mainan.tampilkanInfo();
        }
        System.out.println("Mainan berhasil ditambahkan dengan opsi cetak info!");
    }

    public void tampilkanDaftarMainan() {
        if (daftarMainan.isEmpty()) {
            System.out.println("Belum ada mainan yang terdaftar.");
            return;
        }
        System.out.println("\n=== DAFTAR MAINAN ===");
        for (int i = 0; i < daftarMainan.size(); i++) {
            System.out.println("Index: " + i);
            daftarMainan.get(i).tampilkanInfo();
        }
    }

    public void updateMainan(int index, Mainan mainanBaru) {
        if (index >= 0 && index < daftarMainan.size()) {
            daftarMainan.set(index, mainanBaru);
            System.out.println("Mainan berhasil diupdate!");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusMainan(int index) {
        if (index >= 0 && index < daftarMainan.size()) {
            daftarMainan.remove(index);
            System.out.println("Mainan berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}

