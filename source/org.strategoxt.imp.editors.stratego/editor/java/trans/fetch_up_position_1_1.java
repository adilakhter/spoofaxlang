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

@SuppressWarnings("all") public class fetch_up_position_1_1 extends Strategy 
{ 
  public static fetch_up_position_1_1 instance = new fetch_up_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4713, IStrategoTerm u_4713)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_position_1_1");
    Fail22701:
    { 
      IStrategoTerm w_4713 = null;
      IStrategoTerm y_4713 = null;
      w_4713 = term;
      term = term_at_position_0_1.instance.invoke(context, u_4713, w_4713);
      if(term == null)
        break Fail22701;
      term = termFactory.makeTuple(term, w_4713);
      term = fetch_up_with_position_1_1.instance.invoke(context, term, z_4713, u_4713);
      if(term == null)
        break Fail22701;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22701;
      y_4713 = term.getSubterm(1);
      term = y_4713;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}