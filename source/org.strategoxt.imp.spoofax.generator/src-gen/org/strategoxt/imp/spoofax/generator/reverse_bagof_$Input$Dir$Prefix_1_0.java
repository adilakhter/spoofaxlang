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

@SuppressWarnings("all") public class reverse_bagof_$Input$Dir$Prefix_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Input$Dir$Prefix_1_0 instance = new reverse_bagof_$Input$Dir$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4435)
  { 
    context.push("reverse_bagof_InputDirPrefix_1_0");
    Fail27133:
    { 
      TermReference l_4435 = new TermReference();
      if(l_4435.value == null)
        l_4435.value = term;
      else
        if(l_4435.value != term && !l_4435.value.match(term))
          break Fail27133;
      Success11021:
      { 
        Fail27134:
        { 
          IStrategoTerm p_4435 = null;
          IStrategoTerm r_4435 = null;
          IStrategoTerm s_4435 = null;
          r_4435 = term;
          p_4435 = generator.const7147;
          s_4435 = r_4435;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4435, p_4435, generator.constCons4561);
          if(term == null)
            break Fail27134;
          if(true)
            break Success11021;
        }
        term = generator.constNil7;
      }
      lifted10057 lifted100570 = new lifted10057();
      lifted100570.l_4435 = l_4435;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100570, n_4435);
      if(term == null)
        break Fail27133;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}