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

@SuppressWarnings("all") public class xtc_sglri_0_2 extends Strategy 
{ 
  public static xtc_sglri_0_2 instance = new xtc_sglri_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_4238, IStrategoTerm ref_p_4238)
  { 
    TermReference o_4238 = new TermReference(ref_o_4238);
    TermReference p_4238 = new TermReference(ref_p_4238);
    context.push("xtc_sglri_0_2");
    Fail25575:
    { 
      lifted9115 lifted91150 = new lifted9115();
      lifted91150.o_4238 = o_4238;
      lifted91150.p_4238 = p_4238;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9114.instance, lifted91150);
      if(term == null)
        break Fail25575;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}