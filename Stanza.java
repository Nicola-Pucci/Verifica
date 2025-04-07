package it.itsprodigi.fsd2;

public class Stanza {
    private String nome;
    private Prenotazioni calStanza;

    public Stanza(String nome){
        calStanza = new Prenotazioni();
        this.nome = nome;
    }

    public String getNumStanza() {
        return nome;
    }
    public boolean prenotaStanza(String nomeCliente,int a , int b){
        if(calStanza.prenota(nomeCliente,a,b)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean prenotaStanza(String nomeCliente,int a){
        if(calStanza.prenota(nomeCliente,a)) {
            return true;
        }else{
            return false;
        }
    }

    public String[] getCalendario() {
        return calStanza.getCalendario();
    }

    @Override
    public String toString() {
        return nome;
    }
}
