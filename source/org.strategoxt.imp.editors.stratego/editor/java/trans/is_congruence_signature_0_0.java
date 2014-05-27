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

@SuppressWarnings("all") public class is_congruence_signature_0_0 extends Strategy 
{ 
  public static is_congruence_signature_0_0 instance = new is_congruence_signature_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_congruence_signature_0_0");
    Fail23064:
    { 
      IStrategoTerm q_4774 = null;
      IStrategoTerm r_4774 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23064;
      q_4774 = term.getSubterm(0);
      r_4774 = term.getSubterm(1);
      IStrategoTerm arg8204 = term.getSubterm(2);
      if(arg8204.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8204).intValue())
        break Fail23064;
      term = termFactory.makeTuple(q_4774, r_4774);
      term = $Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23064;
      term = termFactory.makeTuple(q_4774, r_4774, trans.constNil4);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}