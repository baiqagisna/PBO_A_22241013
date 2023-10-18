package com.tutorial;

// class tanpa kontruktor
class polos {
   String dataString;
   int dataInteger;

}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;


    // membuat kontruktor
    // Mahasiswa() {
    //     System.out.println("ini adalah konstruktor");

    // }

    // Membuat konstruktor dengan parameter
    // Mahasiswa() {
    //     system.out.println("Ini adalah konstruktor");   
    //}

    // Membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi) {    
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;

        System.out.println("Nama : " + nama);
        System.out.println("Nama : " + nim);
        System.out.println("Nama : " + prodi);
    }
}

public class Main {
    public static void main(String [] args) {
        //        polos pls = new polos();
        //        pls.dataString = "polos";
        //        pls.dataInteger = 10;
            
        //         System.out.println("isi data string"+ pls.dataString);
        //         System.out.println("isi data integer"+ pls.dataInteger);    
        }

        Mahasiswa mhs1 = new Mahasiswa("Lee Dong Gok", "1234", "PTI");
}

    