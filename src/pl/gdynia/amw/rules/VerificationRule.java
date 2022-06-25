/*
  @author  Tomasz Górski
  @version 2.0
  @since   2022-06-25
 */
package pl.gdynia.amw.rules;

import pl.gdynia.amw.Transaction;

public interface VerificationRule {
    boolean runRule(Transaction tr);
}
