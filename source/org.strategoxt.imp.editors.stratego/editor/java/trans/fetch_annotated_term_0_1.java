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

@SuppressWarnings("all") public class fetch_annotated_term_0_1 extends Strategy 
{ 
  public static fetch_annotated_term_0_1 instance = new fetch_annotated_term_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_4162)
  { 
    TermReference k_4162 = new TermReference(ref_k_4162);
    context.push("fetch_annotated_term_0_1");
    Fail21237:
    { 
      IStrategoTerm l_4162 = null;
      l_4162 = term;
      term = l_4162;
      lifted6423 lifted64230 = new lifted6423();
      lifted64230.k_4162 = k_4162;
      term = fetch_by_origin_1_1.instance.invoke(context, term, lifted64230, k_4162.value);
      if(term == null)
        break Fail21237;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}