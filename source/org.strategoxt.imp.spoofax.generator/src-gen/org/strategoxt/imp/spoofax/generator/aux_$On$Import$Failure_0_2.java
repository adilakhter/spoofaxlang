package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$On$Import$Failure_0_2 extends Strategy 
{ 
  public static aux_$On$Import$Failure_0_2 instance = new aux_$On$Import$Failure_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_4541, IStrategoTerm y_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aux_OnImportFailure_0_2");
    Fail27372:
    { 
      IStrategoTerm term11323 = term;
      Success11086:
      { 
        Fail27373:
        { 
          IStrategoTerm t_4475 = null;
          IStrategoTerm k_4476 = null;
          if(term.getTermType() != IStrategoTerm.STRING || !"91205".equals(((IStrategoString)term).stringValue()))
            break Fail27373;
          term = y_4541;
          t_4475 = y_4541;
          IStrategoTerm term11324 = term;
          Success11087:
          { 
            Fail27374:
            { 
              IStrategoTerm term11325 = term;
              Success11088:
              { 
                Fail27375:
                { 
                  IStrategoTerm u_4475 = null;
                  IStrategoTerm c_4476 = null;
                  u_4475 = term;
                  term = $Input$File_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail27375;
                  c_4476 = term;
                  term = has_extension_0_1.instance.invoke(context, c_4476, generator.const7127);
                  if(term == null)
                    break Fail27375;
                  term = u_4475;
                  { 
                    IStrategoTerm e_4476 = null;
                    e_4476 = term;
                    term = (IStrategoTerm)termFactory.makeListCons(generator.const7928, termFactory.makeListCons(x_4541, (IStrategoList)generator.constNil7));
                    term = fatal_err_msg_0_1.instance.invoke(context, e_4476, term);
                    if(term == null)
                      break Fail27374;
                    if(true)
                      break Success11088;
                  }
                }
                term = term11325;
              }
              if(true)
                break Success11087;
            }
            term = term11324;
            IStrategoTerm v_4475 = null;
            IStrategoTerm w_4475 = null;
            IStrategoTerm g_4476 = null;
            v_4475 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail27373;
            w_4475 = term;
            g_4476 = v_4475;
            term = report_with_failure_0_2.instance.invoke(context, g_4476, generator.const7929, w_4475);
            if(term == null)
              break Fail27373;
          }
          term = t_4475;
          IStrategoTerm term11326 = term;
          Success11089:
          { 
            Fail27376:
            { 
              term = main_descriptor_name_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail27376;
              term = termFactory.makeTuple(term, x_4541);
              term = eq_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail27376;
              { 
                if(true)
                  break Fail27373;
                if(true)
                  break Success11089;
              }
            }
            term = term11326;
          }
          k_4476 = term;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7930, termFactory.makeListCons(x_4541, (IStrategoList)generator.constNil7));
          term = warn_0_1.instance.invoke(context, k_4476, term);
          if(term == null)
            break Fail27373;
          term = generator.constModule0;
          if(true)
            break Success11086;
        }
        term = term11323;
        IStrategoTerm q_4475 = null;
        if(term.getTermType() != IStrategoTerm.STRING || !"31954".equals(((IStrategoString)term).stringValue()))
          break Fail27372;
        q_4475 = term;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7931, termFactory.makeListCons(x_4541, (IStrategoList)generator.constNil7));
        term = fatal_err_msg_0_1.instance.invoke(context, q_4475, term);
        if(term == null)
          break Fail27372;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}