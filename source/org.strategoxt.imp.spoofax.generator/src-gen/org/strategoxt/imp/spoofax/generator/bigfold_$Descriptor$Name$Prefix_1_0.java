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

@SuppressWarnings("all") public class bigfold_$Descriptor$Name$Prefix_1_0 extends Strategy 
{ 
  public static bigfold_$Descriptor$Name$Prefix_1_0 instance = new bigfold_$Descriptor$Name$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4529)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DescriptorNamePrefix_1_0");
    Fail27698:
    { 
      IStrategoTerm j_4529 = null;
      IStrategoTerm l_4529 = null;
      l_4529 = term;
      Success11174:
      { 
        Fail27699:
        { 
          IStrategoTerm m_4529 = null;
          IStrategoTerm o_4529 = null;
          IStrategoTerm p_4529 = null;
          o_4529 = term;
          m_4529 = generator.const7899;
          p_4529 = o_4529;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4529, m_4529, generator.constCons4561);
          if(term == null)
            break Fail27699;
          if(true)
            break Success11174;
        }
        term = generator.constNil7;
      }
      j_4529 = term;
      term = l_4529;
      term = termFactory.makeTuple(j_4529, term);
      term = i_4529.invoke(context, term, lifted10249.instance);
      if(term == null)
        break Fail27698;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}