package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contadosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contadosPorNome.add(c);
            }
        }
        return contadosPorNome;
    }
   public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao i", 12345678);
        agendaContatos.adicionarContato("Joao", 58269347);
        agendaContatos.adicionarContato("Camila", 23456789);
        agendaContatos.adicionarContato("Camila Siva", 33456789);
        agendaContatos.adicionarContato("Camila Jose", 43456789);
        agendaContatos.adicionarContato("Karla", 98765432);
        agendaContatos.adicionarContato("Jaime", 147858236);
        agendaContatos.adicionarContato("Maria", 36985214);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Joao"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Jaime", 12345678));

        //agendaContatos.atualizarNumeroContato("Jaime", 63258741);

        agendaContatos.exibirContatos();



    }
}
