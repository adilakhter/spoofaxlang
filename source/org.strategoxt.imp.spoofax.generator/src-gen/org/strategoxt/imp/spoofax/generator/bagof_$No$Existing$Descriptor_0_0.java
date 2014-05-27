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

@SuppressWarnings("all") public class bagof_$No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static bagof_$No$Existing$Descriptor_0_0 instance = new bagof_$No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_NoExistingDescriptor_0_0");
    Fail27343:
    { 
      TermReference a_4470 = new TermReference();
      TermReference b_4470 = new TermReference();
      if(b_4470.value == null)
        b_4470.value = term;
      else
        if(b_4470.value != term && !b_4470.value.match(term))
          break Fail27343;
      if(a_4470.value == null)
        a_4470.value = term;
      else
        if(a_4470.value != term && !a_4470.value.match(term))
          break Fail27343;
      Success11078:
      { 
        Fail27344:
        { 
          IStrategoTerm e_4470 = null;
          IStrategoTerm g_4470 = null;
          IStrategoTerm h_4470 = null;
          g_4470 = term;
          e_4470 = generator.const7463;
          h_4470 = g_4470;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4470, e_4470, generator.constCons4561);
          if(term == null)
            break Fail27344;
          if(true)
            break Success11078;
        }
        term = generator.constNil7;
      }
      lifted10130 lifted101300 = new lifted10130();
      lifted101300.a_4470 = a_4470;
      lifted101300.b_4470 = b_4470;
      term = filter_1_0.instance.invoke(context, term, lifted101300);
      if(term == null)
        break Fail27343;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}