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

@SuppressWarnings("all") final class lifted9060 extends Strategy 
{ 
  public static final lifted9060 instance = new lifted9060();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28975:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28975;
      IStrategoTerm arg5935 = term.getSubterm(0);
      if(arg5935.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5935).getConstructor())
        break Fail28975;
      IStrategoTerm arg5937 = arg5935.getSubterm(1);
      if(arg5937.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5937).getConstructor())
        break Fail28975;
      IStrategoTerm arg5938 = arg5937.getSubterm(0);
      if(arg5938.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5938).getConstructor())
        break Fail28975;
      IStrategoTerm arg5939 = arg5938.getSubterm(0);
      if(arg5939.getTermType() != IStrategoTerm.STRING || !"Module".equals(((IStrategoString)arg5939).stringValue()))
        break Fail28975;
      IStrategoTerm arg5940 = arg5935.getSubterm(2);
      if(arg5940.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg5940).getConstructor())
        break Fail28975;
      IStrategoTerm arg5941 = arg5940.getSubterm(0);
      if(arg5941.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5941).isEmpty())
        break Fail28975;
      IStrategoTerm arg5942 = ((IStrategoList)arg5941).head();
      if(arg5942.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consterm_1 != ((IStrategoAppl)arg5942).getConstructor())
        break Fail28975;
      IStrategoTerm arg5943 = arg5942.getSubterm(0);
      if(arg5943.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscons_1 != ((IStrategoAppl)arg5943).getConstructor())
        break Fail28975;
      IStrategoTerm arg5944 = arg5943.getSubterm(0);
      if(arg5944.getTermType() != IStrategoTerm.STRING || !"module".equals(((IStrategoString)arg5944).stringValue()))
        break Fail28975;
      IStrategoTerm arg5945 = ((IStrategoList)arg5941).tail();
      if(arg5945.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5945).isEmpty())
        break Fail28975;
      if(true)
        return term;
    }
    return null;
  }
}