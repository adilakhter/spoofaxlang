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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4160, IStrategoTerm c_4160)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_position_1_1");
    Fail21225:
    { 
      IStrategoTerm e_4160 = null;
      IStrategoTerm g_4160 = null;
      e_4160 = term;
      term = term_at_position_0_1.instance.invoke(context, c_4160, e_4160);
      if(term == null)
        break Fail21225;
      term = termFactory.makeTuple(term, e_4160);
      term = fetch_up_with_position_1_1.instance.invoke(context, term, h_4160, c_4160);
      if(term == null)
        break Fail21225;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21225;
      g_4160 = term.getSubterm(1);
      term = g_4160;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}