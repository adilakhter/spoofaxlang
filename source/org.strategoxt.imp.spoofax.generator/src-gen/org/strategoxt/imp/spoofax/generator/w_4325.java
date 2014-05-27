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

@SuppressWarnings("all") final class w_4325 extends Strategy 
{ 
  Strategy v_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28624:
    { 
      IStrategoTerm t_4325 = null;
      IStrategoTerm u_4325 = null;
      IStrategoTerm z_4325 = null;
      IStrategoTerm b_4326 = null;
      IStrategoTerm c_4326 = null;
      IStrategoTerm term10640 = term;
      Success11342:
      { 
        Fail28625:
        { 
          term = $Follow$Visited_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28625;
          { 
            if(true)
              break Fail28624;
            if(true)
              break Success11342;
          }
        }
        term = term10640;
      }
      t_4325 = term;
      u_4325 = term;
      b_4326 = term;
      z_4325 = generator.const7485;
      c_4326 = b_4326;
      term = termFactory.makeTuple(generator.const7486, t_4325);
      term = dr_set_rule_0_3.instance.invoke(context, c_4326, z_4325, t_4325, term);
      if(term == null)
        break Fail28624;
      term = bagof_$Productions_0_0.instance.invoke(context, u_4325);
      if(term == null)
        break Fail28624;
      IStrategoTerm term10641 = term;
      Success11343:
      { 
        Fail28626:
        { 
          term = getfirst_1_0.instance.invoke(context, term, v_4325);
          if(term == null)
            break Fail28626;
          if(true)
            break Success11343;
        }
        term = term10641;
        lifted9453 lifted94530 = new lifted9453();
        lifted94530.v_4325 = v_4325;
        term = getfirst_1_0.instance.invoke(context, term, lifted94530);
        if(term == null)
          break Fail28624;
      }
      if(true)
        return term;
    }
    return null;
  }
}