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

@SuppressWarnings("all") public class reverse_bagof_$Outer$Cookie_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Outer$Cookie_1_0 instance = new reverse_bagof_$Outer$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4335)
  { 
    context.push("reverse_bagof_OuterCookie_1_0");
    Fail22256:
    { 
      TermReference h_4335 = new TermReference();
      TermReference i_4335 = new TermReference();
      if(i_4335.value == null)
        i_4335.value = term;
      else
        if(i_4335.value != term && !i_4335.value.match(term))
          break Fail22256;
      if(h_4335.value == null)
        h_4335.value = term;
      else
        if(h_4335.value != term && !h_4335.value.match(term))
          break Fail22256;
      Success11977:
      { 
        Fail22257:
        { 
          IStrategoTerm n_4335 = null;
          n_4335 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4335, trans.const4394, i_4335.value);
          if(term == null)
            break Fail22257;
          if(true)
            break Success11977;
        }
        term = trans.constNil3;
      }
      lifted6820 lifted68200 = new lifted6820();
      lifted68200.h_4335 = h_4335;
      lifted68200.i_4335 = i_4335;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68200, k_4335);
      if(term == null)
        break Fail22256;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}