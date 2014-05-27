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

@SuppressWarnings("all") public class bagof_$Follow$Visited_0_0 extends Strategy 
{ 
  public static bagof_$Follow$Visited_0_0 instance = new bagof_$Follow$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_FollowVisited_0_0");
    Fail27451:
    { 
      TermReference e_4488 = new TermReference();
      TermReference f_4488 = new TermReference();
      if(f_4488.value == null)
        f_4488.value = term;
      else
        if(f_4488.value != term && !f_4488.value.match(term))
          break Fail27451;
      if(e_4488.value == null)
        e_4488.value = term;
      else
        if(e_4488.value != term && !e_4488.value.match(term))
          break Fail27451;
      Success11110:
      { 
        Fail27452:
        { 
          IStrategoTerm j_4488 = null;
          j_4488 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4488, generator.const7485, f_4488.value);
          if(term == null)
            break Fail27452;
          if(true)
            break Success11110;
        }
        term = generator.constNil7;
      }
      lifted10166 lifted101660 = new lifted10166();
      lifted101660.e_4488 = e_4488;
      lifted101660.f_4488 = f_4488;
      term = filter_1_0.instance.invoke(context, term, lifted101660);
      if(term == null)
        break Fail27451;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}