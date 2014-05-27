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

@SuppressWarnings("all") public class reverse_bagof_$Jar$Locations_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Jar$Locations_1_0 instance = new reverse_bagof_$Jar$Locations_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4513)
  { 
    context.push("reverse_bagof_JarLocations_1_0");
    Fail27605:
    { 
      TermReference d_4513 = new TermReference();
      if(d_4513.value == null)
        d_4513.value = term;
      else
        if(d_4513.value != term && !d_4513.value.match(term))
          break Fail27605;
      Success11151:
      { 
        Fail27606:
        { 
          IStrategoTerm h_4513 = null;
          IStrategoTerm j_4513 = null;
          IStrategoTerm k_4513 = null;
          j_4513 = term;
          h_4513 = generator.const7880;
          k_4513 = j_4513;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4513, h_4513, generator.constCons4561);
          if(term == null)
            break Fail27606;
          if(true)
            break Success11151;
        }
        term = generator.constNil7;
      }
      lifted10219 lifted102190 = new lifted10219();
      lifted102190.d_4513 = d_4513;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102190, f_4513);
      if(term == null)
        break Fail27605;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}