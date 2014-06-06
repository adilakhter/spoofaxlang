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

@SuppressWarnings("all") public class $Attribute$Ref_1_0 extends Strategy 
{ 
  public static $Attribute$Ref_1_0 instance = new $Attribute$Ref_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AttributeRef_1_0");
    Fail26884:
    { 
      IStrategoTerm j_4673 = null;
      IStrategoTerm i_4673 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAttributeRef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26884;
      i_4673 = term.getSubterm(0);
      IStrategoList annos983 = term.getAnnotations();
      j_4673 = annos983;
      term = s_4407.invoke(context, i_4673);
      if(term == null)
        break Fail26884;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consAttributeRef_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_4673));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}