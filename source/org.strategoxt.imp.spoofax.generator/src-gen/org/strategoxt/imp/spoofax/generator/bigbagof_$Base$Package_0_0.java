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

@SuppressWarnings("all") public class bigbagof_$Base$Package_0_0 extends Strategy 
{ 
  public static bigbagof_$Base$Package_0_0 instance = new bigbagof_$Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_BasePackage_0_0");
    Fail27286:
    { 
      TermReference b_4460 = new TermReference();
      if(b_4460.value == null)
        b_4460.value = term;
      else
        if(b_4460.value != term && !b_4460.value.match(term))
          break Fail27286;
      Success11062:
      { 
        Fail27287:
        { 
          IStrategoTerm e_4460 = null;
          IStrategoTerm g_4460 = null;
          IStrategoTerm h_4460 = null;
          g_4460 = term;
          e_4460 = generator.const7448;
          h_4460 = g_4460;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4460, e_4460, generator.constCons4561);
          if(term == null)
            break Fail27287;
          if(true)
            break Success11062;
        }
        term = generator.constNil7;
      }
      lifted10109 lifted101090 = new lifted10109();
      lifted101090.b_4460 = b_4460;
      term = filter_1_0.instance.invoke(context, term, lifted101090);
      if(term == null)
        break Fail27286;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}