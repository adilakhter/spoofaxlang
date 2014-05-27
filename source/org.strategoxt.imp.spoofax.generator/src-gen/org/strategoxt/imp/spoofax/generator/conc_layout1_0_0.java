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

@SuppressWarnings("all") public class conc_layout1_0_0 extends Strategy 
{ 
  public static conc_layout1_0_0 instance = new conc_layout1_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25702:
    { 
      IStrategoTerm x_4249 = null;
      IStrategoTerm y_4249 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25702;
      IStrategoTerm arg6116 = term.getSubterm(0);
      if(arg6116.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)arg6116).getConstructor())
        break Fail25702;
      IStrategoTerm arg6117 = arg6116.getSubterm(0);
      if(arg6117.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6117).getConstructor())
        break Fail25702;
      IStrategoTerm arg6118 = arg6117.getSubterm(0);
      if(arg6118.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6118).isEmpty())
        break Fail25702;
      IStrategoTerm arg6119 = ((IStrategoList)arg6118).head();
      if(arg6119.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6119).getConstructor())
        break Fail25702;
      IStrategoTerm arg6120 = arg6119.getSubterm(0);
      if(arg6120.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6120).getConstructor())
        break Fail25702;
      IStrategoTerm arg6121 = ((IStrategoList)arg6118).tail();
      if(arg6121.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6121).isEmpty())
        break Fail25702;
      IStrategoTerm arg6122 = arg6117.getSubterm(1);
      if(arg6122.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6122).getConstructor())
        break Fail25702;
      IStrategoTerm arg6123 = arg6122.getSubterm(0);
      if(arg6123.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6123).getConstructor())
        break Fail25702;
      IStrategoTerm arg6124 = arg6123.getSubterm(0);
      if(arg6124.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6124).getConstructor())
        break Fail25702;
      IStrategoTerm arg6125 = arg6117.getSubterm(2);
      if(arg6125.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg6125).getConstructor())
        break Fail25702;
      IStrategoTerm arg6126 = arg6116.getSubterm(1);
      if(arg6126.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6126).isEmpty())
        break Fail25702;
      x_4249 = ((IStrategoList)arg6126).head();
      IStrategoTerm arg6127 = ((IStrategoList)arg6126).tail();
      if(arg6127.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6127).isEmpty())
        break Fail25702;
      IStrategoTerm arg6128 = term.getSubterm(1);
      if(arg6128.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)arg6128).getConstructor())
        break Fail25702;
      IStrategoTerm arg6129 = arg6128.getSubterm(0);
      if(arg6129.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6129).getConstructor())
        break Fail25702;
      IStrategoTerm arg6130 = arg6129.getSubterm(0);
      if(arg6130.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6130).isEmpty())
        break Fail25702;
      IStrategoTerm arg6131 = ((IStrategoList)arg6130).head();
      if(arg6131.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6131).getConstructor())
        break Fail25702;
      IStrategoTerm arg6132 = arg6131.getSubterm(0);
      if(arg6132.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6132).getConstructor())
        break Fail25702;
      IStrategoTerm arg6133 = ((IStrategoList)arg6130).tail();
      if(arg6133.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6133).isEmpty())
        break Fail25702;
      IStrategoTerm arg6134 = arg6129.getSubterm(1);
      if(arg6134.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6134).getConstructor())
        break Fail25702;
      IStrategoTerm arg6135 = arg6134.getSubterm(0);
      if(arg6135.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6135).getConstructor())
        break Fail25702;
      IStrategoTerm arg6136 = arg6135.getSubterm(0);
      if(arg6136.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6136).getConstructor())
        break Fail25702;
      IStrategoTerm arg6137 = arg6129.getSubterm(2);
      if(arg6137.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg6137).getConstructor())
        break Fail25702;
      IStrategoTerm arg6138 = arg6128.getSubterm(1);
      if(arg6138.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6138).isEmpty())
        break Fail25702;
      y_4249 = ((IStrategoList)arg6138).head();
      IStrategoTerm arg6139 = ((IStrategoList)arg6138).tail();
      if(arg6139.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6139).isEmpty())
        break Fail25702;
      term = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod13, (IStrategoTerm)termFactory.makeListCons(x_4249, termFactory.makeListCons(y_4249, (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constNil7)});
      if(true)
        return term;
    }
    context.push("conc_layout1_0_0");
    context.popOnFailure();
    return null;
  }
}