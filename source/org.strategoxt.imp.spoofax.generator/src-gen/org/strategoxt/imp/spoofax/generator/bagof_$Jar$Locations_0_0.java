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

@SuppressWarnings("all") public class bagof_$Jar$Locations_0_0 extends Strategy 
{ 
  public static bagof_$Jar$Locations_0_0 instance = new bagof_$Jar$Locations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_JarLocations_0_0");
    Fail27607:
    { 
      TermReference l_4513 = new TermReference();
      if(l_4513.value == null)
        l_4513.value = term;
      else
        if(l_4513.value != term && !l_4513.value.match(term))
          break Fail27607;
      Success11152:
      { 
        Fail27608:
        { 
          IStrategoTerm o_4513 = null;
          IStrategoTerm q_4513 = null;
          IStrategoTerm r_4513 = null;
          q_4513 = term;
          o_4513 = generator.const7880;
          r_4513 = q_4513;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4513, o_4513, generator.constCons4561);
          if(term == null)
            break Fail27608;
          if(true)
            break Success11152;
        }
        term = generator.constNil7;
      }
      lifted10220 lifted102200 = new lifted10220();
      lifted102200.l_4513 = l_4513;
      term = filter_1_0.instance.invoke(context, term, lifted102200);
      if(term == null)
        break Fail27607;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}