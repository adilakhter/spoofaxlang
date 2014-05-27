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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4854)
  { 
    context.push("reverse_bagof_WarnAnalysis_1_0");
    Fail23525:
    { 
      TermReference z_4853 = new TermReference();
      TermReference a_4854 = new TermReference();
      if(a_4854.value == null)
        a_4854.value = term;
      else
        if(a_4854.value != term && !a_4854.value.match(term))
          break Fail23525;
      if(z_4853.value == null)
        z_4853.value = term;
      else
        if(z_4853.value != term && !z_4853.value.match(term))
          break Fail23525;
      Success12613:
      { 
        Fail23526:
        { 
          IStrategoTerm e_4854 = null;
          IStrategoTerm g_4854 = null;
          IStrategoTerm h_4854 = null;
          g_4854 = term;
          e_4854 = trans.const4562;
          h_4854 = g_4854;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4854, e_4854, trans.constCons2047);
          if(term == null)
            break Fail23526;
          if(true)
            break Success12613;
        }
        term = trans.constNil4;
      }
      lifted7018 lifted70180 = new lifted7018();
      lifted70180.z_4853 = z_4853;
      lifted70180.a_4854 = a_4854;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70180, c_4854);
      if(term == null)
        break Fail23525;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}