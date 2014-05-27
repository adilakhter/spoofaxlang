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

@SuppressWarnings("all") public class is_list_production_0_0 extends Strategy 
{ 
  public static is_list_production_0_0 instance = new is_list_production_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_list_production_0_0");
    Fail26307:
    { 
      IStrategoTerm term10652 = term;
      Success10556:
      { 
        Fail26308:
        { 
          term = $Prod$Rule_2_0.instance.invoke(context, term, _Id.instance, lifted9464.instance);
          if(term == null)
            break Fail26308;
          if(true)
            break Success10556;
        }
        term = $Prod$Rule_2_0.instance.invoke(context, term10652, _Id.instance, lifted9468.instance);
        if(term == null)
          break Fail26307;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}