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
    Fail22804:
    { 
      IStrategoTerm o_4730 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail22804;
      o_4730 = term.getSubterm(1);
      term = pp_stratego_string_0_0.instance.invoke(context, o_4730);
      if(term == null)
        break Fail22804;
      term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(o_4730, term), (IStrategoList)trans.constNil4), trans.constNil4, trans.constNil4, trans.constNil4);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}