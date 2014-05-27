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
    Fail21581:
    { 
      IStrategoTerm term11681 = term;
      Success11606:
      { 
        Fail21582:
        { 
          IStrategoTerm v_4220 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21582;
          v_4220 = term.getSubterm(0);
          term = this.invoke(context, v_4220);
          if(term == null)
            break Fail21582;
          term = termFactory.makeAppl(Main._consCOMPLETION_1, new IStrategoTerm[]{term});
          if(true)
            break Success11606;
        }
        term = term11681;
        IStrategoTerm m_4220 = null;
        IStrategoTerm n_4220 = null;
        IStrategoTerm o_4220 = null;
        IStrategoTerm s_4220 = null;
        n_4220 = term;
        s_4220 = term;
        IStrategoTerm term11682 = term;
        Success11607:
        { 
          Fail21583:
          { 
            Success11608:
            { 
              Fail21584:
              { 
                IStrategoTerm p_4220 = null;
                p_4220 = term;
                term = explode_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21584;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail21584;
                IStrategoTerm arg7730 = ((IStrategoList)term).head();
                if(arg7730.getTermType() != IStrategoTerm.INT || 39 != ((IStrategoInt)arg7730).intValue())
                  break Fail21584;
                m_4220 = ((IStrategoList)term).tail();
                term = p_4220;
                { 
                  term = implode_string_0_0.instance.invoke(context, m_4220);
                  if(term == null)
                    break Fail21583;
                  o_4220 = term;
                  if(true)
                    break Success11608;
                }
              }
              term = n_4220;
              o_4220 = n_4220;
            }
            if(true)
              break Success11607;
          }
          term = term11682;
          IStrategoTerm q_4220 = null;
          IStrategoTerm r_4220 = null;
          IStrategoTerm u_4220 = null;
          q_4220 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail21581;
          r_4220 = term;
          u_4220 = q_4220;
          term = report_with_failure_0_2.instance.invoke(context, u_4220, trans.const4357, r_4220);
          if(term == null)
            break Fail21581;
        }
        term = s_4220;
        if(o_4220 == null)
          break Fail21581;
        term = o_4220;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}