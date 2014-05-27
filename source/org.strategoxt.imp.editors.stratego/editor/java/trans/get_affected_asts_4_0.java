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

@SuppressWarnings("all") public class get_affected_asts_4_0 extends Strategy 
{ 
  public static get_affected_asts_4_0 instance = new get_affected_asts_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4183, Strategy d_4183, Strategy e_4183, Strategy f_4183)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_affected_asts_4_0");
    Fail21348:
    { 
      IStrategoTerm y_4182 = null;
      IStrategoTerm a_4183 = null;
      IStrategoTerm b_4183 = null;
      y_4182 = term;
      term = get_source_files_2_0.instance.invoke(context, y_4182, c_4183, d_4183);
      if(term == null)
        break Fail21348;
      term = parse_affected_asts_2_0.instance.invoke(context, term, e_4183, f_4183);
      if(term == null)
        break Fail21348;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21348;
      a_4183 = term.getSubterm(0);
      b_4183 = term.getSubterm(1);
      term = termFactory.makeTuple(a_4183, b_4183);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}