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

@SuppressWarnings("all") public class $Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static $Is$Launched$From$Eclipse_0_0 instance = new $Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsLaunchedFromEclipse_0_0");
    Fail27687:
    { 
      TermReference z_4527 = new TermReference();
      TermReference a_4528 = new TermReference();
      IStrategoTerm d_4528 = null;
      IStrategoTerm f_4528 = null;
      IStrategoTerm g_4528 = null;
      if(a_4528.value == null)
        a_4528.value = term;
      else
        if(a_4528.value != term && !a_4528.value.match(term))
          break Fail27687;
      if(z_4527.value == null)
        z_4527.value = term;
      else
        if(z_4527.value != term && !z_4527.value.match(term))
          break Fail27687;
      f_4528 = term;
      d_4528 = generator.const7895;
      g_4528 = f_4528;
      term = dr_lookup_rule_0_2.instance.invoke(context, g_4528, d_4528, generator.constCons4561);
      if(term == null)
        break Fail27687;
      lifted10248 lifted102480 = new lifted10248();
      lifted102480.z_4527 = z_4527;
      lifted102480.a_4528 = a_4528;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102480);
      if(term == null)
        break Fail27687;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}