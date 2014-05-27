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

@SuppressWarnings("all") public class bigchain_get_config_reference_0_0 extends Strategy 
{ 
  public static bigchain_get_config_reference_0_0 instance = new bigchain_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_get_config_reference_0_0");
    Fail87771:
    { 
      IStrategoTerm b_17579 = null;
      IStrategoTerm d_17579 = null;
      d_17579 = term;
      Success47299:
      { 
        Fail87772:
        { 
          IStrategoTerm e_17579 = null;
          IStrategoTerm g_17579 = null;
          IStrategoTerm h_17579 = null;
          g_17579 = term;
          e_17579 = trans.const17869;
          h_17579 = g_17579;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_17579, e_17579, trans.constCons8528);
          if(term == null)
            break Fail87772;
          if(true)
            break Success47299;
        }
        term = trans.constNil14;
      }
      b_17579 = term;
      term = d_17579;
      term = termFactory.makeTuple(b_17579, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24772.instance);
      if(term == null)
        break Fail87771;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}