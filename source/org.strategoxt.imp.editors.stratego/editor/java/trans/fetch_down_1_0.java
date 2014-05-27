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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4161)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_down_1_0");
    Fail21231:
    { 
      IStrategoTerm j_4161 = null;
      j_4161 = term;
      term = termFactory.makeTuple(j_4161, trans.constNil3);
      term = fetch_down_with_position_1_0.instance.invoke(context, term, l_4161);
      if(term == null)
        break Fail21231;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21231;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}