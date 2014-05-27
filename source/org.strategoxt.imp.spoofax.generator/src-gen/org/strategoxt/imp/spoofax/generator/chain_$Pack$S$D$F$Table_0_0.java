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

@SuppressWarnings("all") public class chain_$Pack$S$D$F$Table_0_0 extends Strategy 
{ 
  public static chain_$Pack$S$D$F$Table_0_0 instance = new chain_$Pack$S$D$F$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_PackSDFTable_0_0");
    Fail27050:
    { 
      IStrategoTerm t_4421 = null;
      IStrategoTerm v_4421 = null;
      v_4421 = term;
      Success10998:
      { 
        Fail27051:
        { 
          IStrategoTerm w_4421 = null;
          IStrategoTerm y_4421 = null;
          IStrategoTerm z_4421 = null;
          y_4421 = term;
          w_4421 = generator.const7022;
          z_4421 = y_4421;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4421, w_4421, generator.constCons4561);
          if(term == null)
            break Fail27051;
          if(true)
            break Success10998;
        }
        term = generator.constNil7;
      }
      t_4421 = term;
      term = v_4421;
      term = termFactory.makeTuple(t_4421, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10027.instance);
      if(term == null)
        break Fail27050;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}