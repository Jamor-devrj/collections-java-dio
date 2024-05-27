package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itensList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i: itensList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        itensList.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!itensList.isEmpty()){
            for(Item i : itensList) {
                double vrItem = i.getQuantidade() * i.getPreco();
                valorTotal += vrItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void exibirItens(){
        System.out.println(itensList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itensList=" + itensList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Caderno", 23.99, 2);
        carrinho.adicionarItem("Lapis", 1.00, 5);
        carrinho.adicionarItem("borracha", 1.50, 2);

        carrinho.exibirItens();

        carrinho.removerItem("Lapis");

        carrinho.exibirItens();
        System.out.println("O valor total da compra é " + carrinho.calcularValorTotal());




    }

}
