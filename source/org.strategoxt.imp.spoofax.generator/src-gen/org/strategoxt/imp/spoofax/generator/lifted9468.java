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

@SuppressWarnings("all") final class lifted9468 extends Strategy 
{ 
  public static final lifted9468 instance = new lifted9468();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28607:
    { 
      IStrategoTerm t_4327 = null;
      IStrategoTerm u_4327 = null;
      IStrategoTerm v_4327 = null;
      IStrategoTerm w_4327 = null;
      IStrategoTerm x_4327 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28607;
      t_4327 = ((IStrategoList)term).head();
      u_4327 = ((IStrategoList)term).tail();
      IStrategoList annos923 = term.getAnnotations();
      x_4327 = annos923;
      term = $Appl_2_0.instance.invoke(context, t_4327, is_list_term_0_0.instance, _Id.instance);
      if(term == null)
        break Fail28607;
      v_4327 = term;
      term = u_4327;
      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
        break Fail28607;
      w_4327 = term;
      IStrategoList list402;
      list402 = checkListTail(w_4327);
      if(list402 == null)
        break Fail28607;
      term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(v_4327, list402), checkListAnnos(termFactory, x_4327));
      if(true)
        return term;
    }
    return null;
  }
}