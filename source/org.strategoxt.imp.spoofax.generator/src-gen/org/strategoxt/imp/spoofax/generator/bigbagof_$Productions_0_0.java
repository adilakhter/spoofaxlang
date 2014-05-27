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

@SuppressWarnings("all") public class bigbagof_$Productions_0_0 extends Strategy 
{ 
  public static bigbagof_$Productions_0_0 instance = new bigbagof_$Productions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Productions_0_0");
    Fail27394:
    { 
      TermReference b_4479 = new TermReference();
      TermReference c_4479 = new TermReference();
      if(c_4479.value == null)
        c_4479.value = term;
      else
        if(c_4479.value != term && !c_4479.value.match(term))
          break Fail27394;
      if(b_4479.value == null)
        b_4479.value = term;
      else
        if(b_4479.value != term && !b_4479.value.match(term))
          break Fail27394;
      Success11094:
      { 
        Fail27395:
        { 
          IStrategoTerm g_4479 = null;
          g_4479 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4479, generator.const7480, c_4479.value);
          if(term == null)
            break Fail27395;
          if(true)
            break Success11094;
        }
        term = generator.constNil7;
      }
      lifted10145 lifted101450 = new lifted10145();
      lifted101450.b_4479 = b_4479;
      lifted101450.c_4479 = c_4479;
      term = filter_1_0.instance.invoke(context, term, lifted101450);
      if(term == null)
        break Fail27394;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}