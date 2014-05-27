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

@SuppressWarnings("all") public class get_source_asts_0_2 extends Strategy 
{ 
  public static get_source_asts_0_2 instance = new get_source_asts_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_4179, IStrategoTerm ref_n_4179)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_4179 = new TermReference(ref_m_4179);
    TermReference n_4179 = new TermReference(ref_n_4179);
    context.push("get_source_asts_0_2");
    Fail21337:
    { 
      IStrategoTerm o_4179 = null;
      IStrategoTerm p_4179 = null;
      IStrategoTerm q_4179 = null;
      o_4179 = term;
      term = o_4179;
      lifted6494 lifted64940 = new lifted6494();
      lifted6493 lifted64930 = new lifted6493();
      lifted64940.n_4179 = n_4179;
      lifted64930.m_4179 = m_4179;
      term = get_source_asts_2_0.instance.invoke(context, term, lifted64930, lifted64940);
      if(term == null)
        break Fail21337;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21337;
      p_4179 = term.getSubterm(0);
      q_4179 = term.getSubterm(1);
      term = termFactory.makeTuple(p_4179, q_4179);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}