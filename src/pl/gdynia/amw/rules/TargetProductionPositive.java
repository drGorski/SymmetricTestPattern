package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class TargetProductionPositive implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getTargetProduction() > 0) {
            System.out.println("TargetProductionPositive - PASS");
            return true;
        } else {
            System.out.println("TargetProductionPositive - FAIL");
            return false;
        }
    }
}