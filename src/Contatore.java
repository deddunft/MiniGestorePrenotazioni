public class Contatore {
    public int cont;
    public int agg;

    public Contatore(int agg) {
        this.cont = 0;
        this.agg=agg;
    }
    public int Conta(){
        cont++;
        if (cont>agg)
            cont=0;
        return cont;
    }

    public int getCont() {
        return cont;
    }
}
