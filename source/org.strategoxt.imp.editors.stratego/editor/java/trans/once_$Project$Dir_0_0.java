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

@SuppressWarnings("all") public class once_$Project$Dir_0_0 extends Strategy 
{ 
  public static once_$Project$Dir_0_0 instance = new once_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ProjectDir_0_0");
    Fail23394:
    { 
      IStrategoTerm z_4831 = null;
      TermReference a_4832 = new TermReference();
      TermReference b_4832 = new TermReference();
      IStrategoTerm c_4832 = null;
      IStrategoTerm d_4832 = null;
      IStrategoTerm f_4832 = null;
      IStrategoTerm g_4832 = null;
      IStrategoTerm i_4832 = null;
      IStrategoTerm j_4832 = null;
      if(a_4832.value == null)
        a_4832.value = term;
      else
        if(a_4832.value != term && !a_4832.value.match(term))
          break Fail23394;
      f_4832 = term;
      i_4832 = term;
      g_4832 = trans.const4475;
      j_4832 = i_4832;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, j_4832, g_4832, trans.constCons2047);
      if(term == null)
        break Fail23394;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23394;
      z_4831 = term.getSubterm(0);
      d_4832 = term.getSubterm(1);
      c_4832 = term.getSubterm(2);
      term = z_4831;
      lifted6972 lifted69720 = new lifted6972();
      lifted69720.a_4832 = a_4832;
      lifted69720.b_4832 = b_4832;
      term = split_fetch_1_0.instance.invoke(context, term, lifted69720);
      if(term == null)
        break Fail23394;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23394;
      term = hashtable_put_0_2.instance.invoke(context, c_4832, d_4832, term);
      if(term == null)
        break Fail23394;
      term = f_4832;
      if(b_4832.value == null)
        break Fail23394;
      term = b_4832.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}