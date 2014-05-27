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

@SuppressWarnings("all") public class bigbagof_$Jar$Locations_0_0 extends Strategy 
{ 
  public static bigbagof_$Jar$Locations_0_0 instance = new bigbagof_$Jar$Locations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_JarLocations_0_0");
    Fail27602:
    { 
      TermReference l_4512 = new TermReference();
      if(l_4512.value == null)
        l_4512.value = term;
      else
        if(l_4512.value != term && !l_4512.value.match(term))
          break Fail27602;
      Success11150:
      { 
        Fail27603:
        { 
          IStrategoTerm o_4512 = null;
          IStrategoTerm q_4512 = null;
          IStrategoTerm r_4512 = null;
          q_4512 = term;
          o_4512 = generator.const7880;
          r_4512 = q_4512;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_4512, o_4512, generator.constCons4561);
          if(term == null)
            break Fail27603;
          if(true)
            break Success11150;
        }
        term = generator.constNil7;
      }
      lifted10217 lifted102170 = new lifted10217();
      lifted102170.l_4512 = l_4512;
      term = filter_1_0.instance.invoke(context, term, lifted102170);
      if(term == null)
        break Fail27602;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}