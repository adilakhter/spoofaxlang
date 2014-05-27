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

@SuppressWarnings("all") public class find_package_name_0_0 extends Strategy 
{ 
  public static find_package_name_0_0 instance = new find_package_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_package_name_0_0");
    Fail26247:
    { 
      TermReference o_4320 = new TermReference();
      IStrategoTerm p_4320 = null;
      p_4320 = term;
      IStrategoTerm term10609 = term;
      Success10523:
      { 
        Fail26248:
        { 
          IStrategoTerm term10610 = term;
          Success10524:
          { 
            Fail26249:
            { 
              lifted9435 lifted94350 = new lifted9435();
              lifted94350.o_4320 = o_4320;
              term = oncetd_1_0.instance.invoke(context, term, lifted94350);
              if(term == null)
                break Fail26249;
              if(true)
                break Success10524;
            }
            term = default_package_name_0_0.instance.invoke(context, term10610);
            if(term == null)
              break Fail26248;
            if(o_4320.value == null)
              o_4320.value = term;
            else
              if(o_4320.value != term && !o_4320.value.match(term))
                break Fail26248;
          }
          if(true)
            break Success10523;
        }
        term = term10609;
        TermReference q_4320 = new TermReference();
        if(q_4320.value == null)
          q_4320.value = term;
        else
          if(q_4320.value != term && !q_4320.value.match(term))
            break Fail26247;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26247;
        lifted9436 lifted94360 = new lifted9436();
        lifted94360.q_4320 = q_4320;
        term = report_failure_1_0.instance.invoke(context, term, lifted94360);
        if(term == null)
          break Fail26247;
      }
      term = p_4320;
      if(o_4320.value == null)
        break Fail26247;
      term = o_4320.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}