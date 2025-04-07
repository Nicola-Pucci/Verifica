package it.itsprodigi.fsd2;

public class Prenotazioni {
    Prenotazione [] calendario;
    public Prenotazioni(){
        calendario = new Prenotazione[30];
        for(int i = 0; i<30;i++){
            Prenotazione pippo = new Prenotazione();
            calendario[i] = pippo;
        }
    }

    public boolean prenota(String nome, int a , int b){
        boolean pippo = false;
        for(int i = a-1;i<b-1;i++){
            if(calendario[i].isPrenotata()){
                return false;
            }
        }
            for(int i = a-1;i<=b-1;i++){
                calendario[i].prenota(nome);

            }
        return true;
    }
    public boolean prenota(String nome,int a){
        if(!calendario[a-1].isPrenotata()){
            calendario[a-1].prenota(nome);
            return true;
        }else{
            return false;
        }
    }
    public void cancellaPrenotazione(String nome){
        for(int i = 0; i<30;i++){
            if(calendario[i].getNomeCliente() == nome){
                calendario[i].cancellaPrenotazione();
            }
        }
    }
    public String[] getCalendario(){
        String [] mensile = new String[30];
        String occupata;
        String giorno = null;
        for(int i = 0;i<30;i++){
            switch (i%7){
                case 0:
                    giorno = "Lunedì";
                case 1:
                    giorno = "Martedì";
                case 2:
                    giorno = "Mercoledì";
                case 3:
                    giorno = "Giovedì";
                case 4:
                    giorno = "Venerdì";
                case 5:
                    giorno = "Sabato";
                case 6:
                    giorno = "Domenica";
            }
            if(this.calendario[i].isPrenotata()){
                occupata = "Occupata";
                }else{
                occupata = " Libera";
            }
            mensile [i] = giorno+" "+Integer.toString(i+1) + " "+ occupata;
        }
        return mensile;
    }
}
