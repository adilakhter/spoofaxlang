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

@SuppressWarnings("all") final class lifted6862 extends Strategy 
{ 
  public static final lifted6862 instance = new lifted6862();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24048:
    { 
      IStrategoTerm u_4784 = null;
      IStrategoTerm q_4785 = null;
      IStrategoTerm b_4785 = null;
      IStrategoTerm d_4785 = null;
      IStrategoTerm e_4785 = null;
      IStrategoTerm j_4785 = null;
      IStrategoTerm l_4785 = null;
      IStrategoTerm m_4785 = null;
      u_4784 = term;
      term = $Project$Dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24048;
      IStrategoTerm term12441 = term;
      Success12747:
      { 
        Fail24049:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24049;
          if(true)
            break Success12747;
        }
        term = term12441;
        IStrategoTerm term12442 = term;
        Success12748:
        { 
          Fail24050:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24050;
            if(true)
              break Success12748;
          }
          term = term12442;
          IStrategoTerm term12443 = term;
          Success12749:
          { 
            Fail24051:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24051;
              if(true)
                break Success12749;
            }
            term = term12443;
            IStrategoTerm term12444 = term;
            Success12750:
            { 
              Fail24052:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24052;
                if(true)
                  break Success12750;
              }
              term = term12444;
              IStrategoTerm x_4784 = null;
              IStrategoTerm y_4784 = null;
              IStrategoTerm a_4785 = null;
              x_4784 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24048;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24048;
              y_4784 = ((IStrategoList)term).tail();
              a_4785 = y_4784;
              term = report_failure_0_2.instance.invoke(context, a_4785, trans.const4591, x_4784);
              if(term == null)
                break Fail24048;
            }
          }
        }
      }
      d_4785 = term;
      b_4785 = trans.const4440;
      e_4785 = d_4785;
      term = string_replace_0_2.instance.invoke(context, e_4785, b_4785, trans.const4440);
      if(term == null)
        break Fail24048;
      q_4785 = term;
      term = u_4784;
      IStrategoTerm term12445 = term;
      Success12751:
      { 
        Fail24053:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24053;
          if(true)
            break Success12751;
        }
        term = term12445;
        IStrategoTerm term12446 = term;
        Success12752:
        { 
          Fail24054:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24054;
            if(true)
              break Success12752;
          }
          term = term12446;
          IStrategoTerm term12447 = term;
          Success12753:
          { 
            Fail24055:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24055;
              if(true)
                break Success12753;
            }
            term = term12447;
            IStrategoTerm term12448 = term;
            Success12754:
            { 
              Fail24056:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24056;
                if(true)
                  break Success12754;
              }
              term = term12448;
              IStrategoTerm f_4785 = null;
              IStrategoTerm g_4785 = null;
              IStrategoTerm i_4785 = null;
              f_4785 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24048;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24048;
              g_4785 = ((IStrategoList)term).tail();
              i_4785 = g_4785;
              term = report_failure_0_2.instance.invoke(context, i_4785, trans.const4591, f_4785);
              if(term == null)
                break Fail24048;
            }
          }
        }
      }
      l_4785 = term;
      j_4785 = trans.const4440;
      m_4785 = l_4785;
      term = string_replace_0_2.instance.invoke(context, m_4785, j_4785, trans.const4555);
      if(term == null)
        break Fail24048;
      term = (IStrategoTerm)termFactory.makeListCons(q_4785, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24048;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      if(true)
        return term;
    }
    return null;
  }
}