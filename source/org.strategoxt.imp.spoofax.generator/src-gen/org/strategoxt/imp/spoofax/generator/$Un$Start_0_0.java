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

@SuppressWarnings("all") public class $Un$Start_0_0 extends Strategy 
{ 
  public static $Un$Start_0_0 instance = new $Un$Start_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25708:
    { 
      IStrategoTerm c_4250 = null;
      IStrategoTerm d_4250 = null;
      IStrategoTerm e_4250 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25708;
      IStrategoTerm arg6156 = term.getSubterm(0);
      if(arg6156.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg6156).getConstructor())
        break Fail25708;
      IStrategoTerm arg6157 = arg6156.getSubterm(0);
      if(arg6157.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6157).isEmpty())
        break Fail25708;
      IStrategoTerm arg6158 = ((IStrategoList)arg6157).head();
      if(arg6158.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6158).getConstructor())
        break Fail25708;
      IStrategoTerm arg6159 = arg6158.getSubterm(0);
      if(arg6159.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6159).getConstructor())
        break Fail25708;
      IStrategoTerm arg6160 = arg6159.getSubterm(0);
      if(arg6160.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6160).getConstructor())
        break Fail25708;
      IStrategoTerm arg6161 = ((IStrategoList)arg6157).tail();
      if(arg6161.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6161).isEmpty())
        break Fail25708;
      IStrategoTerm arg6162 = ((IStrategoList)arg6161).head();
      if(arg6162.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6162).getConstructor())
        break Fail25708;
      IStrategoTerm arg6163 = arg6162.getSubterm(0);
      if(arg6163.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg6163).getConstructor())
        break Fail25708;
      IStrategoTerm arg6164 = ((IStrategoList)arg6161).tail();
      if(arg6164.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6164).isEmpty())
        break Fail25708;
      IStrategoTerm arg6165 = ((IStrategoList)arg6164).head();
      if(arg6165.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6165).getConstructor())
        break Fail25708;
      IStrategoTerm arg6166 = arg6165.getSubterm(0);
      if(arg6166.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6166).getConstructor())
        break Fail25708;
      IStrategoTerm arg6167 = arg6166.getSubterm(0);
      if(arg6167.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg6167).getConstructor())
        break Fail25708;
      IStrategoTerm arg6168 = ((IStrategoList)arg6164).tail();
      if(arg6168.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6168).isEmpty())
        break Fail25708;
      IStrategoTerm arg6169 = arg6156.getSubterm(1);
      if(arg6169.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg6169).getConstructor())
        break Fail25708;
      IStrategoTerm arg6170 = arg6169.getSubterm(0);
      if(arg6170.getTermType() != IStrategoTerm.STRING || !"<START>".equals(((IStrategoString)arg6170).stringValue()))
        break Fail25708;
      IStrategoTerm arg6171 = arg6156.getSubterm(2);
      if(arg6171.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg6171).getConstructor())
        break Fail25708;
      IStrategoTerm arg6172 = term.getSubterm(1);
      if(arg6172.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6172).isEmpty())
        break Fail25708;
      c_4250 = ((IStrategoList)arg6172).head();
      IStrategoTerm arg6173 = ((IStrategoList)arg6172).tail();
      if(arg6173.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6173).isEmpty())
        break Fail25708;
      d_4250 = ((IStrategoList)arg6173).head();
      IStrategoTerm arg6174 = ((IStrategoList)arg6173).tail();
      if(arg6174.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6174).isEmpty())
        break Fail25708;
      e_4250 = ((IStrategoList)arg6174).head();
      IStrategoTerm arg6175 = ((IStrategoList)arg6174).tail();
      if(arg6175.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6175).isEmpty())
        break Fail25708;
      term = termFactory.makeTuple(c_4250, d_4250, e_4250);
      if(true)
        return term;
    }
    context.push("UnStart_0_0");
    context.popOnFailure();
    return null;
  }
}