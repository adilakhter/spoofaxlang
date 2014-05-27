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

@SuppressWarnings("all") public class bagof_$Base$Package_0_0 extends Strategy 
{ 
  public static bagof_$Base$Package_0_0 instance = new bagof_$Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_BasePackage_0_0");
    Fail27291:
    { 
      TermReference b_4461 = new TermReference();
      if(b_4461.value == null)
        b_4461.value = term;
      else
        if(b_4461.value != term && !b_4461.value.match(term))
          break Fail27291;
      Success11064:
      { 
        Fail27292:
        { 
          IStrategoTerm e_4461 = null;
          IStrategoTerm g_4461 = null;
          IStrategoTerm h_4461 = null;
          g_4461 = term;
          e_4461 = generator.const7448;
          h_4461 = g_4461;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4461, e_4461, generator.constCons4561);
          if(term == null)
            break Fail27292;
          if(true)
            break Success11064;
        }
        term = generator.constNil7;
      }
      lifted10112 lifted101120 = new lifted10112();
      lifted101120.b_4461 = b_4461;
      term = filter_1_0.instance.invoke(context, term, lifted101120);
      if(term == null)
        break Fail27291;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}