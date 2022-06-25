/*
  TargetNeedForEnergy class
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
 */

package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class TargetNeedForEnergy implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if ((t.getTargetProduction() + t.getTargetBatteryEnergySurplus()) < t.getTargetNeed()) {
            System.out.println("TargetNeedForEnergy - PASS");
            return true;
        } else {
            System.out.println("TargetNeedForEnergy - FAIL");
            return false;
        }
    }
}

