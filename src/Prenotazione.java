public abstract class Prenotazione {
    private Sala sala;
    private int posti;
    private int codice = 0;


    public Prenotazione(Sala sala, int posti) {
        this.sala = sala;
        this.posti = posti;
        this.codice = codice++;
    }


    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "sala=" + sala +
                ", posti=" + posti +
                ", codice=" + codice +
                '}';
    }
}
