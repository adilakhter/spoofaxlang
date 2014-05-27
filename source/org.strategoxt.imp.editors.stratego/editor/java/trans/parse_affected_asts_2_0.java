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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4737, Strategy e_4737)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_affected_asts_2_0");
    Fail22825:
    { 
      IStrategoTerm z_4736 = null;
      IStrategoTerm a_4737 = null;
      IStrategoTerm b_4737 = null;
      z_4736 = term;
      term = z_4736;
      lifted6774 lifted67740 = new lifted6774();
      lifted67740.d_4737 = d_4737;
      lifted67740.e_4737 = e_4737;
      term = partition_1_0.instance.invoke(context, term, lifted67740);
      if(term == null)
        break Fail22825;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22825;
      b_4737 = term.getSubterm(0);
      a_4737 = term.getSubterm(1);
      term = filter_1_0.instance.invoke(context, b_4737, lifted6775.instance);
      if(term == null)
        break Fail22825;
      term = termFactory.makeTuple(term, a_4737);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}