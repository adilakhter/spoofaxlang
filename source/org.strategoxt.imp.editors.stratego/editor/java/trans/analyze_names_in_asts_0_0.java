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

@SuppressWarnings("all") public class analyze_names_in_asts_0_0 extends Strategy 
{ 
  public static analyze_names_in_asts_0_0 instance = new analyze_names_in_asts_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_names_in_asts_0_0");
    Fail22811:
    { 
      IStrategoTerm x_4732 = null;
      x_4732 = term;
      term = map_1_0.instance.invoke(context, x_4732, lifted6761.instance);
      if(term == null)
        break Fail22811;
      term = map_1_0.instance.invoke(context, term, declare_bodies_top_0_0.instance);
      if(term == null)
        break Fail22811;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}