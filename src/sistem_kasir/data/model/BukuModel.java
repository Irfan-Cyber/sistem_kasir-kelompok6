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
public class BukuModel extends Decorator {

    private String penerbit;
    private int tahunTerbit;
    private int halaman;
    private String penulis;

    public BukuModel(String penerbit, String penulis, int tahunTerbit, int halaman, String nama, int quantity, int harga, IProduk produk) {
        super(nama, quantity, harga, produk);
        this.penerbit = penerbit;
        this.penulis = penulis;
        this.halaman = halaman;
        this.tahunTerbit = tahunTerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    

    @Override
    public String print() {
        return this.produk.print() + 
        "\nProduk Buku" + 
        "\nJudul \t:" + this.nama + 
        "\nPenerbit \t:" + this.penerbit + 
        "\nTahun \t:" + this.tahunTerbit + 
        "\nHalaman \t:" + this.halaman + " hal" + 
        "\nPenulis \t:" + this.penulis + 
        "\nQuantity \t:" + this.quantity + 
        "\nHarga \t:" + this.harga + 
        "\n===================================================\n";
    }

}
