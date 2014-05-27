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

@SuppressWarnings("all") public class remove_indentation_0_1 extends Strategy 
{ 
  public static remove_indentation_0_1 instance = new remove_indentation_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_4273)
  { 
    TermReference d_4273 = new TermReference(ref_d_4273);
    context.push("remove_indentation_0_1");
    Fail25873:
    { 
      lifted9286 lifted92860 = new lifted9286();
      lifted92860.d_4273 = d_4273;
      term = all_lines_1_0.instance.invoke(context, term, lifted92860);
      if(term == null)
        break Fail25873;
      term = trim_chars_1_0.instance.invoke(context, term, lifted9288.instance);
      if(term == null)
        break Fail25873;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}