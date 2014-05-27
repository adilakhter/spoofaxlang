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

@SuppressWarnings("all") public class $Version$Decl_1_0 extends Strategy 
{ 
  public static $Version$Decl_1_0 instance = new $Version$Decl_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VersionDecl_1_0");
    Fail26815:
    { 
      IStrategoTerm e_4667 = null;
      IStrategoTerm d_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consVersionDecl_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26815;
      d_4667 = term.getSubterm(0);
      IStrategoList annos946 = term.getAnnotations();
      e_4667 = annos946;
      term = i_4405.invoke(context, d_4667);
      if(term == null)
        break Fail26815;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consVersionDecl_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}