/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventaris_Gereja;

/**
 *
 * @author FANIA
 */
public class Inventaris_Gereja {
    public class InventarisGereja {
    // Atribut
    private static final String namaGereja = "Santo Joan Don Bosco"; // Nama gereja tetap
    private int id;
    private String namaBarang;
    private String kategori;
    private int jumlah;
    private String lokasi;
    private String keterangan;

    // Constructor
    public InventarisGereja(int id, String namaBarang, String kategori, int jumlah, String lokasi, String keterangan) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
        this.keterangan = keterangan;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Gereja: " + namaGereja);
        System.out.println("ID: " + id);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Kategori: " + kategori);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("-----------------------------------");
    }

    // Method untuk memperbarui jumlah barang
    public void updateJumlah(int jumlahBaru) {
        this.jumlah = jumlahBaru;
        System.out.println("Jumlah " + namaBarang + " diperbarui menjadi: " + jumlah);
    }

    // Method untuk mengubah lokasi barang
    public void ubahLokasi(String lokasiBaru) {
        this.lokasi = lokasiBaru;
        System.out.println("Lokasi " + namaBarang + " dipindahkan ke: " + lokasi);
    }

    // Getter untuk mendapatkan nama barang
    public String getNamaBarang() {
        return namaBarang;
    }
}

}
