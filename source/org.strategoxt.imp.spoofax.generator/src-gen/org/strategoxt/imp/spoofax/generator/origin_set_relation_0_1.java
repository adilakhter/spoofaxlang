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

@SuppressWarnings("all") public class origin_set_relation_0_1 extends Strategy 
{ 
  public static origin_set_relation_0_1 instance = new origin_set_relation_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4257)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_set_relation_0_1");
    Fail25756:
    { 
      TermReference t_4257 = new TermReference();
      IStrategoTerm u_4257 = null;
      if(t_4257.value == null)
        t_4257.value = term;
      else
        if(t_4257.value != term && !t_4257.value.match(term))
          break Fail25756;
      term = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{s_4257});
      lifted9226 lifted92260 = new lifted9226();
      lifted92260.t_4257 = t_4257;
      term = SRTS_all.instance.invoke(context, term, lifted92260);
      if(term == null)
        break Fail25756;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSome_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25756;
      u_4257 = term.getSubterm(0);
      term = u_4257;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}