package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Is$Imported_0_0 extends Strategy 
{ 
  public static $Is$Imported_0_0 instance = new $Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImported_0_0");
    Fail23026:
    { 
      TermReference x_4645 = new TermReference();
      TermReference y_4645 = new TermReference();
      IStrategoTerm c_4646 = null;
      if(y_4645.value == null)
        y_4645.value = term;
      else
        if(y_4645.value != term && !y_4645.value.match(term))
          break Fail23026;
      if(x_4645.value == null)
        x_4645.value = term;
      else
        if(x_4645.value != term && !x_4645.value.match(term))
          break Fail23026;
      c_4646 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, c_4646, trans.const4487, y_4645.value);
      if(term == null)
        break Fail23026;
      lifted6911 lifted69110 = new lifted6911();
      lifted69110.x_4645 = x_4645;
      lifted69110.y_4645 = y_4645;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted69110);
      if(term == null)
        break Fail23026;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}