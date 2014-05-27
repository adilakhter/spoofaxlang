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

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail76131:
    { 
      IStrategoTerm r_92079 = null;
      TermReference s_92079 = new TermReference();
      TermReference t_92079 = new TermReference();
      IStrategoTerm u_92079 = null;
      IStrategoTerm v_92079 = null;
      IStrategoTerm x_92079 = null;
      IStrategoTerm y_92079 = null;
      IStrategoTerm a_92080 = null;
      IStrategoTerm b_92080 = null;
      if(s_92079.value == null)
        s_92079.value = term;
      else
        if(s_92079.value != term && !s_92079.value.match(term))
          break Fail76131;
      x_92079 = term;
      a_92080 = term;
      y_92079 = trans.const15448;
      b_92080 = a_92080;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, b_92080, y_92079, trans.constCons7205);
      if(term == null)
        break Fail76131;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76131;
      r_92079 = term.getSubterm(0);
      v_92079 = term.getSubterm(1);
      u_92079 = term.getSubterm(2);
      term = r_92079;
      lifted21592 lifted215920 = new lifted21592();
      lifted215920.s_92079 = s_92079;
      lifted215920.t_92079 = t_92079;
      term = split_fetch_1_0.instance.invoke(context, term, lifted215920);
      if(term == null)
        break Fail76131;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76131;
      term = hashtable_put_0_2.instance.invoke(context, u_92079, v_92079, term);
      if(term == null)
        break Fail76131;
      term = x_92079;
      if(t_92079.value == null)
        break Fail76131;
      term = t_92079.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}