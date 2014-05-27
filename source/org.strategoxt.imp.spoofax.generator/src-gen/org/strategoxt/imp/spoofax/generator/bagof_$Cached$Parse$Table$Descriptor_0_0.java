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

@SuppressWarnings("all") public class bagof_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static bagof_$Cached$Parse$Table$Descriptor_0_0 instance = new bagof_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CachedParseTableDescriptor_0_0");
    Fail27187:
    { 
      TermReference d_4444 = new TermReference();
      if(d_4444.value == null)
        d_4444.value = term;
      else
        if(d_4444.value != term && !d_4444.value.match(term))
          break Fail27187;
      Success11036:
      { 
        Fail27188:
        { 
          IStrategoTerm g_4444 = null;
          IStrategoTerm i_4444 = null;
          IStrategoTerm j_4444 = null;
          i_4444 = term;
          g_4444 = generator.const7154;
          j_4444 = i_4444;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4444, g_4444, generator.constCons4561);
          if(term == null)
            break Fail27188;
          if(true)
            break Success11036;
        }
        term = generator.constNil7;
      }
      lifted10076 lifted100760 = new lifted10076();
      lifted100760.d_4444 = d_4444;
      term = filter_1_0.instance.invoke(context, term, lifted100760);
      if(term == null)
        break Fail27187;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}