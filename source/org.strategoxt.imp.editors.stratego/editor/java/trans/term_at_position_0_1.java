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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_4206)
  { 
    context.push("term_at_position_0_1");
    Fail21484:
    { 
      TermReference j_4206 = new TermReference();
      IStrategoTerm k_4206 = null;
      k_4206 = term;
      lifted6552 lifted65520 = new lifted6552();
      lifted65520.j_4206 = j_4206;
      term = at_position_1_1.instance.invoke(context, term, lifted65520, h_4206);
      if(term == null)
        break Fail21484;
      term = k_4206;
      if(j_4206.value == null)
        break Fail21484;
      term = j_4206.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}