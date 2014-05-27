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

@SuppressWarnings("all") public class xtc_sglri_0_1 extends Strategy 
{ 
  public static xtc_sglri_0_1 instance = new xtc_sglri_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_4238)
  { 
    TermReference j_4238 = new TermReference(ref_j_4238);
    context.push("xtc_sglri_0_1");
    Fail25574:
    { 
      lifted9113 lifted91130 = new lifted9113();
      lifted91130.j_4238 = j_4238;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9112.instance, lifted91130);
      if(term == null)
        break Fail25574;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}