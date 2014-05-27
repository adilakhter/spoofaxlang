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

@SuppressWarnings("all") public class term_at_position_0_1 extends Strategy 
{ 
  public static term_at_position_0_1 instance = new term_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4759)
  { 
    context.push("term_at_position_0_1");
    Fail22960:
    { 
      TermReference b_4760 = new TermReference();
      IStrategoTerm c_4760 = null;
      c_4760 = term;
      lifted6823 lifted68230 = new lifted6823();
      lifted68230.b_4760 = b_4760;
      term = at_position_1_1.instance.invoke(context, term, lifted68230, z_4759);
      if(term == null)
        break Fail22960;
      term = c_4760;
      if(b_4760.value == null)
        break Fail22960;
      term = b_4760.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}