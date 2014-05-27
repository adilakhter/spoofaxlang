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

@SuppressWarnings("all") public class chain_$Base$Package_0_0 extends Strategy 
{ 
  public static chain_$Base$Package_0_0 instance = new chain_$Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_BasePackage_0_0");
    Fail27284:
    { 
      IStrategoTerm s_4459 = null;
      IStrategoTerm u_4459 = null;
      u_4459 = term;
      Success11061:
      { 
        Fail27285:
        { 
          IStrategoTerm v_4459 = null;
          IStrategoTerm x_4459 = null;
          IStrategoTerm y_4459 = null;
          x_4459 = term;
          v_4459 = generator.const7448;
          y_4459 = x_4459;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4459, v_4459, generator.constCons4561);
          if(term == null)
            break Fail27285;
          if(true)
            break Success11061;
        }
        term = generator.constNil7;
      }
      s_4459 = term;
      term = u_4459;
      term = termFactory.makeTuple(s_4459, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10108.instance);
      if(term == null)
        break Fail27284;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}