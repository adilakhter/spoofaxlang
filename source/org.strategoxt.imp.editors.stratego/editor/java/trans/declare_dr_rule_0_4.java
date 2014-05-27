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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_4791, IStrategoTerm s_4791, IStrategoTerm t_4791, IStrategoTerm u_4791)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_dr_rule_0_4");
    Fail23150:
    { 
      IStrategoTerm v_4791 = null;
      IStrategoTerm w_4791 = null;
      IStrategoTerm q_4792 = null;
      IStrategoTerm b_4792 = null;
      IStrategoTerm d_4792 = null;
      IStrategoTerm e_4792 = null;
      IStrategoTerm j_4792 = null;
      IStrategoTerm l_4792 = null;
      IStrategoTerm m_4792 = null;
      IStrategoTerm n_4792 = null;
      IStrategoTerm u_4792 = null;
      IStrategoTerm w_4792 = null;
      IStrategoTerm x_4792 = null;
      v_4791 = term;
      term = v_4791;
      IStrategoTerm term12478 = term;
      Success12385:
      { 
        Fail23151:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23151;
          if(true)
            break Success12385;
        }
        term = term12478;
        IStrategoTerm term12479 = term;
        Success12386:
        { 
          Fail23152:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23152;
            if(true)
              break Success12386;
          }
          term = term12479;
          IStrategoTerm term12480 = term;
          Success12387:
          { 
            Fail23153:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23153;
              if(true)
                break Success12387;
            }
            term = term12480;
            IStrategoTerm term12481 = term;
            Success12388:
            { 
              Fail23154:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23154;
                if(true)
                  break Success12388;
              }
              term = term12481;
              IStrategoTerm x_4791 = null;
              IStrategoTerm y_4791 = null;
              IStrategoTerm a_4792 = null;
              x_4791 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23150;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail23150;
              y_4791 = ((IStrategoList)term).tail();
              a_4792 = y_4791;
              term = report_failure_0_2.instance.invoke(context, a_4792, trans.const4599, x_4791);
              if(term == null)
                break Fail23150;
            }
          }
        }
      }
      d_4792 = term;
      b_4792 = trans.const4440;
      e_4792 = d_4792;
      term = string_replace_0_2.instance.invoke(context, e_4792, b_4792, trans.const4440);
      if(term == null)
        break Fail23150;
      q_4792 = term;
      term = r_4791;
      IStrategoTerm term12482 = term;
      Success12389:
      { 
        Fail23155:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23155;
          if(true)
            break Success12389;
        }
        term = term12482;
        IStrategoTerm term12483 = term;
        Success12390:
        { 
          Fail23156:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23156;
            if(true)
              break Success12390;
          }
          term = term12483;
          IStrategoTerm term12484 = term;
          Success12391:
          { 
            Fail23157:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23157;
              if(true)
                break Success12391;
            }
            term = term12484;
            IStrategoTerm term12485 = term;
            Success12392:
            { 
              Fail23158:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23158;
                if(true)
                  break Success12392;
              }
              term = term12485;
              IStrategoTerm f_4792 = null;
              IStrategoTerm g_4792 = null;
              IStrategoTerm i_4792 = null;
              f_4792 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23150;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail23150;
              g_4792 = ((IStrategoList)term).tail();
              i_4792 = g_4792;
              term = report_failure_0_2.instance.invoke(context, i_4792, trans.const4599, f_4792);
              if(term == null)
                break Fail23150;
            }
          }
        }
      }
      l_4792 = term;
      j_4792 = trans.const4440;
      m_4792 = l_4792;
      term = string_replace_0_2.instance.invoke(context, m_4792, j_4792, trans.const4600);
      if(term == null)
        break Fail23150;
      term = (IStrategoTerm)termFactory.makeListCons(q_4792, termFactory.makeListCons(trans.const4502, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23150;
      term = termFactory.makeTuple(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)), t_4791, u_4791);
      w_4791 = term;
      n_4792 = term;
      w_4792 = term;
      u_4792 = trans.const4568;
      x_4792 = w_4792;
      term = termFactory.makeTuple(trans.const4569, s_4791);
      term = dr_set_rule_0_3.instance.invoke(context, x_4792, u_4792, w_4791, term);
      if(term == null)
        break Fail23150;
      term = n_4792;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}