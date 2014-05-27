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
    Fail21322:
    { 
      IStrategoTerm a_4175 = null;
      IStrategoTerm b_4175 = null;
      IStrategoTerm c_4175 = null;
      IStrategoTerm d_4175 = null;
      IStrategoTerm e_4175 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21322;
      a_4175 = term.getSubterm(0);
      b_4175 = term.getSubterm(1);
      c_4175 = term.getSubterm(2);
      d_4175 = term.getSubterm(3);
      e_4175 = term.getSubterm(4);
      term = termFactory.makeTuple(trans.constNone0, a_4175, b_4175, c_4175, d_4175, e_4175);
      term = inline_refactoring_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21322;
      term = process_refactoring_result_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21322;
      term = termFactory.makeTuple(trans.const4249, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}