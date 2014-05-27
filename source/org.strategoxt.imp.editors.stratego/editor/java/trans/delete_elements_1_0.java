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

@SuppressWarnings("all") public class delete_elements_1_0 extends Strategy 
{ 
  public static delete_elements_1_0 instance = new delete_elements_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4174)
  { 
    context.push("delete_elements_1_0");
    Fail21320:
    { 
      IStrategoTerm l_4174 = null;
      l_4174 = term;
      term = l_4174;
      lifted6468 lifted64680 = new lifted6468();
      lifted64680.n_4174 = n_4174;
      term = topdown_1_0.instance.invoke(context, term, lifted64680);
      if(term == null)
        break Fail21320;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}