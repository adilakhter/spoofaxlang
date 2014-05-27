package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_92023, IStrategoTerm a_92023)
  { 
    context.push("desugar_position_1_1");
    Fail75697:
    { 
      IStrategoTerm b_92023 = null;
      b_92023 = term;
      term = at_position_1_1.instance.invoke(context, a_92023, lifted21508.instance, b_92023);
      if(term == null)
        break Fail75697;
      lifted21509 lifted215090 = new lifted21509();
      lifted215090.h_92023 = h_92023;
      term = topdown_1_0.instance.invoke(context, term, lifted215090);
      if(term == null)
        break Fail75697;
      term = position_of_term_1_0.instance.invoke(context, term, lifted21512.instance);
      if(term == null)
        break Fail75697;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}