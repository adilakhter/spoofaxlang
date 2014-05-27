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

@SuppressWarnings("all") final class lifted6795 extends Strategy 
{ 
  TermReference q_4743;

  TermReference r_4743;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24130:
    { 
      IStrategoTerm l_4745 = null;
      IStrategoTerm m_4745 = null;
      IStrategoTerm n_4745 = null;
      IStrategoTerm p_4745 = null;
      IStrategoTerm e_4744 = null;
      IStrategoTerm g_4744 = null;
      IStrategoTerm h_4744 = null;
      IStrategoTerm m_4744 = null;
      IStrategoTerm o_4744 = null;
      IStrategoTerm p_4744 = null;
      m_4745 = term;
      p_4745 = term;
      IStrategoTerm term12220 = term;
      Success12789:
      { 
        Fail24131:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24131;
          if(true)
            break Success12789;
        }
        term = term12220;
        IStrategoTerm term12221 = term;
        Success12790:
        { 
          Fail24132:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24132;
            if(true)
              break Success12790;
          }
          term = term12221;
          IStrategoTerm term12222 = term;
          Success12791:
          { 
            Fail24133:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24133;
              if(true)
                break Success12791;
            }
            term = term12222;
            IStrategoTerm term12223 = term;
            Success12792:
            { 
              Fail24134:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24134;
                if(true)
                  break Success12792;
              }
              term = term12223;
              IStrategoTerm a_4744 = null;
              IStrategoTerm b_4744 = null;
              IStrategoTerm d_4744 = null;
              a_4744 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24130;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24130;
              b_4744 = ((IStrategoList)term).tail();
              d_4744 = b_4744;
              term = report_failure_0_2.instance.invoke(context, d_4744, trans.const4500, a_4744);
              if(term == null)
                break Fail24130;
            }
          }
        }
      }
      g_4744 = term;
      e_4744 = trans.const4440;
      h_4744 = g_4744;
      term = string_replace_0_2.instance.invoke(context, h_4744, e_4744, trans.const4440);
      if(term == null)
        break Fail24130;
      n_4745 = term;
      term = p_4745;
      if(q_4743.value == null)
        break Fail24130;
      term = q_4743.value;
      IStrategoTerm term12224 = term;
      Success12793:
      { 
        Fail24135:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24135;
          if(true)
            break Success12793;
        }
        term = term12224;
        IStrategoTerm term12225 = term;
        Success12794:
        { 
          Fail24136:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24136;
            if(true)
              break Success12794;
          }
          term = term12225;
          IStrategoTerm term12226 = term;
          Success12795:
          { 
            Fail24137:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24137;
              if(true)
                break Success12795;
            }
            term = term12226;
            IStrategoTerm term12227 = term;
            Success12796:
            { 
              Fail24138:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24138;
                if(true)
                  break Success12796;
              }
              term = term12227;
              IStrategoTerm i_4744 = null;
              IStrategoTerm j_4744 = null;
              IStrategoTerm l_4744 = null;
              i_4744 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24130;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24130;
              j_4744 = ((IStrategoList)term).tail();
              l_4744 = j_4744;
              term = report_failure_0_2.instance.invoke(context, l_4744, trans.const4500, i_4744);
              if(term == null)
                break Fail24130;
            }
          }
        }
      }
      o_4744 = term;
      m_4744 = trans.const4440;
      p_4744 = o_4744;
      term = string_replace_0_2.instance.invoke(context, p_4744, m_4744, trans.const4501);
      if(term == null)
        break Fail24130;
      term = (IStrategoTerm)termFactory.makeListCons(n_4745, termFactory.makeListCons(trans.const4502, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24130;
      l_4745 = term;
      term = m_4745;
      if(r_4743.value == null)
        break Fail24130;
      term = termFactory.annotateTerm(l_4745, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(r_4743.value, (IStrategoList)trans.constNil4)));
      if(true)
        return term;
    }
    return null;
  }
}