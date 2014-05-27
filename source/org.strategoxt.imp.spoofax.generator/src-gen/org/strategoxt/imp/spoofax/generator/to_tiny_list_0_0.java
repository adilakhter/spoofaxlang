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

@SuppressWarnings("all") public class to_tiny_list_0_0 extends Strategy 
{ 
  public static to_tiny_list_0_0 instance = new to_tiny_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_tiny_list_0_0");
    Fail25555:
    { 
      TermReference l_4236 = new TermReference();
      TermReference m_4236 = new TermReference();
      IStrategoTerm n_4236 = null;
      IStrategoTerm z_4236 = null;
      IStrategoTerm o_4236 = null;
      IStrategoTerm p_4236 = null;
      n_4236 = term;
      lifted9091 lifted90910 = new lifted9091();
      lifted90910.l_4236 = l_4236;
      lifted90910.m_4236 = m_4236;
      term = try_1_0.instance.invoke(context, term, lifted90910);
      if(term == null)
        break Fail25555;
      term = try_1_0.instance.invoke(context, n_4236, lifted9092.instance);
      if(term == null)
        break Fail25555;
      term = map_1_0.instance.invoke(context, term, to_tiny_substring_0_0.instance);
      if(term == null)
        break Fail25555;
      z_4236 = term;
      term = separate_by_0_1.instance.invoke(context, z_4236, generator.const7071);
      if(term == null)
        break Fail25555;
      p_4236 = term;
      o_4236 = term;
      term = p_4236;
      IStrategoTerm term10097 = term;
      Success10074:
      { 
        Fail25556:
        { 
          IStrategoTerm q_4236 = null;
          q_4236 = term;
          term = o_4236;
          if(l_4236.value == null)
            break Fail25556;
          term = q_4236;
          { 
            term = termFactory.makeTuple(term, generator.constCons4608);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25555;
            if(true)
              break Success10074;
          }
        }
        term = term10097;
        IStrategoTerm term10098 = term;
        Success10075:
        { 
          Fail25557:
          { 
            IStrategoTerm r_4236 = null;
            r_4236 = term;
            term = o_4236;
            if(m_4236.value == null)
              break Fail25557;
            term = r_4236;
            { 
              term = termFactory.makeTuple(term, generator.constCons4609);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25555;
              if(true)
                break Success10075;
            }
          }
          term = term10098;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}