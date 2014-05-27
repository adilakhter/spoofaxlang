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

@SuppressWarnings("all") public class output_text_file_p__0_2 extends Strategy 
{ 
  public static output_text_file_p__0_2 instance = new output_text_file_p__0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_4255, IStrategoTerm w_4255)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_text_file_p__0_2");
    Fail25742:
    { 
      IStrategoTerm x_4255 = null;
      IStrategoTerm y_4255 = null;
      IStrategoTerm a_4256 = null;
      y_4255 = term;
      term = create_dirs_0_0.instance.invoke(context, v_4255);
      if(term == null)
        break Fail25742;
      x_4255 = term;
      a_4256 = y_4255;
      term = termFactory.makeTuple(x_4255, generator.const7009, w_4255);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25742;
      term = output_text_file_p__0_1.instance.invoke(context, a_4256, term);
      if(term == null)
        break Fail25742;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}