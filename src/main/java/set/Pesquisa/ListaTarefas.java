package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }

    }
    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarPendente != null){
            if (tarefaParaMarcarPendente.isConcluida()){
                tarefaParaMarcarPendente.setConcluida(false);
            }
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }
    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar");
        listaTarefas.adicionarTarefa("Limpar");
        listaTarefas.adicionarTarefa("cozinhar");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("trabalhar");

        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());


        listaTarefas.removerTarefa("Lavar");
        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());


        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("trabalhar");
        System.out.println("Concluidas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("regar as flores");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


    }
}
