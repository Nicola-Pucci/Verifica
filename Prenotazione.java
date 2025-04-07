package it.itsprodigi.fsd2;

public class Prenotazione{
    private boolean prenotata;
    private String nomeCliente;
    public Prenotazione(){
        prenotata = false;
        nomeCliente = null;
    }
    public void prenota(String nome){
        prenotata = true;
        nomeCliente = nome;
    }
    public void cancellaPrenotazione(){
        prenotata = false;
        nomeCliente = null;
    }
    public boolean isPrenotata(){
        return prenotata;
    }
    public  String getNomeCliente(){
        return nomeCliente;
    }
}
