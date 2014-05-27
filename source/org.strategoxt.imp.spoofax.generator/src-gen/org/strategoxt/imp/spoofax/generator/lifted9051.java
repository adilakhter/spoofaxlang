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

@SuppressWarnings("all") final class lifted9051 extends Strategy 
{ 
  TermReference d_4227;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28985:
    { 
      IStrategoTerm e_4227 = null;
      e_4227 = term;
      IStrategoTerm term10076 = term;
      Success11413:
      { 
        Fail28986:
        { 
          IStrategoTerm f_4227 = null;
          IStrategoTerm g_4227 = null;
          IStrategoTerm h_4227 = null;
          f_4227 = term;
          h_4227 = term;
          g_4227 = term;
          term = h_4227;
          if(d_4227.value == null)
            break Fail28986;
          term = termFactory.makeTuple(g_4227, d_4227.value);
          term = elem_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28986;
          term = f_4227;
          term = termFactory.makeTuple(generator.const7041, term);
          term = set_config_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28986;
          if(true)
            break Success11413;
        }
        term = term10076;
        IStrategoTerm k_4227 = null;
        IStrategoTerm m_4227 = null;
        IStrategoTerm l_4227 = null;
        IStrategoTerm n_4227 = null;
        m_4227 = term;
        k_4227 = term;
        term = m_4227;
        n_4227 = m_4227;
        if(d_4227.value == null)
          break Fail28985;
        term = termFactory.makeTuple(generator.const7045, d_4227.value);
        term = separate_by_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28985;
        l_4227 = term;
        term = n_4227;
        IStrategoList list370;
        list370 = checkListTail(l_4227);
        if(list370 == null)
          break Fail28985;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const6988, termFactory.makeListCons(k_4227, termFactory.makeListCons(generator.const7046, list370)));
        term = fatal_error_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28985;
      }
      term = e_4227;
      if(true)
        return term;
    }
    return null;
  }
}