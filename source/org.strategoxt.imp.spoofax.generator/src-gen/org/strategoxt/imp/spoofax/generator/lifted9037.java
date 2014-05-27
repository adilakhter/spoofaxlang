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

@SuppressWarnings("all") final class lifted9037 extends Strategy 
{ 
  public static final lifted9037 instance = new lifted9037();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29004:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29004;
      IStrategoTerm arg5884 = term.getSubterm(0);
      if(arg5884.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5884).getConstructor())
        break Fail29004;
      IStrategoTerm arg5886 = arg5884.getSubterm(1);
      if(arg5886.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5886).getConstructor())
        break Fail29004;
      IStrategoTerm arg5887 = arg5886.getSubterm(0);
      if(arg5887.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5887).getConstructor())
        break Fail29004;
      IStrategoTerm arg5888 = arg5887.getSubterm(0);
      if(arg5888.getTermType() != IStrategoTerm.STRING || !"Import".equals(((IStrategoString)arg5888).stringValue()))
        break Fail29004;
      term = get_module_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29004;
      if(true)
        return term;
    }
    return null;
  }
}