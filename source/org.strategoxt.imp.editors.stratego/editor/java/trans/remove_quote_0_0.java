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

@SuppressWarnings("all") public class remove_quote_0_0 extends Strategy 
{ 
  public static remove_quote_0_0 instance = new remove_quote_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_quote_0_0");
    Fail23057:
    { 
      IStrategoTerm term12390 = term;
      Success12315:
      { 
        Fail23058:
        { 
          IStrategoTerm n_4774 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
            break Fail23058;
          n_4774 = term.getSubterm(0);
          term = this.invoke(context, n_4774);
          if(term == null)
            break Fail23058;
          term = termFactory.makeAppl(Main._consCOMPLETION_1, new IStrategoTerm[]{term});
          if(true)
            break Success12315;
        }
        term = term12390;
        IStrategoTerm e_4774 = null;
        IStrategoTerm f_4774 = null;
        IStrategoTerm g_4774 = null;
        IStrategoTerm k_4774 = null;
        f_4774 = term;
        k_4774 = term;
        IStrategoTerm term12391 = term;
        Success12316:
        { 
          Fail23059:
          { 
            Success12317:
            { 
              Fail23060:
              { 
                IStrategoTerm h_4774 = null;
                h_4774 = term;
                term = explode_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23060;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail23060;
                IStrategoTerm arg8197 = ((IStrategoList)term).head();
                if(arg8197.getTermType() != IStrategoTerm.INT || 39 != ((IStrategoInt)arg8197).intValue())
                  break Fail23060;
                e_4774 = ((IStrategoList)term).tail();
                term = h_4774;
                { 
                  term = implode_string_0_0.instance.invoke(context, e_4774);
                  if(term == null)
                    break Fail23059;
                  g_4774 = term;
                  if(true)
                    break Success12317;
                }
              }
              term = f_4774;
              g_4774 = f_4774;
            }
            if(true)
              break Success12316;
          }
          term = term12391;
          IStrategoTerm i_4774 = null;
          IStrategoTerm j_4774 = null;
          IStrategoTerm m_4774 = null;
          i_4774 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail23057;
          j_4774 = term;
          m_4774 = i_4774;
          term = report_with_failure_0_2.instance.invoke(context, m_4774, trans.const4567, j_4774);
          if(term == null)
            break Fail23057;
        }
        term = k_4774;
        if(g_4774 == null)
          break Fail23057;
        term = g_4774;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}