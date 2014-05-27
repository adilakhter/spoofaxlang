package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Current$Dir_0_0 instance = new bagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentDir_0_0");
    Fail76212:
    { 
      TermReference b_92093 = new TermReference();
      if(b_92093.value == null)
        b_92093.value = term;
      else
        if(b_92093.value != term && !b_92093.value.match(term))
          break Fail76212;
      Success41833:
      { 
        Fail76213:
        { 
          IStrategoTerm e_92093 = null;
          IStrategoTerm g_92093 = null;
          IStrategoTerm h_92093 = null;
          g_92093 = term;
          e_92093 = trans.const15515;
          h_92093 = g_92093;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_92093, e_92093, trans.constCons7205);
          if(term == null)
            break Fail76213;
          if(true)
            break Success41833;
        }
        term = trans.constNil11;
      }
      lifted21621 lifted216210 = new lifted21621();
      lifted216210.b_92093 = b_92093;
      term = filter_1_0.instance.invoke(context, term, lifted216210);
      if(term == null)
        break Fail76212;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}