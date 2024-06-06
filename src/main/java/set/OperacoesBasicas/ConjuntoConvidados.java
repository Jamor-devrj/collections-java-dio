package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Total convidados: " + convidados.contarConvidados());

        convidados.adicionarConvidado("Jose", 10001);
        convidados.adicionarConvidado("Maria", 20002);
        convidados.adicionarConvidado("Joao", 30003);
        convidados.adicionarConvidado("Lucia", 40004);
        convidados.adicionarConvidado("Ana", 40004);

        //convidados.exibirConvidados();

        System.out.println("Total convidados: " + convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(30003);

        convidados.exibirConvidados();

        System.out.println("Total convidados: " + convidados.contarConvidados());

    }
}
