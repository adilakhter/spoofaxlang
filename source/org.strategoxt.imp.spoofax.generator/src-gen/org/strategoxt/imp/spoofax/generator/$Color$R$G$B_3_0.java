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

@SuppressWarnings("all") public class $Color$R$G$B_3_0 extends Strategy 
{ 
  public static $Color$R$G$B_3_0 instance = new $Color$R$G$B_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4407, Strategy p_4407, Strategy q_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRGB_3_0");
    Fail26868:
    { 
      IStrategoTerm b_4673 = null;
      IStrategoTerm y_4672 = null;
      IStrategoTerm z_4672 = null;
      IStrategoTerm a_4673 = null;
      IStrategoTerm c_4673 = null;
      IStrategoTerm d_4673 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorRGB_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26868;
      y_4672 = term.getSubterm(0);
      z_4672 = term.getSubterm(1);
      a_4673 = term.getSubterm(2);
      IStrategoList annos981 = term.getAnnotations();
      b_4673 = annos981;
      term = o_4407.invoke(context, y_4672);
      if(term == null)
        break Fail26868;
      c_4673 = term;
      term = p_4407.invoke(context, z_4672);
      if(term == null)
        break Fail26868;
      d_4673 = term;
      term = q_4407.invoke(context, a_4673);
      if(term == null)
        break Fail26868;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorRGB_3, new IStrategoTerm[]{c_4673, d_4673, term}), checkListAnnos(termFactory, b_4673));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}