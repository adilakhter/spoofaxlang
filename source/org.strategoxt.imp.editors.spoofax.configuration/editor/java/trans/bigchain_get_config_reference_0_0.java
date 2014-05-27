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
    Fail22963:
    { 
      IStrategoTerm e_4635 = null;
      IStrategoTerm g_4635 = null;
      g_4635 = term;
      Success12212:
      { 
        Fail22964:
        { 
          IStrategoTerm h_4635 = null;
          IStrategoTerm j_4635 = null;
          IStrategoTerm k_4635 = null;
          j_4635 = term;
          h_4635 = trans.const4482;
          k_4635 = j_4635;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_4635, h_4635, trans.constCons2047);
          if(term == null)
            break Fail22964;
          if(true)
            break Success12212;
        }
        term = trans.constNil4;
      }
      e_4635 = term;
      term = g_4635;
      term = termFactory.makeTuple(e_4635, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6887.instance);
      if(term == null)
        break Fail22963;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}