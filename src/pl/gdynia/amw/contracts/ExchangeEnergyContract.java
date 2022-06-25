/*
  ExchangeEnergyContract class
  Concrete smart contract class that implements SmartContract abstract class.

  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
*/
package pl.gdynia.amw.contracts;

import pl.gdynia.amw.Transaction;
import pl.gdynia.amw.rules.VerificationRule;
import pl.gdynia.amw.rules.*;
import java.util.Arrays;

public final class ExchangeEnergyContract extends SmartContract {

    public ExchangeEnergyContract(){
        // populates array-backed list of verification rules
        rulesList = Arrays.asList(
                new TheSameCommunity(),
                new DifferentProsumers(),
                new PositiveValue(),
                new SourceSurplusEnergy(),
                new TargetNeedForEnergy());
    }
    @Override
    public boolean checkSC(Transaction tr){
        boolean correct = false;
        for (VerificationRule vR : rulesList) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}
