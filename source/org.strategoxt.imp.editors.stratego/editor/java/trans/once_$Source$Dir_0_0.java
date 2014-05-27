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

@SuppressWarnings("all") public class once_$Source$Dir_0_0 extends Strategy 
{ 
  public static once_$Source$Dir_0_0 instance = new once_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_SourceDir_0_0");
    Fail23472:
    { 
      IStrategoTerm q_4844 = null;
      TermReference r_4844 = new TermReference();
      TermReference s_4844 = new TermReference();
      IStrategoTerm t_4844 = null;
      IStrategoTerm u_4844 = null;
      IStrategoTerm w_4844 = null;
      IStrategoTerm x_4844 = null;
      IStrategoTerm z_4844 = null;
      IStrategoTerm a_4845 = null;
      if(r_4844.value == null)
        r_4844.value = term;
      else
        if(r_4844.value != term && !r_4844.value.match(term))
          break Fail23472;
      w_4844 = term;
      z_4844 = term;
      x_4844 = trans.const4552;
      a_4845 = z_4844;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, a_4845, x_4844, trans.constCons2047);
      if(term == null)
        break Fail23472;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23472;
      q_4844 = term.getSubterm(0);
      u_4844 = term.getSubterm(1);
      t_4844 = term.getSubterm(2);
      term = q_4844;
      lifted6999 lifted69990 = new lifted6999();
      lifted69990.r_4844 = r_4844;
      lifted69990.s_4844 = s_4844;
      term = split_fetch_1_0.instance.invoke(context, term, lifted69990);
      if(term == null)
        break Fail23472;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23472;
      term = hashtable_put_0_2.instance.invoke(context, t_4844, u_4844, term);
      if(term == null)
        break Fail23472;
      term = w_4844;
      if(s_4844.value == null)
        break Fail23472;
      term = s_4844.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}