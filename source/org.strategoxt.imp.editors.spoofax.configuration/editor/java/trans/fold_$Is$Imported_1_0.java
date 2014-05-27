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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17587)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail87821:
    { 
      IStrategoTerm k_17587 = null;
      IStrategoTerm o_17587 = null;
      IStrategoTerm q_17587 = null;
      k_17587 = term;
      q_17587 = term;
      Success47312:
      { 
        Fail87822:
        { 
          IStrategoTerm s_17587 = null;
          s_17587 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_17587, trans.const17874, k_17587);
          if(term == null)
            break Fail87822;
          if(true)
            break Success47312;
        }
        term = trans.constNil14;
      }
      o_17587 = term;
      term = q_17587;
      term = termFactory.makeTuple(o_17587, term);
      term = n_17587.invoke(context, term, lifted24789.instance);
      if(term == null)
        break Fail87821;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}