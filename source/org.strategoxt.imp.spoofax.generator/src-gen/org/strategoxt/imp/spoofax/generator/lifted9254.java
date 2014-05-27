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

@SuppressWarnings("all") final class lifted9254 extends Strategy 
{ 
  TermReference t_4264;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28800:
    { 
      IStrategoTerm u_4264 = null;
      IStrategoTerm v_4264 = null;
      v_4264 = term;
      IStrategoTerm term10254 = term;
      Success11374:
      { 
        Fail28801:
        { 
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28801;
          { 
            term = modification_time_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28800;
            if(true)
              break Success11374;
          }
        }
        term = verbose_msg_2_0.instance.invoke(context, term10254, lifted9255.instance, _Id.instance);
        if(term == null)
          break Fail28800;
        if(true)
          break Fail28800;
      }
      u_4264 = term;
      term = v_4264;
      if(t_4264.value == null)
        break Fail28800;
      term = termFactory.makeTuple(t_4264.value, u_4264);
      term = lt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28800;
      if(true)
        return term;
    }
    return null;
  }
}