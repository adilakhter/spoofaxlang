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

@SuppressWarnings("all") public class at_least_one_match_0_0 extends Strategy 
{ 
  public static at_least_one_match_0_0 instance = new at_least_one_match_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_least_one_match_0_0");
    Fail25890:
    { 
      TermReference g_4275 = new TermReference();
      IStrategoTerm h_4275 = null;
      IStrategoTerm i_4275 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25890;
      IStrategoTerm arg6246 = term.getSubterm(0);
      if(arg6246.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6246).isEmpty())
        break Fail25890;
      if(g_4275.value == null)
        g_4275.value = ((IStrategoList)arg6246).head();
      else
        if(g_4275.value != ((IStrategoList)arg6246).head() && !g_4275.value.match(((IStrategoList)arg6246).head()))
          break Fail25890;
      h_4275 = ((IStrategoList)arg6246).tail();
      i_4275 = term.getSubterm(1);
      Success10246:
      { 
        Fail25891:
        { 
          term = i_4275;
          lifted9292 lifted92920 = new lifted9292();
          lifted92920.g_4275 = g_4275;
          term = fetch_1_0.instance.invoke(context, term, lifted92920);
          if(term == null)
            break Fail25891;
          if(true)
            break Success10246;
        }
        term = termFactory.makeTuple(h_4275, i_4275);
        term = this.invoke(context, term);
        if(term == null)
          break Fail25890;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}