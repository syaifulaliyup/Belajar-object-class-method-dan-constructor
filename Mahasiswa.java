package Latihan1;

public class Mahasiswa {
    // Atribut kelas Mahasiswa
    String nama;
    double health;
    String weapon;
    String armor;
    double attack;
    double defence;

    // Konstruktor kelas Mahasiswa
    public Mahasiswa(String nama, double health, String weapon,String armor,double attack,double defence) {
        this.nama = nama;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
        this.attack = attack;
        this.defence = defence;
    }

    // Metode kelas Mahasiswa
    void displayInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Health : " + " " + health + " " + "Hp");
        System.out.println("Weapon : " + " " + weapon + " " + attack);
        System.out.println("Armor :" + " " + armor + " " + defence);
    }
}
