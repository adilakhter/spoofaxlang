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

@SuppressWarnings("all") final class lifted6865 extends Strategy 
{ 
  TermReference y_4786;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24038:
    { 
      IStrategoTerm b_4787 = null;
      IStrategoTerm b_4788 = null;
      IStrategoTerm d_4788 = null;
      IStrategoTerm g_4787 = null;
      IStrategoTerm i_4787 = null;
      IStrategoTerm j_4787 = null;
      IStrategoTerm o_4787 = null;
      IStrategoTerm q_4787 = null;
      IStrategoTerm r_4787 = null;
      b_4787 = term;
      d_4788 = term;
      term = b_4787;
      IStrategoTerm term12459 = term;
      Success12739:
      { 
        Fail24039:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24039;
          if(true)
            break Success12739;
        }
        term = term12459;
        IStrategoTerm term12460 = term;
        Success12740:
        { 
          Fail24040:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24040;
            if(true)
              break Success12740;
          }
          term = term12460;
          IStrategoTerm term12461 = term;
          Success12741:
          { 
            Fail24041:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24041;
              if(true)
                break Success12741;
            }
            term = term12461;
            IStrategoTerm term12462 = term;
            Success12742:
            { 
              Fail24042:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24042;
                if(true)
                  break Success12742;
              }
              term = term12462;
              IStrategoTerm c_4787 = null;
              IStrategoTerm d_4787 = null;
              IStrategoTerm f_4787 = null;
              c_4787 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24038;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24038;
              d_4787 = ((IStrategoList)term).tail();
              f_4787 = d_4787;
              term = report_failure_0_2.instance.invoke(context, f_4787, trans.const4593, c_4787);
              if(term == null)
                break Fail24038;
            }
          }
        }
      }
      i_4787 = term;
      g_4787 = trans.const4440;
      j_4787 = i_4787;
      term = string_replace_0_2.instance.invoke(context, j_4787, g_4787, trans.const4440);
      if(term == null)
        break Fail24038;
      b_4788 = term;
      term = d_4788;
      if(y_4786.value == null)
        break Fail24038;
      term = y_4786.value;
      IStrategoTerm term12463 = term;
      Success12743:
      { 
        Fail24043:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24043;
          if(true)
            break Success12743;
        }
        term = term12463;
        IStrategoTerm term12464 = term;
        Success12744:
        { 
          Fail24044:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24044;
            if(true)
              break Success12744;
          }
          term = term12464;
          IStrategoTerm term12465 = term;
          Success12745:
          { 
            Fail24045:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24045;
              if(true)
                break Success12745;
            }
            term = term12465;
            IStrategoTerm term12466 = term;
            Success12746:
            { 
              Fail24046:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24046;
                if(true)
                  break Success12746;
              }
              term = term12466;
              IStrategoTerm k_4787 = null;
              IStrategoTerm l_4787 = null;
              IStrategoTerm n_4787 = null;
              k_4787 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24038;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24038;
              l_4787 = ((IStrategoList)term).tail();
              n_4787 = l_4787;
              term = report_failure_0_2.instance.invoke(context, n_4787, trans.const4593, k_4787);
              if(term == null)
                break Fail24038;
            }
          }
        }
      }
      q_4787 = term;
      o_4787 = trans.const4440;
      r_4787 = q_4787;
      term = string_replace_0_2.instance.invoke(context, r_4787, o_4787, trans.const4501);
      if(term == null)
        break Fail24038;
      term = (IStrategoTerm)termFactory.makeListCons(b_4788, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24038;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      term = file_exists_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24038;
      if(true)
        return term;
    }
    return null;
  }
}