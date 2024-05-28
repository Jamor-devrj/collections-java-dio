package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        if(!numeros.isEmpty()){
            for(Integer n: numeros){
                total += n;
            }
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        else {
            System.out.println("A lista esta vazia");
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }
        else {
            System.out.println("A lista esta vazia");
        }
        return menorNumero;
    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(numeros);
        }
        else {
            System.out.println("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);

        System.out.print("Numero na lista ");
        somaNumeros.exibirNumeros();

        System.out.println("Total somado: " + somaNumeros.calcularSoma());
        System.out.println("Numero Maior: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Numero Menor: " + somaNumeros.encontrarMenorNumero());

    }
}
