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

@SuppressWarnings("all") public class dirs_with_generated_files_0_0 extends Strategy 
{ 
  public static dirs_with_generated_files_0_0 instance = new dirs_with_generated_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("dirs_with_generated_files_0_0");
    Fail22881:
    { 
      IStrategoTerm c_4750 = null;
      IStrategoTerm g_4750 = null;
      IStrategoTerm u_4748 = null;
      IStrategoTerm w_4748 = null;
      IStrategoTerm x_4748 = null;
      IStrategoTerm d_4750 = null;
      IStrategoTerm j_4750 = null;
      IStrategoTerm e_4749 = null;
      IStrategoTerm g_4749 = null;
      IStrategoTerm h_4749 = null;
      IStrategoTerm e_4750 = null;
      IStrategoTerm m_4750 = null;
      IStrategoTerm o_4749 = null;
      IStrategoTerm q_4749 = null;
      IStrategoTerm r_4749 = null;
      IStrategoTerm y_4749 = null;
      IStrategoTerm a_4750 = null;
      IStrategoTerm b_4750 = null;
      g_4750 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      IStrategoTerm term12249 = term;
      Success12194:
      { 
        Fail22882:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22882;
          if(true)
            break Success12194;
        }
        term = term12249;
        IStrategoTerm term12250 = term;
        Success12195:
        { 
          Fail22883:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22883;
            if(true)
              break Success12195;
          }
          term = term12250;
          IStrategoTerm term12251 = term;
          Success12196:
          { 
            Fail22884:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22884;
              if(true)
                break Success12196;
            }
            term = term12251;
            IStrategoTerm term12252 = term;
            Success12197:
            { 
              Fail22885:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22885;
                if(true)
                  break Success12197;
              }
              term = term12252;
              IStrategoTerm q_4748 = null;
              IStrategoTerm r_4748 = null;
              IStrategoTerm t_4748 = null;
              q_4748 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22881;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22881;
              r_4748 = ((IStrategoList)term).tail();
              t_4748 = r_4748;
              term = report_failure_0_2.instance.invoke(context, t_4748, trans.const4531, q_4748);
              if(term == null)
                break Fail22881;
            }
          }
        }
      }
      w_4748 = term;
      u_4748 = trans.const4440;
      x_4748 = w_4748;
      term = string_replace_0_2.instance.invoke(context, x_4748, u_4748, trans.const4440);
      if(term == null)
        break Fail22881;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      c_4750 = term;
      term = g_4750;
      j_4750 = g_4750;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      IStrategoTerm term12253 = term;
      Success12198:
      { 
        Fail22886:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22886;
          if(true)
            break Success12198;
        }
        term = term12253;
        IStrategoTerm term12254 = term;
        Success12199:
        { 
          Fail22887:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22887;
            if(true)
              break Success12199;
          }
          term = term12254;
          IStrategoTerm term12255 = term;
          Success12200:
          { 
            Fail22888:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22888;
              if(true)
                break Success12200;
            }
            term = term12255;
            IStrategoTerm term12256 = term;
            Success12201:
            { 
              Fail22889:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22889;
                if(true)
                  break Success12201;
              }
              term = term12256;
              IStrategoTerm a_4749 = null;
              IStrategoTerm b_4749 = null;
              IStrategoTerm d_4749 = null;
              a_4749 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22881;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22881;
              b_4749 = ((IStrategoList)term).tail();
              d_4749 = b_4749;
              term = report_failure_0_2.instance.invoke(context, d_4749, trans.const4531, a_4749);
              if(term == null)
                break Fail22881;
            }
          }
        }
      }
      g_4749 = term;
      e_4749 = trans.const4440;
      h_4749 = g_4749;
      term = string_replace_0_2.instance.invoke(context, h_4749, e_4749, trans.const4440);
      if(term == null)
        break Fail22881;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2083);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      d_4750 = term;
      term = j_4750;
      m_4750 = j_4750;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      IStrategoTerm term12257 = term;
      Success12202:
      { 
        Fail22890:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22890;
          if(true)
            break Success12202;
        }
        term = term12257;
        IStrategoTerm term12258 = term;
        Success12203:
        { 
          Fail22891:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22891;
            if(true)
              break Success12203;
          }
          term = term12258;
          IStrategoTerm term12259 = term;
          Success12204:
          { 
            Fail22892:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22892;
              if(true)
                break Success12204;
            }
            term = term12259;
            IStrategoTerm term12260 = term;
            Success12205:
            { 
              Fail22893:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22893;
                if(true)
                  break Success12205;
              }
              term = term12260;
              IStrategoTerm k_4749 = null;
              IStrategoTerm l_4749 = null;
              IStrategoTerm n_4749 = null;
              k_4749 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22881;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22881;
              l_4749 = ((IStrategoList)term).tail();
              n_4749 = l_4749;
              term = report_failure_0_2.instance.invoke(context, n_4749, trans.const4531, k_4749);
              if(term == null)
                break Fail22881;
            }
          }
        }
      }
      q_4749 = term;
      o_4749 = trans.const4440;
      r_4749 = q_4749;
      term = string_replace_0_2.instance.invoke(context, r_4749, o_4749, trans.const4440);
      if(term == null)
        break Fail22881;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2084);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      e_4750 = term;
      term = m_4750;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      IStrategoTerm term12261 = term;
      Success12206:
      { 
        Fail22894:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22894;
          if(true)
            break Success12206;
        }
        term = term12261;
        IStrategoTerm term12262 = term;
        Success12207:
        { 
          Fail22895:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22895;
            if(true)
              break Success12207;
          }
          term = term12262;
          IStrategoTerm term12263 = term;
          Success12208:
          { 
            Fail22896:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22896;
              if(true)
                break Success12208;
            }
            term = term12263;
            IStrategoTerm term12264 = term;
            Success12209:
            { 
              Fail22897:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22897;
                if(true)
                  break Success12209;
              }
              term = term12264;
              IStrategoTerm u_4749 = null;
              IStrategoTerm v_4749 = null;
              IStrategoTerm x_4749 = null;
              u_4749 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22881;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22881;
              v_4749 = ((IStrategoList)term).tail();
              x_4749 = v_4749;
              term = report_failure_0_2.instance.invoke(context, x_4749, trans.const4531, u_4749);
              if(term == null)
                break Fail22881;
            }
          }
        }
      }
      a_4750 = term;
      y_4749 = trans.const4440;
      b_4750 = a_4750;
      term = string_replace_0_2.instance.invoke(context, b_4750, y_4749, trans.const4440);
      if(term == null)
        break Fail22881;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2085);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22881;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.annotateTerm(c_4750, checkListAnnos(termFactory, trans.constNil4)), termFactory.makeListCons(termFactory.annotateTerm(d_4750, checkListAnnos(termFactory, trans.constNil4)), termFactory.makeListCons(termFactory.annotateTerm(e_4750, checkListAnnos(termFactory, trans.constNil4)), termFactory.makeListCons(termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)), (IStrategoList)trans.constNil4))));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}