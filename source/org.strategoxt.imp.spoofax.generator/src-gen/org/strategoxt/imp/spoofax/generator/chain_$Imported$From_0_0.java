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

@SuppressWarnings("all") public class chain_$Imported$From_0_0 extends Strategy 
{ 
  public static chain_$Imported$From_0_0 instance = new chain_$Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ImportedFrom_0_0");
    Fail27076:
    { 
      IStrategoTerm z_4425 = null;
      IStrategoTerm c_4426 = null;
      IStrategoTerm e_4426 = null;
      z_4425 = term;
      e_4426 = term;
      Success11005:
      { 
        Fail27077:
        { 
          IStrategoTerm g_4426 = null;
          g_4426 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4426, generator.const7027, z_4425);
          if(term == null)
            break Fail27077;
          if(true)
            break Success11005;
        }
        term = generator.constNil7;
      }
      c_4426 = term;
      term = e_4426;
      term = termFactory.makeTuple(c_4426, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10036.instance);
      if(term == null)
        break Fail27076;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}