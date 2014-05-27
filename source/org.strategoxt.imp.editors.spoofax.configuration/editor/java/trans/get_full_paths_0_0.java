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
    Fail22905:
    { 
      IStrategoTerm y_4629 = null;
      IStrategoTerm z_4629 = null;
      IStrategoTerm a_4630 = null;
      IStrategoTerm e_4630 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22905;
      a_4630 = term.getSubterm(0);
      y_4629 = term.getSubterm(3);
      e_4630 = y_4629;
      term = guarantee_extension_0_1.instance.invoke(context, e_4630, trans.const4502);
      if(term == null)
        break Fail22905;
      z_4629 = term;
      term = alltd_1_0.instance.invoke(context, a_4630, normalized_spxproject_reference_0_0.instance);
      if(term == null)
        break Fail22905;
      term = get_all_includes_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22905;
      term = termFactory.makeTuple(z_4629, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}