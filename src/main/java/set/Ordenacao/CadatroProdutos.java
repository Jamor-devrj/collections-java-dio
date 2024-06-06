package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadatroProdutos {
    private Set<Produto> produtoSet;

    public CadatroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadatroProdutos cadastroProdutos = new CadatroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Detergente", 30d, 5);
        cadastroProdutos.adicionarProduto(2L, "Carne", 40d, 10);
        cadastroProdutos.adicionarProduto(3L, "Arroz", 20d, 2);
        cadastroProdutos.adicionarProduto(9L, "Bolacha", 10d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
