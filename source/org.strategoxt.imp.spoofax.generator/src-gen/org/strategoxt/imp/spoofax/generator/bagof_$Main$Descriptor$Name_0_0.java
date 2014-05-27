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

@SuppressWarnings("all") public class bagof_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static bagof_$Main$Descriptor$Name_0_0 instance = new bagof_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_MainDescriptorName_0_0");
    Fail27737:
    { 
      TermReference h_4536 = new TermReference();
      if(h_4536.value == null)
        h_4536.value = term;
      else
        if(h_4536.value != term && !h_4536.value.match(term))
          break Fail27737;
      Success11187:
      { 
        Fail27738:
        { 
          IStrategoTerm k_4536 = null;
          IStrategoTerm m_4536 = null;
          IStrategoTerm n_4536 = null;
          m_4536 = term;
          k_4536 = generator.const7897;
          n_4536 = m_4536;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4536, k_4536, generator.constCons4561);
          if(term == null)
            break Fail27738;
          if(true)
            break Success11187;
        }
        term = generator.constNil7;
      }
      lifted10265 lifted102650 = new lifted10265();
      lifted102650.h_4536 = h_4536;
      term = filter_1_0.instance.invoke(context, term, lifted102650);
      if(term == null)
        break Fail27737;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}