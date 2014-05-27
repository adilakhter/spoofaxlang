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

@SuppressWarnings("all") public class xtc_abox2text_1_0 extends Strategy 
{ 
  public static xtc_abox2text_1_0 instance = new xtc_abox2text_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4237)
  { 
    context.push("xtc_abox2text_1_0");
    Fail25570:
    { 
      lifted9106 lifted91060 = new lifted9106();
      lifted91060.r_4237 = r_4237;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9105.instance, lifted91060);
      if(term == null)
        break Fail25570;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}