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

@SuppressWarnings("all") public class bigchain_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bigchain_$Is$No$Conflict_0_0 instance = new bigchain_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsNoConflict_0_0");
    Fail22301:
    { 
      IStrategoTerm g_4342 = null;
      IStrategoTerm j_4342 = null;
      IStrategoTerm l_4342 = null;
      g_4342 = term;
      l_4342 = term;
      Success11988:
      { 
        Fail22302:
        { 
          IStrategoTerm n_4342 = null;
          n_4342 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_4342, trans.const4427, g_4342);
          if(term == null)
            break Fail22302;
          if(true)
            break Success11988;
        }
        term = trans.constNil3;
      }
      j_4342 = term;
      term = l_4342;
      term = termFactory.makeTuple(j_4342, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6834.instance);
      if(term == null)
        break Fail22301;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}