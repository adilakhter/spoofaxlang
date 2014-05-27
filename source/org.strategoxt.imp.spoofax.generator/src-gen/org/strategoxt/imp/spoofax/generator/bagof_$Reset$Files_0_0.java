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

@SuppressWarnings("all") public class bagof_$Reset$Files_0_0 extends Strategy 
{ 
  public static bagof_$Reset$Files_0_0 instance = new bagof_$Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ResetFiles_0_0");
    Fail27659:
    { 
      TermReference x_4522 = new TermReference();
      TermReference y_4522 = new TermReference();
      if(y_4522.value == null)
        y_4522.value = term;
      else
        if(y_4522.value != term && !y_4522.value.match(term))
          break Fail27659;
      if(x_4522.value == null)
        x_4522.value = term;
      else
        if(x_4522.value != term && !x_4522.value.match(term))
          break Fail27659;
      Success11166:
      { 
        Fail27660:
        { 
          IStrategoTerm b_4523 = null;
          IStrategoTerm d_4523 = null;
          IStrategoTerm e_4523 = null;
          d_4523 = term;
          b_4523 = generator.const7888;
          e_4523 = d_4523;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4523, b_4523, generator.constCons4561);
          if(term == null)
            break Fail27660;
          if(true)
            break Success11166;
        }
        term = generator.constNil7;
      }
      lifted10238 lifted102380 = new lifted10238();
      lifted102380.x_4522 = x_4522;
      lifted102380.y_4522 = y_4522;
      term = filter_1_0.instance.invoke(context, term, lifted102380);
      if(term == null)
        break Fail27659;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}