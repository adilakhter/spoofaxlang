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

@SuppressWarnings("all") final class lifted9418 extends Strategy 
{ 
  public static final lifted9418 instance = new lifted9418();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28657:
    { 
      IStrategoTerm term10605 = term;
      Success11347:
      { 
        Fail28658:
        { 
          IStrategoTerm w_4316 = null;
          w_4316 = term;
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28658;
          term = w_4316;
          if(true)
            break Success11347;
        }
        term = term10605;
        IStrategoTerm x_4316 = null;
        IStrategoTerm y_4316 = null;
        IStrategoTerm o_4318 = null;
        IStrategoTerm p_4318 = null;
        IStrategoTerm r_4318 = null;
        IStrategoTerm s_4318 = null;
        IStrategoTerm t_4318 = null;
        x_4316 = term;
        term = find_package_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28657;
        y_4316 = term;
        r_4318 = term;
        o_4318 = generator.const7448;
        s_4318 = r_4318;
        p_4318 = generator.constCons4561;
        t_4318 = s_4318;
        term = termFactory.makeTuple(generator.const7449, y_4316);
        term = dr_set_rule_0_3.instance.invoke(context, t_4318, o_4318, p_4318, term);
        if(term == null)
          break Fail28657;
        term = x_4316;
      }
      if(true)
        return term;
    }
    return null;
  }
}