import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1,w2,w3;

    @BeforeEach
    void setUp() {
        w1 = new Worker("Sarah", "Smith", "Ms.", 1998, 14.50);
        w2 = new Worker("Donovan", "Scoglietti", "Mr.", 1999, 25.78);
        w3 = new Worker("Rhonda", "Holscher", "Mrs.", 1969, 17.63);

    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(14.50);
        assertEquals(14.50, w1.getHourlyPayRate());
        w2.setHourlyPayRate(25.78);
        assertEquals(25.78, w2.getHourlyPayRate());
        w3.setHourlyPayRate(17.63);
        assertEquals(17.63, w3.getHourlyPayRate());

    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(56.36);
        assertEquals(w1.calculateWeeklyPay(56.36), w1.calculateWeeklyPay(56.36));
        w2.calculateWeeklyPay(35.7);
        assertEquals(w2.calculateWeeklyPay(35.7), w2.calculateWeeklyPay(35.7));
        w3.calculateWeeklyPay(26.0);
        assertEquals(w3.calculateWeeklyPay(26.0), w3.calculateWeeklyPay(26.0));

    }

    @Test
    void displayWeeklyPay() {
        w1.displayWeeklyPay(56.36);
        assertEquals(w1.displayWeeklyPay(56.36), w1.displayWeeklyPay(56.36));
        w2.displayWeeklyPay(35.7);
        assertEquals(w2.displayWeeklyPay(35.7), w2.displayWeeklyPay(35.7));
        w3.displayWeeklyPay(26.0);
        assertEquals(w3.displayWeeklyPay(26.0), w3.displayWeeklyPay(26.0));

    }
}