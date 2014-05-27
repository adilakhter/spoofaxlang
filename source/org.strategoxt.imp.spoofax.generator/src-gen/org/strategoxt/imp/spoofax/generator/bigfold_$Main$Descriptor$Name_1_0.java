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

@SuppressWarnings("all") public class bigfold_$Main$Descriptor$Name_1_0 extends Strategy 
{ 
  public static bigfold_$Main$Descriptor$Name_1_0 instance = new bigfold_$Main$Descriptor$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4533)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_MainDescriptorName_1_0");
    Fail27724:
    { 
      IStrategoTerm q_4533 = null;
      IStrategoTerm s_4533 = null;
      s_4533 = term;
      Success11181:
      { 
        Fail27725:
        { 
          IStrategoTerm t_4533 = null;
          IStrategoTerm v_4533 = null;
          IStrategoTerm w_4533 = null;
          v_4533 = term;
          t_4533 = generator.const7897;
          w_4533 = v_4533;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4533, t_4533, generator.constCons4561);
          if(term == null)
            break Fail27725;
          if(true)
            break Success11181;
        }
        term = generator.constNil7;
      }
      q_4533 = term;
      term = s_4533;
      term = termFactory.makeTuple(q_4533, term);
      term = p_4533.invoke(context, term, lifted10258.instance);
      if(term == null)
        break Fail27724;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}