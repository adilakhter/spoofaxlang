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

@SuppressWarnings("all") final class lifted9473 extends Strategy 
{ 
  public static final lifted9473 instance = new lifted9473();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28601:
    { 
      IStrategoTerm e_4328 = null;
      IStrategoTerm f_4328 = null;
      IStrategoTerm g_4328 = null;
      IStrategoTerm h_4328 = null;
      IStrategoTerm i_4328 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28601;
      e_4328 = ((IStrategoList)term).head();
      f_4328 = ((IStrategoList)term).tail();
      IStrategoList annos924 = term.getAnnotations();
      i_4328 = annos924;
      term = $Appl_2_0.instance.invoke(context, e_4328, lifted9474.instance, _Id.instance);
      if(term == null)
        break Fail28601;
      g_4328 = term;
      term = f_4328;
      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
        break Fail28601;
      h_4328 = term;
      IStrategoList list403;
      list403 = checkListTail(h_4328);
      if(list403 == null)
        break Fail28601;
      term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(g_4328, list403), checkListAnnos(termFactory, i_4328));
      if(true)
        return term;
    }
    return null;
  }
}