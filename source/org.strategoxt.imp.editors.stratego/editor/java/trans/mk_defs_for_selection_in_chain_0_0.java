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

@SuppressWarnings("all") public class mk_defs_for_selection_in_chain_0_0 extends Strategy 
{ 
  public static mk_defs_for_selection_in_chain_0_0 instance = new mk_defs_for_selection_in_chain_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("mk_defs_for_selection_in_chain_0_0");
    Fail21269:
    { 
      IStrategoTerm f_4166 = null;
      IStrategoTerm g_4166 = null;
      IStrategoTerm h_4166 = null;
      IStrategoTerm i_4166 = null;
      IStrategoTerm j_4166 = null;
      IStrategoTerm k_4166 = null;
      IStrategoTerm l_4166 = null;
      IStrategoTerm m_4166 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21269;
      i_4166 = term.getSubterm(0);
      f_4166 = term.getSubterm(1);
      m_4166 = term;
      term = reorder_associativity_chain_0_0.instance.invoke(context, f_4166);
      if(term == null)
        break Fail21269;
      IStrategoTerm cons525 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      g_4166 = cons525;
      IStrategoTerm args9 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(args9.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args9).isEmpty())
        break Fail21269;
      j_4166 = ((IStrategoList)args9).head();
      IStrategoTerm arg7532 = ((IStrategoList)args9).tail();
      if(arg7532.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7532).isEmpty())
        break Fail21269;
      h_4166 = ((IStrategoList)arg7532).head();
      IStrategoTerm arg7533 = ((IStrategoList)arg7532).tail();
      if(arg7533.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7533).isEmpty())
        break Fail21269;
      term = termFactory.makeTuple(i_4166, j_4166);
      term = mk_defs_for_selection_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21269;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21269;
      k_4166 = term.getSubterm(0);
      l_4166 = term.getSubterm(1);
      term = m_4166;
      IStrategoTerm mkterm3;
      mkterm3 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{g_4166, (IStrategoTerm)termFactory.makeListCons(l_4166, termFactory.makeListCons(h_4166, (IStrategoList)trans.constNil3))});
      if(mkterm3 == null)
        break Fail21269;
      term = termFactory.makeTuple(k_4166, mkterm3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}