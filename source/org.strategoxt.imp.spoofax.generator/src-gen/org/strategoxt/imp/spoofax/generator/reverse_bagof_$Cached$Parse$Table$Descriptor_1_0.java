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

@SuppressWarnings("all") public class reverse_bagof_$Cached$Parse$Table$Descriptor_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Cached$Parse$Table$Descriptor_1_0 instance = new reverse_bagof_$Cached$Parse$Table$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4443)
  { 
    context.push("reverse_bagof_CachedParseTableDescriptor_1_0");
    Fail27185:
    { 
      TermReference v_4443 = new TermReference();
      if(v_4443.value == null)
        v_4443.value = term;
      else
        if(v_4443.value != term && !v_4443.value.match(term))
          break Fail27185;
      Success11035:
      { 
        Fail27186:
        { 
          IStrategoTerm z_4443 = null;
          IStrategoTerm b_4444 = null;
          IStrategoTerm c_4444 = null;
          b_4444 = term;
          z_4443 = generator.const7154;
          c_4444 = b_4444;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4444, z_4443, generator.constCons4561);
          if(term == null)
            break Fail27186;
          if(true)
            break Success11035;
        }
        term = generator.constNil7;
      }
      lifted10075 lifted100750 = new lifted10075();
      lifted100750.v_4443 = v_4443;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100750, x_4443);
      if(term == null)
        break Fail27185;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}