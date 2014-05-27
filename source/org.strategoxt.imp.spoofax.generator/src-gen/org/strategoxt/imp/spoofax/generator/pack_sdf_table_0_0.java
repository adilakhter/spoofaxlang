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

@SuppressWarnings("all") public class pack_sdf_table_0_0 extends Strategy 
{ 
  public static pack_sdf_table_0_0 instance = new pack_sdf_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pack_sdf_table_0_0");
    Fail25484:
    { 
      Success10049:
      { 
        Fail25485:
        { 
          term = $Pack$S$D$F$Table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25485;
          if(true)
            break Success10049;
        }
        IStrategoTerm j_4224 = null;
        IStrategoTerm k_4224 = null;
        IStrategoTerm o_4224 = null;
        IStrategoTerm p_4224 = null;
        IStrategoTerm r_4224 = null;
        IStrategoTerm s_4224 = null;
        IStrategoTerm t_4224 = null;
        term = open_parse_table_0_0.instance.invoke(context, generator.constSdf2Baf);
        if(term == null)
          break Fail25484;
        j_4224 = term;
        k_4224 = term;
        r_4224 = term;
        o_4224 = generator.const7022;
        s_4224 = r_4224;
        p_4224 = generator.constCons4561;
        t_4224 = s_4224;
        term = termFactory.makeTuple(generator.const7023, k_4224);
        term = dr_set_rule_0_3.instance.invoke(context, t_4224, o_4224, p_4224, term);
        if(term == null)
          break Fail25484;
        term = j_4224;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}