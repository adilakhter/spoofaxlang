package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail87803:
    { 
      IStrategoTerm r_17584 = null;
      TermReference s_17584 = new TermReference();
      TermReference t_17584 = new TermReference();
      IStrategoTerm u_17584 = null;
      IStrategoTerm v_17584 = null;
      IStrategoTerm x_17584 = null;
      IStrategoTerm y_17584 = null;
      IStrategoTerm a_17585 = null;
      IStrategoTerm b_17585 = null;
      if(s_17584.value == null)
        s_17584.value = term;
      else
        if(s_17584.value != term && !s_17584.value.match(term))
          break Fail87803;
      x_17584 = term;
      a_17585 = term;
      y_17584 = trans.const17872;
      b_17585 = a_17585;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, b_17585, y_17584, trans.constCons8528);
      if(term == null)
        break Fail87803;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail87803;
      r_17584 = term.getSubterm(0);
      v_17584 = term.getSubterm(1);
      u_17584 = term.getSubterm(2);
      term = r_17584;
      lifted24784 lifted247840 = new lifted24784();
      lifted247840.s_17584 = s_17584;
      lifted247840.t_17584 = t_17584;
      term = split_fetch_1_0.instance.invoke(context, term, lifted247840);
      if(term == null)
        break Fail87803;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87803;
      term = hashtable_put_0_2.instance.invoke(context, u_17584, v_17584, term);
      if(term == null)
        break Fail87803;
      term = x_17584;
      if(t_17584.value == null)
        break Fail87803;
      term = t_17584.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}