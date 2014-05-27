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

@SuppressWarnings("all") public class add_input_dir_prefix_0_0 extends Strategy 
{ 
  public static add_input_dir_prefix_0_0 instance = new add_input_dir_prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_input_dir_prefix_0_0");
    Fail25799:
    { 
      IStrategoTerm e_4262 = null;
      IStrategoTerm g_4262 = null;
      g_4262 = term;
      Success10189:
      { 
        Fail25800:
        { 
          term = $Input$Dir$Prefix_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25800;
          if(true)
            break Success10189;
        }
        term = generator.const7000;
      }
      e_4262 = term;
      term = g_4262;
      term = termFactory.makeTuple(e_4262, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25799;
      term = set_input_dir_prefix_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25799;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}