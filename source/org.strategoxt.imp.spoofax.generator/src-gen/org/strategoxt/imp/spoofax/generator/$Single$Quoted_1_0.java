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

@SuppressWarnings("all") public class $Single$Quoted_1_0 extends Strategy 
{ 
  public static $Single$Quoted_1_0 instance = new $Single$Quoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleQuoted_1_0");
    Fail26798:
    { 
      IStrategoTerm z_4664 = null;
      IStrategoTerm y_4664 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSingleQuoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26798;
      y_4664 = term.getSubterm(0);
      IStrategoList annos929 = term.getAnnotations();
      z_4664 = annos929;
      term = o_4404.invoke(context, y_4664);
      if(term == null)
        break Fail26798;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consSingleQuoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_4664));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}