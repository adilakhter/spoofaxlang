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

@SuppressWarnings("all") public class bigchain_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static bigchain_$Main$Descriptor$Name_0_0 instance = new bigchain_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_MainDescriptorName_0_0");
    Fail27728:
    { 
      IStrategoTerm n_4534 = null;
      IStrategoTerm p_4534 = null;
      p_4534 = term;
      Success11183:
      { 
        Fail27729:
        { 
          IStrategoTerm q_4534 = null;
          IStrategoTerm s_4534 = null;
          IStrategoTerm t_4534 = null;
          s_4534 = term;
          q_4534 = generator.const7897;
          t_4534 = s_4534;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4534, q_4534, generator.constCons4561);
          if(term == null)
            break Fail27729;
          if(true)
            break Success11183;
        }
        term = generator.constNil7;
      }
      n_4534 = term;
      term = p_4534;
      term = termFactory.makeTuple(n_4534, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10260.instance);
      if(term == null)
        break Fail27728;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}