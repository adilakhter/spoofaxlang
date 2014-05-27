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

@SuppressWarnings("all") public class $Doc$Type$Decl_2_0 extends Strategy 
{ 
  public static $Doc$Type$Decl_2_0 instance = new $Doc$Type$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4404, Strategy y_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DocTypeDecl_2_0");
    Fail26806:
    { 
      IStrategoTerm a_4666 = null;
      IStrategoTerm y_4665 = null;
      IStrategoTerm z_4665 = null;
      IStrategoTerm b_4666 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDocTypeDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26806;
      y_4665 = term.getSubterm(0);
      z_4665 = term.getSubterm(1);
      IStrategoList annos937 = term.getAnnotations();
      a_4666 = annos937;
      term = x_4404.invoke(context, y_4665);
      if(term == null)
        break Fail26806;
      b_4666 = term;
      term = y_4404.invoke(context, z_4665);
      if(term == null)
        break Fail26806;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDocTypeDecl_2, new IStrategoTerm[]{b_4666, term}), checkListAnnos(termFactory, a_4666));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}