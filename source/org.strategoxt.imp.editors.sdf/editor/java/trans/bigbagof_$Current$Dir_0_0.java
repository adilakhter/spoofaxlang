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

@SuppressWarnings("all") public class bigbagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$Dir_0_0 instance = new bigbagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentDir_0_0");
    Fail76207:
    { 
      TermReference b_92092 = new TermReference();
      if(b_92092.value == null)
        b_92092.value = term;
      else
        if(b_92092.value != term && !b_92092.value.match(term))
          break Fail76207;
      Success41831:
      { 
        Fail76208:
        { 
          IStrategoTerm e_92092 = null;
          IStrategoTerm g_92092 = null;
          IStrategoTerm h_92092 = null;
          g_92092 = term;
          e_92092 = trans.const15515;
          h_92092 = g_92092;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_92092, e_92092, trans.constCons7205);
          if(term == null)
            break Fail76208;
          if(true)
            break Success41831;
        }
        term = trans.constNil11;
      }
      lifted21618 lifted216180 = new lifted21618();
      lifted216180.b_92092 = b_92092;
      term = filter_1_0.instance.invoke(context, term, lifted216180);
      if(term == null)
        break Fail76207;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}