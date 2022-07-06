package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class TargetBatteryPositive implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getTargetBatteryEnergySurplus() > 0) {
            System.out.println("TargetBatteryPositive - PASS");
            return true;
        } else {
            System.out.println("TargetBatteryPositive - FAIL");
            return false;
        }
    }
}