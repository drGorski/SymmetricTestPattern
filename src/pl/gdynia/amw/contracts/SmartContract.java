/*
  SmartContract abstract class

  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
 */

package pl.gdynia.amw.contracts;

import pl.gdynia.amw.Transaction;
import pl.gdynia.amw.rules.VerificationRule;
import java.util.List;

public abstract sealed class SmartContract permits ExchangeEnergyContract {
    // list of verification rules
    protected List<VerificationRule> rulesList;

    // verification of the smart contract
    public abstract boolean checkSC(Transaction tr);
}