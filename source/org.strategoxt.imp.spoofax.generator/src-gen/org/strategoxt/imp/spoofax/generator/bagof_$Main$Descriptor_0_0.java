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

@SuppressWarnings("all") public class bagof_$Main$Descriptor_0_0 extends Strategy 
{ 
  public static bagof_$Main$Descriptor_0_0 instance = new bagof_$Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_MainDescriptor_0_0");
    Fail27239:
    { 
      TermReference n_4452 = new TermReference();
      if(n_4452.value == null)
        n_4452.value = term;
      else
        if(n_4452.value != term && !n_4452.value.match(term))
          break Fail27239;
      Success11050:
      { 
        Fail27240:
        { 
          IStrategoTerm q_4452 = null;
          IStrategoTerm s_4452 = null;
          IStrategoTerm t_4452 = null;
          s_4452 = term;
          q_4452 = generator.const7251;
          t_4452 = s_4452;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4452, q_4452, generator.constCons4561);
          if(term == null)
            break Fail27240;
          if(true)
            break Success11050;
        }
        term = generator.constNil7;
      }
      lifted10094 lifted100940 = new lifted10094();
      lifted100940.n_4452 = n_4452;
      term = filter_1_0.instance.invoke(context, term, lifted100940);
      if(term == null)
        break Fail27239;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}