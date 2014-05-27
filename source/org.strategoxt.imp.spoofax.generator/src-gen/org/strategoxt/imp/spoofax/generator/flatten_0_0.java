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

@SuppressWarnings("all") public class flatten_0_0 extends Strategy 
{ 
  public static flatten_0_0 instance = new flatten_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("flatten_0_0");
    Fail25699:
    { 
      IStrategoTerm term10205 = term;
      IStrategoConstructor cons338 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10160:
      { 
        if(cons338 == SpoofaxGenerator._consappl_2)
        { 
          Fail25700:
          { 
            IStrategoTerm p_4249 = null;
            IStrategoTerm arg6113 = term.getSubterm(0);
            if(arg6113.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6113).getConstructor())
              break Fail25700;
            p_4249 = arg6113.getSubterm(1);
            term = yield_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25700;
            term = termFactory.makeAppl(SpoofaxGenerator._consflatlex_2, new IStrategoTerm[]{p_4249, term});
            if(true)
              break Success10160;
          }
          term = term10205;
        }
        if(cons338 == SpoofaxGenerator._consflatlex_2)
        { 
          IStrategoTerm m_4249 = null;
          IStrategoTerm n_4249 = null;
          m_4249 = term.getSubterm(0);
          n_4249 = term.getSubterm(1);
          term = termFactory.makeAppl(SpoofaxGenerator._consflatlex_2, new IStrategoTerm[]{m_4249, n_4249});
        }
        else
        { 
          break Fail25699;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}