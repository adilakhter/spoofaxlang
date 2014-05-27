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

@SuppressWarnings("all") public class $Project$Dir_0_0 extends Strategy 
{ 
  public static $Project$Dir_0_0 instance = new $Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ProjectDir_0_0");
    Fail76188:
    { 
      TermReference b_92089 = new TermReference();
      IStrategoTerm e_92089 = null;
      IStrategoTerm g_92089 = null;
      IStrategoTerm h_92089 = null;
      if(b_92089.value == null)
        b_92089.value = term;
      else
        if(b_92089.value != term && !b_92089.value.match(term))
          break Fail76188;
      g_92089 = term;
      e_92089 = trans.const15517;
      h_92089 = g_92089;
      term = dr_lookup_rule_0_2.instance.invoke(context, h_92089, e_92089, trans.constCons7205);
      if(term == null)
        break Fail76188;
      lifted21613 lifted216130 = new lifted21613();
      lifted216130.b_92089 = b_92089;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216130);
      if(term == null)
        break Fail76188;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}