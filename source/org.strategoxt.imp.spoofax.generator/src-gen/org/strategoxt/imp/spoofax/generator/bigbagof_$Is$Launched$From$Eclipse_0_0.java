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

@SuppressWarnings("all") public class bigbagof_$Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Launched$From$Eclipse_0_0 instance = new bigbagof_$Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsLaunchedFromEclipse_0_0");
    Fail27680:
    { 
      TermReference o_4526 = new TermReference();
      TermReference p_4526 = new TermReference();
      if(p_4526.value == null)
        p_4526.value = term;
      else
        if(p_4526.value != term && !p_4526.value.match(term))
          break Fail27680;
      if(o_4526.value == null)
        o_4526.value = term;
      else
        if(o_4526.value != term && !o_4526.value.match(term))
          break Fail27680;
      Success11171:
      { 
        Fail27681:
        { 
          IStrategoTerm s_4526 = null;
          IStrategoTerm u_4526 = null;
          IStrategoTerm v_4526 = null;
          u_4526 = term;
          s_4526 = generator.const7895;
          v_4526 = u_4526;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_4526, s_4526, generator.constCons4561);
          if(term == null)
            break Fail27681;
          if(true)
            break Success11171;
        }
        term = generator.constNil7;
      }
      lifted10244 lifted102440 = new lifted10244();
      lifted102440.o_4526 = o_4526;
      lifted102440.p_4526 = p_4526;
      term = filter_1_0.instance.invoke(context, term, lifted102440);
      if(term == null)
        break Fail27680;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}