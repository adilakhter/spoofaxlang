package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class constraint_error_bad_match_0_0 extends Strategy 
{ 
  public static constraint_error_bad_match_0_0 instance = new constraint_error_bad_match_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("constraint_error_bad_match_0_0");
    Fail23311:
    { 
      IStrategoTerm r_4820 = null;
      term = collect_1_0.instance.invoke(context, term, lifted6940.instance);
      if(term == null)
        break Fail23311;
      term = filter_1_0.instance.invoke(context, term, lifted6941.instance);
      if(term == null)
        break Fail23311;
      term = map_1_0.instance.invoke(context, term, lifted6942.instance);
      if(term == null)
        break Fail23311;
      r_4820 = term;
      IStrategoTerm term12653 = term;
      Success12526:
      { 
        Fail23312:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail23312;
          { 
            if(true)
              break Fail23311;
            if(true)
              break Success12526;
          }
        }
        term = term12653;
      }
      term = r_4820;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}