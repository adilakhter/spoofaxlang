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

@SuppressWarnings("all") public class chain_$Project$Name_0_0 extends Strategy 
{ 
  public static chain_$Project$Name_0_0 instance = new chain_$Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ProjectName_0_0");
    Fail27574:
    { 
      IStrategoTerm v_4507 = null;
      IStrategoTerm x_4507 = null;
      x_4507 = term;
      Success11142:
      { 
        Fail27575:
        { 
          IStrategoTerm y_4507 = null;
          IStrategoTerm a_4508 = null;
          IStrategoTerm b_4508 = null;
          a_4508 = term;
          y_4507 = generator.const7876;
          b_4508 = a_4508;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4508, y_4507, generator.constCons4561);
          if(term == null)
            break Fail27575;
          if(true)
            break Success11142;
        }
        term = generator.constNil7;
      }
      v_4507 = term;
      term = x_4507;
      term = termFactory.makeTuple(v_4507, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10207.instance);
      if(term == null)
        break Fail27574;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}