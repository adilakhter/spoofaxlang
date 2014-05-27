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

@SuppressWarnings("all") public class $R$E$P$L$A$C$E$M$E$N$T_3_0 extends Strategy 
{ 
  public static $R$E$P$L$A$C$E$M$E$N$T_3_0 instance = new $R$E$P$L$A$C$E$M$E$N$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4406, Strategy x_4406, Strategy y_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("REPLACEMENT_3_0");
    Fail26843:
    { 
      IStrategoTerm g_4671 = null;
      IStrategoTerm d_4671 = null;
      IStrategoTerm e_4671 = null;
      IStrategoTerm f_4671 = null;
      IStrategoTerm h_4671 = null;
      IStrategoTerm i_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consREPLACEMENT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26843;
      d_4671 = term.getSubterm(0);
      e_4671 = term.getSubterm(1);
      f_4671 = term.getSubterm(2);
      IStrategoList annos970 = term.getAnnotations();
      g_4671 = annos970;
      term = w_4406.invoke(context, d_4671);
      if(term == null)
        break Fail26843;
      h_4671 = term;
      term = x_4406.invoke(context, e_4671);
      if(term == null)
        break Fail26843;
      i_4671 = term;
      term = y_4406.invoke(context, f_4671);
      if(term == null)
        break Fail26843;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_3, new IStrategoTerm[]{h_4671, i_4671, term}), checkListAnnos(termFactory, g_4671));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}