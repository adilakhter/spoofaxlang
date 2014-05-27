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

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17587)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail87819:
    { 
      IStrategoTerm y_17586 = null;
      IStrategoTerm c_17587 = null;
      IStrategoTerm e_17587 = null;
      y_17586 = term;
      e_17587 = term;
      Success47311:
      { 
        Fail87820:
        { 
          IStrategoTerm g_17587 = null;
          g_17587 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_17587, trans.const17874, y_17586);
          if(term == null)
            break Fail87820;
          if(true)
            break Success47311;
        }
        term = trans.constNil14;
      }
      c_17587 = term;
      term = e_17587;
      term = termFactory.makeTuple(c_17587, term);
      term = b_17587.invoke(context, term, lifted24788.instance);
      if(term == null)
        break Fail87819;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}