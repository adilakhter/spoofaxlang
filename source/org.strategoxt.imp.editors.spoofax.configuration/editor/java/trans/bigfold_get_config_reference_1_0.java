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

@SuppressWarnings("all") public class bigfold_get_config_reference_1_0 extends Strategy 
{ 
  public static bigfold_get_config_reference_1_0 instance = new bigfold_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17577)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_get_config_reference_1_0");
    Fail87767:
    { 
      IStrategoTerm a_17578 = null;
      IStrategoTerm c_17578 = null;
      c_17578 = term;
      Success47297:
      { 
        Fail87768:
        { 
          IStrategoTerm d_17578 = null;
          IStrategoTerm f_17578 = null;
          IStrategoTerm g_17578 = null;
          f_17578 = term;
          d_17578 = trans.const17869;
          g_17578 = f_17578;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_17578, d_17578, trans.constCons8528);
          if(term == null)
            break Fail87768;
          if(true)
            break Success47297;
        }
        term = trans.constNil14;
      }
      a_17578 = term;
      term = c_17578;
      term = termFactory.makeTuple(a_17578, term);
      term = z_17577.invoke(context, term, lifted24770.instance);
      if(term == null)
        break Fail87767;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}