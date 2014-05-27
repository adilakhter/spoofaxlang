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

@SuppressWarnings("all") public class reverse_bagof_$Follow$Visited_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Follow$Visited_1_0 instance = new reverse_bagof_$Follow$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4488)
  { 
    context.push("reverse_bagof_FollowVisited_1_0");
    Fail27449:
    { 
      TermReference x_4487 = new TermReference();
      TermReference y_4487 = new TermReference();
      if(y_4487.value == null)
        y_4487.value = term;
      else
        if(y_4487.value != term && !y_4487.value.match(term))
          break Fail27449;
      if(x_4487.value == null)
        x_4487.value = term;
      else
        if(x_4487.value != term && !x_4487.value.match(term))
          break Fail27449;
      Success11109:
      { 
        Fail27450:
        { 
          IStrategoTerm d_4488 = null;
          d_4488 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4488, generator.const7485, y_4487.value);
          if(term == null)
            break Fail27450;
          if(true)
            break Success11109;
        }
        term = generator.constNil7;
      }
      lifted10165 lifted101650 = new lifted10165();
      lifted101650.x_4487 = x_4487;
      lifted101650.y_4487 = y_4487;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101650, a_4488);
      if(term == null)
        break Fail27449;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}