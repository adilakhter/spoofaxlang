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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail27161:
    { 
      TermReference x_4439 = new TermReference();
      TermReference y_4439 = new TermReference();
      if(y_4439.value == null)
        y_4439.value = term;
      else
        if(y_4439.value != term && !y_4439.value.match(term))
          break Fail27161;
      if(x_4439.value == null)
        x_4439.value = term;
      else
        if(x_4439.value != term && !x_4439.value.match(term))
          break Fail27161;
      Success11029:
      { 
        Fail27162:
        { 
          IStrategoTerm c_4440 = null;
          c_4440 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4440, generator.const7145, y_4439.value);
          if(term == null)
            break Fail27162;
          if(true)
            break Success11029;
        }
        term = generator.constNil7;
      }
      lifted10067 lifted100670 = new lifted10067();
      lifted100670.x_4439 = x_4439;
      lifted100670.y_4439 = y_4439;
      term = filter_1_0.instance.invoke(context, term, lifted100670);
      if(term == null)
        break Fail27161;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}