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

@SuppressWarnings("all") public class pp_builder_0_0 extends Strategy 
{ 
  public static pp_builder_0_0 instance = new pp_builder_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_builder_0_0");
    Fail22802:
    { 
      IStrategoTerm a_4730 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22802;
      a_4730 = term.getSubterm(0);
      term = debug_1_0.instance.invoke(context, a_4730, lifted6747.instance);
      if(term == null)
        break Fail22802;
      term = pp_stratego_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22802;
      term = termFactory.makeTuple(trans.const4466, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}