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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4187, Strategy o_4187, IStrategoTerm ref_e_4187)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_4187 = new TermReference(ref_e_4187);
    context.push("apply_rename_refactoring_2_1");
    Fail21373:
    { 
      IStrategoTerm f_4187 = null;
      IStrategoTerm g_4187 = null;
      IStrategoTerm i_4187 = null;
      IStrategoTerm j_4187 = null;
      IStrategoTerm k_4187 = null;
      IStrategoTerm l_4187 = null;
      k_4187 = term;
      term = k_4187;
      lifted6516 lifted65160 = new lifted6516();
      lifted65160.e_4187 = e_4187;
      term = topdown_1_0.instance.invoke(context, term, lifted65160);
      if(term == null)
        break Fail21373;
      l_4187 = term;
      term = n_4187.invoke(context, term);
      if(term == null)
        break Fail21373;
      g_4187 = term;
      term = termFactory.makeTuple(k_4187, term);
      term = introduced_constraint_errors_1_0.instance.invoke(context, term, o_4187);
      if(term == null)
        break Fail21373;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21373;
      i_4187 = term.getSubterm(0);
      f_4187 = term.getSubterm(1);
      term = termFactory.makeTuple(l_4187, g_4187);
      lifted6518 lifted65180 = new lifted6518();
      lifted65180.e_4187 = e_4187;
      term = namebinding_error_messages_1_0.instance.invoke(context, term, lifted65180);
      if(term == null)
        break Fail21373;
      term = termFactory.makeTuple(term, i_4187);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21373;
      j_4187 = term;
      term = termFactory.makeTuple(k_4187, l_4187);
      term = get_changed_asts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21373;
      term = termFactory.makeTuple(term, j_4187, f_4187);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}