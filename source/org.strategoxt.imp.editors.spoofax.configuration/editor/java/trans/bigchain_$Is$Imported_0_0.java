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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail87823:
    { 
      IStrategoTerm w_17587 = null;
      IStrategoTerm z_17587 = null;
      IStrategoTerm b_17588 = null;
      w_17587 = term;
      b_17588 = term;
      Success47313:
      { 
        Fail87824:
        { 
          IStrategoTerm d_17588 = null;
          d_17588 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_17588, trans.const17874, w_17587);
          if(term == null)
            break Fail87824;
          if(true)
            break Success47313;
        }
        term = trans.constNil14;
      }
      z_17587 = term;
      term = b_17588;
      term = termFactory.makeTuple(z_17587, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24790.instance);
      if(term == null)
        break Fail87823;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}