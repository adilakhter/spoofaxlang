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

@SuppressWarnings("all") public class bigbagof_$Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static bigbagof_$Descriptor$Name$Prefix_0_0 instance = new bigbagof_$Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_DescriptorNamePrefix_0_0");
    Fail27706:
    { 
      TermReference a_4531 = new TermReference();
      if(a_4531.value == null)
        a_4531.value = term;
      else
        if(a_4531.value != term && !a_4531.value.match(term))
          break Fail27706;
      Success11178:
      { 
        Fail27707:
        { 
          IStrategoTerm d_4531 = null;
          IStrategoTerm f_4531 = null;
          IStrategoTerm g_4531 = null;
          f_4531 = term;
          d_4531 = generator.const7899;
          g_4531 = f_4531;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4531, d_4531, generator.constCons4561);
          if(term == null)
            break Fail27707;
          if(true)
            break Success11178;
        }
        term = generator.constNil7;
      }
      lifted10253 lifted102530 = new lifted10253();
      lifted102530.a_4531 = a_4531;
      term = filter_1_0.instance.invoke(context, term, lifted102530);
      if(term == null)
        break Fail27706;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}