/*
  DifferentProsumers class
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
 */

package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class DifferentProsumers implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getSourceID() != t.getTargetID()) {
            System.out.println("DifferentProsumers - PASS");
            return true;
        } else {
            System.out.println("DifferentProsumers - FAIL");
            return false;
        }
    }
}
