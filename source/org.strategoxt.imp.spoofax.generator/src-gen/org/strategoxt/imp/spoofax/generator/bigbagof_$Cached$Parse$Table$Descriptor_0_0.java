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

@SuppressWarnings("all") public class bigbagof_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static bigbagof_$Cached$Parse$Table$Descriptor_0_0 instance = new bigbagof_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CachedParseTableDescriptor_0_0");
    Fail27182:
    { 
      TermReference d_4443 = new TermReference();
      if(d_4443.value == null)
        d_4443.value = term;
      else
        if(d_4443.value != term && !d_4443.value.match(term))
          break Fail27182;
      Success11034:
      { 
        Fail27183:
        { 
          IStrategoTerm g_4443 = null;
          IStrategoTerm i_4443 = null;
          IStrategoTerm j_4443 = null;
          i_4443 = term;
          g_4443 = generator.const7154;
          j_4443 = i_4443;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4443, g_4443, generator.constCons4561);
          if(term == null)
            break Fail27183;
          if(true)
            break Success11034;
        }
        term = generator.constNil7;
      }
      lifted10073 lifted100730 = new lifted10073();
      lifted100730.d_4443 = d_4443;
      term = filter_1_0.instance.invoke(context, term, lifted100730);
      if(term == null)
        break Fail27182;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}