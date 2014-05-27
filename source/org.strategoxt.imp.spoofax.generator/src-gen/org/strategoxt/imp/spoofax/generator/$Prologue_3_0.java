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

@SuppressWarnings("all") public class $Prologue_3_0 extends Strategy 
{ 
  public static $Prologue_3_0 instance = new $Prologue_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4405, Strategy p_4405, Strategy q_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prologue_3_0");
    Fail26819:
    { 
      IStrategoTerm w_4667 = null;
      IStrategoTerm t_4667 = null;
      IStrategoTerm u_4667 = null;
      IStrategoTerm v_4667 = null;
      IStrategoTerm x_4667 = null;
      IStrategoTerm y_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPrologue_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26819;
      t_4667 = term.getSubterm(0);
      u_4667 = term.getSubterm(1);
      v_4667 = term.getSubterm(2);
      IStrategoList annos950 = term.getAnnotations();
      w_4667 = annos950;
      term = o_4405.invoke(context, t_4667);
      if(term == null)
        break Fail26819;
      x_4667 = term;
      term = p_4405.invoke(context, u_4667);
      if(term == null)
        break Fail26819;
      y_4667 = term;
      term = q_4405.invoke(context, v_4667);
      if(term == null)
        break Fail26819;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consPrologue_3, new IStrategoTerm[]{x_4667, y_4667, term}), checkListAnnos(termFactory, w_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}