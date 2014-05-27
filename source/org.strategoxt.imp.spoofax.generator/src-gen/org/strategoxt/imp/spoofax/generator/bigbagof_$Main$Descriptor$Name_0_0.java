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

@SuppressWarnings("all") public class bigbagof_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static bigbagof_$Main$Descriptor$Name_0_0 instance = new bigbagof_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_MainDescriptorName_0_0");
    Fail27732:
    { 
      TermReference h_4535 = new TermReference();
      if(h_4535.value == null)
        h_4535.value = term;
      else
        if(h_4535.value != term && !h_4535.value.match(term))
          break Fail27732;
      Success11185:
      { 
        Fail27733:
        { 
          IStrategoTerm k_4535 = null;
          IStrategoTerm m_4535 = null;
          IStrategoTerm n_4535 = null;
          m_4535 = term;
          k_4535 = generator.const7897;
          n_4535 = m_4535;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_4535, k_4535, generator.constCons4561);
          if(term == null)
            break Fail27733;
          if(true)
            break Success11185;
        }
        term = generator.constNil7;
      }
      lifted10262 lifted102620 = new lifted10262();
      lifted102620.h_4535 = h_4535;
      term = filter_1_0.instance.invoke(context, term, lifted102620);
      if(term == null)
        break Fail27732;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}