public class Contatore {
    public int cont;

    public Contatore() {
        this.cont = 0;
    }
    public int Conta(){
        cont++;
        return cont;
    }

    public int getCont() {
        return cont;
    }
}
