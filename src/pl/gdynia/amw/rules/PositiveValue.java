/*
  PositiveValue class
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
 */

package pl.gdynia.amw.rules;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.Transaction;

public final class PositiveValue implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getQuantity() > 0) {
            System.out.println("PositiveValue - PASS");
            return true;
        } else {
            System.out.println("PositiveValue - FAIL");
            return false;
        }
    }
}
