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

@SuppressWarnings("all") final class lifted9034 extends Strategy 
{ 
  public static final lifted9034 instance = new lifted9034();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29008:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29008;
      IStrategoTerm arg5876 = term.getSubterm(0);
      if(arg5876.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5876).getConstructor())
        break Fail29008;
      IStrategoTerm arg5878 = arg5876.getSubterm(1);
      if(arg5878.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslex_1 != ((IStrategoAppl)arg5878).getConstructor())
        break Fail29008;
      IStrategoTerm arg5879 = arg5878.getSubterm(0);
      if(arg5879.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5879).getConstructor())
        break Fail29008;
      IStrategoTerm arg5880 = arg5879.getSubterm(0);
      if(arg5880.getTermType() != IStrategoTerm.STRING || !"ModuleId".equals(((IStrategoString)arg5880).stringValue()))
        break Fail29008;
      if(true)
        return term;
    }
    return null;
  }
}