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

@SuppressWarnings("all") public class as_string_0_0 extends Strategy 
{ 
  public static as_string_0_0 instance = new as_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("as_string_0_0");
    Fail25539:
    { 
      IStrategoTerm term10089 = term;
      Success10068:
      { 
        Fail25540:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25540;
          if(true)
            break Success10068;
        }
        term = write_to_string_0_0.instance.invoke(context, term10089);
        if(term == null)
          break Fail25539;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}