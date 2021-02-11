/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_kasir.data.model;

import sistem_kasir.data.Decorator;
import sistem_kasir.data.IProduk;

/**
 *
 * @author Acer
 */
public class PenghapusModel extends Decorator{

    private String merek;
    private String warna;

    public PenghapusModel(String merek, String warna, String nama, int quantity, int harga, IProduk produk) {
        super(nama, quantity, harga, produk);
        this.merek = merek;
        this.warna = warna;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    

    @Override
    public String print() {
        return this.produk.print()
                + "\nProduk Gel Pulpen"
                + "\nNama \t:" + this.nama
                + "\nMerek \t:" + this.merek
                + "\nWarna \t:" + this.warna
                + "\nQuantity \t:" + this.quantity
                + "\nHarga \t:" + this.harga
                + "\n===================================================\n";
    }
    
}
