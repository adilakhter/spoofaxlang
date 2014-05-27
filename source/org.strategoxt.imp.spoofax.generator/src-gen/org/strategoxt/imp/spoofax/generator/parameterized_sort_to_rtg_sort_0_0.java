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

@SuppressWarnings("all") public class parameterized_sort_to_rtg_sort_0_0 extends Strategy 
{ 
  public static parameterized_sort_to_rtg_sort_0_0 instance = new parameterized_sort_to_rtg_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parameterized_sort_to_rtg_sort_0_0");
    Fail26731:
    { 
      IStrategoTerm a_4393 = null;
      IStrategoTerm c_4393 = null;
      IStrategoTerm d_4393 = null;
      IStrategoTerm e_4393 = null;
      IStrategoTerm g_4393 = null;
      IStrategoTerm h_4393 = null;
      IStrategoTerm i_4393 = null;
      IStrategoTerm k_4393 = null;
      IStrategoTerm l_4393 = null;
      c_4393 = term;
      a_4393 = generator.const7891;
      d_4393 = c_4393;
      term = string_replace_0_2.instance.invoke(context, d_4393, a_4393, generator.const7120);
      if(term == null)
        break Fail26731;
      g_4393 = term;
      e_4393 = generator.const7067;
      h_4393 = g_4393;
      term = string_replace_0_2.instance.invoke(context, h_4393, e_4393, generator.const7120);
      if(term == null)
        break Fail26731;
      k_4393 = term;
      i_4393 = generator.const7068;
      l_4393 = k_4393;
      term = string_replace_0_2.instance.invoke(context, l_4393, i_4393, generator.const7000);
      if(term == null)
        break Fail26731;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}