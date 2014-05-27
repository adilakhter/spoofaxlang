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

@SuppressWarnings("all") public class $Q$Name_2_0 extends Strategy 
{ 
  public static $Q$Name_2_0 instance = new $Q$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4405, Strategy y_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QName_2_0");
    Fail26824:
    { 
      IStrategoTerm s_4668 = null;
      IStrategoTerm q_4668 = null;
      IStrategoTerm r_4668 = null;
      IStrategoTerm t_4668 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consQName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26824;
      q_4668 = term.getSubterm(0);
      r_4668 = term.getSubterm(1);
      IStrategoList annos955 = term.getAnnotations();
      s_4668 = annos955;
      term = x_4405.invoke(context, q_4668);
      if(term == null)
        break Fail26824;
      t_4668 = term;
      term = y_4405.invoke(context, r_4668);
      if(term == null)
        break Fail26824;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consQName_2, new IStrategoTerm[]{t_4668, term}), checkListAnnos(termFactory, s_4668));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}