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

@SuppressWarnings("all") public class bagof_$Input$File_0_0 extends Strategy 
{ 
  public static bagof_$Input$File_0_0 instance = new bagof_$Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_InputFile_0_0");
    Fail27529:
    { 
      TermReference q_4500 = new TermReference();
      if(q_4500.value == null)
        q_4500.value = term;
      else
        if(q_4500.value != term && !q_4500.value.match(term))
          break Fail27529;
      Success11131:
      { 
        Fail27530:
        { 
          IStrategoTerm t_4500 = null;
          IStrategoTerm v_4500 = null;
          IStrategoTerm w_4500 = null;
          v_4500 = term;
          t_4500 = generator.const7868;
          w_4500 = v_4500;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4500, t_4500, generator.constCons4561);
          if(term == null)
            break Fail27530;
          if(true)
            break Success11131;
        }
        term = generator.constNil7;
      }
      lifted10193 lifted101930 = new lifted10193();
      lifted101930.q_4500 = q_4500;
      term = filter_1_0.instance.invoke(context, term, lifted101930);
      if(term == null)
        break Fail27529;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}