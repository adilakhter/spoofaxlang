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

@SuppressWarnings("all") public class parse_affected_asts_2_0 extends Strategy 
{ 
  public static parse_affected_asts_2_0 instance = new parse_affected_asts_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4183, Strategy m_4183)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_affected_asts_2_0");
    Fail21349:
    { 
      IStrategoTerm h_4183 = null;
      IStrategoTerm i_4183 = null;
      IStrategoTerm j_4183 = null;
      h_4183 = term;
      term = h_4183;
      lifted6503 lifted65030 = new lifted6503();
      lifted65030.l_4183 = l_4183;
      lifted65030.m_4183 = m_4183;
      term = partition_1_0.instance.invoke(context, term, lifted65030);
      if(term == null)
        break Fail21349;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21349;
      j_4183 = term.getSubterm(0);
      i_4183 = term.getSubterm(1);
      term = filter_1_0.instance.invoke(context, j_4183, lifted6504.instance);
      if(term == null)
        break Fail21349;
      term = termFactory.makeTuple(term, i_4183);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}