package it.itsprodigi.fsd2;
import java.lang.Object;

import static java.lang.String.valueOf;

public class Albergo {
    private Stanza[] elencoStanze;
    private int piani;
    private int stanze;
    public Albergo(int piani,int stanze){
        elencoStanze = new Stanza[piani * stanze];
        this.piani = piani;
        this.stanze = stanze;
        for(int i = 0;i < piani;i++){
            for(int a = 0;a<stanze;a++){
                String pippo =(Integer.toString(i) + Integer.toString(a));
                Stanza stanza = new Stanza(pippo);
                elencoStanze[(i*stanze)+a]=stanza;
            }
        }
    }
     public Stanza [] getElencoStanze(){
        return elencoStanze;
     }
     public String prenotaStanza(String nome,int a, int b){
        for(int i = 0;i<(piani*stanze);i++){
            if(elencoStanze[i].prenotaStanza(nome,a,b)){
                return elencoStanze[i].getNumStanza();
            }
        }
        return "Errore nella ragistrazione";
     }

    public String prenotaStanza(String nome,int a){
        for(int i = 0;i<(piani*stanze);i++){
            if(elencoStanze[i].prenotaStanza(nome,a)){
                return elencoStanze[i].getNumStanza();
            }
        }
        return "Errore nella ragistrazione";
    }
    public void cancellaPrenotazione(String nome,int stanza){
        elencoStanze[stanza].cancellaPrenotazione(nome);
    }
}
