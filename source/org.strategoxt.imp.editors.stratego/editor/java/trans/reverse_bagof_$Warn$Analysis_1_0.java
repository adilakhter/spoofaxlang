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

@SuppressWarnings("all") public class reverse_bagof_$Warn$Analysis_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Warn$Analysis_1_0 instance = new reverse_bagof_$Warn$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4300)
  { 
    context.push("reverse_bagof_WarnAnalysis_1_0");
    Fail22049:
    { 
      TermReference h_4300 = new TermReference();
      TermReference i_4300 = new TermReference();
      if(i_4300.value == null)
        i_4300.value = term;
      else
        if(i_4300.value != term && !i_4300.value.match(term))
          break Fail22049;
      if(h_4300.value == null)
        h_4300.value = term;
      else
        if(h_4300.value != term && !h_4300.value.match(term))
          break Fail22049;
      Success11904:
      { 
        Fail22050:
        { 
          IStrategoTerm m_4300 = null;
          IStrategoTerm o_4300 = null;
          IStrategoTerm p_4300 = null;
          o_4300 = term;
          m_4300 = trans.const4352;
          p_4300 = o_4300;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4300, m_4300, trans.constCons1966);
          if(term == null)
            break Fail22050;
          if(true)
            break Success11904;
        }
        term = trans.constNil3;
      }
      lifted6747 lifted67470 = new lifted6747();
      lifted67470.h_4300 = h_4300;
      lifted67470.i_4300 = i_4300;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67470, k_4300);
      if(term == null)
        break Fail22049;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}