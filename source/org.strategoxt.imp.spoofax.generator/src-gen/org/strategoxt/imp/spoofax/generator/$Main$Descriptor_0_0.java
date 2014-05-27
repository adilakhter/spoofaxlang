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

@SuppressWarnings("all") public class $Main$Descriptor_0_0 extends Strategy 
{ 
  public static $Main$Descriptor_0_0 instance = new $Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("MainDescriptor_0_0");
    Fail27241:
    { 
      TermReference u_4452 = new TermReference();
      IStrategoTerm x_4452 = null;
      IStrategoTerm z_4452 = null;
      IStrategoTerm a_4453 = null;
      if(u_4452.value == null)
        u_4452.value = term;
      else
        if(u_4452.value != term && !u_4452.value.match(term))
          break Fail27241;
      z_4452 = term;
      x_4452 = generator.const7251;
      a_4453 = z_4452;
      term = dr_lookup_rule_0_2.instance.invoke(context, a_4453, x_4452, generator.constCons4561);
      if(term == null)
        break Fail27241;
      lifted10095 lifted100950 = new lifted10095();
      lifted100950.u_4452 = u_4452;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100950);
      if(term == null)
        break Fail27241;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}