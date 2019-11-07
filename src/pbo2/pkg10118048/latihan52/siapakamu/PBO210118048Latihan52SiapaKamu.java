/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan52.siapakamu;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : siapa kamu
 */
public class PBO210118048Latihan52SiapaKamu {

    public static void main(String[] args) {
        
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawa");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        mhs.setNim("10118048");
        mhs.setNama("Niko Yama");
        mhs.setUmur(18);
        mhs.setKelas("PBO2");
        System.out.println("\nNIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }

}
