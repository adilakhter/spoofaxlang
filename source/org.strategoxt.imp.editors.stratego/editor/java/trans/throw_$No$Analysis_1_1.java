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

@SuppressWarnings("all") public class throw_$No$Analysis_1_1 extends Strategy 
{ 
  public static throw_$No$Analysis_1_1 instance = new throw_$No$Analysis_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4301, IStrategoTerm n_4301)
  { 
    context.push("throw_NoAnalysis_1_1");
    Fail22057:
    { 
      IStrategoTerm q_4301 = null;
      q_4301 = term;
      term = dr_throw_1_2.instance.invoke(context, q_4301, o_4301, n_4301, trans.const4349);
      if(term == null)
        break Fail22057;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}