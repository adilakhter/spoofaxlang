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

@SuppressWarnings("all") final class lifted9421 extends Strategy 
{ 
  public static final lifted9421 instance = new lifted9421();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28654:
    { 
      IStrategoTerm term10607 = term;
      Success11346:
      { 
        Fail28655:
        { 
          IStrategoTerm a_4317 = null;
          a_4317 = term;
          term = $Editor$Extensions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28655;
          term = a_4317;
          if(true)
            break Success11346;
        }
        term = term10607;
        IStrategoTerm b_4317 = null;
        IStrategoTerm c_4317 = null;
        IStrategoTerm a_4319 = null;
        IStrategoTerm b_4319 = null;
        IStrategoTerm d_4319 = null;
        IStrategoTerm e_4319 = null;
        IStrategoTerm f_4319 = null;
        b_4317 = term;
        term = find_editor_extensions_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28654;
        c_4317 = term;
        d_4319 = term;
        a_4319 = generator.const7453;
        e_4319 = d_4319;
        b_4319 = generator.constCons4561;
        f_4319 = e_4319;
        term = termFactory.makeTuple(generator.const7454, c_4317);
        term = dr_set_rule_0_3.instance.invoke(context, f_4319, a_4319, b_4319, term);
        if(term == null)
          break Fail28654;
        term = b_4317;
      }
      if(true)
        return term;
    }
    return null;
  }
}