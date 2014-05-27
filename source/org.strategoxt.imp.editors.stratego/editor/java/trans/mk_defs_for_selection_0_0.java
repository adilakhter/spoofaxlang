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
    Fail21270:
    { 
      IStrategoTerm o_4166 = null;
      IStrategoTerm p_4166 = null;
      IStrategoTerm q_4166 = null;
      IStrategoTerm r_4166 = null;
      IStrategoTerm s_4166 = null;
      IStrategoTerm t_4166 = null;
      IStrategoTerm u_4166 = null;
      IStrategoTerm v_4166 = null;
      IStrategoTerm w_4166 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21270;
      t_4166 = term.getSubterm(0);
      r_4166 = term.getSubterm(1);
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{t_4166, trans.constNil3, trans.constNil3, r_4166});
      term = debug_1_0.instance.invoke(context, term, lifted6434.instance);
      if(term == null)
        break Fail21270;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{t_4166, trans.constNil3, trans.constNil3, r_4166});
      term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
      if(term == null)
        break Fail21270;
      term = declare_bodies_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21270;
      o_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6436.instance);
      if(term == null)
        break Fail21270;
      term = collect_all_1_0.instance.invoke(context, o_4166, is_unbound_svar_0_0.instance);
      if(term == null)
        break Fail21270;
      u_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6438.instance);
      if(term == null)
        break Fail21270;
      term = map_1_0.instance.invoke(context, u_4166, svaruse_to_svardec_0_0.instance);
      if(term == null)
        break Fail21270;
      p_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6440.instance);
      if(term == null)
        break Fail21270;
      term = collect_all_1_0.instance.invoke(context, o_4166, is_unbound_tvar_0_0.instance);
      if(term == null)
        break Fail21270;
      v_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6442.instance);
      if(term == null)
        break Fail21270;
      term = map_1_0.instance.invoke(context, v_4166, tvaruse_to_tvardec_0_0.instance);
      if(term == null)
        break Fail21270;
      q_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6444.instance);
      if(term == null)
        break Fail21270;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{t_4166, p_4166, q_4166, r_4166});
      s_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6445.instance);
      if(term == null)
        break Fail21270;
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{t_4166}), u_4166, v_4166});
      w_4166 = term;
      term = debug_1_0.instance.invoke(context, term, lifted6446.instance);
      if(term == null)
        break Fail21270;
      term = termFactory.makeTuple(s_4166, w_4166);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}