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

@SuppressWarnings("all") final class lifted9270 extends Strategy 
{ 
  TermReference o_4541;

  Strategy n_4541;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28786:
    { 
      IStrategoTerm term10278 = term;
      Success11371:
      { 
        Fail28787:
        { 
          term = n_4541.invoke(context, term);
          if(term == null)
            break Fail28787;
          if(true)
            break Success11371;
        }
        term = term10278;
        IStrategoTerm t_4269 = null;
        IStrategoTerm v_4269 = null;
        t_4269 = term;
        if(o_4541.value == null)
          break Fail28786;
        term = (IStrategoTerm)termFactory.makeListCons(o_4541.value, (IStrategoList)generator.constNil7);
        term = ast2abox_0_1.instance.invoke(context, t_4269, term);
        if(term == null)
          break Fail28786;
        v_4269 = term;
        term = box2text_string_0_1.instance.invoke(context, v_4269, generator.const7040);
        if(term == null)
          break Fail28786;
      }
      if(true)
        return term;
    }
    return null;
  }
}