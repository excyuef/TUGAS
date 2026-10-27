/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author rhafi-ganteng
 */

import java.util.Scanner;

public class TugasCoding {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU TUGAS CODING JAVA =====");
            System.out.println("1. Ganjil atau Genap");
            System.out.println("2. Predikat Nilai");
            System.out.println("3. Bilangan 1 sampai 100");
            System.out.println("4. Jumlah Bilangan 1 sampai 50");
            System.out.println("5. Menu Data Sekolah");
            System.out.println("6. Pemeriksaan Nilai Siswa");
            System.out.println("7. Menampilkan Bilangan Ganjil");
            System.out.println("8. Tabel Perkalian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    ganjilGenap();
                    break;
                case 2:
                    predikatNilai();
                    break;
                case 3:
                    bilanganSeratus();
                    break;
                case 4:
                    jumlahBilangan();
                    break;
                case 5:
                    menuSekolah();
                    break;
                case 6:
                    pemeriksaanNilai();
                    break;
                case 7:
                    bilanganGanjil();
                    break;
                case 8:
                    tabelPerkalian();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }

    // 1. Menentukan bilangan ganjil atau genap
    static void ganjilGenap() {
        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }

    // 2. Menentukan predikat nilai
    static void predikatNilai() {
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilai >= 90) {
            System.out.println("Predikat: A");
        } else if (nilai >= 80) {
            System.out.println("Predikat: B");
        } else if (nilai >= 70) {
            System.out.println("Predikat: C");
        } else {
            System.out.println("Predikat: D");
        }
    }

    // 3. Menampilkan bilangan 1 sampai 100
    static void bilanganSeratus() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 4. Menghitung jumlah bilangan 1 sampai 50
    static void jumlahBilangan() {
        int total = 0;

        for (int i = 1; i <= 50; i++) {
            total += i;
        }

        System.out.println("Jumlah bilangan 1 sampai 50: " + total);
    }

    // 5. Menu aplikasi menggunakan switch
    static void menuSekolah() {
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA SEKOLAH =====");
            System.out.println("1. Data Siswa");
            System.out.println("2. Data Guru");
            System.out.println("3. Data Kelas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Menampilkan Data Siswa.");
                    break;
                case 2:
                    System.out.println("Menampilkan Data Guru.");
                    break;
                case 3:
                    System.out.println("Menampilkan Data Kelas.");
                    break;
                case 4:
                    System.out.println("Keluar dari menu sekolah.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }

    // 6. Menghitung jumlah siswa lulus dan belum lulus
    static void pemeriksaanNilai() {
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        int lulus = 0;
        int belumLulus = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            int nilai = input.nextInt();

            if (nilai >= 75 && nilai <= 100) {
                lulus++;
            } else if (nilai >= 0 && nilai < 75) {
                belumLulus++;
            } else {
                System.out.println("Nilai tidak valid!");
                i--;
            }
        }

        System.out.println("Jumlah siswa lulus: " + lulus);
        System.out.println("Jumlah siswa belum lulus: " + belumLulus);
    }

    // 7. Menampilkan bilangan ganjil menggunakan continue
    static void bilanganGanjil() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    // 8. Menampilkan tabel perkalian 1 sampai 10
    static void tabelPerkalian() {
        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        System.out.println("\nTabel perkalian " + angka + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                angka + " x " + i + " = " + (angka * i)
            );
        }
    }
}

