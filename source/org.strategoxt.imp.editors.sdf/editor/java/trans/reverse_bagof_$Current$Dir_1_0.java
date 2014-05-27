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

@SuppressWarnings("all") public class reverse_bagof_$Current$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$Dir_1_0 instance = new reverse_bagof_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_92092)
  { 
    context.push("reverse_bagof_CurrentDir_1_0");
    Fail76210:
    { 
      TermReference t_92092 = new TermReference();
      if(t_92092.value == null)
        t_92092.value = term;
      else
        if(t_92092.value != term && !t_92092.value.match(term))
          break Fail76210;
      Success41832:
      { 
        Fail76211:
        { 
          IStrategoTerm x_92092 = null;
          IStrategoTerm z_92092 = null;
          IStrategoTerm a_92093 = null;
          z_92092 = term;
          x_92092 = trans.const15515;
          a_92093 = z_92092;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_92093, x_92092, trans.constCons7205);
          if(term == null)
            break Fail76211;
          if(true)
            break Success41832;
        }
        term = trans.constNil11;
      }
      lifted21620 lifted216200 = new lifted21620();
      lifted216200.t_92092 = t_92092;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216200, v_92092);
      if(term == null)
        break Fail76210;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}