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

@SuppressWarnings("all") public class collect_binding_violations_1_0 extends Strategy 
{ 
  public static collect_binding_violations_1_0 instance = new collect_binding_violations_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4738)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_binding_violations_1_0");
    Fail22834:
    { 
      IStrategoTerm e_4738 = null;
      IStrategoTerm f_4738 = null;
      IStrategoTerm g_4738 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22834;
      e_4738 = term.getSubterm(0);
      f_4738 = term.getSubterm(1);
      term = collect_all_2_0.instance.invoke(context, e_4738, j_4738, conc_0_0.instance);
      if(term == null)
        break Fail22834;
      g_4738 = term;
      term = collect_all_2_0.instance.invoke(context, f_4738, j_4738, conc_0_0.instance);
      if(term == null)
        break Fail22834;
      term = termFactory.makeTuple(g_4738, term);
      term = zip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22834;
      term = binding_violations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22834;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}