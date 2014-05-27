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

@SuppressWarnings("all") final class lifted6796 extends Strategy 
{ 
  TermReference s_4743;

  TermReference r_4743;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24121:
    { 
      IStrategoTerm t_4745 = null;
      IStrategoTerm u_4745 = null;
      IStrategoTerm v_4745 = null;
      IStrategoTerm x_4745 = null;
      IStrategoTerm w_4744 = null;
      IStrategoTerm y_4744 = null;
      IStrategoTerm z_4744 = null;
      IStrategoTerm e_4745 = null;
      IStrategoTerm g_4745 = null;
      IStrategoTerm h_4745 = null;
      u_4745 = term;
      x_4745 = term;
      IStrategoTerm term12228 = term;
      Success12781:
      { 
        Fail24122:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24122;
          if(true)
            break Success12781;
        }
        term = term12228;
        IStrategoTerm term12229 = term;
        Success12782:
        { 
          Fail24123:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24123;
            if(true)
              break Success12782;
          }
          term = term12229;
          IStrategoTerm term12230 = term;
          Success12783:
          { 
            Fail24124:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24124;
              if(true)
                break Success12783;
            }
            term = term12230;
            IStrategoTerm term12231 = term;
            Success12784:
            { 
              Fail24125:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24125;
                if(true)
                  break Success12784;
              }
              term = term12231;
              IStrategoTerm s_4744 = null;
              IStrategoTerm t_4744 = null;
              IStrategoTerm v_4744 = null;
              s_4744 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24121;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24121;
              t_4744 = ((IStrategoList)term).tail();
              v_4744 = t_4744;
              term = report_failure_0_2.instance.invoke(context, v_4744, trans.const4500, s_4744);
              if(term == null)
                break Fail24121;
            }
          }
        }
      }
      y_4744 = term;
      w_4744 = trans.const4440;
      z_4744 = y_4744;
      term = string_replace_0_2.instance.invoke(context, z_4744, w_4744, trans.const4440);
      if(term == null)
        break Fail24121;
      v_4745 = term;
      term = x_4745;
      if(s_4743.value == null)
        break Fail24121;
      term = s_4743.value;
      IStrategoTerm term12232 = term;
      Success12785:
      { 
        Fail24126:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24126;
          if(true)
            break Success12785;
        }
        term = term12232;
        IStrategoTerm term12233 = term;
        Success12786:
        { 
          Fail24127:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24127;
            if(true)
              break Success12786;
          }
          term = term12233;
          IStrategoTerm term12234 = term;
          Success12787:
          { 
            Fail24128:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24128;
              if(true)
                break Success12787;
            }
            term = term12234;
            IStrategoTerm term12235 = term;
            Success12788:
            { 
              Fail24129:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24129;
                if(true)
                  break Success12788;
              }
              term = term12235;
              IStrategoTerm a_4745 = null;
              IStrategoTerm b_4745 = null;
              IStrategoTerm d_4745 = null;
              a_4745 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24121;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24121;
              b_4745 = ((IStrategoList)term).tail();
              d_4745 = b_4745;
              term = report_failure_0_2.instance.invoke(context, d_4745, trans.const4500, a_4745);
              if(term == null)
                break Fail24121;
            }
          }
        }
      }
      g_4745 = term;
      e_4745 = trans.const4440;
      h_4745 = g_4745;
      term = string_replace_0_2.instance.invoke(context, h_4745, e_4745, trans.const4501);
      if(term == null)
        break Fail24121;
      term = (IStrategoTerm)termFactory.makeListCons(v_4745, termFactory.makeListCons(trans.const4502, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24121;
      t_4745 = term;
      term = u_4745;
      if(r_4743.value == null)
        break Fail24121;
      term = termFactory.annotateTerm(t_4745, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(r_4743.value, (IStrategoList)trans.constNil4)));
      if(true)
        return term;
    }
    return null;
  }
}