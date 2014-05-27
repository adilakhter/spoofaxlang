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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail87827:
    { 
      TermReference r_17588 = new TermReference();
      TermReference s_17588 = new TermReference();
      if(s_17588.value == null)
        s_17588.value = term;
      else
        if(s_17588.value != term && !s_17588.value.match(term))
          break Fail87827;
      if(r_17588.value == null)
        r_17588.value = term;
      else
        if(r_17588.value != term && !r_17588.value.match(term))
          break Fail87827;
      Success47315:
      { 
        Fail87828:
        { 
          IStrategoTerm w_17588 = null;
          w_17588 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_17588, trans.const17874, s_17588.value);
          if(term == null)
            break Fail87828;
          if(true)
            break Success47315;
        }
        term = trans.constNil14;
      }
      lifted24792 lifted247920 = new lifted24792();
      lifted247920.r_17588 = r_17588;
      lifted247920.s_17588 = s_17588;
      term = filter_1_0.instance.invoke(context, term, lifted247920);
      if(term == null)
        break Fail87827;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}