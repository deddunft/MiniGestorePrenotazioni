public  class sSala {
    private int posti;
    private Sala sala;

    public sSala(int posti, Sala sala) {
        this.posti = posti;
        this.sala = sala;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "sSala{" +
                "posti=" + posti +
                ", sala=" + sala +
                '}';
    }
}
