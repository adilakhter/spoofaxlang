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

@SuppressWarnings("all") public class bigfold_$Follow$Visited_1_0 extends Strategy 
{ 
  public static bigfold_$Follow$Visited_1_0 instance = new bigfold_$Follow$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4485)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_FollowVisited_1_0");
    Fail27438:
    { 
      IStrategoTerm o_4485 = null;
      IStrategoTerm s_4485 = null;
      IStrategoTerm u_4485 = null;
      o_4485 = term;
      u_4485 = term;
      Success11104:
      { 
        Fail27439:
        { 
          IStrategoTerm w_4485 = null;
          w_4485 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4485, generator.const7485, o_4485);
          if(term == null)
            break Fail27439;
          if(true)
            break Success11104;
        }
        term = generator.constNil7;
      }
      s_4485 = term;
      term = u_4485;
      term = termFactory.makeTuple(s_4485, term);
      term = r_4485.invoke(context, term, lifted10159.instance);
      if(term == null)
        break Fail27438;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}