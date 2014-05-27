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

@SuppressWarnings("all") public class output_text_file_p__0_1 extends Strategy 
{ 
  public static output_text_file_p__0_1 instance = new output_text_file_p__0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4256)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_text_file_p__0_1");
    Fail25743:
    { 
      IStrategoTerm c_4256 = null;
      IStrategoTerm d_4256 = null;
      d_4256 = term;
      term = termFactory.makeTuple(b_4256, generator.const6986);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25743;
      c_4256 = term;
      term = d_4256;
      term = termFactory.makeTuple(term, c_4256);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25743;
      term = fclose_0_0.instance.invoke(context, c_4256);
      if(term == null)
        break Fail25743;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}