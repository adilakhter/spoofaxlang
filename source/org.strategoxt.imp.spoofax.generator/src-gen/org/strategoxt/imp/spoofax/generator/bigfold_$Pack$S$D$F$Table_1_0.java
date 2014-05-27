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

@SuppressWarnings("all") public class bigfold_$Pack$S$D$F$Table_1_0 extends Strategy 
{ 
  public static bigfold_$Pack$S$D$F$Table_1_0 instance = new bigfold_$Pack$S$D$F$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4420)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_PackSDFTable_1_0");
    Fail27044:
    { 
      IStrategoTerm l_4420 = null;
      IStrategoTerm n_4420 = null;
      n_4420 = term;
      Success10995:
      { 
        Fail27045:
        { 
          IStrategoTerm o_4420 = null;
          IStrategoTerm q_4420 = null;
          IStrategoTerm r_4420 = null;
          q_4420 = term;
          o_4420 = generator.const7022;
          r_4420 = q_4420;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_4420, o_4420, generator.constCons4561);
          if(term == null)
            break Fail27045;
          if(true)
            break Success10995;
        }
        term = generator.constNil7;
      }
      l_4420 = term;
      term = n_4420;
      term = termFactory.makeTuple(l_4420, term);
      term = k_4420.invoke(context, term, lifted10024.instance);
      if(term == null)
        break Fail27044;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}