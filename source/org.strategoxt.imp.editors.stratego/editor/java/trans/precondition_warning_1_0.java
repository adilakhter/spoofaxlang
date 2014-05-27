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

@SuppressWarnings("all") public class precondition_warning_1_0 extends Strategy 
{ 
  public static precondition_warning_1_0 instance = new precondition_warning_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4719)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("precondition_warning_1_0");
    Fail22737:
    { 
      IStrategoTerm h_4719 = null;
      IStrategoTerm i_4719 = null;
      IStrategoTerm n_4719 = null;
      IStrategoTerm p_4719 = null;
      IStrategoTerm q_4719 = null;
      h_4719 = term;
      term = origin_term_0_0.instance.invoke(context, h_4719);
      if(term == null)
        break Fail22737;
      IStrategoTerm term12138 = term;
      Success12137:
      { 
        Fail22738:
        { 
          term = in_selected_fragment_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22738;
          { 
            if(true)
              break Fail22737;
            if(true)
              break Success12137;
          }
        }
        term = term12138;
      }
      i_4719 = term;
      term = r_4719.invoke(context, h_4719);
      if(term == null)
        break Fail22737;
      IStrategoTerm term12139 = term;
      Success12138:
      { 
        Fail22739:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22739;
          if(true)
            break Success12138;
        }
        term = term12139;
        IStrategoTerm term12140 = term;
        Success12139:
        { 
          Fail22740:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22740;
            if(true)
              break Success12139;
          }
          term = term12140;
          IStrategoTerm term12141 = term;
          Success12140:
          { 
            Fail22741:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22741;
              if(true)
                break Success12140;
            }
            term = term12141;
            IStrategoTerm term12142 = term;
            Success12141:
            { 
              Fail22742:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22742;
                if(true)
                  break Success12141;
              }
              term = term12142;
              IStrategoTerm j_4719 = null;
              IStrategoTerm k_4719 = null;
              IStrategoTerm m_4719 = null;
              j_4719 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22737;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22737;
              k_4719 = ((IStrategoList)term).tail();
              m_4719 = k_4719;
              term = report_failure_0_2.instance.invoke(context, m_4719, trans.const4439, j_4719);
              if(term == null)
                break Fail22737;
            }
          }
        }
      }
      p_4719 = term;
      n_4719 = trans.const4440;
      q_4719 = p_4719;
      term = string_replace_0_2.instance.invoke(context, q_4719, n_4719, trans.const4441);
      if(term == null)
        break Fail22737;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4442, termFactory.makeListCons(term, (IStrategoList)trans.constNil4));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22737;
      term = termFactory.makeTuple(i_4719, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}