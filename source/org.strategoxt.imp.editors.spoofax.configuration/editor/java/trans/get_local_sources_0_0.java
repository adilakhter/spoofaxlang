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

@SuppressWarnings("all") public class get_local_sources_0_0 extends Strategy 
{ 
  public static get_local_sources_0_0 instance = new get_local_sources_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_local_sources_0_0");
    Fail87574:
    { 
      IStrategoTerm term47219 = term;
      Success47211:
      { 
        Fail87575:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail87575;
          term = trans.constNil14;
          if(true)
            break Success47211;
        }
        term = term47219;
        IStrategoTerm g_17556 = null;
        IStrategoTerm h_17556 = null;
        IStrategoTerm i_17556 = null;
        IStrategoTerm j_17556 = null;
        IStrategoTerm k_17556 = null;
        IStrategoTerm n_17556 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail87574;
        IStrategoTerm arg29976 = ((IStrategoList)term).head();
        if(arg29976.getTermType() != IStrategoTerm.APPL || Main._consSource_2 != ((IStrategoAppl)arg29976).getConstructor())
          break Fail87574;
        g_17556 = arg29976.getSubterm(0);
        h_17556 = arg29976.getSubterm(1);
        i_17556 = ((IStrategoList)term).tail();
        n_17556 = term;
        IStrategoTerm term47220 = term;
        Success47212:
        { 
          Fail87576:
          { 
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(g_17556, h_17556), (IStrategoList)trans.constNil14);
            j_17556 = term;
            term = this.invoke(context, i_17556);
            if(term == null)
              break Fail87576;
            term = termFactory.makeTuple(term, j_17556);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87576;
            k_17556 = term;
            if(true)
              break Success47212;
          }
          term = term47220;
          IStrategoTerm l_17556 = null;
          IStrategoTerm m_17556 = null;
          IStrategoTerm r_17556 = null;
          l_17556 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail87574;
          m_17556 = term;
          r_17556 = l_17556;
          term = report_with_failure_0_2.instance.invoke(context, r_17556, trans.const17848, m_17556);
          if(term == null)
            break Fail87574;
        }
        term = n_17556;
        if(k_17556 == null)
          break Fail87574;
        term = k_17556;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}