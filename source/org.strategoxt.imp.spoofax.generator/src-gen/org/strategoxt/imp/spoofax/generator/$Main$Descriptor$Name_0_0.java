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

@SuppressWarnings("all") public class $Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static $Main$Descriptor$Name_0_0 instance = new $Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("MainDescriptorName_0_0");
    Fail27739:
    { 
      TermReference o_4536 = new TermReference();
      IStrategoTerm r_4536 = null;
      IStrategoTerm t_4536 = null;
      IStrategoTerm u_4536 = null;
      if(o_4536.value == null)
        o_4536.value = term;
      else
        if(o_4536.value != term && !o_4536.value.match(term))
          break Fail27739;
      t_4536 = term;
      r_4536 = generator.const7897;
      u_4536 = t_4536;
      term = dr_lookup_rule_0_2.instance.invoke(context, u_4536, r_4536, generator.constCons4561);
      if(term == null)
        break Fail27739;
      lifted10266 lifted102660 = new lifted10266();
      lifted102660.o_4536 = o_4536;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102660);
      if(term == null)
        break Fail27739;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}