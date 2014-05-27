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

@SuppressWarnings("all") final class lifted9411 extends Strategy 
{ 
  public static final lifted9411 instance = new lifted9411();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28663:
    { 
      IStrategoTerm term10600 = term;
      Success11349:
      { 
        Fail28664:
        { 
          IStrategoTerm o_4316 = null;
          o_4316 = term;
          term = get_config_0_0.instance.invoke(context, generator.constSdfMainModuleFlag0);
          if(term == null)
            break Fail28664;
          term = o_4316;
          if(true)
            break Success11349;
        }
        term = term10600;
        IStrategoTerm p_4316 = null;
        IStrategoTerm q_4316 = null;
        p_4316 = term;
        term = find_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28663;
        term = termFactory.makeTuple(generator.constSdfMainModuleFlag0, term);
        term = set_config_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28663;
        term = p_4316;
        q_4316 = p_4316;
        IStrategoTerm term10601 = term;
        Success11350:
        { 
          Fail28665:
          { 
            term = get_sdf_main_module_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28665;
            if(true)
              break Success11350;
          }
          term = term10601;
          TermReference r_4316 = new TermReference();
          if(r_4316.value == null)
            r_4316.value = term;
          else
            if(r_4316.value != term && !r_4316.value.match(term))
              break Fail28663;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail28663;
          lifted9412 lifted94120 = new lifted9412();
          lifted94120.r_4316 = r_4316;
          term = report_failure_1_0.instance.invoke(context, term, lifted94120);
          if(term == null)
            break Fail28663;
        }
        term = q_4316;
      }
      if(true)
        return term;
    }
    return null;
  }
}