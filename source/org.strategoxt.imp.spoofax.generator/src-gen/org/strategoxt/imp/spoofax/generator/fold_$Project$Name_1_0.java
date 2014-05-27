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

@SuppressWarnings("all") public class fold_$Project$Name_1_0 extends Strategy 
{ 
  public static fold_$Project$Name_1_0 instance = new fold_$Project$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4506)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ProjectName_1_0");
    Fail27570:
    { 
      IStrategoTerm z_4506 = null;
      IStrategoTerm b_4507 = null;
      b_4507 = term;
      Success11140:
      { 
        Fail27571:
        { 
          IStrategoTerm c_4507 = null;
          IStrategoTerm e_4507 = null;
          IStrategoTerm f_4507 = null;
          e_4507 = term;
          c_4507 = generator.const7876;
          f_4507 = e_4507;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4507, c_4507, generator.constCons4561);
          if(term == null)
            break Fail27571;
          if(true)
            break Success11140;
        }
        term = generator.constNil7;
      }
      z_4506 = term;
      term = b_4507;
      term = termFactory.makeTuple(z_4506, term);
      term = y_4506.invoke(context, term, lifted10205.instance);
      if(term == null)
        break Fail27570;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}