package it.itsprodigi.fsd2;
//2 argomenti a riga di comando(nPiani e nStanzePerPiano)
public class MainAlb {
    public static void main(String[] args){
        Albergo pippo = new Albergo(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

        pippo.prenotaStanza("nicola",7,8);
        Stanza [] idk = pippo.getElencoStanze();
        System.out.println("pippo"+idk[0].getCalendario()[6]);
    }
}
