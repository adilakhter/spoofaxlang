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

@SuppressWarnings("all") public class conc_layout2_0_0 extends Strategy 
{ 
  public static conc_layout2_0_0 instance = new conc_layout2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25703:
    { 
      IStrategoTerm z_4249 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25703;
      IStrategoTerm arg6140 = term.getSubterm(0);
      if(arg6140.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)arg6140).getConstructor())
        break Fail25703;
      IStrategoTerm arg6141 = arg6140.getSubterm(0);
      if(arg6141.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6141).getConstructor())
        break Fail25703;
      IStrategoTerm arg6142 = arg6141.getSubterm(0);
      if(arg6142.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6142).isEmpty())
        break Fail25703;
      IStrategoTerm arg6143 = arg6141.getSubterm(1);
      if(arg6143.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6143).getConstructor())
        break Fail25703;
      IStrategoTerm arg6144 = arg6143.getSubterm(0);
      if(arg6144.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6144).getConstructor())
        break Fail25703;
      IStrategoTerm arg6145 = arg6144.getSubterm(0);
      if(arg6145.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6145).getConstructor())
        break Fail25703;
      IStrategoTerm arg6146 = arg6141.getSubterm(2);
      if(arg6146.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg6146).getConstructor())
        break Fail25703;
      IStrategoTerm arg6147 = arg6140.getSubterm(1);
      if(arg6147.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6147).isEmpty())
        break Fail25703;
      z_4249 = term.getSubterm(1);
      term = z_4249;
      if(true)
        return term;
    }
    context.push("conc_layout2_0_0");
    context.popOnFailure();
    return null;
  }
}