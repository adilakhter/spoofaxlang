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

@SuppressWarnings("all") public class $Block$Comment$Def_3_0 extends Strategy 
{ 
  public static $Block$Comment$Def_3_0 instance = new $Block$Comment$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4408, Strategy r_4408, Strategy s_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BlockCommentDef_3_0");
    Fail26898:
    { 
      IStrategoTerm t_4675 = null;
      IStrategoTerm q_4675 = null;
      IStrategoTerm r_4675 = null;
      IStrategoTerm s_4675 = null;
      IStrategoTerm u_4675 = null;
      IStrategoTerm v_4675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consBlockCommentDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26898;
      q_4675 = term.getSubterm(0);
      r_4675 = term.getSubterm(1);
      s_4675 = term.getSubterm(2);
      IStrategoList annos995 = term.getAnnotations();
      t_4675 = annos995;
      term = q_4408.invoke(context, q_4675);
      if(term == null)
        break Fail26898;
      u_4675 = term;
      term = r_4408.invoke(context, r_4675);
      if(term == null)
        break Fail26898;
      v_4675 = term;
      term = s_4408.invoke(context, s_4675);
      if(term == null)
        break Fail26898;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consBlockCommentDef_3, new IStrategoTerm[]{u_4675, v_4675, term}), checkListAnnos(termFactory, t_4675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}