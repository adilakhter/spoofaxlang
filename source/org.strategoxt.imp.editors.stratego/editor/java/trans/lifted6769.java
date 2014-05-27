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

@SuppressWarnings("all") final class lifted6769 extends Strategy 
{ 
  TermReference a_4734;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24164:
    { 
      IStrategoTerm c_4735 = null;
      IStrategoTerm e_4735 = null;
      IStrategoTerm i_4734 = null;
      IStrategoTerm k_4734 = null;
      IStrategoTerm l_4734 = null;
      IStrategoTerm s_4734 = null;
      IStrategoTerm u_4734 = null;
      IStrategoTerm v_4734 = null;
      e_4735 = term;
      if(a_4734.value == null)
        break Fail24164;
      term = a_4734.value;
      IStrategoTerm term12178 = term;
      Success12809:
      { 
        Fail24165:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24165;
          if(true)
            break Success12809;
        }
        term = term12178;
        IStrategoTerm term12179 = term;
        Success12810:
        { 
          Fail24166:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24166;
            if(true)
              break Success12810;
          }
          term = term12179;
          IStrategoTerm term12180 = term;
          Success12811:
          { 
            Fail24167:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24167;
              if(true)
                break Success12811;
            }
            term = term12180;
            IStrategoTerm term12181 = term;
            Success12812:
            { 
              Fail24168:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24168;
                if(true)
                  break Success12812;
              }
              term = term12181;
              IStrategoTerm e_4734 = null;
              IStrategoTerm f_4734 = null;
              IStrategoTerm h_4734 = null;
              e_4734 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24164;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24164;
              f_4734 = ((IStrategoList)term).tail();
              h_4734 = f_4734;
              term = report_failure_0_2.instance.invoke(context, h_4734, trans.const4478, e_4734);
              if(term == null)
                break Fail24164;
            }
          }
        }
      }
      k_4734 = term;
      i_4734 = trans.const4440;
      l_4734 = k_4734;
      term = string_replace_0_2.instance.invoke(context, l_4734, i_4734, trans.const4440);
      if(term == null)
        break Fail24164;
      c_4735 = term;
      term = e_4735;
      IStrategoTerm term12182 = term;
      Success12813:
      { 
        Fail24169:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24169;
          if(true)
            break Success12813;
        }
        term = term12182;
        IStrategoTerm term12183 = term;
        Success12814:
        { 
          Fail24170:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24170;
            if(true)
              break Success12814;
          }
          term = term12183;
          IStrategoTerm term12184 = term;
          Success12815:
          { 
            Fail24171:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24171;
              if(true)
                break Success12815;
            }
            term = term12184;
            IStrategoTerm term12185 = term;
            Success12816:
            { 
              Fail24172:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24172;
                if(true)
                  break Success12816;
              }
              term = term12185;
              IStrategoTerm o_4734 = null;
              IStrategoTerm p_4734 = null;
              IStrategoTerm r_4734 = null;
              o_4734 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24164;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24164;
              p_4734 = ((IStrategoList)term).tail();
              r_4734 = p_4734;
              term = report_failure_0_2.instance.invoke(context, r_4734, trans.const4478, o_4734);
              if(term == null)
                break Fail24164;
            }
          }
        }
      }
      u_4734 = term;
      s_4734 = trans.const4440;
      v_4734 = u_4734;
      term = string_replace_0_2.instance.invoke(context, v_4734, s_4734, trans.const4479);
      if(term == null)
        break Fail24164;
      term = (IStrategoTerm)termFactory.makeListCons(c_4735, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24164;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      if(true)
        return term;
    }
    return null;
  }
}