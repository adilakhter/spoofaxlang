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

@SuppressWarnings("all") public class apply_rename_refactoring_2_2 extends Strategy 
{ 
  public static apply_rename_refactoring_2_2 instance = new apply_rename_refactoring_2_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4740, Strategy s_4740, IStrategoTerm l_4740, IStrategoTerm m_4740)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("apply_rename_refactoring_2_2");
    Fail22848:
    { 
      IStrategoTerm n_4740 = null;
      IStrategoTerm o_4740 = null;
      IStrategoTerm p_4740 = null;
      IStrategoTerm q_4740 = null;
      IStrategoTerm v_4740 = null;
      n_4740 = term;
      v_4740 = n_4740;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(l_4740, m_4740), (IStrategoList)trans.constNil4);
      term = apply_rename_refactoring_2_1.instance.invoke(context, v_4740, r_4740, s_4740, term);
      if(term == null)
        break Fail22848;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22848;
      o_4740 = term.getSubterm(0);
      p_4740 = term.getSubterm(1);
      q_4740 = term.getSubterm(2);
      term = termFactory.makeTuple(o_4740, p_4740, q_4740);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}