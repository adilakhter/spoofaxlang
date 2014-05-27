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
    Fail21329:
    { 
      IStrategoTerm z_4176 = null;
      IStrategoTerm a_4177 = null;
      a_4177 = term;
      term = collect_all_2_0.instance.invoke(context, a_4177, lifted6477.instance, conc_0_0.instance);
      if(term == null)
        break Fail21329;
      z_4176 = term;
      term = collect_all_2_0.instance.invoke(context, a_4177, constraint_warning_0_0.instance, conc_0_0.instance);
      if(term == null)
        break Fail21329;
      term = termFactory.makeTuple(z_4176, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}