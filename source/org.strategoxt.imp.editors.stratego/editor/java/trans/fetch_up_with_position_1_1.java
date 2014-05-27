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

@SuppressWarnings("all") public class fetch_up_with_position_1_1 extends Strategy 
{ 
  public static fetch_up_with_position_1_1 instance = new fetch_up_with_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4714, IStrategoTerm b_4714)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_with_position_1_1");
    Fail22702:
    { 
      IStrategoTerm c_4714 = null;
      IStrategoTerm d_4714 = null;
      IStrategoTerm e_4714 = null;
      IStrategoTerm f_4714 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22702;
      c_4714 = term.getSubterm(0);
      d_4714 = term.getSubterm(1);
      term = termFactory.makeTuple(c_4714, d_4714);
      term = fetch_up_with_position_2_1.instance.invoke(context, term, g_4714, _Fail.instance, b_4714);
      if(term == null)
        break Fail22702;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22702;
      e_4714 = term.getSubterm(0);
      f_4714 = term.getSubterm(1);
      term = termFactory.makeTuple(e_4714, f_4714);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}