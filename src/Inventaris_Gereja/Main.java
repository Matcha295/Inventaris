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
public class Main {
    public static void main(String[] args) {
        // Menampilkan nama gereja
        System.out.println("=== Inventaris Gereja Santo Joan Don Bosco ===");

        // Membuat beberapa objek inventaris gereja
        Inventaris_Gereja mimbar = new Inventaris_Gereja(1, "Mimbar Kayu", "Peralatan Ibadah", 1, "Ruang Utama", "Digunakan untuk khotbah");
        Inventaris_Gereja kursi = new Inventaris_Gereja(2, "Kursi Jemaat", "Furniture", 50, "Aula Gereja", "Kursi untuk jemaat");

        // Menampilkan informasi awal
        mimbar.tampilkanInfo();
        kursi.tampilkanInfo();

        // Update jumlah kursi
        kursi.updateJumlah(55);
        kursi.tampilkanInfo();

        // Memindahkan mimbar ke lokasi baru
        mimbar.ubahLokasi("Gudang Gereja");
        mimbar.tampilkanInfo();
    }
}


