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

@SuppressWarnings("all") public class bigbagof_$Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Reserved$Class$Name_0_0 instance = new bigbagof_$Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsReservedClassName_0_0");
    Fail27208:
    { 
      TermReference k_4447 = new TermReference();
      TermReference l_4447 = new TermReference();
      if(l_4447.value == null)
        l_4447.value = term;
      else
        if(l_4447.value != term && !l_4447.value.match(term))
          break Fail27208;
      if(k_4447.value == null)
        k_4447.value = term;
      else
        if(k_4447.value != term && !k_4447.value.match(term))
          break Fail27208;
      Success11041:
      { 
        Fail27209:
        { 
          IStrategoTerm p_4447 = null;
          p_4447 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4447, generator.const7167, l_4447.value);
          if(term == null)
            break Fail27209;
          if(true)
            break Success11041;
        }
        term = generator.constNil7;
      }
      lifted10082 lifted100820 = new lifted10082();
      lifted100820.k_4447 = k_4447;
      lifted100820.l_4447 = l_4447;
      term = filter_1_0.instance.invoke(context, term, lifted100820);
      if(term == null)
        break Fail27208;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}