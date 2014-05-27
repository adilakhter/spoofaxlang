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

@SuppressWarnings("all") public class remove_debug_builder_0_0 extends Strategy 
{ 
  public static remove_debug_builder_0_0 instance = new remove_debug_builder_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_debug_builder_0_0");
    Fail22800:
    { 
      IStrategoTerm i_4729 = null;
      IStrategoTerm j_4729 = null;
      IStrategoTerm k_4729 = null;
      IStrategoTerm l_4729 = null;
      IStrategoTerm m_4729 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22800;
      i_4729 = term.getSubterm(0);
      j_4729 = term.getSubterm(1);
      k_4729 = term.getSubterm(2);
      l_4729 = term.getSubterm(3);
      m_4729 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.constNone0, i_4729, j_4729, k_4729, l_4729, m_4729);
      term = remove_debug_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22800;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22800;
      term = termFactory.makeTuple(trans.const4459, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}