public class prenotazioneG extends Prenotazione{

    private int posti;

    public prenotazioneG(Sala sala, int posti,int codice) {
        super(sala, posti,codice);
        this.posti = posti;
    }
}
