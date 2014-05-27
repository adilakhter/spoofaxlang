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

@SuppressWarnings("all") public class reverse_bagof_$Production$Visited_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Production$Visited_1_0 instance = new reverse_bagof_$Production$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4496)
  { 
    context.push("reverse_bagof_ProductionVisited_1_0");
    Fail27501:
    { 
      TermReference d_4496 = new TermReference();
      TermReference e_4496 = new TermReference();
      if(e_4496.value == null)
        e_4496.value = term;
      else
        if(e_4496.value != term && !e_4496.value.match(term))
          break Fail27501;
      if(d_4496.value == null)
        d_4496.value = term;
      else
        if(d_4496.value != term && !d_4496.value.match(term))
          break Fail27501;
      Success11123:
      { 
        Fail27502:
        { 
          IStrategoTerm j_4496 = null;
          j_4496 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4496, generator.const7489, e_4496.value);
          if(term == null)
            break Fail27502;
          if(true)
            break Success11123;
        }
        term = generator.constNil7;
      }
      lifted10183 lifted101830 = new lifted10183();
      lifted101830.d_4496 = d_4496;
      lifted101830.e_4496 = e_4496;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101830, g_4496);
      if(term == null)
        break Fail27501;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}