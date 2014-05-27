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

@SuppressWarnings("all") public class reverse_bagof_$Reset$Files_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Reset$Files_1_0 instance = new reverse_bagof_$Reset$Files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4522)
  { 
    context.push("reverse_bagof_ResetFiles_1_0");
    Fail27657:
    { 
      TermReference o_4522 = new TermReference();
      TermReference p_4522 = new TermReference();
      if(p_4522.value == null)
        p_4522.value = term;
      else
        if(p_4522.value != term && !p_4522.value.match(term))
          break Fail27657;
      if(o_4522.value == null)
        o_4522.value = term;
      else
        if(o_4522.value != term && !o_4522.value.match(term))
          break Fail27657;
      Success11165:
      { 
        Fail27658:
        { 
          IStrategoTerm t_4522 = null;
          IStrategoTerm v_4522 = null;
          IStrategoTerm w_4522 = null;
          v_4522 = term;
          t_4522 = generator.const7888;
          w_4522 = v_4522;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4522, t_4522, generator.constCons4561);
          if(term == null)
            break Fail27658;
          if(true)
            break Success11165;
        }
        term = generator.constNil7;
      }
      lifted10237 lifted102370 = new lifted10237();
      lifted102370.o_4522 = o_4522;
      lifted102370.p_4522 = p_4522;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102370, r_4522);
      if(term == null)
        break Fail27657;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}