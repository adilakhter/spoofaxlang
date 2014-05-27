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

@SuppressWarnings("all") public class bigfold_$Is$Reserved$Class$Name_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Reserved$Class$Name_1_0 instance = new bigfold_$Is$Reserved$Class$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4445)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsReservedClassName_1_0");
    Fail27200:
    { 
      IStrategoTerm r_4445 = null;
      IStrategoTerm v_4445 = null;
      IStrategoTerm x_4445 = null;
      r_4445 = term;
      x_4445 = term;
      Success11037:
      { 
        Fail27201:
        { 
          IStrategoTerm z_4445 = null;
          z_4445 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4445, generator.const7167, r_4445);
          if(term == null)
            break Fail27201;
          if(true)
            break Success11037;
        }
        term = generator.constNil7;
      }
      v_4445 = term;
      term = x_4445;
      term = termFactory.makeTuple(v_4445, term);
      term = u_4445.invoke(context, term, lifted10078.instance);
      if(term == null)
        break Fail27200;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}