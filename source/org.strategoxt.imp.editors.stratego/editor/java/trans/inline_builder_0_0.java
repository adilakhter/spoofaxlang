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

@SuppressWarnings("all") public class inline_builder_0_0 extends Strategy 
{ 
  public static inline_builder_0_0 instance = new inline_builder_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("inline_builder_0_0");
    Fail22798:
    { 
      IStrategoTerm s_4728 = null;
      IStrategoTerm t_4728 = null;
      IStrategoTerm u_4728 = null;
      IStrategoTerm v_4728 = null;
      IStrategoTerm w_4728 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail22798;
      s_4728 = term.getSubterm(0);
      t_4728 = term.getSubterm(1);
      u_4728 = term.getSubterm(2);
      v_4728 = term.getSubterm(3);
      w_4728 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.constNone0, s_4728, t_4728, u_4728, v_4728, w_4728);
      term = inline_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22798;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22798;
      term = termFactory.makeTuple(trans.const4459, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}