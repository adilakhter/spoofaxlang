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

@SuppressWarnings("all") public class bagof_$Source$Path$Name_0_0 extends Strategy 
{ 
  public static bagof_$Source$Path$Name_0_0 instance = new bagof_$Source$Path$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_SourcePathName_0_0");
    Fail27031:
    { 
      TermReference w_4418 = new TermReference();
      TermReference x_4418 = new TermReference();
      if(x_4418.value == null)
        x_4418.value = term;
      else
        if(x_4418.value != term && !x_4418.value.match(term))
          break Fail27031;
      if(w_4418.value == null)
        w_4418.value = term;
      else
        if(w_4418.value != term && !w_4418.value.match(term))
          break Fail27031;
      Success10994:
      { 
        Fail27032:
        { 
          IStrategoTerm b_4419 = null;
          b_4419 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4419, generator.const7018, x_4418.value);
          if(term == null)
            break Fail27032;
          if(true)
            break Success10994;
        }
        term = generator.constNil7;
      }
      lifted10022 lifted100220 = new lifted10022();
      lifted100220.w_4418 = w_4418;
      lifted100220.x_4418 = x_4418;
      term = filter_1_0.instance.invoke(context, term, lifted100220);
      if(term == null)
        break Fail27031;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}