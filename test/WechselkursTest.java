import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WechselkursTest {
    @Test
    void testMaxKursgewinn2() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6, 0, 0};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(0.2, wk.maxKursgewinn2(), 0.001);
    }
    @Test
    void testLaengsteAnstieg() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6, 0, 0};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(3, wk.laengsteAnstieg());
    }
    @Test
    void testMinKurs() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6, 0, 0};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(0.5, wk.minKurs());
    }
    @Test
    void testAvgKurs() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(0.7, wk.avgKurs(),0.001);
    }
    @Test
    void testMaxKursGewinn() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(0.4, wk.maxKursGewinn());
    }
    @Test
    void testAnzahlTageUeberKurs() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(5,wk.anzahlTageUeberKurs(0.6));
    }
    @Test
    void testanzahlSpitzen() {
        double[] kurse = {0.8, 0.9, 0.7, 0.6, 0.7, 0.8, 0.5, 0.6};
        Wechselkurs wk = new Wechselkurs(kurse);
        wk.anzahl = 8;

        assertEquals(2, wk.anzahlSpitzen());
    }
}