public class mein {

    public static void main(String[] args) {
        MiniGestorePrenotazioni mgp1 = new MiniGestorePrenotazioni(5,5);
        PrenotazioneSingola p1 ;
        Contatore count = new Contatore();
        System.out.println(mgp1.salae.getPosti());
        prenotazioneG pg2 = new prenotazioneG(Sala.INTERNO,3, count.getCont());

        prenotazioneG pg1 = new prenotazioneG(Sala.ESTERNO,2, count.Conta());
        System.out.println(mgp1.Prenota(p1=new PrenotazioneSingola(Sala.INTERNO, count.Conta())));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1);
        mgp1.terminaPrenotazione(p1);
        System.out.println(mgp1);
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg2));
        System.out.println(mgp1);

    }
}
