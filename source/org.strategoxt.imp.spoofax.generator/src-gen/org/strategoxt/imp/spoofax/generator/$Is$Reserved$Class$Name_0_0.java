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

@SuppressWarnings("all") public class $Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static $Is$Reserved$Class$Name_0_0 instance = new $Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsReservedClassName_0_0");
    Fail27215:
    { 
      TermReference n_4448 = new TermReference();
      TermReference o_4448 = new TermReference();
      IStrategoTerm s_4448 = null;
      if(o_4448.value == null)
        o_4448.value = term;
      else
        if(o_4448.value != term && !o_4448.value.match(term))
          break Fail27215;
      if(n_4448.value == null)
        n_4448.value = term;
      else
        if(n_4448.value != term && !n_4448.value.match(term))
          break Fail27215;
      s_4448 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, s_4448, generator.const7167, o_4448.value);
      if(term == null)
        break Fail27215;
      lifted10086 lifted100860 = new lifted10086();
      lifted100860.n_4448 = n_4448;
      lifted100860.o_4448 = o_4448;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100860);
      if(term == null)
        break Fail27215;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}