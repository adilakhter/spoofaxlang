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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail27156:
    { 
      TermReference a_4439 = new TermReference();
      TermReference b_4439 = new TermReference();
      if(b_4439.value == null)
        b_4439.value = term;
      else
        if(b_4439.value != term && !b_4439.value.match(term))
          break Fail27156;
      if(a_4439.value == null)
        a_4439.value = term;
      else
        if(a_4439.value != term && !a_4439.value.match(term))
          break Fail27156;
      Success11027:
      { 
        Fail27157:
        { 
          IStrategoTerm f_4439 = null;
          f_4439 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4439, generator.const7145, b_4439.value);
          if(term == null)
            break Fail27157;
          if(true)
            break Success11027;
        }
        term = generator.constNil7;
      }
      lifted10064 lifted100640 = new lifted10064();
      lifted100640.a_4439 = a_4439;
      lifted100640.b_4439 = b_4439;
      term = filter_1_0.instance.invoke(context, term, lifted100640);
      if(term == null)
        break Fail27156;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}