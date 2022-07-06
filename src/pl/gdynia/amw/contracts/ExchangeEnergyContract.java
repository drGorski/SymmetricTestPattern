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
        rulesList = Arrays.asList(
                new TheSameCommunity(),
                new DifferentProsumers(),
                new PositiveValue(),
                new SourceSurplusPositive(), // added for 7
                new TargetNeedPositive(), // added for 7
                new SourceSurplusEnergy(), // removed for 3
                //new TargetProductionPositive(), // added for 9
                //new TargetBatteryPositive(), // added for 9
                new TargetNeedForEnergy()); // removed for 3
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
