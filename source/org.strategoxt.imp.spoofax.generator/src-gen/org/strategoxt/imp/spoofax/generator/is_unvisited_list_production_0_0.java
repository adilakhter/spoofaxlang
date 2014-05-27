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

@SuppressWarnings("all") public class is_unvisited_list_production_0_0 extends Strategy 
{ 
  public static is_unvisited_list_production_0_0 instance = new is_unvisited_list_production_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_unvisited_list_production_0_0");
    Fail26313:
    { 
      IStrategoTerm term10656 = term;
      Success10560:
      { 
        Fail26314:
        { 
          IStrategoTerm d_4328 = null;
          d_4328 = term;
          term = get_list_production_item_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26314;
          IStrategoTerm term10657 = term;
          Success10561:
          { 
            Fail26315:
            { 
              term = $Follow$Visited_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26315;
              { 
                if(true)
                  break Fail26314;
                if(true)
                  break Success10561;
              }
            }
            term = term10657;
          }
          term = d_4328;
          if(true)
            break Success10560;
        }
        term = $Prod$Rule_2_0.instance.invoke(context, term10656, _Id.instance, lifted9473.instance);
        if(term == null)
          break Fail26313;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}