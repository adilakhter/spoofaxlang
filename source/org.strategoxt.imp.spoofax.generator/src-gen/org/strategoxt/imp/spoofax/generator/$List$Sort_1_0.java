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

@SuppressWarnings("all") public class $List$Sort_1_0 extends Strategy 
{ 
  public static $List$Sort_1_0 instance = new $List$Sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListSort_1_0");
    Fail26947:
    { 
      IStrategoTerm u_4683 = null;
      IStrategoTerm t_4683 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consListSort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26947;
      t_4683 = term.getSubterm(0);
      IStrategoList annos1044 = term.getAnnotations();
      u_4683 = annos1044;
      term = t_4411.invoke(context, t_4683);
      if(term == null)
        break Fail26947;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consListSort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_4683));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}