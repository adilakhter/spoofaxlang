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

@SuppressWarnings("all") public class bagof_$Imported$From_0_0 extends Strategy 
{ 
  public static bagof_$Imported$From_0_0 instance = new bagof_$Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ImportedFrom_0_0");
    Fail27083:
    { 
      TermReference g_4427 = new TermReference();
      TermReference h_4427 = new TermReference();
      if(h_4427.value == null)
        h_4427.value = term;
      else
        if(h_4427.value != term && !h_4427.value.match(term))
          break Fail27083;
      if(g_4427.value == null)
        g_4427.value = term;
      else
        if(g_4427.value != term && !g_4427.value.match(term))
          break Fail27083;
      Success11008:
      { 
        Fail27084:
        { 
          IStrategoTerm l_4427 = null;
          l_4427 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4427, generator.const7027, h_4427.value);
          if(term == null)
            break Fail27084;
          if(true)
            break Success11008;
        }
        term = generator.constNil7;
      }
      lifted10040 lifted100400 = new lifted10040();
      lifted100400.g_4427 = g_4427;
      lifted100400.h_4427 = h_4427;
      term = filter_1_0.instance.invoke(context, term, lifted100400);
      if(term == null)
        break Fail27083;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}