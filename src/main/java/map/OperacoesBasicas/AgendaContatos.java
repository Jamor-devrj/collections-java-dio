package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
        else {
            System.out.println("Agenda está vazia!");
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
       Integer numeroNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroNome = agendaContatoMap.get(nome);
        }
        else {
            System.out.println("Agenda está vazia!");
        }
        return numeroNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila Dio", 2345678);
        agendaContatos.adicionarContato("Camila Cavalcante", 1234567);
        agendaContatos.adicionarContato("Camila Silva", 98765421);
        agendaContatos.adicionarContato("Camila Brasil", 14785236);
        agendaContatos.adicionarContato("Joao", 74108520);
        agendaContatos.adicionarContato("Maria", 32145698);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila Silva"));

    }

}
