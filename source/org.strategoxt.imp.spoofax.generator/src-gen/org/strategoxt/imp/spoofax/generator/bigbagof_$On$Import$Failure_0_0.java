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

@SuppressWarnings("all") public class bigbagof_$On$Import$Failure_0_0 extends Strategy 
{ 
  public static bigbagof_$On$Import$Failure_0_0 instance = new bigbagof_$On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_OnImportFailure_0_0");
    Fail27364:
    { 
      TermReference r_4473 = new TermReference();
      TermReference s_4473 = new TermReference();
      if(s_4473.value == null)
        s_4473.value = term;
      else
        if(s_4473.value != term && !s_4473.value.match(term))
          break Fail27364;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27364;
      if(r_4473.value == null)
        r_4473.value = term.getSubterm(0);
      else
        if(r_4473.value != term.getSubterm(0) && !r_4473.value.match(term.getSubterm(0)))
          break Fail27364;
      Success11083:
      { 
        Fail27365:
        { 
          IStrategoTerm v_4473 = null;
          IStrategoTerm x_4473 = null;
          IStrategoTerm y_4473 = null;
          x_4473 = term;
          v_4473 = generator.const7458;
          y_4473 = x_4473;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4473, v_4473, generator.const7459);
          if(term == null)
            break Fail27365;
          if(true)
            break Success11083;
        }
        term = generator.constNil7;
      }
      lifted10136 lifted101360 = new lifted10136();
      lifted101360.r_4473 = r_4473;
      lifted101360.s_4473 = s_4473;
      term = filter_1_0.instance.invoke(context, term, lifted101360);
      if(term == null)
        break Fail27364;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}