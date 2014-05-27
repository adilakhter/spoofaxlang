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
    Fail23553:
    { 
      TermReference c_4859 = new TermReference();
      TermReference d_4859 = new TermReference();
      if(d_4859.value == null)
        d_4859.value = term;
      else
        if(d_4859.value != term && !d_4859.value.match(term))
          break Fail23553;
      if(c_4859.value == null)
        c_4859.value = term;
      else
        if(c_4859.value != term && !c_4859.value.match(term))
          break Fail23553;
      Success12621:
      { 
        Fail23554:
        { 
          IStrategoTerm g_4859 = null;
          IStrategoTerm i_4859 = null;
          IStrategoTerm j_4859 = null;
          i_4859 = term;
          g_4859 = trans.const4559;
          j_4859 = i_4859;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4859, g_4859, trans.constCons2047);
          if(term == null)
            break Fail23554;
          if(true)
            break Success12621;
        }
        term = trans.constNil4;
      }
      lifted7028 lifted70280 = new lifted7028();
      lifted70280.c_4859 = c_4859;
      lifted70280.d_4859 = d_4859;
      term = filter_1_0.instance.invoke(context, term, lifted70280);
      if(term == null)
        break Fail23553;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}