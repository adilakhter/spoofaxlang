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

@SuppressWarnings("all") public class fold_$Descriptor$P$P$Table_1_0 extends Strategy 
{ 
  public static fold_$Descriptor$P$P$Table_1_0 instance = new fold_$Descriptor$P$P$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4429)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DescriptorPPTable_1_0");
    Fail27098:
    { 
      IStrategoTerm h_4429 = null;
      IStrategoTerm j_4429 = null;
      j_4429 = term;
      Success11010:
      { 
        Fail27099:
        { 
          IStrategoTerm k_4429 = null;
          IStrategoTerm m_4429 = null;
          IStrategoTerm n_4429 = null;
          m_4429 = term;
          k_4429 = generator.const7124;
          n_4429 = m_4429;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4429, k_4429, generator.constCons4561);
          if(term == null)
            break Fail27099;
          if(true)
            break Success11010;
        }
        term = generator.constNil7;
      }
      h_4429 = term;
      term = j_4429;
      term = termFactory.makeTuple(h_4429, term);
      term = g_4429.invoke(context, term, lifted10043.instance);
      if(term == null)
        break Fail27098;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}