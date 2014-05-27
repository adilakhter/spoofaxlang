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

@SuppressWarnings("all") public class prim_origin_textfragment_0_0 extends Strategy 
{ 
  public static prim_origin_textfragment_0_0 instance = new prim_origin_textfragment_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25778:
    { 
      IStrategoTerm y_4258 = null;
      IStrategoTerm a_4259 = null;
      IStrategoTerm b_4259 = null;
      a_4259 = term;
      y_4258 = generator.const7000;
      term = a_4259;
      b_4259 = a_4259;
      term = context.invokePrimitive("SSL_EXT_origin_textfragment", b_4259, NO_STRATEGIES, new IStrategoTerm[]{y_4258, term});
      if(term == null)
        break Fail25778;
      if(true)
        return term;
    }
    context.push("prim_origin_textfragment_0_0");
    context.popOnFailure();
    return null;
  }
}