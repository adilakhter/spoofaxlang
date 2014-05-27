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

@SuppressWarnings("all") final class lifted9415 extends Strategy 
{ 
  public static final lifted9415 instance = new lifted9415();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28660:
    { 
      IStrategoTerm term10603 = term;
      Success11348:
      { 
        Fail28661:
        { 
          IStrategoTerm s_4316 = null;
          s_4316 = term;
          term = $Start$Symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28661;
          term = s_4316;
          if(true)
            break Success11348;
        }
        term = term10603;
        IStrategoTerm t_4316 = null;
        IStrategoTerm u_4316 = null;
        IStrategoTerm c_4318 = null;
        IStrategoTerm d_4318 = null;
        IStrategoTerm f_4318 = null;
        IStrategoTerm g_4318 = null;
        IStrategoTerm h_4318 = null;
        t_4316 = term;
        term = find_start_symbol_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28660;
        term = parameterized_sort_to_rtg_sort_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28660;
        u_4316 = term;
        f_4318 = term;
        c_4318 = generator.const7443;
        g_4318 = f_4318;
        d_4318 = generator.constCons4561;
        h_4318 = g_4318;
        term = termFactory.makeTuple(generator.const7444, u_4316);
        term = dr_set_rule_0_3.instance.invoke(context, h_4318, c_4318, d_4318, term);
        if(term == null)
          break Fail28660;
        term = t_4316;
      }
      if(true)
        return term;
    }
    return null;
  }
}