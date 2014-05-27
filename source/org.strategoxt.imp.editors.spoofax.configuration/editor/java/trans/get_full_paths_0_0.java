package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_full_paths_0_0 extends Strategy 
{ 
  public static get_full_paths_0_0 instance = new get_full_paths_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_full_paths_0_0");
    Fail87713:
    { 
      IStrategoTerm v_17573 = null;
      IStrategoTerm w_17573 = null;
      IStrategoTerm x_17573 = null;
      IStrategoTerm b_17574 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail87713;
      x_17573 = term.getSubterm(0);
      v_17573 = term.getSubterm(3);
      b_17574 = v_17573;
      term = guarantee_extension_0_1.instance.invoke(context, b_17574, trans.const17889);
      if(term == null)
        break Fail87713;
      w_17573 = term;
      term = alltd_1_0.instance.invoke(context, x_17573, normalized_spxproject_reference_0_0.instance);
      if(term == null)
        break Fail87713;
      term = get_all_includes_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87713;
      term = termFactory.makeTuple(w_17573, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}