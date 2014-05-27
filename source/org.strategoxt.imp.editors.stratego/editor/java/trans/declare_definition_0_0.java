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

@SuppressWarnings("all") public class declare_definition_0_0 extends Strategy 
{ 
  public static declare_definition_0_0 instance = new declare_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_definition_0_0");
    Fail21593:
    { 
      IStrategoTerm i_4221 = null;
      IStrategoTerm j_4221 = null;
      IStrategoTerm k_4221 = null;
      IStrategoTerm q_4221 = null;
      k_4221 = term;
      q_4221 = term;
      IStrategoTerm term11688 = term;
      Success11613:
      { 
        Fail21594:
        { 
          term = signature_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21594;
          i_4221 = term;
          IStrategoTerm term11689 = term;
          Success11614:
          { 
            Fail21595:
            { 
              IStrategoTerm l_4221 = null;
              l_4221 = term;
              IStrategoTerm term11690 = term;
              Success11615:
              { 
                Fail21596:
                { 
                  term = $Declare$Cookie_0_0.instance.invoke(context, i_4221);
                  if(term == null)
                    break Fail21596;
                  j_4221 = term;
                  { 
                    if(true)
                      break Fail21595;
                    if(true)
                      break Success11615;
                  }
                }
                term = term11690;
              }
              term = l_4221;
              { 
                IStrategoTerm m_4221 = null;
                IStrategoTerm v_4221 = null;
                IStrategoTerm x_4221 = null;
                IStrategoTerm y_4221 = null;
                IStrategoTerm n_4221 = null;
                IStrategoTerm z_4221 = null;
                IStrategoTerm b_4222 = null;
                IStrategoTerm c_4222 = null;
                term = newterm_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21594;
                if(j_4221 == null)
                  j_4221 = term;
                else
                  if(j_4221 != term && !j_4221.match(term))
                    break Fail21594;
                m_4221 = term;
                x_4221 = term;
                v_4221 = trans.const4358;
                y_4221 = x_4221;
                term = termFactory.makeTuple(trans.const4359, j_4221);
                term = dr_set_rule_0_3.instance.invoke(context, y_4221, v_4221, i_4221, term);
                if(term == null)
                  break Fail21594;
                term = m_4221;
                n_4221 = m_4221;
                b_4222 = term;
                z_4221 = trans.const4360;
                c_4222 = b_4222;
                term = termFactory.makeTuple(trans.const4361, k_4221);
                term = dr_set_rule_0_3.instance.invoke(context, c_4222, z_4221, j_4221, term);
                if(term == null)
                  break Fail21594;
                term = n_4221;
                if(true)
                  break Success11614;
              }
            }
            term = term11689;
          }
          if(true)
            break Success11613;
        }
        term = term11688;
        IStrategoTerm o_4221 = null;
        IStrategoTerm p_4221 = null;
        IStrategoTerm e_4222 = null;
        o_4221 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21593;
        p_4221 = term;
        e_4222 = o_4221;
        term = report_with_failure_0_2.instance.invoke(context, e_4222, trans.const4362, p_4221);
        if(term == null)
          break Fail21593;
      }
      term = q_4221;
      if(j_4221 == null)
        break Fail21593;
      term = j_4221;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}