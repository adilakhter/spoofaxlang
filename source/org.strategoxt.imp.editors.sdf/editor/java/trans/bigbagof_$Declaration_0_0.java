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

@SuppressWarnings("all") public class bigbagof_$Declaration_0_0 extends Strategy 
{ 
  public static bigbagof_$Declaration_0_0 instance = new bigbagof_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Declaration_0_0");
    Fail76285:
    { 
      TermReference f_92105 = new TermReference();
      TermReference g_92105 = new TermReference();
      if(g_92105.value == null)
        g_92105.value = term;
      else
        if(g_92105.value != term && !g_92105.value.match(term))
          break Fail76285;
      if(f_92105.value == null)
        f_92105.value = term;
      else
        if(f_92105.value != term && !f_92105.value.match(term))
          break Fail76285;
      Success41852:
      { 
        Fail76286:
        { 
          IStrategoTerm k_92105 = null;
          k_92105 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_92105, trans.const15522, g_92105.value);
          if(term == null)
            break Fail76286;
          if(true)
            break Success41852;
        }
        term = trans.constNil11;
      }
      lifted21645 lifted216450 = new lifted21645();
      lifted216450.f_92105 = f_92105;
      lifted216450.g_92105 = g_92105;
      term = filter_1_0.instance.invoke(context, term, lifted216450);
      if(term == null)
        break Fail76285;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}