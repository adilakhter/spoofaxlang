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

@SuppressWarnings("all") public class bagof_$Productions_0_0 extends Strategy 
{ 
  public static bagof_$Productions_0_0 instance = new bagof_$Productions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Productions_0_0");
    Fail27399:
    { 
      TermReference y_4479 = new TermReference();
      TermReference z_4479 = new TermReference();
      if(z_4479.value == null)
        z_4479.value = term;
      else
        if(z_4479.value != term && !z_4479.value.match(term))
          break Fail27399;
      if(y_4479.value == null)
        y_4479.value = term;
      else
        if(y_4479.value != term && !y_4479.value.match(term))
          break Fail27399;
      Success11096:
      { 
        Fail27400:
        { 
          IStrategoTerm d_4480 = null;
          d_4480 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4480, generator.const7480, z_4479.value);
          if(term == null)
            break Fail27400;
          if(true)
            break Success11096;
        }
        term = generator.constNil7;
      }
      lifted10148 lifted101480 = new lifted10148();
      lifted101480.y_4479 = y_4479;
      lifted101480.z_4479 = z_4479;
      term = filter_1_0.instance.invoke(context, term, lifted101480);
      if(term == null)
        break Fail27399;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}