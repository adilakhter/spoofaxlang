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

@SuppressWarnings("all") public class bagof_$On$Import$Failure_0_0 extends Strategy 
{ 
  public static bagof_$On$Import$Failure_0_0 instance = new bagof_$On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_OnImportFailure_0_0");
    Fail27369:
    { 
      TermReference u_4474 = new TermReference();
      TermReference v_4474 = new TermReference();
      if(v_4474.value == null)
        v_4474.value = term;
      else
        if(v_4474.value != term && !v_4474.value.match(term))
          break Fail27369;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27369;
      if(u_4474.value == null)
        u_4474.value = term.getSubterm(0);
      else
        if(u_4474.value != term.getSubterm(0) && !u_4474.value.match(term.getSubterm(0)))
          break Fail27369;
      Success11085:
      { 
        Fail27370:
        { 
          IStrategoTerm y_4474 = null;
          IStrategoTerm a_4475 = null;
          IStrategoTerm b_4475 = null;
          a_4475 = term;
          y_4474 = generator.const7458;
          b_4475 = a_4475;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4475, y_4474, generator.const7459);
          if(term == null)
            break Fail27370;
          if(true)
            break Success11085;
        }
        term = generator.constNil7;
      }
      lifted10139 lifted101390 = new lifted10139();
      lifted101390.u_4474 = u_4474;
      lifted101390.v_4474 = v_4474;
      term = filter_1_0.instance.invoke(context, term, lifted101390);
      if(term == null)
        break Fail27369;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}