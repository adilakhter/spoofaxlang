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

@SuppressWarnings("all") public class insert_at_position_0_2 extends Strategy 
{ 
  public static insert_at_position_0_2 instance = new insert_at_position_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4167, IStrategoTerm ref_n_4167)
  { 
    TermReference n_4167 = new TermReference(ref_n_4167);
    context.push("insert_at_position_0_2");
    Fail21273:
    { 
      TermReference o_4167 = new TermReference();
      IStrategoTerm p_4167 = null;
      IStrategoTerm q_4167 = null;
      q_4167 = term;
      term = init_0_0.instance.invoke(context, m_4167);
      if(term == null)
        break Fail21273;
      p_4167 = term;
      term = last_0_0.instance.invoke(context, m_4167);
      if(term == null)
        break Fail21273;
      if(o_4167.value == null)
        o_4167.value = term;
      else
        if(o_4167.value != term && !o_4167.value.match(term))
          break Fail21273;
      term = q_4167;
      lifted6450 lifted64500 = new lifted6450();
      lifted64500.o_4167 = o_4167;
      lifted64500.n_4167 = n_4167;
      term = at_position_1_1.instance.invoke(context, term, lifted64500, p_4167);
      if(term == null)
        break Fail21273;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}