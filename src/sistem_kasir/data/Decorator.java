/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_kasir.data;

/**
 *
 * @author Acer
 */
public abstract class Decorator implements IProduk {

    protected IProduk produk = null;

    protected String nama;
    protected int quantity;
    protected int harga;

    public Decorator(String nama, int quantity, int harga, IProduk produk) {
        this.produk = produk;
        this.nama = nama;
        this.quantity = quantity;
        this.harga = harga;
    }

}
