package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class TargetNeedPositive implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getTargetNeed() > 0) {
            System.out.println("TargetNeedPositive - PASS");
            return true;
        } else {
            System.out.println("TargetNeedPositive - FAIL");
            return false;
        }
    }
}