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

@SuppressWarnings("all") public class inline_call_0_1 extends Strategy 
{ 
  public static inline_call_0_1 instance = new inline_call_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4172)
  { 
    context.push("inline_call_0_1");
    Fail21309:
    { 
      IStrategoTerm n_4172 = null;
      IStrategoTerm o_4172 = null;
      IStrategoTerm p_4172 = null;
      IStrategoTerm q_4172 = null;
      IStrategoTerm r_4172 = null;
      IStrategoTerm s_4172 = null;
      IStrategoTerm t_4172 = null;
      IStrategoTerm u_4172 = null;
      IStrategoTerm v_4172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21309;
      IStrategoTerm arg7627 = term.getSubterm(0);
      if(arg7627.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7627).getConstructor())
        break Fail21309;
      IStrategoTerm arg7628 = arg7627.getSubterm(0);
      n_4172 = arg7628;
      IStrategoList annos671 = arg7628.getAnnotations();
      if(annos671.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos671).isEmpty())
        break Fail21309;
      o_4172 = ((IStrategoList)annos671).head();
      IStrategoTerm arg7629 = ((IStrategoList)annos671).tail();
      if(arg7629.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7629).isEmpty())
        break Fail21309;
      s_4172 = term.getSubterm(1);
      u_4172 = term.getSubterm(2);
      term = m_4172;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail21309;
      IStrategoTerm arg7630 = term.getSubterm(0);
      if(arg7630 != n_4172 && !n_4172.match(arg7630))
        break Fail21309;
      IStrategoList annos672 = arg7630.getAnnotations();
      if(annos672.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos672).isEmpty())
        break Fail21309;
      if(((IStrategoList)annos672).head() != o_4172 && !o_4172.match(((IStrategoList)annos672).head()))
        break Fail21309;
      IStrategoTerm arg7631 = ((IStrategoList)annos672).tail();
      if(arg7631.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7631).isEmpty())
        break Fail21309;
      p_4172 = term.getSubterm(1);
      q_4172 = term.getSubterm(2);
      v_4172 = term.getSubterm(3);
      term = map_1_0.instance.invoke(context, p_4172, svardec_to_svaruse_0_0.instance);
      if(term == null)
        break Fail21309;
      r_4172 = term;
      term = map_1_0.instance.invoke(context, q_4172, tvardec_to_tvaruse_0_0.instance);
      if(term == null)
        break Fail21309;
      t_4172 = term;
      term = substitute_multiple_0_2.instance.invoke(context, v_4172, r_4172, s_4172);
      if(term == null)
        break Fail21309;
      term = substitute_multiple_0_2.instance.invoke(context, term, t_4172, u_4172);
      if(term == null)
        break Fail21309;
      term = try_1_0.instance.invoke(context, term, rule_to_lambda_rule_0_0.instance);
      if(term == null)
        break Fail21309;
      term = scope_free_vars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21309;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}