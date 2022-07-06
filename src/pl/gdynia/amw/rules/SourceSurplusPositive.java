package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class SourceSurplusPositive implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getSourceSurplus() > 0) {
            System.out.println("SourceSurplusPositive - PASS");
            return true;
        } else {
            System.out.println("SourceSurplusPositive - FAIL");
            return false;
        }
    }
}

