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

@SuppressWarnings("all") public class mk_defs_for_selection_0_0 extends Strategy 
{ 
  public static mk_defs_for_selection_0_0 instance = new mk_defs_for_selection_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("mk_defs_for_selection_0_0");
    Fail22746:
    { 
      IStrategoTerm g_4720 = null;
      IStrategoTerm h_4720 = null;
      IStrategoTerm i_4720 = null;
      IStrategoTerm j_4720 = null;
      IStrategoTerm k_4720 = null;
      IStrategoTerm l_4720 = null;
      IStrategoTerm m_4720 = null;
      IStrategoTerm n_4720 = null;
      IStrategoTerm o_4720 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22746;
      l_4720 = term.getSubterm(0);
      j_4720 = term.getSubterm(1);
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{l_4720, trans.constNil4, trans.constNil4, j_4720});
      term = debug_1_0.instance.invoke(context, term, lifted6705.instance);
      if(term == null)
        break Fail22746;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{l_4720, trans.constNil4, trans.constNil4, j_4720});
      term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
      if(term == null)
        break Fail22746;
      term = declare_bodies_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22746;
      g_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6707.instance);
      if(term == null)
        break Fail22746;
      term = collect_all_1_0.instance.invoke(context, g_4720, is_unbound_svar_0_0.instance);
      if(term == null)
        break Fail22746;
      m_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6709.instance);
      if(term == null)
        break Fail22746;
      term = map_1_0.instance.invoke(context, m_4720, svaruse_to_svardec_0_0.instance);
      if(term == null)
        break Fail22746;
      h_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6711.instance);
      if(term == null)
        break Fail22746;
      term = collect_all_1_0.instance.invoke(context, g_4720, is_unbound_tvar_0_0.instance);
      if(term == null)
        break Fail22746;
      n_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6713.instance);
      if(term == null)
        break Fail22746;
      term = map_1_0.instance.invoke(context, n_4720, tvaruse_to_tvardec_0_0.instance);
      if(term == null)
        break Fail22746;
      i_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6715.instance);
      if(term == null)
        break Fail22746;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{l_4720, h_4720, i_4720, j_4720});
      k_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6716.instance);
      if(term == null)
        break Fail22746;
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{l_4720}), m_4720, n_4720});
      o_4720 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6717.instance);
      if(term == null)
        break Fail22746;
      term = termFactory.makeTuple(k_4720, o_4720);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}