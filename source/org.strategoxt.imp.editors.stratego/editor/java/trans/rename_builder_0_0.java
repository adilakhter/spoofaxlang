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

@SuppressWarnings("all") public class rename_builder_0_0 extends Strategy 
{ 
  public static rename_builder_0_0 instance = new rename_builder_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("rename_builder_0_0");
    Fail22797:
    { 
      IStrategoTerm h_4728 = null;
      TermReference i_4728 = new TermReference();
      IStrategoTerm j_4728 = null;
      IStrategoTerm k_4728 = null;
      IStrategoTerm l_4728 = null;
      IStrategoTerm m_4728 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22797;
      h_4728 = term.getSubterm(0);
      j_4728 = term.getSubterm(1);
      k_4728 = term.getSubterm(2);
      l_4728 = term.getSubterm(3);
      m_4728 = term.getSubterm(4);
      term = h_4728;
      lifted6742 lifted67420 = new lifted6742();
      lifted67420.i_4728 = i_4728;
      term = oncetd_1_0.instance.invoke(context, term, lifted67420);
      if(term == null)
        break Fail22797;
      if(i_4728.value == null)
        break Fail22797;
      term = termFactory.makeTuple(trans.const4458, i_4728.value, j_4728, k_4728, l_4728, m_4728);
      term = rename_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22797;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22797;
      term = termFactory.makeTuple(trans.const4459, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}