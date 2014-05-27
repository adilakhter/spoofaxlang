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

@SuppressWarnings("all") public class is_spx_config_exist_0_0 extends Strategy 
{ 
  public static is_spx_config_exist_0_0 instance = new is_spx_config_exist_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_spx_config_exist_0_0");
    Fail22824:
    { 
      IStrategoTerm x_4617 = null;
      IStrategoTerm y_4617 = null;
      IStrategoTerm f_4618 = null;
      IStrategoTerm h_4618 = null;
      IStrategoTerm i_4618 = null;
      IStrategoTerm j_4618 = null;
      IStrategoTerm q_4618 = null;
      IStrategoTerm s_4618 = null;
      IStrategoTerm t_4618 = null;
      IStrategoTerm d_4619 = null;
      IStrategoTerm e_4619 = null;
      IStrategoTerm g_4619 = null;
      IStrategoTerm h_4619 = null;
      IStrategoTerm i_4619 = null;
      y_4617 = term;
      IStrategoTerm term12173 = term;
      Success12164:
      { 
        Fail22825:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22825;
          if(true)
            break Success12164;
        }
        term = term12173;
        IStrategoTerm term12174 = term;
        Success12165:
        { 
          Fail22826:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22826;
            if(true)
              break Success12165;
          }
          term = term12174;
          IStrategoTerm term12175 = term;
          Success12166:
          { 
            Fail22827:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22827;
              if(true)
                break Success12166;
            }
            term = term12175;
            IStrategoTerm term12176 = term;
            Success12167:
            { 
              Fail22828:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22828;
                if(true)
                  break Success12167;
              }
              term = term12176;
              IStrategoTerm b_4618 = null;
              IStrategoTerm c_4618 = null;
              IStrategoTerm e_4618 = null;
              b_4618 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22824;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22824;
              c_4618 = ((IStrategoList)term).tail();
              e_4618 = c_4618;
              term = report_failure_0_2.instance.invoke(context, e_4618, trans.const4481, b_4618);
              if(term == null)
                break Fail22824;
            }
          }
        }
      }
      h_4618 = term;
      f_4618 = trans.const4457;
      i_4618 = h_4618;
      term = string_replace_0_2.instance.invoke(context, i_4618, f_4618, trans.const4457);
      if(term == null)
        break Fail22824;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2044);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22824;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      term = file_exists_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22824;
      term = y_4617;
      j_4618 = y_4617;
      IStrategoTerm term12177 = term;
      Success12168:
      { 
        Fail22829:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22829;
          if(true)
            break Success12168;
        }
        term = term12177;
        IStrategoTerm term12178 = term;
        Success12169:
        { 
          Fail22830:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22830;
            if(true)
              break Success12169;
          }
          term = term12178;
          IStrategoTerm term12179 = term;
          Success12170:
          { 
            Fail22831:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22831;
              if(true)
                break Success12170;
            }
            term = term12179;
            IStrategoTerm term12180 = term;
            Success12171:
            { 
              Fail22832:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22832;
                if(true)
                  break Success12171;
              }
              term = term12180;
              IStrategoTerm m_4618 = null;
              IStrategoTerm n_4618 = null;
              IStrategoTerm p_4618 = null;
              m_4618 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22824;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22824;
              n_4618 = ((IStrategoList)term).tail();
              p_4618 = n_4618;
              term = report_failure_0_2.instance.invoke(context, p_4618, trans.const4481, m_4618);
              if(term == null)
                break Fail22824;
            }
          }
        }
      }
      s_4618 = term;
      q_4618 = trans.const4457;
      t_4618 = s_4618;
      term = string_replace_0_2.instance.invoke(context, t_4618, q_4618, trans.const4457);
      if(term == null)
        break Fail22824;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2044);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22824;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      x_4617 = term;
      g_4619 = term;
      d_4619 = trans.const4482;
      h_4619 = g_4619;
      e_4619 = trans.constCons2047;
      i_4619 = h_4619;
      term = termFactory.makeTuple(trans.const4483, x_4617);
      term = dr_add_rule_0_3.instance.invoke(context, i_4619, d_4619, e_4619, term);
      if(term == null)
        break Fail22824;
      term = j_4618;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}