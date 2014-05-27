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
    Fail22799:
    { 
      IStrategoTerm a_4729 = null;
      IStrategoTerm b_4729 = null;
      IStrategoTerm c_4729 = null;
      IStrategoTerm d_4729 = null;
      IStrategoTerm e_4729 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22799;
      a_4729 = term.getSubterm(0);
      b_4729 = term.getSubterm(1);
      c_4729 = term.getSubterm(2);
      d_4729 = term.getSubterm(3);
      e_4729 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.const4460, a_4729, b_4729, c_4729, d_4729, e_4729);
      term = extract_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22799;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22799;
      term = termFactory.makeTuple(trans.const4459, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}