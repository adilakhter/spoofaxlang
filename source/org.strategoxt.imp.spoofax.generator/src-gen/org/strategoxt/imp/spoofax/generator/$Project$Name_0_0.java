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

@SuppressWarnings("all") public class $Project$Name_0_0 extends Strategy 
{ 
  public static $Project$Name_0_0 instance = new $Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ProjectName_0_0");
    Fail27583:
    { 
      TermReference l_4509 = new TermReference();
      IStrategoTerm o_4509 = null;
      IStrategoTerm q_4509 = null;
      IStrategoTerm r_4509 = null;
      if(l_4509.value == null)
        l_4509.value = term;
      else
        if(l_4509.value != term && !l_4509.value.match(term))
          break Fail27583;
      q_4509 = term;
      o_4509 = generator.const7876;
      r_4509 = q_4509;
      term = dr_lookup_rule_0_2.instance.invoke(context, r_4509, o_4509, generator.constCons4561);
      if(term == null)
        break Fail27583;
      lifted10212 lifted102120 = new lifted10212();
      lifted102120.l_4509 = l_4509;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102120);
      if(term == null)
        break Fail27583;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}