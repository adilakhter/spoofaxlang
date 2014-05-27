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

@SuppressWarnings("all") final class lifted6773 extends Strategy 
{ 
  public static final lifted6773 instance = new lifted6773();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24151:
    { 
      IStrategoTerm m_4736 = null;
      IStrategoTerm o_4736 = null;
      IStrategoTerm w_4735 = null;
      IStrategoTerm y_4735 = null;
      IStrategoTerm z_4735 = null;
      IStrategoTerm g_4736 = null;
      IStrategoTerm i_4736 = null;
      IStrategoTerm j_4736 = null;
      o_4736 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24151;
      IStrategoTerm term12188 = term;
      Success12800:
      { 
        Fail24152:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24152;
          if(true)
            break Success12800;
        }
        term = term12188;
        IStrategoTerm term12189 = term;
        Success12801:
        { 
          Fail24153:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24153;
            if(true)
              break Success12801;
          }
          term = term12189;
          IStrategoTerm term12190 = term;
          Success12802:
          { 
            Fail24154:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24154;
              if(true)
                break Success12802;
            }
            term = term12190;
            IStrategoTerm term12191 = term;
            Success12803:
            { 
              Fail24155:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24155;
                if(true)
                  break Success12803;
              }
              term = term12191;
              IStrategoTerm s_4735 = null;
              IStrategoTerm t_4735 = null;
              IStrategoTerm v_4735 = null;
              s_4735 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24151;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24151;
              t_4735 = ((IStrategoList)term).tail();
              v_4735 = t_4735;
              term = report_failure_0_2.instance.invoke(context, v_4735, trans.const4481, s_4735);
              if(term == null)
                break Fail24151;
            }
          }
        }
      }
      y_4735 = term;
      w_4735 = trans.const4440;
      z_4735 = y_4735;
      term = string_replace_0_2.instance.invoke(context, z_4735, w_4735, trans.const4440);
      if(term == null)
        break Fail24151;
      m_4736 = term;
      term = o_4736;
      IStrategoTerm term12192 = term;
      Success12804:
      { 
        Fail24156:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24156;
          if(true)
            break Success12804;
        }
        term = term12192;
        IStrategoTerm term12193 = term;
        Success12805:
        { 
          Fail24157:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail24157;
            if(true)
              break Success12805;
          }
          term = term12193;
          IStrategoTerm term12194 = term;
          Success12806:
          { 
            Fail24158:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail24158;
              if(true)
                break Success12806;
            }
            term = term12194;
            IStrategoTerm term12195 = term;
            Success12807:
            { 
              Fail24159:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail24159;
                if(true)
                  break Success12807;
              }
              term = term12195;
              IStrategoTerm c_4736 = null;
              IStrategoTerm d_4736 = null;
              IStrategoTerm f_4736 = null;
              c_4736 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail24151;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail24151;
              d_4736 = ((IStrategoList)term).tail();
              f_4736 = d_4736;
              term = report_failure_0_2.instance.invoke(context, f_4736, trans.const4481, c_4736);
              if(term == null)
                break Fail24151;
            }
          }
        }
      }
      i_4736 = term;
      g_4736 = trans.const4440;
      j_4736 = i_4736;
      term = string_replace_0_2.instance.invoke(context, j_4736, g_4736, trans.const4482);
      if(term == null)
        break Fail24151;
      term = (IStrategoTerm)termFactory.makeListCons(m_4736, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24151;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      if(true)
        return term;
    }
    return null;
  }
}