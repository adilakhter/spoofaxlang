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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail87801:
    { 
      TermReference k_17584 = new TermReference();
      if(k_17584.value == null)
        k_17584.value = term;
      else
        if(k_17584.value != term && !k_17584.value.match(term))
          break Fail87801;
      Success47308:
      { 
        Fail87802:
        { 
          IStrategoTerm n_17584 = null;
          IStrategoTerm p_17584 = null;
          IStrategoTerm q_17584 = null;
          p_17584 = term;
          n_17584 = trans.const17872;
          q_17584 = p_17584;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_17584, n_17584, trans.constCons8528);
          if(term == null)
            break Fail87802;
          if(true)
            break Success47308;
        }
        term = trans.constNil14;
      }
      lifted24783 lifted247830 = new lifted24783();
      lifted247830.k_17584 = k_17584;
      term = filter_1_0.instance.invoke(context, term, lifted247830);
      if(term == null)
        break Fail87801;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}