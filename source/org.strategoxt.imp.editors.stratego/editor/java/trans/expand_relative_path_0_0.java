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

@SuppressWarnings("all") public class expand_relative_path_0_0 extends Strategy 
{ 
  public static expand_relative_path_0_0 instance = new expand_relative_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("expand_relative_path_0_0");
    Fail21647:
    { 
      IStrategoTerm g_4232 = null;
      IStrategoTerm z_4232 = null;
      IStrategoTerm c_4233 = null;
      IStrategoTerm n_4232 = null;
      IStrategoTerm p_4232 = null;
      IStrategoTerm q_4232 = null;
      IStrategoTerm v_4232 = null;
      IStrategoTerm x_4232 = null;
      IStrategoTerm y_4232 = null;
      g_4232 = term;
      z_4232 = term;
      term = is_relpath_0_0.instance.invoke(context, g_4232);
      if(term == null)
        break Fail21647;
      term = z_4232;
      term = $Project$Dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21647;
      IStrategoTerm term11741 = term;
      Success11656:
      { 
        Fail21648:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21648;
          if(true)
            break Success11656;
        }
        term = term11741;
        IStrategoTerm term11742 = term;
        Success11657:
        { 
          Fail21649:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21649;
            if(true)
              break Success11657;
          }
          term = term11742;
          IStrategoTerm term11743 = term;
          Success11658:
          { 
            Fail21650:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21650;
              if(true)
                break Success11658;
            }
            term = term11743;
            IStrategoTerm term11744 = term;
            Success11659:
            { 
              Fail21651:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21651;
                if(true)
                  break Success11659;
              }
              term = term11744;
              IStrategoTerm j_4232 = null;
              IStrategoTerm k_4232 = null;
              IStrategoTerm m_4232 = null;
              j_4232 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21647;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21647;
              k_4232 = ((IStrategoList)term).tail();
              m_4232 = k_4232;
              term = report_failure_0_2.instance.invoke(context, m_4232, trans.const4382, j_4232);
              if(term == null)
                break Fail21647;
            }
          }
        }
      }
      p_4232 = term;
      n_4232 = trans.const4230;
      q_4232 = p_4232;
      term = string_replace_0_2.instance.invoke(context, q_4232, n_4232, trans.const4230);
      if(term == null)
        break Fail21647;
      c_4233 = term;
      term = g_4232;
      IStrategoTerm term11745 = term;
      Success11660:
      { 
        Fail21652:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21652;
          if(true)
            break Success11660;
        }
        term = term11745;
        IStrategoTerm term11746 = term;
        Success11661:
        { 
          Fail21653:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21653;
            if(true)
              break Success11661;
          }
          term = term11746;
          IStrategoTerm term11747 = term;
          Success11662:
          { 
            Fail21654:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21654;
              if(true)
                break Success11662;
            }
            term = term11747;
            IStrategoTerm term11748 = term;
            Success11663:
            { 
              Fail21655:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21655;
                if(true)
                  break Success11663;
              }
              term = term11748;
              IStrategoTerm r_4232 = null;
              IStrategoTerm s_4232 = null;
              IStrategoTerm u_4232 = null;
              r_4232 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21647;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21647;
              s_4232 = ((IStrategoList)term).tail();
              u_4232 = s_4232;
              term = report_failure_0_2.instance.invoke(context, u_4232, trans.const4382, r_4232);
              if(term == null)
                break Fail21647;
            }
          }
        }
      }
      x_4232 = term;
      v_4232 = trans.const4230;
      y_4232 = x_4232;
      term = string_replace_0_2.instance.invoke(context, y_4232, v_4232, trans.const4345);
      if(term == null)
        break Fail21647;
      term = (IStrategoTerm)termFactory.makeListCons(c_4233, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21647;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}