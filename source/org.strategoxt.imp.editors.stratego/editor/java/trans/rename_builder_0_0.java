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
    Fail21321:
    { 
      IStrategoTerm p_4174 = null;
      TermReference q_4174 = new TermReference();
      IStrategoTerm r_4174 = null;
      IStrategoTerm s_4174 = null;
      IStrategoTerm t_4174 = null;
      IStrategoTerm u_4174 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21321;
      p_4174 = term.getSubterm(0);
      r_4174 = term.getSubterm(1);
      s_4174 = term.getSubterm(2);
      t_4174 = term.getSubterm(3);
      u_4174 = term.getSubterm(4);
      term = p_4174;
      lifted6471 lifted64710 = new lifted6471();
      lifted64710.q_4174 = q_4174;
      term = oncetd_1_0.instance.invoke(context, term, lifted64710);
      if(term == null)
        break Fail21321;
      if(q_4174.value == null)
        break Fail21321;
      term = termFactory.makeTuple(trans.const4248, q_4174.value, r_4174, s_4174, t_4174, u_4174);
      term = rename_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21321;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21321;
      term = termFactory.makeTuple(trans.const4249, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}