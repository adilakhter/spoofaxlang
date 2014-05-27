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
    Fail21260:
    { 
      IStrategoTerm d_4165 = null;
      IStrategoTerm e_4165 = null;
      IStrategoTerm f_4165 = null;
      IStrategoTerm g_4165 = null;
      IStrategoTerm h_4165 = null;
      IStrategoTerm j_4165 = null;
      IStrategoTerm k_4165 = null;
      IStrategoTerm l_4165 = null;
      IStrategoTerm m_4165 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail21260;
      d_4165 = term.getSubterm(0);
      e_4165 = term.getSubterm(1);
      f_4165 = term.getSubterm(2);
      h_4165 = term.getSubterm(3);
      term = termFactory.makeTuple(d_4165, e_4165);
      term = mk_defs_for_extraction_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21260;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21260;
      l_4165 = term.getSubterm(0);
      g_4165 = term.getSubterm(1);
      term = debug_1_0.instance.invoke(context, term, lifted6430.instance);
      if(term == null)
        break Fail21260;
      term = extract_1_3.instance.invoke(context, h_4165, lifted6431.instance, f_4165, g_4165, l_4165);
      if(term == null)
        break Fail21260;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(h_4165, term), (IStrategoList)trans.constNil3);
      j_4165 = term;
      k_4165 = trans.constNil3;
      term = collect_all_1_0.instance.invoke(context, l_4165, lifted6432.instance);
      if(term == null)
        break Fail21260;
      m_4165 = term;
      term = termFactory.makeTuple(j_4165, k_4165, trans.constNil3, m_4165);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}