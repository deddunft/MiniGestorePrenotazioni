public class mein {

    public static void main(String[] args) {
        MiniGestorePrenotazioni mgp1 = new MiniGestorePrenotazioni(20,20);
        PrenotazioneSingola p1;
        System.out.println(mgp1.salae.getPosti());
        prenotazioneG pg2 = new prenotazioneG(Sala.INTERNO,3);

        prenotazioneG pg1 = new prenotazioneG(Sala.ESTERNO,10);
        System.out.println(mgp1.Prenota(p1=new PrenotazioneSingola(Sala.ESTERNO)));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(p1));
        System.out.println(mgp1.salae.getPosti());
        mgp1.terminaPrenotazione(p1);
        System.out.println(mgp1.salae.getPosti());
        mgp1.Prenota(pg2);
        System.out.println(mgp1);

    }
}
