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

@SuppressWarnings("all") public class chain_$Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static chain_$Descriptor$P$P$Table_0_0 instance = new chain_$Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DescriptorPPTable_0_0");
    Fail27102:
    { 
      IStrategoTerm d_4430 = null;
      IStrategoTerm f_4430 = null;
      f_4430 = term;
      Success11012:
      { 
        Fail27103:
        { 
          IStrategoTerm g_4430 = null;
          IStrategoTerm i_4430 = null;
          IStrategoTerm j_4430 = null;
          i_4430 = term;
          g_4430 = generator.const7124;
          j_4430 = i_4430;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_4430, g_4430, generator.constCons4561);
          if(term == null)
            break Fail27103;
          if(true)
            break Success11012;
        }
        term = generator.constNil7;
      }
      d_4430 = term;
      term = f_4430;
      term = termFactory.makeTuple(d_4430, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10045.instance);
      if(term == null)
        break Fail27102;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}