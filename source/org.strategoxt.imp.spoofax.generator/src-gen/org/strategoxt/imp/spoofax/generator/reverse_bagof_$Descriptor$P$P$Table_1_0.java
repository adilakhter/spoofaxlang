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

@SuppressWarnings("all") public class reverse_bagof_$Descriptor$P$P$Table_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Descriptor$P$P$Table_1_0 instance = new reverse_bagof_$Descriptor$P$P$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4431)
  { 
    context.push("reverse_bagof_DescriptorPPTable_1_0");
    Fail27107:
    { 
      TermReference e_4431 = new TermReference();
      if(e_4431.value == null)
        e_4431.value = term;
      else
        if(e_4431.value != term && !e_4431.value.match(term))
          break Fail27107;
      Success11014:
      { 
        Fail27108:
        { 
          IStrategoTerm i_4431 = null;
          IStrategoTerm k_4431 = null;
          IStrategoTerm l_4431 = null;
          k_4431 = term;
          i_4431 = generator.const7124;
          l_4431 = k_4431;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4431, i_4431, generator.constCons4561);
          if(term == null)
            break Fail27108;
          if(true)
            break Success11014;
        }
        term = generator.constNil7;
      }
      lifted10048 lifted100480 = new lifted10048();
      lifted100480.e_4431 = e_4431;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100480, g_4431);
      if(term == null)
        break Fail27107;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}