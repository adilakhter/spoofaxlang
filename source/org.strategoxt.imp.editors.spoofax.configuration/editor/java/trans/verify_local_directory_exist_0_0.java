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

@SuppressWarnings("all") public class verify_local_directory_exist_0_0 extends Strategy 
{ 
  public static verify_local_directory_exist_0_0 instance = new verify_local_directory_exist_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verify_local_directory_exist_0_0");
    Fail87611:
    { 
      IStrategoTerm p_17559 = null;
      IStrategoTerm q_17559 = null;
      p_17559 = term;
      Success47234:
      { 
        Fail87612:
        { 
          IStrategoTerm r_17559 = null;
          r_17559 = term;
          term = is_dir_exist_0_0.instance.invoke(context, p_17559);
          if(term == null)
            break Fail87612;
          term = r_17559;
          { 
            term = trans.constNil14;
            q_17559 = trans.constNil14;
            if(true)
              break Success47234;
          }
        }
        IStrategoTerm w_17559 = null;
        IStrategoTerm y_17559 = null;
        IStrategoTerm z_17559 = null;
        term = p_17559;
        IStrategoTerm term47244 = term;
        Success47235:
        { 
          Fail87613:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87613;
            if(true)
              break Success47235;
          }
          term = term47244;
          IStrategoTerm term47245 = term;
          Success47236:
          { 
            Fail87614:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87614;
              if(true)
                break Success47236;
            }
            term = term47245;
            IStrategoTerm term47246 = term;
            Success47237:
            { 
              Fail87615:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87615;
                if(true)
                  break Success47237;
              }
              term = term47246;
              IStrategoTerm term47247 = term;
              Success47238:
              { 
                Fail87616:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87616;
                  if(true)
                    break Success47238;
                }
                term = term47247;
                IStrategoTerm s_17559 = null;
                IStrategoTerm t_17559 = null;
                IStrategoTerm v_17559 = null;
                s_17559 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail87611;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail87611;
                t_17559 = ((IStrategoList)term).tail();
                v_17559 = t_17559;
                term = report_failure_0_2.instance.invoke(context, v_17559, trans.const17858, s_17559);
                if(term == null)
                  break Fail87611;
              }
            }
          }
        }
        y_17559 = term;
        w_17559 = trans.const17844;
        z_17559 = y_17559;
        term = string_replace_0_2.instance.invoke(context, z_17559, w_17559, trans.const17859);
        if(term == null)
          break Fail87611;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const17861, termFactory.makeListCons(term, (IStrategoList)trans.constCons8526));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87611;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(p_17559, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14))), (IStrategoList)trans.constNil14);
        q_17559 = term;
      }
      term = q_17559;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}