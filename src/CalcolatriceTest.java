import static org.junit.jupiter.api.Assertions.*;

class CalcolatriceTest {

    @org.junit.jupiter.api.Test
    void sommaOkay() {
        //andare a richiamare l'istanza
        Calcolatrice calcolatrice = new Calcolatrice();
        //andare a richiamare il metodo
        //inserire nel metodo dei valori di input che facciano passare il test
        int result = calcolatrice.somma(3,4);
        //andare ad utilizzare il costrutto per validare il test
        assertEquals(7, result);
    }

    @org.junit.jupiter.api.Test
    void sottrai() {
        Calcolatrice calcolatrice = new Calcolatrice();
        int result = calcolatrice.sottrai(7,2);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void moltiplica() {
        Calcolatrice calcolatrice = new Calcolatrice();
        int result = calcolatrice.moltiplica(7,2);
        assertEquals(14, result);
    }

    @org.junit.jupiter.api.Test
    void dividi() {
        Calcolatrice calcolatrice = new Calcolatrice();
        double result = calcolatrice.dividi(8,2);
        assertEquals(4, result);
    }
}