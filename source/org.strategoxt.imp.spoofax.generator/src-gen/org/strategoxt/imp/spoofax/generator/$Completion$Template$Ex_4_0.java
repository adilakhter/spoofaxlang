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

@SuppressWarnings("all") public class $Completion$Template$Ex_4_0 extends Strategy 
{ 
  public static $Completion$Template$Ex_4_0 instance = new $Completion$Template$Ex_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4410, Strategy o_4410, Strategy p_4410, Strategy q_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTemplateEx_4_0");
    Fail26932:
    { 
      IStrategoTerm w_4680 = null;
      IStrategoTerm s_4680 = null;
      IStrategoTerm t_4680 = null;
      IStrategoTerm u_4680 = null;
      IStrategoTerm v_4680 = null;
      IStrategoTerm x_4680 = null;
      IStrategoTerm y_4680 = null;
      IStrategoTerm z_4680 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionTemplateEx_4 != ((IStrategoAppl)term).getConstructor())
        break Fail26932;
      s_4680 = term.getSubterm(0);
      t_4680 = term.getSubterm(1);
      u_4680 = term.getSubterm(2);
      v_4680 = term.getSubterm(3);
      IStrategoList annos1029 = term.getAnnotations();
      w_4680 = annos1029;
      term = n_4410.invoke(context, s_4680);
      if(term == null)
        break Fail26932;
      x_4680 = term;
      term = o_4410.invoke(context, t_4680);
      if(term == null)
        break Fail26932;
      y_4680 = term;
      term = p_4410.invoke(context, u_4680);
      if(term == null)
        break Fail26932;
      z_4680 = term;
      term = q_4410.invoke(context, v_4680);
      if(term == null)
        break Fail26932;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateEx_4, new IStrategoTerm[]{x_4680, y_4680, z_4680, term}), checkListAnnos(termFactory, w_4680));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}