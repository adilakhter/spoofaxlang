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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4184)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_binding_violations_1_0");
    Fail21358:
    { 
      IStrategoTerm m_4184 = null;
      IStrategoTerm n_4184 = null;
      IStrategoTerm o_4184 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21358;
      m_4184 = term.getSubterm(0);
      n_4184 = term.getSubterm(1);
      term = collect_all_2_0.instance.invoke(context, m_4184, r_4184, conc_0_0.instance);
      if(term == null)
        break Fail21358;
      o_4184 = term;
      term = collect_all_2_0.instance.invoke(context, n_4184, r_4184, conc_0_0.instance);
      if(term == null)
        break Fail21358;
      term = termFactory.makeTuple(o_4184, term);
      term = zip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21358;
      term = binding_violations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21358;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}