package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4646, IStrategoTerm i_4646)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail22886:
    { 
      IStrategoTerm term12218 = term;
      Success12195:
      { 
        Fail22887:
        { 
          IStrategoTerm l_4627 = null;
          TermReference m_4627 = new TermReference();
          IStrategoTerm n_4627 = null;
          IStrategoTerm o_4627 = null;
          IStrategoTerm r_4627 = null;
          IStrategoTerm t_4627 = null;
          IStrategoTerm u_4627 = null;
          IStrategoTerm cons569 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          l_4627 = cons569;
          IStrategoTerm args22 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          o_4627 = args22;
          r_4627 = term;
          term = i_4646;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22887;
          n_4627 = ((IStrategoList)term).head();
          if(m_4627.value == null)
            m_4627.value = ((IStrategoList)term).tail();
          else
            if(m_4627.value != ((IStrategoList)term).tail() && !m_4627.value.match(((IStrategoList)term).tail()))
              break Fail22887;
          term = r_4627;
          u_4627 = term;
          term = termFactory.makeTuple(n_4627, o_4627);
          lifted6875 lifted68750 = new lifted6875();
          lifted68750.h_4646 = h_4646;
          lifted68750.m_4627 = m_4627;
          term = at_index_1_0.instance.invoke(context, term, lifted68750);
          if(term == null)
            break Fail22887;
          t_4627 = term;
          term = u_4627;
          IStrategoTerm mkterm8;
          mkterm8 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{l_4627, t_4627});
          if(mkterm8 == null)
            break Fail22887;
          term = mkterm8;
          if(true)
            break Success12195;
        }
        term = term12218;
        IStrategoTerm g_4627 = null;
        g_4627 = term;
        term = i_4646;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22886;
        term = h_4646.invoke(context, g_4627);
        if(term == null)
          break Fail22886;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}