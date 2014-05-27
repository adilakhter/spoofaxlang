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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4165)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("precondition_warning_1_0");
    Fail21261:
    { 
      IStrategoTerm p_4165 = null;
      IStrategoTerm q_4165 = null;
      IStrategoTerm v_4165 = null;
      IStrategoTerm x_4165 = null;
      IStrategoTerm y_4165 = null;
      p_4165 = term;
      term = origin_term_0_0.instance.invoke(context, p_4165);
      if(term == null)
        break Fail21261;
      IStrategoTerm term11429 = term;
      Success11428:
      { 
        Fail21262:
        { 
          term = in_selected_fragment_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21262;
          { 
            if(true)
              break Fail21261;
            if(true)
              break Success11428;
          }
        }
        term = term11429;
      }
      q_4165 = term;
      term = z_4165.invoke(context, p_4165);
      if(term == null)
        break Fail21261;
      IStrategoTerm term11430 = term;
      Success11429:
      { 
        Fail21263:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21263;
          if(true)
            break Success11429;
        }
        term = term11430;
        IStrategoTerm term11431 = term;
        Success11430:
        { 
          Fail21264:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21264;
            if(true)
              break Success11430;
          }
          term = term11431;
          IStrategoTerm term11432 = term;
          Success11431:
          { 
            Fail21265:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21265;
              if(true)
                break Success11431;
            }
            term = term11432;
            IStrategoTerm term11433 = term;
            Success11432:
            { 
              Fail21266:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21266;
                if(true)
                  break Success11432;
              }
              term = term11433;
              IStrategoTerm r_4165 = null;
              IStrategoTerm s_4165 = null;
              IStrategoTerm u_4165 = null;
              r_4165 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21261;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21261;
              s_4165 = ((IStrategoList)term).tail();
              u_4165 = s_4165;
              term = report_failure_0_2.instance.invoke(context, u_4165, trans.const4229, r_4165);
              if(term == null)
                break Fail21261;
            }
          }
        }
      }
      x_4165 = term;
      v_4165 = trans.const4230;
      y_4165 = x_4165;
      term = string_replace_0_2.instance.invoke(context, y_4165, v_4165, trans.const4231);
      if(term == null)
        break Fail21261;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4232, termFactory.makeListCons(term, (IStrategoList)trans.constNil3));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21261;
      term = termFactory.makeTuple(q_4165, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}