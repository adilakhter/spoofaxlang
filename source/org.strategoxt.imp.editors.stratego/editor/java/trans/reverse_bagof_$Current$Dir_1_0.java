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

@SuppressWarnings("all") public class reverse_bagof_$Current$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$Dir_1_0 instance = new reverse_bagof_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4309)
  { 
    context.push("reverse_bagof_CurrentDir_1_0");
    Fail22101:
    { 
      TermReference l_4309 = new TermReference();
      if(l_4309.value == null)
        l_4309.value = term;
      else
        if(l_4309.value != term && !l_4309.value.match(term))
          break Fail22101;
      Success11918:
      { 
        Fail22102:
        { 
          IStrategoTerm p_4309 = null;
          IStrategoTerm r_4309 = null;
          IStrategoTerm s_4309 = null;
          r_4309 = term;
          p_4309 = trans.const4346;
          s_4309 = r_4309;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4309, p_4309, trans.constCons1966);
          if(term == null)
            break Fail22102;
          if(true)
            break Success11918;
        }
        term = trans.constNil3;
      }
      lifted6765 lifted67650 = new lifted6765();
      lifted67650.l_4309 = l_4309;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67650, n_4309);
      if(term == null)
        break Fail22101;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}