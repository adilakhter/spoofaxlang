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

@SuppressWarnings("all") public class bigbagof_$No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static bigbagof_$No$Existing$Descriptor_0_0 instance = new bigbagof_$No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_NoExistingDescriptor_0_0");
    Fail27338:
    { 
      TermReference x_4468 = new TermReference();
      TermReference y_4468 = new TermReference();
      if(y_4468.value == null)
        y_4468.value = term;
      else
        if(y_4468.value != term && !y_4468.value.match(term))
          break Fail27338;
      if(x_4468.value == null)
        x_4468.value = term;
      else
        if(x_4468.value != term && !x_4468.value.match(term))
          break Fail27338;
      Success11076:
      { 
        Fail27339:
        { 
          IStrategoTerm b_4469 = null;
          IStrategoTerm d_4469 = null;
          IStrategoTerm e_4469 = null;
          d_4469 = term;
          b_4469 = generator.const7463;
          e_4469 = d_4469;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4469, b_4469, generator.constCons4561);
          if(term == null)
            break Fail27339;
          if(true)
            break Success11076;
        }
        term = generator.constNil7;
      }
      lifted10127 lifted101270 = new lifted10127();
      lifted101270.x_4468 = x_4468;
      lifted101270.y_4468 = y_4468;
      term = filter_1_0.instance.invoke(context, term, lifted101270);
      if(term == null)
        break Fail27338;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}