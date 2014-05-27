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
    Fail21324:
    { 
      IStrategoTerm q_4175 = null;
      IStrategoTerm r_4175 = null;
      IStrategoTerm s_4175 = null;
      IStrategoTerm t_4175 = null;
      IStrategoTerm u_4175 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21324;
      q_4175 = term.getSubterm(0);
      r_4175 = term.getSubterm(1);
      s_4175 = term.getSubterm(2);
      t_4175 = term.getSubterm(3);
      u_4175 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.constNone0, q_4175, r_4175, s_4175, t_4175, u_4175);
      term = remove_debug_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21324;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21324;
      term = termFactory.makeTuple(trans.const4249, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}