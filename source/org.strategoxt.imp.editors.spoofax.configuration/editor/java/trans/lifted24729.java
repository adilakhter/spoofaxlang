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

@SuppressWarnings("all") final class lifted24729 extends Strategy 
{ 
  TermReference f_17555;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail87900:
    { 
      IStrategoTerm g_17555 = null;
      IStrategoTerm h_17555 = null;
      IStrategoTerm a_17556 = null;
      IStrategoTerm m_17555 = null;
      IStrategoTerm o_17555 = null;
      IStrategoTerm p_17555 = null;
      IStrategoTerm u_17555 = null;
      IStrategoTerm w_17555 = null;
      IStrategoTerm x_17555 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail87900;
      g_17555 = term.getSubterm(0);
      h_17555 = term.getSubterm(1);
      if(f_17555.value == null)
        break Fail87900;
      term = f_17555.value;
      IStrategoTerm term47211 = term;
      Success47333:
      { 
        Fail87901:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87901;
          if(true)
            break Success47333;
        }
        term = term47211;
        IStrategoTerm term47212 = term;
        Success47334:
        { 
          Fail87902:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87902;
            if(true)
              break Success47334;
          }
          term = term47212;
          IStrategoTerm term47213 = term;
          Success47335:
          { 
            Fail87903:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87903;
              if(true)
                break Success47335;
            }
            term = term47213;
            IStrategoTerm term47214 = term;
            Success47336:
            { 
              Fail87904:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87904;
                if(true)
                  break Success47336;
              }
              term = term47214;
              IStrategoTerm i_17555 = null;
              IStrategoTerm j_17555 = null;
              IStrategoTerm l_17555 = null;
              i_17555 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail87900;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87900;
              j_17555 = ((IStrategoList)term).tail();
              l_17555 = j_17555;
              term = report_failure_0_2.instance.invoke(context, l_17555, trans.const17843, i_17555);
              if(term == null)
                break Fail87900;
            }
          }
        }
      }
      o_17555 = term;
      m_17555 = trans.const17844;
      p_17555 = o_17555;
      term = string_replace_0_2.instance.invoke(context, p_17555, m_17555, trans.const17844);
      if(term == null)
        break Fail87900;
      a_17556 = term;
      term = g_17555;
      IStrategoTerm term47215 = term;
      Success47337:
      { 
        Fail87905:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87905;
          if(true)
            break Success47337;
        }
        term = term47215;
        IStrategoTerm term47216 = term;
        Success47338:
        { 
          Fail87906:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87906;
            if(true)
              break Success47338;
          }
          term = term47216;
          IStrategoTerm term47217 = term;
          Success47339:
          { 
            Fail87907:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87907;
              if(true)
                break Success47339;
            }
            term = term47217;
            IStrategoTerm term47218 = term;
            Success47340:
            { 
              Fail87908:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87908;
                if(true)
                  break Success47340;
              }
              term = term47218;
              IStrategoTerm q_17555 = null;
              IStrategoTerm r_17555 = null;
              IStrategoTerm t_17555 = null;
              q_17555 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail87900;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail87900;
              r_17555 = ((IStrategoList)term).tail();
              t_17555 = r_17555;
              term = report_failure_0_2.instance.invoke(context, t_17555, trans.const17843, q_17555);
              if(term == null)
                break Fail87900;
            }
          }
        }
      }
      w_17555 = term;
      u_17555 = trans.const17844;
      x_17555 = w_17555;
      term = string_replace_0_2.instance.invoke(context, x_17555, u_17555, trans.const17845);
      if(term == null)
        break Fail87900;
      term = (IStrategoTerm)termFactory.makeListCons(a_17556, termFactory.makeListCons(trans.const17846, termFactory.makeListCons(term, (IStrategoList)trans.constNil14)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87900;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14)), h_17555);
      if(true)
        return term;
    }
    return null;
  }
}