package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4541, IStrategoTerm m_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail25839:
    { 
      IStrategoTerm term10274 = term;
      Success10215:
      { 
        Fail25840:
        { 
          IStrategoTerm k_4268 = null;
          TermReference l_4268 = new TermReference();
          IStrategoTerm m_4268 = null;
          IStrategoTerm n_4268 = null;
          IStrategoTerm q_4268 = null;
          IStrategoTerm s_4268 = null;
          IStrategoTerm t_4268 = null;
          IStrategoTerm cons319 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          k_4268 = cons319;
          IStrategoTerm args46 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          n_4268 = args46;
          q_4268 = term;
          term = m_4541;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25840;
          m_4268 = ((IStrategoList)term).head();
          if(l_4268.value == null)
            l_4268.value = ((IStrategoList)term).tail();
          else
            if(l_4268.value != ((IStrategoList)term).tail() && !l_4268.value.match(((IStrategoList)term).tail()))
              break Fail25840;
          term = q_4268;
          t_4268 = term;
          term = termFactory.makeTuple(m_4268, n_4268);
          lifted9266 lifted92660 = new lifted9266();
          lifted92660.l_4541 = l_4541;
          lifted92660.l_4268 = l_4268;
          term = at_index_1_0.instance.invoke(context, term, lifted92660);
          if(term == null)
            break Fail25840;
          s_4268 = term;
          term = t_4268;
          IStrategoTerm mkterm7;
          mkterm7 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{k_4268, s_4268});
          if(mkterm7 == null)
            break Fail25840;
          term = mkterm7;
          if(true)
            break Success10215;
        }
        term = term10274;
        IStrategoTerm f_4268 = null;
        f_4268 = term;
        term = m_4541;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail25839;
        term = l_4541.invoke(context, f_4268);
        if(term == null)
          break Fail25839;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}