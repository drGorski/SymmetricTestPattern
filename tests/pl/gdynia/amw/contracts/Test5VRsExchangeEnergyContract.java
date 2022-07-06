package pl.gdynia.amw.contracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.Transaction;

class Test5VRsExchangeEnergyContract {
    ExchangeEnergyContract sC = new ExchangeEnergyContract();
    @Test
    void checkSCPositive() {
        System.out.println("--- checkSCPositive");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 101, 101);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTargetNeedForEnergy() {
        System.out.println("--- checkSCInNegativeTargetNeedForEnergy");
        Transaction tr = new Transaction(100, 300, 400, 20, 500, 1001, 1002, 101, 101);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeSourceSurplusEnergy() {
        System.out.println("--- checkSCNegativeSourceSurplusEnergy");
        Transaction tr = new Transaction(100, 10, 400, 20, 10, 1001, 1002, 101, 101);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativePositiveValue() {
        System.out.println("--- checkSCNegativePositiveValue");
        Transaction tr = new Transaction(0, 300, 400, 20, 10, 1001, 1002, 101, 101);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeDifferentProsumers() {
        System.out.println("--- checkSCNegativeDifferentProsumers");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1001, 101, 101);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTheSameCommunity() {
        System.out.println("--- checkSCNegativeTheSameCommunity");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 101, 102);
        assertFalse(sC.checkSC(tr));
    }
}
