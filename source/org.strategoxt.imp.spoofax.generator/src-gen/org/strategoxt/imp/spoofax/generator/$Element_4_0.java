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

@SuppressWarnings("all") public class $Element_4_0 extends Strategy 
{ 
  public static $Element_4_0 instance = new $Element_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4404, Strategy f_4404, Strategy g_4404, Strategy h_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Element_4_0");
    Fail26794:
    { 
      IStrategoTerm e_4664 = null;
      IStrategoTerm a_4664 = null;
      IStrategoTerm b_4664 = null;
      IStrategoTerm c_4664 = null;
      IStrategoTerm d_4664 = null;
      IStrategoTerm f_4664 = null;
      IStrategoTerm g_4664 = null;
      IStrategoTerm h_4664 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consElement_4 != ((IStrategoAppl)term).getConstructor())
        break Fail26794;
      a_4664 = term.getSubterm(0);
      b_4664 = term.getSubterm(1);
      c_4664 = term.getSubterm(2);
      d_4664 = term.getSubterm(3);
      IStrategoList annos925 = term.getAnnotations();
      e_4664 = annos925;
      term = e_4404.invoke(context, a_4664);
      if(term == null)
        break Fail26794;
      f_4664 = term;
      term = f_4404.invoke(context, b_4664);
      if(term == null)
        break Fail26794;
      g_4664 = term;
      term = g_4404.invoke(context, c_4664);
      if(term == null)
        break Fail26794;
      h_4664 = term;
      term = h_4404.invoke(context, d_4664);
      if(term == null)
        break Fail26794;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consElement_4, new IStrategoTerm[]{f_4664, g_4664, h_4664, term}), checkListAnnos(termFactory, e_4664));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}