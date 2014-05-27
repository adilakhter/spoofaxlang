package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17570, IStrategoTerm r_17570)
  { 
    context.push("desugar_position_1_1");
    Fail87693:
    { 
      IStrategoTerm s_17570 = null;
      s_17570 = term;
      term = at_position_1_1.instance.invoke(context, r_17570, lifted24754.instance, s_17570);
      if(term == null)
        break Fail87693;
      lifted24755 lifted247550 = new lifted24755();
      lifted247550.y_17570 = y_17570;
      term = topdown_1_0.instance.invoke(context, term, lifted247550);
      if(term == null)
        break Fail87693;
      term = position_of_term_1_0.instance.invoke(context, term, lifted24758.instance);
      if(term == null)
        break Fail87693;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}