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

@SuppressWarnings("all") public class fetch_down_1_0 extends Strategy 
{ 
  public static fetch_down_1_0 instance = new fetch_down_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4715)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_down_1_0");
    Fail22707:
    { 
      IStrategoTerm b_4715 = null;
      b_4715 = term;
      term = termFactory.makeTuple(b_4715, trans.constNil4);
      term = fetch_down_with_position_1_0.instance.invoke(context, term, d_4715);
      if(term == null)
        break Fail22707;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22707;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}