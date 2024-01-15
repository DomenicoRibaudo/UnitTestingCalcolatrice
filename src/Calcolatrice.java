
public class Calcolatrice {

    public int somma(int a, int b) {
        return a + b;
    }

    public int sottrai(int a, int b) {
        return a - b;
    }

    public int moltiplica(int a, int b) {
        return a * b;
    }

    public int dividi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossibile dividere per zero");
        }
        return a / b;
    }
}

