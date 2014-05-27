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
    Fail23123:
    { 
      IStrategoTerm y_4785 = null;
      IStrategoTerm r_4786 = null;
      IStrategoTerm u_4786 = null;
      IStrategoTerm f_4786 = null;
      IStrategoTerm h_4786 = null;
      IStrategoTerm i_4786 = null;
      IStrategoTerm n_4786 = null;
      IStrategoTerm p_4786 = null;
      IStrategoTerm q_4786 = null;
      y_4785 = term;
      r_4786 = term;
      term = is_relpath_0_0.instance.invoke(context, y_4785);
      if(term == null)
        break Fail23123;
      term = r_4786;
      term = $Project$Dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23123;
      IStrategoTerm term12450 = term;
      Success12365:
      { 
        Fail23124:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23124;
          if(true)
            break Success12365;
        }
        term = term12450;
        IStrategoTerm term12451 = term;
        Success12366:
        { 
          Fail23125:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23125;
            if(true)
              break Success12366;
          }
          term = term12451;
          IStrategoTerm term12452 = term;
          Success12367:
          { 
            Fail23126:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23126;
              if(true)
                break Success12367;
            }
            term = term12452;
            IStrategoTerm term12453 = term;
            Success12368:
            { 
              Fail23127:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23127;
                if(true)
                  break Success12368;
              }
              term = term12453;
              IStrategoTerm b_4786 = null;
              IStrategoTerm c_4786 = null;
              IStrategoTerm e_4786 = null;
              b_4786 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23123;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail23123;
              c_4786 = ((IStrategoList)term).tail();
              e_4786 = c_4786;
              term = report_failure_0_2.instance.invoke(context, e_4786, trans.const4592, b_4786);
              if(term == null)
                break Fail23123;
            }
          }
        }
      }
      h_4786 = term;
      f_4786 = trans.const4440;
      i_4786 = h_4786;
      term = string_replace_0_2.instance.invoke(context, i_4786, f_4786, trans.const4440);
      if(term == null)
        break Fail23123;
      u_4786 = term;
      term = y_4785;
      IStrategoTerm term12454 = term;
      Success12369:
      { 
        Fail23128:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23128;
          if(true)
            break Success12369;
        }
        term = term12454;
        IStrategoTerm term12455 = term;
        Success12370:
        { 
          Fail23129:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23129;
            if(true)
              break Success12370;
          }
          term = term12455;
          IStrategoTerm term12456 = term;
          Success12371:
          { 
            Fail23130:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23130;
              if(true)
                break Success12371;
            }
            term = term12456;
            IStrategoTerm term12457 = term;
            Success12372:
            { 
              Fail23131:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23131;
                if(true)
                  break Success12372;
              }
              term = term12457;
              IStrategoTerm j_4786 = null;
              IStrategoTerm k_4786 = null;
              IStrategoTerm m_4786 = null;
              j_4786 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23123;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail23123;
              k_4786 = ((IStrategoList)term).tail();
              m_4786 = k_4786;
              term = report_failure_0_2.instance.invoke(context, m_4786, trans.const4592, j_4786);
              if(term == null)
                break Fail23123;
            }
          }
        }
      }
      p_4786 = term;
      n_4786 = trans.const4440;
      q_4786 = p_4786;
      term = string_replace_0_2.instance.invoke(context, q_4786, n_4786, trans.const4555);
      if(term == null)
        break Fail23123;
      term = (IStrategoTerm)termFactory.makeListCons(u_4786, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23123;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}