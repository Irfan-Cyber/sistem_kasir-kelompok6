/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_kasir.data;

import sistem_kasir.Const;
import sistem_kasir.data.model.GelPulpen;
import sistem_kasir.data.model.TintaPulpen;

/**
 *
 * @author Acer
 */
public class PulpenFactory {
    private String type;
    private String merek;
    private int quantity;
    private int harga;
    private String nama;
    private IProduk produk;

    public PulpenFactory(int quantity, int harga, String nama, IProduk produk) {
        this.quantity = quantity;
        this.harga = harga;
        this.nama = nama;
        this.produk = produk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public IProduk getPulpen(){
        if(type.equals(Const.TYPE_GEL)){
            return new GelPulpen(merek, nama, quantity, harga, produk);
        } else {
            return new TintaPulpen(merek, nama, quantity, harga, produk);
        }
    }
    
}
