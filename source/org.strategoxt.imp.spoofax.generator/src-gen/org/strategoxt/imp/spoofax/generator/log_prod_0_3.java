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

@SuppressWarnings("all") public class log_prod_0_3 extends Strategy 
{ 
  public static log_prod_0_3 instance = new log_prod_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4248, IStrategoTerm a_4249, IStrategoTerm ref_b_4249)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_4249 = new TermReference(ref_b_4249);
    context.push("log_prod_0_3");
    Fail25697:
    { 
      TermReference c_4249 = new TermReference();
      IStrategoTerm d_4249 = null;
      IStrategoTerm g_4249 = null;
      d_4249 = term;
      lifted9194 lifted91940 = new lifted9194();
      lifted91940.b_4249 = b_4249;
      lifted91940.c_4249 = c_4249;
      term = xtc_temp_files_1_0.instance.invoke(context, term, lifted91940);
      if(term == null)
        break Fail25697;
      term = log_0_2.instance.invoke(context, term, z_4248, a_4249);
      if(term == null)
        break Fail25697;
      g_4249 = term;
      if(c_4249.value == null)
        break Fail25697;
      term = termFactory.makeTuple(generator.const7122, c_4249.value);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25697;
      term = log_0_2.instance.invoke(context, g_4249, z_4248, term);
      if(term == null)
        break Fail25697;
      term = d_4249;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}