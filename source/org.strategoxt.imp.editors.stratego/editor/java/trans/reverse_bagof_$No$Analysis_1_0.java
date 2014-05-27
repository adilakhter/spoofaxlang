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

@SuppressWarnings("all") public class reverse_bagof_$No$Analysis_1_0 extends Strategy 
{ 
  public static reverse_bagof_$No$Analysis_1_0 instance = new reverse_bagof_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4305)
  { 
    context.push("reverse_bagof_NoAnalysis_1_0");
    Fail22075:
    { 
      TermReference b_4305 = new TermReference();
      TermReference c_4305 = new TermReference();
      if(c_4305.value == null)
        c_4305.value = term;
      else
        if(c_4305.value != term && !c_4305.value.match(term))
          break Fail22075;
      if(b_4305.value == null)
        b_4305.value = term;
      else
        if(b_4305.value != term && !b_4305.value.match(term))
          break Fail22075;
      Success11911:
      { 
        Fail22076:
        { 
          IStrategoTerm g_4305 = null;
          IStrategoTerm i_4305 = null;
          IStrategoTerm j_4305 = null;
          i_4305 = term;
          g_4305 = trans.const4349;
          j_4305 = i_4305;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4305, g_4305, trans.constCons1966);
          if(term == null)
            break Fail22076;
          if(true)
            break Success11911;
        }
        term = trans.constNil3;
      }
      lifted6756 lifted67560 = new lifted6756();
      lifted67560.b_4305 = b_4305;
      lifted67560.c_4305 = c_4305;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67560, e_4305);
      if(term == null)
        break Fail22075;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}