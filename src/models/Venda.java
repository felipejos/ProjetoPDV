package models;

import java.util.ArrayList;

public class Venda {

    int id;
    String cliente;
    double valorTotal;
    String data;

    ArrayList<Produto> carrinhoProdutos = new ArrayList<>();
    
}
