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

@SuppressWarnings("all") public class bagof_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static bagof_$Outer$Cookie_0_0 instance = new bagof_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_OuterCookie_0_0");
    Fail23734:
    { 
      TermReference g_4889 = new TermReference();
      TermReference h_4889 = new TermReference();
      if(h_4889.value == null)
        h_4889.value = term;
      else
        if(h_4889.value != term && !h_4889.value.match(term))
          break Fail23734;
      if(g_4889.value == null)
        g_4889.value = term;
      else
        if(g_4889.value != term && !g_4889.value.match(term))
          break Fail23734;
      Success12687:
      { 
        Fail23735:
        { 
          IStrategoTerm l_4889 = null;
          l_4889 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4889, trans.const4604, h_4889.value);
          if(term == null)
            break Fail23735;
          if(true)
            break Success12687;
        }
        term = trans.constNil4;
      }
      lifted7092 lifted70920 = new lifted7092();
      lifted70920.g_4889 = g_4889;
      lifted70920.h_4889 = h_4889;
      term = filter_1_0.instance.invoke(context, term, lifted70920);
      if(term == null)
        break Fail23734;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}