package it.itsprodigi.fsd2;
//2 argomenti a riga di comando(nPiani e nStanzePerPiano)
public class MainAlb {
    public static void main(String[] args) {
        int piani = Integer.parseInt(args[0]);
        int stanze = Integer.parseInt(args[1]);
        Albergo pippo = new Albergo(piani, stanze);

        String s = pippo.prenotaStanza("nicola", 7, 8);
        System.out.println("è stata prenotata la stanza: "+s);
        s = pippo.prenotaStanza("carlo", 7, 15);
        System.out.println("è stata prenotata la stanza: "+s);
        s = pippo.prenotaStanza("pluto", 1, 15);
        System.out.println("è stata prenotata la stanza: "+s);
        s = pippo.prenotaStanza("pippo", 15);
        System.out.println("è stata prenotata la stanza: "+s);
        s = pippo.prenotaStanza("paperino", 16,22);
        System.out.println("è stata prenotata la stanza: "+s);
        pippo.cancellaPrenotazione("nicola",00);
        Stanza[] idk = pippo.getElencoStanze();
        for (int a = 0; a<(piani * stanze);a++){
            for (int i = 0; i < 30; i++) {
                System.out.println("Stanza " + idk[a].getNumStanza() + " " + idk[a].getCalendario()[i]);
            }
        }
    }
}