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

@SuppressWarnings("all") public class bagof_$Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static bagof_$Descriptor$Name$Prefix_0_0 instance = new bagof_$Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_DescriptorNamePrefix_0_0");
    Fail27711:
    { 
      TermReference a_4532 = new TermReference();
      if(a_4532.value == null)
        a_4532.value = term;
      else
        if(a_4532.value != term && !a_4532.value.match(term))
          break Fail27711;
      Success11180:
      { 
        Fail27712:
        { 
          IStrategoTerm d_4532 = null;
          IStrategoTerm f_4532 = null;
          IStrategoTerm g_4532 = null;
          f_4532 = term;
          d_4532 = generator.const7899;
          g_4532 = f_4532;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4532, d_4532, generator.constCons4561);
          if(term == null)
            break Fail27712;
          if(true)
            break Success11180;
        }
        term = generator.constNil7;
      }
      lifted10256 lifted102560 = new lifted10256();
      lifted102560.a_4532 = a_4532;
      term = filter_1_0.instance.invoke(context, term, lifted102560);
      if(term == null)
        break Fail27711;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}