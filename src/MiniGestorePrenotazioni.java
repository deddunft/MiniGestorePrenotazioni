import java.util.Arrays;

public class MiniGestorePrenotazioni {
    public int n;
    public int m;
    public sSala salai;
    public sSala salae;
    public int cod;
    private int count;
    private int counte;
    private int counti;

    private Prenotazione[] prenotazionei;
    private Prenotazione[] prenotazionee;




    public MiniGestorePrenotazioni(int n, int m){
        this.n = n;
        salai = new sSala(this.n,Sala.INTERNO);
        this.m = m;
        salae= new sSala(this.m,Sala.ESTERNO);
        prenotazionei = new Prenotazione[salai.getPosti()];
        prenotazionee = new Prenotazione[salai.getPosti()];
    }

    public sSala getSalai() {
        return salai;
    }

    public void setSalai(sSala salai) {
        this.salai = salai;
    }

    public sSala getSalae() {
        return salae;
    }

    public void setSalae(sSala salae) {
        this.salae = salae;
    }

    public boolean Prenota(Prenotazione prenotazione) {
        cod = count;
        if (salae.getPosti() < prenotazione.getPosti() || salai.getPosti() < prenotazione.getPosti()) {

            return false;
        } else if (prenotazione instanceof prenotazioneG && prenotazione.getPosti() > salae.getPosti() + salai.getPosti()) {
            return false;
        } else {
            if (prenotazione.getSala() == salae.getSala() && prenotazione instanceof PrenotazioneSingola) {
                int pippo = salae.getPosti();
                salae.setPosti(pippo - prenotazione.getPosti());
                prenotazionee[prenotazione.getCodice()]=prenotazione;
                counte++;

            } else if (prenotazione.getSala() == salai.getSala()) {
                int pippo = salai.getPosti();
                salai.setPosti(pippo - prenotazione.getPosti());
                prenotazionei[prenotazione.getCodice()]=prenotazione;
                counti++;

            } else if (prenotazione instanceof prenotazioneG && prenotazione.getPosti() < salai.getPosti() + salae.getPosti()) {
                int pippo = salae.getPosti();
                salae.setPosti(pippo - prenotazione.getPosti());
                prenotazionee[prenotazione.getCodice()]=prenotazione;
                counte++;
            } else if (prenotazione instanceof prenotazioneG && prenotazione.getPosti() < salai.getPosti() + salae.getPosti()) {
                int pippo = salai.getPosti();
                salai.setPosti(pippo - prenotazione.getPosti());
                prenotazionee[prenotazione.getCodice()]=prenotazione;
                counte++;
            }
            cod= count;

            count++;
            return true;
        }
    }

    public void terminaPrenotazione (Prenotazione prenotazione) {
        if (prenotazione.getSala() == salae.getSala()) {
            int pippo = salae.getPosti();
            salae.setPosti(prenotazione.getPosti()+pippo);
            prenotazionee[prenotazione.getCodice()]=null;
        }
        if (prenotazione.getSala() == salai.getSala()) {
            int pippo = salai.getPosti();
            salai.setPosti(prenotazione.getPosti()+pippo);
            prenotazionei[prenotazione.getCodice()]=null;
        }
    }


    @Override
    public String toString() {
        return "MiniGestorePrenotazioni{" +
                "prenotazione interno=" + Arrays.toString(prenotazionei) +
                ", prenotazione esterno=" + Arrays.toString(prenotazionee) +
                '}';
    }
}
