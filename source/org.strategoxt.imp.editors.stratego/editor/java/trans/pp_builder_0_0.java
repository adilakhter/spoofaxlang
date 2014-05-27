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
    Fail21326:
    { 
      IStrategoTerm i_4176 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21326;
      i_4176 = term.getSubterm(0);
      term = debug_1_0.instance.invoke(context, i_4176, lifted6476.instance);
      if(term == null)
        break Fail21326;
      term = pp_stratego_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21326;
      term = termFactory.makeTuple(trans.const4256, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}