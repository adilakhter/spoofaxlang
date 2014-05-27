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

@SuppressWarnings("all") public class conc_prod_1_0 extends Strategy 
{ 
  public static conc_prod_1_0 instance = new conc_prod_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4412)
  { 
    context.push("conc_prod_1_0");
    Fail26961:
    { 
      lifted9793 lifted97930 = new lifted9793();
      lifted9782 lifted97820 = new lifted9782();
      lifted97930.l_4412 = l_4412;
      lifted97820.l_4412 = l_4412;
      term = prod_3_0.instance.invoke(context, term, lifted97820, lifted97930, no_attrs_0_0.instance);
      if(term == null)
        break Fail26961;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}