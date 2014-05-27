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

@SuppressWarnings("all") public class $Start$Symbol_0_0 extends Strategy 
{ 
  public static $Start$Symbol_0_0 instance = new $Start$Symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("StartSymbol_0_0");
    Fail27319:
    { 
      TermReference p_4465 = new TermReference();
      IStrategoTerm s_4465 = null;
      IStrategoTerm u_4465 = null;
      IStrategoTerm v_4465 = null;
      if(p_4465.value == null)
        p_4465.value = term;
      else
        if(p_4465.value != term && !p_4465.value.match(term))
          break Fail27319;
      u_4465 = term;
      s_4465 = generator.const7443;
      v_4465 = u_4465;
      term = dr_lookup_rule_0_2.instance.invoke(context, v_4465, s_4465, generator.constCons4561);
      if(term == null)
        break Fail27319;
      lifted10122 lifted101220 = new lifted10122();
      lifted101220.p_4465 = p_4465;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101220);
      if(term == null)
        break Fail27319;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}