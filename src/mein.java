public class mein {

    public static void main(String[] args) {
        MiniGestorePrenotazioni mgp1 = new MiniGestorePrenotazioni(5,5);
        PrenotazioneSingola p1 ;
        Contatore counti = new Contatore();
        Contatore counte = new Contatore();

        System.out.println(mgp1.salae.getPosti());
        prenotazioneG pg2 = new prenotazioneG(Sala.INTERNO,3, counti.getCont());

        prenotazioneG pg1 = new prenotazioneG(Sala.ESTERNO,2, counte.getCont());
        System.out.println(mgp1.Prenota(p1=new PrenotazioneSingola(Sala.INTERNO, counti.Conta())));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1);
        mgp1.terminaPrenotazione(p1);
        System.out.println(mgp1);
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg2));
        System.out.println(mgp1);
        mgp1.terminaPrenotazione(pg2);
        System.out.println(mgp1);

    }
}
