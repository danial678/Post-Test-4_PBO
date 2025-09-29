package main;

import java.util.Scanner;
import service.MainanService;
import model.ActionFigure;
import model.DiecastMobil;

public class MainApp {
    public static void main(String[] args) {
        MainanService service = new MainanService();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n======================================");
            System.out.println("       MANAJEMEN KOLEKSI MAINAN");
            System.out.println("======================================");
            System.out.println("1. Tambah Mainan");
            System.out.println("2. Lihat Koleksi Mainan");
            System.out.println("3. Ubah Mainan");
            System.out.println("4. Hapus Mainan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Pilih jenis mainan: 1. Action Figure | 2. Diecast Mobil");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Merek: ");
                    String merek = sc.nextLine();
                    System.out.print("Masukkan Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Masukkan Kategori: ");
                    String kategori = sc.nextLine();

                    System.out.println("Pilih Edisi: 1. Standar | 2. Limited | 3. Exclusive");
                    int pilihanEdisi = sc.nextInt();
                    sc.nextLine();
                    String edisi = switch (pilihanEdisi) {
                        case 1 -> "Standar";
                        case 2 -> "Limited";
                        case 3 -> "Exclusive";
                        default -> "Standar";
                    };

                    if (jenis == 1) {
                        System.out.print("Masukkan Karakter: ");
                        String karakter = sc.nextLine();
                        service.tambahMainan(new ActionFigure(nama, merek, harga, kategori, edisi, karakter));
                    } else {
                        System.out.println("Pilih Skala: 1. 1:18 | 2. 1:24 | 3. 1:32");
                        int pilihanSkala = sc.nextInt();
                        sc.nextLine();
                        String skala = switch (pilihanSkala) {
                            case 1 -> "1:18";
                            case 2 -> "1:24";
                            case 3 -> "1:32";
                            default -> "1:18";
                        };
                        service.tambahMainan(new DiecastMobil(nama, merek, harga, kategori, edisi, skala));
                    }
                }

                case 2 -> service.tampilkanDaftarMainan();

                case 3 -> {
                    service.tampilkanDaftarMainan();
                    System.out.print("Masukkan index mainan yang ingin diupdate: ");
                    int indexUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Pilih jenis mainan baru: 1. Action Figure | 2. Diecast Mobil");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan Nama baru: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Merek baru: ");
                    String merek = sc.nextLine();
                    System.out.print("Masukkan Harga baru: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Masukkan Kategori baru: ");
                    String kategori = sc.nextLine();

                    System.out.println("Pilih Edisi baru: 1. Standar | 2. Limited | 3. Exclusive");
                    int pilihanEdisi = sc.nextInt();
                    sc.nextLine();
                    String edisi = switch (pilihanEdisi) {
                        case 1 -> "Standar";
                        case 2 -> "Limited";
                        case 3 -> "Exclusive";
                        default -> "Standar";
                    };

                    if (jenis == 1) {
                        System.out.print("Masukkan Karakter baru: ");
                        String karakter = sc.nextLine();
                        service.updateMainan(indexUpdate,
                                new ActionFigure(nama, merek, harga, kategori, edisi, karakter));
                    } else {
                        System.out.println("Pilih Skala baru: 1. 1:18 | 2. 1:24 | 3. 1:32");
                        int pilihanSkala = sc.nextInt();
                        sc.nextLine();
                        String skala = switch (pilihanSkala) {
                            case 1 -> "1:18";
                            case 2 -> "1:24";
                            case 3 -> "1:32";
                            default -> "1:18";
                        };
                        service.updateMainan(indexUpdate,
                                new DiecastMobil(nama, merek, harga, kategori, edisi, skala));
                    }
                }

                case 4 -> {
                    service.tampilkanDaftarMainan();
                    System.out.print("Masukkan index mainan yang ingin dihapus: ");
                    int indexDelete = sc.nextInt();
                    sc.nextLine();
                    service.hapusMainan(indexDelete);
                }

                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}