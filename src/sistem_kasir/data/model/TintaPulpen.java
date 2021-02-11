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
public class TintaPulpen extends Decorator {

    private String merek;

    public TintaPulpen(String merek, String nama, int quantity, int harga, IProduk produk) {
        super(nama, quantity, harga, produk);
        this.merek = merek;
    }

    @Override
    public String print() {
        return this.produk.print()
                + "\nProduk Tinta Pulpen"
                + "\nNama \t:" + this.nama
                + "\nMerek \t:" + this.merek
                + "\nQuantity \t:" + this.quantity
                + "\nHarga \t:" + this.harga
                + "\n===================================================\n";
    }

}
