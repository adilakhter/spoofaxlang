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

@SuppressWarnings("all") public class $Color$Rule_2_0 extends Strategy 
{ 
  public static $Color$Rule_2_0 instance = new $Color$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4408, Strategy f_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRule_2_0");
    Fail26889:
    { 
      IStrategoTerm n_4674 = null;
      IStrategoTerm l_4674 = null;
      IStrategoTerm m_4674 = null;
      IStrategoTerm o_4674 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26889;
      l_4674 = term.getSubterm(0);
      m_4674 = term.getSubterm(1);
      IStrategoList annos988 = term.getAnnotations();
      n_4674 = annos988;
      term = e_4408.invoke(context, l_4674);
      if(term == null)
        break Fail26889;
      o_4674 = term;
      term = f_4408.invoke(context, m_4674);
      if(term == null)
        break Fail26889;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorRule_2, new IStrategoTerm[]{o_4674, term}), checkListAnnos(termFactory, n_4674));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}