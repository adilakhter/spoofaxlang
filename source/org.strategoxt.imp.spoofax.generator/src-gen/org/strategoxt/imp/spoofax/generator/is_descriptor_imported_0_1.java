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

@SuppressWarnings("all") public class is_descriptor_imported_0_1 extends Strategy 
{ 
  public static is_descriptor_imported_0_1 instance = new is_descriptor_imported_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_4254)
  { 
    TermReference o_4254 = new TermReference(ref_o_4254);
    context.push("is_descriptor_imported_0_1");
    Fail25733:
    { 
      term = $Main$Descriptor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25733;
      lifted9211 lifted92110 = new lifted9211();
      lifted92110.o_4254 = o_4254;
      term = oncetd_1_0.instance.invoke(context, term, lifted92110);
      if(term == null)
        break Fail25733;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}