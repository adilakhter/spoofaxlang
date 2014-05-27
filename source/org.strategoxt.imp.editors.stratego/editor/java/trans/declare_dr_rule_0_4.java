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

@SuppressWarnings("all") public class declare_dr_rule_0_4 extends Strategy 
{ 
  public static declare_dr_rule_0_4 instance = new declare_dr_rule_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4237, IStrategoTerm a_4238, IStrategoTerm b_4238, IStrategoTerm c_4238)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_dr_rule_0_4");
    Fail21674:
    { 
      IStrategoTerm d_4238 = null;
      IStrategoTerm e_4238 = null;
      IStrategoTerm y_4238 = null;
      IStrategoTerm j_4238 = null;
      IStrategoTerm l_4238 = null;
      IStrategoTerm m_4238 = null;
      IStrategoTerm r_4238 = null;
      IStrategoTerm t_4238 = null;
      IStrategoTerm u_4238 = null;
      IStrategoTerm v_4238 = null;
      IStrategoTerm c_4239 = null;
      IStrategoTerm e_4239 = null;
      IStrategoTerm f_4239 = null;
      d_4238 = term;
      term = d_4238;
      IStrategoTerm term11769 = term;
      Success11676:
      { 
        Fail21675:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21675;
          if(true)
            break Success11676;
        }
        term = term11769;
        IStrategoTerm term11770 = term;
        Success11677:
        { 
          Fail21676:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21676;
            if(true)
              break Success11677;
          }
          term = term11770;
          IStrategoTerm term11771 = term;
          Success11678:
          { 
            Fail21677:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21677;
              if(true)
                break Success11678;
            }
            term = term11771;
            IStrategoTerm term11772 = term;
            Success11679:
            { 
              Fail21678:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21678;
                if(true)
                  break Success11679;
              }
              term = term11772;
              IStrategoTerm f_4238 = null;
              IStrategoTerm g_4238 = null;
              IStrategoTerm i_4238 = null;
              f_4238 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21674;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21674;
              g_4238 = ((IStrategoList)term).tail();
              i_4238 = g_4238;
              term = report_failure_0_2.instance.invoke(context, i_4238, trans.const4389, f_4238);
              if(term == null)
                break Fail21674;
            }
          }
        }
      }
      l_4238 = term;
      j_4238 = trans.const4230;
      m_4238 = l_4238;
      term = string_replace_0_2.instance.invoke(context, m_4238, j_4238, trans.const4230);
      if(term == null)
        break Fail21674;
      y_4238 = term;
      term = z_4237;
      IStrategoTerm term11773 = term;
      Success11680:
      { 
        Fail21679:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21679;
          if(true)
            break Success11680;
        }
        term = term11773;
        IStrategoTerm term11774 = term;
        Success11681:
        { 
          Fail21680:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21680;
            if(true)
              break Success11681;
          }
          term = term11774;
          IStrategoTerm term11775 = term;
          Success11682:
          { 
            Fail21681:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21681;
              if(true)
                break Success11682;
            }
            term = term11775;
            IStrategoTerm term11776 = term;
            Success11683:
            { 
              Fail21682:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21682;
                if(true)
                  break Success11683;
              }
              term = term11776;
              IStrategoTerm n_4238 = null;
              IStrategoTerm o_4238 = null;
              IStrategoTerm q_4238 = null;
              n_4238 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21674;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21674;
              o_4238 = ((IStrategoList)term).tail();
              q_4238 = o_4238;
              term = report_failure_0_2.instance.invoke(context, q_4238, trans.const4389, n_4238);
              if(term == null)
                break Fail21674;
            }
          }
        }
      }
      t_4238 = term;
      r_4238 = trans.const4230;
      u_4238 = t_4238;
      term = string_replace_0_2.instance.invoke(context, u_4238, r_4238, trans.const4390);
      if(term == null)
        break Fail21674;
      term = (IStrategoTerm)termFactory.makeListCons(y_4238, termFactory.makeListCons(trans.const4292, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21674;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)), b_4238, c_4238);
      e_4238 = term;
      v_4238 = term;
      e_4239 = term;
      c_4239 = trans.const4358;
      f_4239 = e_4239;
      term = termFactory.makeTuple(trans.const4359, a_4238);
      term = dr_set_rule_0_3.instance.invoke(context, f_4239, c_4239, e_4238, term);
      if(term == null)
        break Fail21674;
      term = v_4238;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}