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

@SuppressWarnings("all") public class bigchain_$Input$File_0_0 extends Strategy 
{ 
  public static bigchain_$Input$File_0_0 instance = new bigchain_$Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_InputFile_0_0");
    Fail27520:
    { 
      IStrategoTerm w_4498 = null;
      IStrategoTerm y_4498 = null;
      y_4498 = term;
      Success11127:
      { 
        Fail27521:
        { 
          IStrategoTerm z_4498 = null;
          IStrategoTerm b_4499 = null;
          IStrategoTerm c_4499 = null;
          b_4499 = term;
          z_4498 = generator.const7868;
          c_4499 = b_4499;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4499, z_4498, generator.constCons4561);
          if(term == null)
            break Fail27521;
          if(true)
            break Success11127;
        }
        term = generator.constNil7;
      }
      w_4498 = term;
      term = y_4498;
      term = termFactory.makeTuple(w_4498, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10188.instance);
      if(term == null)
        break Fail27520;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}