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

@SuppressWarnings("all") final class lifted9049 extends Strategy 
{ 
  TermReference w_4225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28992:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28992;
      IStrategoTerm arg5891 = term.getSubterm(0);
      if(arg5891.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5891).getConstructor())
        break Fail28992;
      IStrategoTerm arg5893 = arg5891.getSubterm(1);
      if(arg5893.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5893).getConstructor())
        break Fail28992;
      IStrategoTerm arg5894 = arg5893.getSubterm(0);
      if(arg5894.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5894).getConstructor())
        break Fail28992;
      IStrategoTerm arg5895 = arg5894.getSubterm(0);
      if(arg5895.getTermType() != IStrategoTerm.STRING || !"ModuleId".equals(((IStrategoString)arg5895).stringValue()))
        break Fail28992;
      term = yield_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28992;
      if(w_4225.value == null)
        w_4225.value = term;
      else
        if(w_4225.value != term && !w_4225.value.match(term))
          break Fail28992;
      if(true)
        return term;
    }
    return null;
  }
}