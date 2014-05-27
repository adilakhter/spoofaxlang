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

@SuppressWarnings("all") public class fold_$Follow$Visited_1_0 extends Strategy 
{ 
  public static fold_$Follow$Visited_1_0 instance = new fold_$Follow$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4486)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_FollowVisited_1_0");
    Fail27440:
    { 
      IStrategoTerm a_4486 = null;
      IStrategoTerm e_4486 = null;
      IStrategoTerm g_4486 = null;
      a_4486 = term;
      g_4486 = term;
      Success11105:
      { 
        Fail27441:
        { 
          IStrategoTerm i_4486 = null;
          i_4486 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4486, generator.const7485, a_4486);
          if(term == null)
            break Fail27441;
          if(true)
            break Success11105;
        }
        term = generator.constNil7;
      }
      e_4486 = term;
      term = g_4486;
      term = termFactory.makeTuple(e_4486, term);
      term = d_4486.invoke(context, term, lifted10160.instance);
      if(term == null)
        break Fail27440;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}