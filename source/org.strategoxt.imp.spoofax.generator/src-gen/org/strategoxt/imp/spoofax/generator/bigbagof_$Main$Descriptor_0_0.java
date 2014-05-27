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

@SuppressWarnings("all") public class bigbagof_$Main$Descriptor_0_0 extends Strategy 
{ 
  public static bigbagof_$Main$Descriptor_0_0 instance = new bigbagof_$Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_MainDescriptor_0_0");
    Fail27234:
    { 
      TermReference n_4451 = new TermReference();
      if(n_4451.value == null)
        n_4451.value = term;
      else
        if(n_4451.value != term && !n_4451.value.match(term))
          break Fail27234;
      Success11048:
      { 
        Fail27235:
        { 
          IStrategoTerm q_4451 = null;
          IStrategoTerm s_4451 = null;
          IStrategoTerm t_4451 = null;
          s_4451 = term;
          q_4451 = generator.const7251;
          t_4451 = s_4451;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4451, q_4451, generator.constCons4561);
          if(term == null)
            break Fail27235;
          if(true)
            break Success11048;
        }
        term = generator.constNil7;
      }
      lifted10091 lifted100910 = new lifted10091();
      lifted100910.n_4451 = n_4451;
      term = filter_1_0.instance.invoke(context, term, lifted100910);
      if(term == null)
        break Fail27234;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}