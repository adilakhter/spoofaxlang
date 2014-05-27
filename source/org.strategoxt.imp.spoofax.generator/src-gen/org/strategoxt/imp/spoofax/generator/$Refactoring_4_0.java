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

@SuppressWarnings("all") public class $Refactoring_4_0 extends Strategy 
{ 
  public static $Refactoring_4_0 instance = new $Refactoring_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4410, Strategy d_4410, Strategy e_4410, Strategy f_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Refactoring_4_0");
    Fail26926:
    { 
      IStrategoTerm u_4679 = null;
      IStrategoTerm q_4679 = null;
      IStrategoTerm r_4679 = null;
      IStrategoTerm s_4679 = null;
      IStrategoTerm t_4679 = null;
      IStrategoTerm v_4679 = null;
      IStrategoTerm w_4679 = null;
      IStrategoTerm x_4679 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRefactoring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail26926;
      q_4679 = term.getSubterm(0);
      r_4679 = term.getSubterm(1);
      s_4679 = term.getSubterm(2);
      t_4679 = term.getSubterm(3);
      IStrategoList annos1023 = term.getAnnotations();
      u_4679 = annos1023;
      term = c_4410.invoke(context, q_4679);
      if(term == null)
        break Fail26926;
      v_4679 = term;
      term = d_4410.invoke(context, r_4679);
      if(term == null)
        break Fail26926;
      w_4679 = term;
      term = e_4410.invoke(context, s_4679);
      if(term == null)
        break Fail26926;
      x_4679 = term;
      term = f_4410.invoke(context, t_4679);
      if(term == null)
        break Fail26926;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consRefactoring_4, new IStrategoTerm[]{v_4679, w_4679, x_4679, term}), checkListAnnos(termFactory, u_4679));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}