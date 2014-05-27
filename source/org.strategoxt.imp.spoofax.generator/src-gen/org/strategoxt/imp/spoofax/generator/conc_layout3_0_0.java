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

@SuppressWarnings("all") public class conc_layout3_0_0 extends Strategy 
{ 
  public static conc_layout3_0_0 instance = new conc_layout3_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25704:
    { 
      IStrategoTerm a_4250 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25704;
      a_4250 = term.getSubterm(0);
      IStrategoTerm arg6148 = term.getSubterm(1);
      if(arg6148.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)arg6148).getConstructor())
        break Fail25704;
      IStrategoTerm arg6149 = arg6148.getSubterm(0);
      if(arg6149.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6149).getConstructor())
        break Fail25704;
      IStrategoTerm arg6150 = arg6149.getSubterm(0);
      if(arg6150.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6150).isEmpty())
        break Fail25704;
      IStrategoTerm arg6151 = arg6149.getSubterm(1);
      if(arg6151.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6151).getConstructor())
        break Fail25704;
      IStrategoTerm arg6152 = arg6151.getSubterm(0);
      if(arg6152.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6152).getConstructor())
        break Fail25704;
      IStrategoTerm arg6153 = arg6152.getSubterm(0);
      if(arg6153.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6153).getConstructor())
        break Fail25704;
      IStrategoTerm arg6154 = arg6149.getSubterm(2);
      if(arg6154.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg6154).getConstructor())
        break Fail25704;
      IStrategoTerm arg6155 = arg6148.getSubterm(1);
      if(arg6155.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6155).isEmpty())
        break Fail25704;
      term = a_4250;
      if(true)
        return term;
    }
    context.push("conc_layout3_0_0");
    context.popOnFailure();
    return null;
  }
}