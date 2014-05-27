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

@SuppressWarnings("all") public class is_seq_symbol_0_0 extends Strategy 
{ 
  public static is_seq_symbol_0_0 instance = new is_seq_symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_seq_symbol_0_0");
    Fail25638:
    { 
      IStrategoTerm term10153 = term;
      Success10119:
      { 
        Fail25639:
        { 
          term = cf_1_0.instance.invoke(context, term, is_seq_symbol_0_0.instance);
          if(term == null)
            break Fail25639;
          if(true)
            break Success10119;
        }
        term = seq_2_0.instance.invoke(context, term10153, _Id.instance, is_list_0_0.instance);
        if(term == null)
          break Fail25638;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}