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

@SuppressWarnings("all") public class reverse_bagof_$Main$Descriptor_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Main$Descriptor_1_0 instance = new reverse_bagof_$Main$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4452)
  { 
    context.push("reverse_bagof_MainDescriptor_1_0");
    Fail27237:
    { 
      TermReference f_4452 = new TermReference();
      if(f_4452.value == null)
        f_4452.value = term;
      else
        if(f_4452.value != term && !f_4452.value.match(term))
          break Fail27237;
      Success11049:
      { 
        Fail27238:
        { 
          IStrategoTerm j_4452 = null;
          IStrategoTerm l_4452 = null;
          IStrategoTerm m_4452 = null;
          l_4452 = term;
          j_4452 = generator.const7251;
          m_4452 = l_4452;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4452, j_4452, generator.constCons4561);
          if(term == null)
            break Fail27238;
          if(true)
            break Success11049;
        }
        term = generator.constNil7;
      }
      lifted10093 lifted100930 = new lifted10093();
      lifted100930.f_4452 = f_4452;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100930, h_4452);
      if(term == null)
        break Fail27237;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}