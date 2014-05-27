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

@SuppressWarnings("all") public class reorder_right_associativity_chain_0_0 extends Strategy 
{ 
  public static reorder_right_associativity_chain_0_0 instance = new reorder_right_associativity_chain_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("reorder_right_associativity_chain_0_0");
    Fail21280:
    { 
      IStrategoTerm i_4168 = null;
      IStrategoTerm j_4168 = null;
      IStrategoTerm k_4168 = null;
      IStrategoTerm l_4168 = null;
      IStrategoTerm m_4168 = null;
      k_4168 = term;
      IStrategoTerm cons526 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      j_4168 = cons526;
      IStrategoTerm args10 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(args10.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args10).isEmpty())
        break Fail21280;
      IStrategoTerm arg7535 = ((IStrategoList)args10).tail();
      if(arg7535.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7535).isEmpty())
        break Fail21280;
      IStrategoTerm arg7536 = ((IStrategoList)arg7535).tail();
      if(arg7536.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7536).isEmpty())
        break Fail21280;
      m_4168 = term;
      term = break_right_associativity_chain_0_1.instance.invoke(context, k_4168, j_4168);
      if(term == null)
        break Fail21280;
      i_4168 = term;
      term = broken_child_in_right_associativity_chain_0_1.instance.invoke(context, k_4168, j_4168);
      if(term == null)
        break Fail21280;
      l_4168 = term;
      term = termFactory.makeTuple(k_4168, term);
      term = check_brackets_tail_term_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21280;
      term = m_4168;
      IStrategoTerm mkterm4;
      mkterm4 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{j_4168, (IStrategoTerm)termFactory.makeListCons(i_4168, termFactory.makeListCons(l_4168, (IStrategoList)trans.constNil3))});
      if(mkterm4 == null)
        break Fail21280;
      term = mkterm4;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}