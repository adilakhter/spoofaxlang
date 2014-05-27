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

@SuppressWarnings("all") public class bagof_$No$Analysis_0_0 extends Strategy 
{ 
  public static bagof_$No$Analysis_0_0 instance = new bagof_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_NoAnalysis_0_0");
    Fail22077:
    { 
      TermReference k_4305 = new TermReference();
      TermReference l_4305 = new TermReference();
      if(l_4305.value == null)
        l_4305.value = term;
      else
        if(l_4305.value != term && !l_4305.value.match(term))
          break Fail22077;
      if(k_4305.value == null)
        k_4305.value = term;
      else
        if(k_4305.value != term && !k_4305.value.match(term))
          break Fail22077;
      Success11912:
      { 
        Fail22078:
        { 
          IStrategoTerm o_4305 = null;
          IStrategoTerm q_4305 = null;
          IStrategoTerm r_4305 = null;
          q_4305 = term;
          o_4305 = trans.const4349;
          r_4305 = q_4305;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4305, o_4305, trans.constCons1966);
          if(term == null)
            break Fail22078;
          if(true)
            break Success11912;
        }
        term = trans.constNil3;
      }
      lifted6757 lifted67570 = new lifted6757();
      lifted67570.k_4305 = k_4305;
      lifted67570.l_4305 = l_4305;
      term = filter_1_0.instance.invoke(context, term, lifted67570);
      if(term == null)
        break Fail22077;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}