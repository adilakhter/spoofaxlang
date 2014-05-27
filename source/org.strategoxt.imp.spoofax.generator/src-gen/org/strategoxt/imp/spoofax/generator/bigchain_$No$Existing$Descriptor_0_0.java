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

@SuppressWarnings("all") public class bigchain_$No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static bigchain_$No$Existing$Descriptor_0_0 instance = new bigchain_$No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_NoExistingDescriptor_0_0");
    Fail27334:
    { 
      IStrategoTerm b_4468 = null;
      IStrategoTerm d_4468 = null;
      d_4468 = term;
      Success11074:
      { 
        Fail27335:
        { 
          IStrategoTerm e_4468 = null;
          IStrategoTerm g_4468 = null;
          IStrategoTerm h_4468 = null;
          g_4468 = term;
          e_4468 = generator.const7463;
          h_4468 = g_4468;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4468, e_4468, generator.constCons4561);
          if(term == null)
            break Fail27335;
          if(true)
            break Success11074;
        }
        term = generator.constNil7;
      }
      b_4468 = term;
      term = d_4468;
      term = termFactory.makeTuple(b_4468, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10125.instance);
      if(term == null)
        break Fail27334;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}