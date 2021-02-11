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
public class PensilModel extends Decorator {

    private String merek;
    private String jenis;

    public PensilModel(String merek, String jenis, String nama, int quantity, int harga, IProduk produk) {
        super(nama, quantity, harga, produk);
        this.merek = merek;
        this.jenis = jenis;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String print() {
        return this.produk.print()
                + "\nProduk Pensil Model"
                + "\nNama \t:" + this.nama
                + "\nMerek \t:" + this.merek
                + "\nJenis \t:" + this.jenis
                + "\nQuantity \t:" + this.quantity
                + "\nHarga \t:" + this.harga
                + "\n===================================================\n";
    }

}
