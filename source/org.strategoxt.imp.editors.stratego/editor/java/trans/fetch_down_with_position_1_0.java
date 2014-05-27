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

@SuppressWarnings("all") public class fetch_down_with_position_1_0 extends Strategy 
{ 
  public static fetch_down_with_position_1_0 instance = new fetch_down_with_position_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_down_with_position_1_0");
    Fail22708:
    { 
      IStrategoTerm term12118 = term;
      Success12118:
      { 
        Fail22709:
        { 
          IStrategoTerm j_4715 = null;
          IStrategoTerm k_4715 = null;
          IStrategoTerm l_4715 = null;
          IStrategoTerm m_4715 = null;
          IStrategoTerm n_4715 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22709;
          j_4715 = term.getSubterm(0);
          l_4715 = term.getSubterm(1);
          term = j_4715;
          IStrategoTerm term12119 = term;
          Success12119:
          { 
            Fail22710:
            { 
              term = j_4898.invoke(context, term);
              if(term == null)
                break Fail22710;
              { 
                if(true)
                  break Fail22709;
                if(true)
                  break Success12119;
              }
            }
            term = term12119;
          }
          term = get_arguments_0_0.instance.invoke(context, j_4715);
          if(term == null)
            break Fail22709;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22709;
          k_4715 = ((IStrategoList)term).head();
          IStrategoTerm arg7958 = ((IStrategoList)term).tail();
          if(arg7958.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7958).isEmpty())
            break Fail22709;
          term = termFactory.makeTuple(l_4715, trans.constCons2043);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22709;
          term = termFactory.makeTuple(k_4715, term);
          term = this.invoke(context, term, j_4898);
          if(term == null)
            break Fail22709;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22709;
          m_4715 = term.getSubterm(0);
          n_4715 = term.getSubterm(1);
          term = termFactory.makeTuple(m_4715, n_4715);
          if(true)
            break Success12118;
        }
        term = term12118;
        IStrategoTerm f_4715 = null;
        IStrategoTerm g_4715 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22708;
        g_4715 = term.getSubterm(0);
        f_4715 = term.getSubterm(1);
        term = j_4898.invoke(context, g_4715);
        if(term == null)
          break Fail22708;
        term = termFactory.makeTuple(g_4715, f_4715);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}