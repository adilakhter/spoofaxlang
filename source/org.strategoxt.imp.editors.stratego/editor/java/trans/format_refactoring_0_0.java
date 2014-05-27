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

@SuppressWarnings("all") public class format_refactoring_0_0 extends Strategy 
{ 
  public static format_refactoring_0_0 instance = new format_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("format_refactoring_0_0");
    Fail21328:
    { 
      IStrategoTerm w_4176 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail21328;
      w_4176 = term.getSubterm(1);
      term = pp_stratego_string_0_0.instance.invoke(context, w_4176);
      if(term == null)
        break Fail21328;
      term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(w_4176, term), (IStrategoList)trans.constNil3), trans.constNil3, trans.constNil3, trans.constNil3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}