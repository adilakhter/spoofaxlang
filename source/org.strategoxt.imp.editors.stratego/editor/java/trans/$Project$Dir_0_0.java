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

@SuppressWarnings("all") public class $Project$Dir_0_0 extends Strategy 
{ 
  public static $Project$Dir_0_0 instance = new $Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ProjectDir_0_0");
    Fail21923:
    { 
      TermReference h_4279 = new TermReference();
      IStrategoTerm k_4279 = null;
      IStrategoTerm m_4279 = null;
      IStrategoTerm n_4279 = null;
      if(h_4279.value == null)
        h_4279.value = term;
      else
        if(h_4279.value != term && !h_4279.value.match(term))
          break Fail21923;
      m_4279 = term;
      k_4279 = trans.const4265;
      n_4279 = m_4279;
      term = dr_lookup_rule_0_2.instance.invoke(context, n_4279, k_4279, trans.constCons1966);
      if(term == null)
        break Fail21923;
      lifted6704 lifted67040 = new lifted6704();
      lifted67040.h_4279 = h_4279;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67040);
      if(term == null)
        break Fail21923;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}