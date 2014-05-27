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

@SuppressWarnings("all") public class $Content$Proposals_0_0 extends Strategy 
{ 
  public static $Content$Proposals_0_0 instance = new $Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ContentProposals_0_0");
    Fail23762:
    { 
      TermReference t_4893 = new TermReference();
      IStrategoTerm w_4893 = null;
      IStrategoTerm y_4893 = null;
      IStrategoTerm z_4893 = null;
      if(t_4893.value == null)
        t_4893.value = term;
      else
        if(t_4893.value != term && !t_4893.value.match(term))
          break Fail23762;
      y_4893 = term;
      w_4893 = trans.const4611;
      z_4893 = y_4893;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_4893, w_4893, trans.constCons2047);
      if(term == null)
        break Fail23762;
      lifted7102 lifted71020 = new lifted7102();
      lifted71020.t_4893 = t_4893;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted71020);
      if(term == null)
        break Fail23762;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}