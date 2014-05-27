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

@SuppressWarnings("all") public class bigbagof_$Editor$Extensions_0_0 extends Strategy 
{ 
  public static bigbagof_$Editor$Extensions_0_0 instance = new bigbagof_$Editor$Extensions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_EditorExtensions_0_0");
    Fail27260:
    { 
      TermReference u_4455 = new TermReference();
      if(u_4455.value == null)
        u_4455.value = term;
      else
        if(u_4455.value != term && !u_4455.value.match(term))
          break Fail27260;
      Success11055:
      { 
        Fail27261:
        { 
          IStrategoTerm x_4455 = null;
          IStrategoTerm z_4455 = null;
          IStrategoTerm a_4456 = null;
          z_4455 = term;
          x_4455 = generator.const7453;
          a_4456 = z_4455;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4456, x_4455, generator.constCons4561);
          if(term == null)
            break Fail27261;
          if(true)
            break Success11055;
        }
        term = generator.constNil7;
      }
      lifted10100 lifted101000 = new lifted10100();
      lifted101000.u_4455 = u_4455;
      term = filter_1_0.instance.invoke(context, term, lifted101000);
      if(term == null)
        break Fail27260;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}