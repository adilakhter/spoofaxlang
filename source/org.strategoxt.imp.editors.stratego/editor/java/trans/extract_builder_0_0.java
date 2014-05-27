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

@SuppressWarnings("all") public class extract_builder_0_0 extends Strategy 
{ 
  public static extract_builder_0_0 instance = new extract_builder_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("extract_builder_0_0");
    Fail21323:
    { 
      IStrategoTerm i_4175 = null;
      IStrategoTerm j_4175 = null;
      IStrategoTerm k_4175 = null;
      IStrategoTerm l_4175 = null;
      IStrategoTerm m_4175 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21323;
      i_4175 = term.getSubterm(0);
      j_4175 = term.getSubterm(1);
      k_4175 = term.getSubterm(2);
      l_4175 = term.getSubterm(3);
      m_4175 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.const4250, i_4175, j_4175, k_4175, l_4175, m_4175);
      term = extract_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21323;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21323;
      term = termFactory.makeTuple(trans.const4249, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}