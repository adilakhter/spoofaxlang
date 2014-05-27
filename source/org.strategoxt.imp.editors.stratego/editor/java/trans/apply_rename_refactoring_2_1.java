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

@SuppressWarnings("all") public class apply_rename_refactoring_2_1 extends Strategy 
{ 
  public static apply_rename_refactoring_2_1 instance = new apply_rename_refactoring_2_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4741, Strategy g_4741, IStrategoTerm ref_w_4740)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_4740 = new TermReference(ref_w_4740);
    context.push("apply_rename_refactoring_2_1");
    Fail22849:
    { 
      IStrategoTerm x_4740 = null;
      IStrategoTerm y_4740 = null;
      IStrategoTerm a_4741 = null;
      IStrategoTerm b_4741 = null;
      IStrategoTerm c_4741 = null;
      IStrategoTerm d_4741 = null;
      c_4741 = term;
      term = c_4741;
      lifted6787 lifted67870 = new lifted6787();
      lifted67870.w_4740 = w_4740;
      term = topdown_1_0.instance.invoke(context, term, lifted67870);
      if(term == null)
        break Fail22849;
      d_4741 = term;
      term = f_4741.invoke(context, term);
      if(term == null)
        break Fail22849;
      y_4740 = term;
      term = termFactory.makeTuple(c_4741, term);
      term = introduced_constraint_errors_1_0.instance.invoke(context, term, g_4741);
      if(term == null)
        break Fail22849;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22849;
      a_4741 = term.getSubterm(0);
      x_4740 = term.getSubterm(1);
      term = termFactory.makeTuple(d_4741, y_4740);
      lifted6789 lifted67890 = new lifted6789();
      lifted67890.w_4740 = w_4740;
      term = namebinding_error_messages_1_0.instance.invoke(context, term, lifted67890);
      if(term == null)
        break Fail22849;
      term = termFactory.makeTuple(term, a_4741);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22849;
      b_4741 = term;
      term = termFactory.makeTuple(c_4741, d_4741);
      term = get_changed_asts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22849;
      term = termFactory.makeTuple(term, b_4741, x_4740);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}