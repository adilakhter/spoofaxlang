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

@SuppressWarnings("all") public class bagof_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static bagof_$Warn$Analysis_0_0 instance = new bagof_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_WarnAnalysis_0_0");
    Fail23527:
    { 
      TermReference i_4854 = new TermReference();
      TermReference j_4854 = new TermReference();
      if(j_4854.value == null)
        j_4854.value = term;
      else
        if(j_4854.value != term && !j_4854.value.match(term))
          break Fail23527;
      if(i_4854.value == null)
        i_4854.value = term;
      else
        if(i_4854.value != term && !i_4854.value.match(term))
          break Fail23527;
      Success12614:
      { 
        Fail23528:
        { 
          IStrategoTerm m_4854 = null;
          IStrategoTerm o_4854 = null;
          IStrategoTerm p_4854 = null;
          o_4854 = term;
          m_4854 = trans.const4562;
          p_4854 = o_4854;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4854, m_4854, trans.constCons2047);
          if(term == null)
            break Fail23528;
          if(true)
            break Success12614;
        }
        term = trans.constNil4;
      }
      lifted7019 lifted70190 = new lifted7019();
      lifted70190.i_4854 = i_4854;
      lifted70190.j_4854 = j_4854;
      term = filter_1_0.instance.invoke(context, term, lifted70190);
      if(term == null)
        break Fail23527;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}