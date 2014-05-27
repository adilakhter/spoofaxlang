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

@SuppressWarnings("all") final class lifted9033 extends Strategy 
{ 
  public static final lifted9033 instance = new lifted9033();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29009:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29009;
      IStrategoTerm arg5861 = term.getSubterm(0);
      if(arg5861.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5861).getConstructor())
        break Fail29009;
      IStrategoTerm arg5863 = arg5861.getSubterm(1);
      if(arg5863.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5863).getConstructor())
        break Fail29009;
      IStrategoTerm arg5864 = arg5863.getSubterm(0);
      if(arg5864.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5864).getConstructor())
        break Fail29009;
      IStrategoTerm arg5865 = arg5864.getSubterm(0);
      if(arg5865.getTermType() != IStrategoTerm.STRING || !"Module".equals(((IStrategoString)arg5865).stringValue()))
        break Fail29009;
      if(true)
        return term;
    }
    return null;
  }
}