package Latihan1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa menggunakan konstruktor
        Mahasiswa player1 = new Mahasiswa("Ucup", 100.0, "Pedang","baju besi",15.0,10.0);
        Mahasiswa player2 = new Mahasiswa("Otong", 50.0, "Ketapel","kaos",1.0,0.0);

        // Memanggil metode objek untuk menampilkan informasi
        System.out.println("Informasi player 1:");
        player1.displayInfo();

        System.out.println("\nInformasi player 2:");
        player2.displayInfo();
    }
}
