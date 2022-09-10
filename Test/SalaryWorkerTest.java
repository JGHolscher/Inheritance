import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2, sw3;


    @BeforeEach
    void setUp() {
      sw1 = new SalaryWorker("Sarah", "Smith", "Ms.", 1998, 32000.52);
      sw2 = new SalaryWorker("Donovan", "Scoglietti", "Mr.", 1999, 57045.0);
      sw3 = new SalaryWorker("Rhonda", "Holscher", "Mrs.", 1969, 26987.98);

    }

    @Test
    void setAnnualSalary() {
        sw1.setAnnualSalary(32000.52);
        assertEquals(32000.52, sw1.getAnnualSalary());
        sw2.setAnnualSalary(57045.0);
        assertEquals(57045.0, sw2.getAnnualSalary());
        sw3.setAnnualSalary(26987.98);
        assertEquals(26987.98, sw3.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        sw1.calculateWeeklyPay();
        assertEquals(sw1.calculateWeeklyPay(), sw1.calculateWeeklyPay());
        sw2.calculateWeeklyPay();
        assertEquals(sw2.calculateWeeklyPay(), sw2.calculateWeeklyPay());
        sw1.calculateWeeklyPay();
        assertEquals(sw3.calculateWeeklyPay(), sw3.calculateWeeklyPay());
    }

    @Test
    void displayWeeklyPay() {
        sw1.displayWeeklyPay();
        assertEquals(sw1.displayWeeklyPay(), sw1.displayWeeklyPay());
        sw2.displayWeeklyPay();
        assertEquals(sw2.displayWeeklyPay(), sw2.displayWeeklyPay());
        sw3.displayWeeklyPay();
        assertEquals(sw3.displayWeeklyPay(), sw3.displayWeeklyPay());
    }
}