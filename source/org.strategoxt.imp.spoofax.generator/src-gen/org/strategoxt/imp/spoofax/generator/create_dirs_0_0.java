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

@SuppressWarnings("all") public class create_dirs_0_0 extends Strategy 
{ 
  public static create_dirs_0_0 instance = new create_dirs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_dirs_0_0");
    Fail25747:
    { 
      IStrategoTerm q_4256 = null;
      IStrategoTerm r_4256 = null;
      IStrategoTerm s_4256 = null;
      r_4256 = term;
      term = getcwd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25747;
      q_4256 = term;
      term = map_1_0.instance.invoke(context, r_4256, lifted9220.instance);
      if(term == null)
        break Fail25747;
      term = getcwd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25747;
      s_4256 = term;
      term = chdir_0_0.instance.invoke(context, q_4256);
      if(term == null)
        break Fail25747;
      term = s_4256;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}