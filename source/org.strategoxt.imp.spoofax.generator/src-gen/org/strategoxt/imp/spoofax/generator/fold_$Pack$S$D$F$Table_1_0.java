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

@SuppressWarnings("all") public class fold_$Pack$S$D$F$Table_1_0 extends Strategy 
{ 
  public static fold_$Pack$S$D$F$Table_1_0 instance = new fold_$Pack$S$D$F$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4420)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_PackSDFTable_1_0");
    Fail27046:
    { 
      IStrategoTerm x_4420 = null;
      IStrategoTerm z_4420 = null;
      z_4420 = term;
      Success10996:
      { 
        Fail27047:
        { 
          IStrategoTerm a_4421 = null;
          IStrategoTerm c_4421 = null;
          IStrategoTerm d_4421 = null;
          c_4421 = term;
          a_4421 = generator.const7022;
          d_4421 = c_4421;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4421, a_4421, generator.constCons4561);
          if(term == null)
            break Fail27047;
          if(true)
            break Success10996;
        }
        term = generator.constNil7;
      }
      x_4420 = term;
      term = z_4420;
      term = termFactory.makeTuple(x_4420, term);
      term = w_4420.invoke(context, term, lifted10025.instance);
      if(term == null)
        break Fail27046;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}