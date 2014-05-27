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

@SuppressWarnings("all") public class once_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static once_$Is$No$Conflict_0_0 instance = new once_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsNoConflict_0_0");
    Fail23783:
    { 
      IStrategoTerm z_4896 = null;
      TermReference a_4897 = new TermReference();
      TermReference b_4897 = new TermReference();
      TermReference c_4897 = new TermReference();
      IStrategoTerm d_4897 = null;
      IStrategoTerm e_4897 = null;
      IStrategoTerm g_4897 = null;
      IStrategoTerm i_4897 = null;
      if(b_4897.value == null)
        b_4897.value = term;
      else
        if(b_4897.value != term && !b_4897.value.match(term))
          break Fail23783;
      if(a_4897.value == null)
        a_4897.value = term;
      else
        if(a_4897.value != term && !a_4897.value.match(term))
          break Fail23783;
      g_4897 = term;
      i_4897 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, i_4897, trans.const4637, b_4897.value);
      if(term == null)
        break Fail23783;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23783;
      z_4896 = term.getSubterm(0);
      e_4897 = term.getSubterm(1);
      d_4897 = term.getSubterm(2);
      term = z_4896;
      lifted7108 lifted71080 = new lifted7108();
      lifted71080.a_4897 = a_4897;
      lifted71080.b_4897 = b_4897;
      lifted71080.c_4897 = c_4897;
      term = split_fetch_1_0.instance.invoke(context, term, lifted71080);
      if(term == null)
        break Fail23783;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23783;
      term = hashtable_put_0_2.instance.invoke(context, d_4897, e_4897, term);
      if(term == null)
        break Fail23783;
      term = g_4897;
      if(c_4897.value == null)
        break Fail23783;
      term = c_4897.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}