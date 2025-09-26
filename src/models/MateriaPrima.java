package models;

public class MateriaPrima {

    int id;
    String nome;
    int quantidade;
    int unidade;
    double custo;
    Produto produto;

    MateriaPrima(int id, String nome, int quantidade, double custo){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }
}
