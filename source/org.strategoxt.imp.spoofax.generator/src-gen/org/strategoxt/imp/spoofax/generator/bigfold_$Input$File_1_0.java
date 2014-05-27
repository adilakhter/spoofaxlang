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

@SuppressWarnings("all") public class bigfold_$Input$File_1_0 extends Strategy 
{ 
  public static bigfold_$Input$File_1_0 instance = new bigfold_$Input$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4497)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_InputFile_1_0");
    Fail27516:
    { 
      IStrategoTerm z_4497 = null;
      IStrategoTerm b_4498 = null;
      b_4498 = term;
      Success11125:
      { 
        Fail27517:
        { 
          IStrategoTerm c_4498 = null;
          IStrategoTerm e_4498 = null;
          IStrategoTerm f_4498 = null;
          e_4498 = term;
          c_4498 = generator.const7868;
          f_4498 = e_4498;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4498, c_4498, generator.constCons4561);
          if(term == null)
            break Fail27517;
          if(true)
            break Success11125;
        }
        term = generator.constNil7;
      }
      z_4497 = term;
      term = b_4498;
      term = termFactory.makeTuple(z_4497, term);
      term = y_4497.invoke(context, term, lifted10186.instance);
      if(term == null)
        break Fail27516;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}