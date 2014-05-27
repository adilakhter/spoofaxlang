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

@SuppressWarnings("all") public class once_$Current$Dir_0_0 extends Strategy 
{ 
  public static once_$Current$Dir_0_0 instance = new once_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentDir_0_0");
    Fail23576:
    { 
      IStrategoTerm s_4862 = null;
      TermReference t_4862 = new TermReference();
      TermReference u_4862 = new TermReference();
      IStrategoTerm v_4862 = null;
      IStrategoTerm w_4862 = null;
      IStrategoTerm y_4862 = null;
      IStrategoTerm z_4862 = null;
      IStrategoTerm b_4863 = null;
      IStrategoTerm c_4863 = null;
      if(t_4862.value == null)
        t_4862.value = term;
      else
        if(t_4862.value != term && !t_4862.value.match(term))
          break Fail23576;
      y_4862 = term;
      b_4863 = term;
      z_4862 = trans.const4556;
      c_4863 = b_4863;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, c_4863, z_4862, trans.constCons2047);
      if(term == null)
        break Fail23576;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23576;
      s_4862 = term.getSubterm(0);
      w_4862 = term.getSubterm(1);
      v_4862 = term.getSubterm(2);
      term = s_4862;
      lifted7035 lifted70350 = new lifted7035();
      lifted70350.t_4862 = t_4862;
      lifted70350.u_4862 = u_4862;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70350);
      if(term == null)
        break Fail23576;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23576;
      term = hashtable_put_0_2.instance.invoke(context, v_4862, w_4862, term);
      if(term == null)
        break Fail23576;
      term = y_4862;
      if(u_4862.value == null)
        break Fail23576;
      term = u_4862.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}