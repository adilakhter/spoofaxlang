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

@SuppressWarnings("all") public class collect_semantic_issues_0_0 extends Strategy 
{ 
  public static collect_semantic_issues_0_0 instance = new collect_semantic_issues_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_semantic_issues_0_0");
    Fail22805:
    { 
      IStrategoTerm r_4730 = null;
      IStrategoTerm s_4730 = null;
      s_4730 = term;
      term = collect_all_2_0.instance.invoke(context, s_4730, lifted6748.instance, conc_0_0.instance);
      if(term == null)
        break Fail22805;
      r_4730 = term;
      term = collect_all_2_0.instance.invoke(context, s_4730, constraint_warning_0_0.instance, conc_0_0.instance);
      if(term == null)
        break Fail22805;
      term = termFactory.makeTuple(r_4730, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}