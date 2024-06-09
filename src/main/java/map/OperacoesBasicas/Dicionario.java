package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
        else {
            System.out.println("Dicionario esta vazio!");
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraEncontrada = null;
        if (!dicionarioMap.isEmpty()){
            palavraEncontrada = dicionarioMap.get(palavra);
        }
        return palavraEncontrada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Arroz", "Grão usado como alimento");
        dicionario.adicionarPalavra("Futebol", "Esporte com bola sem uso das mão");
        dicionario.adicionarPalavra("Feijoada", "Prato brasileiro com base no feijão");
        dicionario.adicionarPalavra("Biblia", "Livro Sagrado do Cristianismo");
        dicionario.adicionarPalavra("Rola", "Pequena ave");
        dicionario.adicionarPalavra("Abestado", "Ministro Haddad");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Abestado");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Feijoada"));

    }


}
