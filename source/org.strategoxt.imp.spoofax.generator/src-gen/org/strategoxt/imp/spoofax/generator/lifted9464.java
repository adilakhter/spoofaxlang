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

@SuppressWarnings("all") final class lifted9464 extends Strategy 
{ 
  public static final lifted9464 instance = new lifted9464();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28608:
    { 
      IStrategoTerm y_4327 = null;
      IStrategoTerm z_4327 = null;
      IStrategoTerm a_4328 = null;
      IStrategoTerm b_4328 = null;
      IStrategoTerm c_4328 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28608;
      y_4327 = ((IStrategoList)term).head();
      z_4327 = ((IStrategoList)term).tail();
      IStrategoList annos922 = term.getAnnotations();
      c_4328 = annos922;
      term = $Appl_2_0.instance.invoke(context, y_4327, is_list_term_0_0.instance, _Id.instance);
      if(term == null)
        break Fail28608;
      a_4328 = term;
      term = z_4327;
      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
        break Fail28608;
      b_4328 = term;
      IStrategoList list401;
      list401 = checkListTail(b_4328);
      if(list401 == null)
        break Fail28608;
      term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(a_4328, list401), checkListAnnos(termFactory, c_4328));
      if(true)
        return term;
    }
    return null;
  }
}