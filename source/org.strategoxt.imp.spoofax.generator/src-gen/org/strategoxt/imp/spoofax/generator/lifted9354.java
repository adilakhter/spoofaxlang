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

@SuppressWarnings("all") final class lifted9354 extends Strategy 
{ 
  public static final lifted9354 instance = new lifted9354();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28700:
    { 
      TermReference t_4302 = new TermReference();
      TermReference u_4302 = new TermReference();
      IStrategoTerm v_4302 = null;
      IStrategoTerm term10513 = term;
      Success11354:
      { 
        Fail28701:
        { 
          term = is_list_production_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28701;
          { 
            if(true)
              break Fail28700;
            if(true)
              break Success11354;
          }
        }
        term = term10513;
      }
      v_4302 = term;
      term = heuristic_child_sorts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28700;
      lifted9355 lifted93550 = new lifted9355();
      lifted93550.t_4302 = t_4302;
      term = SRTS_one.instance.invoke(context, term, lifted93550);
      if(term == null)
        break Fail28700;
      lifted9356 lifted93560 = new lifted9356();
      lifted93560.u_4302 = u_4302;
      term = SRTS_one.instance.invoke(context, term, lifted93560);
      if(term == null)
        break Fail28700;
      term = v_4302;
      lifted9357 lifted93570 = new lifted9357();
      lifted93570.u_4302 = u_4302;
      lifted93570.t_4302 = t_4302;
      term = if_verbose3_1_0.instance.invoke(context, term, lifted93570);
      if(term == null)
        break Fail28700;
      if(true)
        return term;
    }
    return null;
  }
}