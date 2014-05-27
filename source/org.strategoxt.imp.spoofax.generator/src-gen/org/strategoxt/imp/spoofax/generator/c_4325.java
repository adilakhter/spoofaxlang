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

@SuppressWarnings("all") final class c_4325 extends Strategy 
{ 
  Strategy b_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28631:
    { 
      IStrategoTerm term10639 = term;
      Success11344:
      { 
        Fail28632:
        { 
          term = $Collect$All$Visited_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28632;
          term = generator.constNil7;
          if(true)
            break Success11344;
        }
        term = term10639;
        IStrategoTerm z_4324 = null;
        IStrategoTerm a_4325 = null;
        IStrategoTerm f_4325 = null;
        IStrategoTerm h_4325 = null;
        IStrategoTerm i_4325 = null;
        z_4324 = term;
        a_4325 = term;
        h_4325 = term;
        f_4325 = generator.const7483;
        i_4325 = h_4325;
        term = termFactory.makeTuple(generator.const7484, z_4324);
        term = dr_set_rule_0_3.instance.invoke(context, i_4325, f_4325, z_4324, term);
        if(term == null)
          break Fail28631;
        term = heuristic_collect_all_visit_sort_2_0.instance.invoke(context, a_4325, b_4325, this);
        if(term == null)
          break Fail28631;
      }
      if(true)
        return term;
    }
    return null;
  }
}