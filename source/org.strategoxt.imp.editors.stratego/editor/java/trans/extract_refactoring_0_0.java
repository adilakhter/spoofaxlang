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

@SuppressWarnings("all") public class extract_refactoring_0_0 extends Strategy 
{ 
  public static extract_refactoring_0_0 instance = new extract_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("extract_refactoring_0_0");
    Fail22736:
    { 
      IStrategoTerm v_4718 = null;
      IStrategoTerm w_4718 = null;
      IStrategoTerm x_4718 = null;
      IStrategoTerm y_4718 = null;
      IStrategoTerm z_4718 = null;
      IStrategoTerm b_4719 = null;
      IStrategoTerm c_4719 = null;
      IStrategoTerm d_4719 = null;
      IStrategoTerm e_4719 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail22736;
      v_4718 = term.getSubterm(0);
      w_4718 = term.getSubterm(1);
      x_4718 = term.getSubterm(2);
      z_4718 = term.getSubterm(3);
      term = termFactory.makeTuple(v_4718, w_4718);
      term = mk_defs_for_extraction_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22736;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22736;
      d_4719 = term.getSubterm(0);
      y_4718 = term.getSubterm(1);
      term = debug_1_0.instance.invoke(context, term, lifted6701.instance);
      if(term == null)
        break Fail22736;
      term = extract_1_3.instance.invoke(context, z_4718, lifted6702.instance, x_4718, y_4718, d_4719);
      if(term == null)
        break Fail22736;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(z_4718, term), (IStrategoList)trans.constNil4);
      b_4719 = term;
      c_4719 = trans.constNil4;
      term = collect_all_1_0.instance.invoke(context, d_4719, lifted6703.instance);
      if(term == null)
        break Fail22736;
      e_4719 = term;
      term = termFactory.makeTuple(b_4719, c_4719, trans.constNil4, e_4719);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}