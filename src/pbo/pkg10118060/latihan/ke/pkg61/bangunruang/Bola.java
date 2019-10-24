/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118060.latihan.ke.pkg61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Permai Ramadhan
 * KELAS    : IF-2
 * NIM      : 10118060
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menghitung
 * volume bangun ruang
 */
public class Bola extends BangunRuang {

    @Override
    public double hitungVolume() {
        return 4.0/3.0 * 22.0/7.0 * Math.pow(jariJari, 3);
    }
    
}
