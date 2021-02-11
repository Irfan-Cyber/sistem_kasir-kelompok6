/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_kasir.data.model;

import sistem_kasir.data.IProduk;

/**
 *
 * @author Acer
 */
public class ProdukModel implements IProduk {

    @Override
    public String print() {
        return "Produk Yang Dibeli\n===================================================\n";
    }

}
