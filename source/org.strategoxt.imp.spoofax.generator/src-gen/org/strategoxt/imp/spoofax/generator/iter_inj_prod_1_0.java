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

@SuppressWarnings("all") public class iter_inj_prod_1_0 extends Strategy 
{ 
  public static iter_inj_prod_1_0 instance = new iter_inj_prod_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4412)
  { 
    context.push("iter_inj_prod_1_0");
    Fail26962:
    { 
      lifted9799 lifted97990 = new lifted9799();
      lifted9796 lifted97960 = new lifted9796();
      lifted97990.m_4412 = m_4412;
      lifted97960.m_4412 = m_4412;
      term = prod_3_0.instance.invoke(context, term, lifted97960, lifted97990, no_attrs_0_0.instance);
      if(term == null)
        break Fail26962;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}