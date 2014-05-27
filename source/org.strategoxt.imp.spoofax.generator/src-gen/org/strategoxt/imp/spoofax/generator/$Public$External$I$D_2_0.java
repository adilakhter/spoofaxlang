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

@SuppressWarnings("all") public class $Public$External$I$D_2_0 extends Strategy 
{ 
  public static $Public$External$I$D_2_0 instance = new $Public$External$I$D_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4405, Strategy s_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PublicExternalID_2_0");
    Fail26820:
    { 
      IStrategoTerm c_4668 = null;
      IStrategoTerm a_4668 = null;
      IStrategoTerm b_4668 = null;
      IStrategoTerm d_4668 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPublicExternalID_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26820;
      a_4668 = term.getSubterm(0);
      b_4668 = term.getSubterm(1);
      IStrategoList annos951 = term.getAnnotations();
      c_4668 = annos951;
      term = r_4405.invoke(context, a_4668);
      if(term == null)
        break Fail26820;
      d_4668 = term;
      term = s_4405.invoke(context, b_4668);
      if(term == null)
        break Fail26820;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consPublicExternalID_2, new IStrategoTerm[]{d_4668, term}), checkListAnnos(termFactory, c_4668));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}