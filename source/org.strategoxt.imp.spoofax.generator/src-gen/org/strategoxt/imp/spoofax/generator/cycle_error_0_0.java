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

@SuppressWarnings("all") public class cycle_error_0_0 extends Strategy 
{ 
  public static cycle_error_0_0 instance = new cycle_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("cycle_error_0_0");
    Fail25593:
    { 
      IStrategoTerm l_4240 = null;
      IStrategoTerm m_4240 = null;
      IStrategoTerm o_4240 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25593;
      m_4240 = term.getSubterm(0);
      IStrategoTerm arg5954 = term.getSubterm(1);
      if(arg5954.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)arg5954).getConstructor())
        break Fail25593;
      l_4240 = arg5954.getSubterm(0);
      IStrategoTerm arg5955 = arg5954.getSubterm(1);
      if(arg5955.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5955).isEmpty())
        break Fail25593;
      IStrategoTerm arg5956 = ((IStrategoList)arg5955).head();
      if(arg5956.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg5956).getConstructor())
        break Fail25593;
      if(arg5956.getSubterm(0) != l_4240 && !l_4240.match(arg5956.getSubterm(0)))
        break Fail25593;
      IStrategoTerm arg5957 = ((IStrategoList)arg5955).tail();
      if(arg5957.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5957).isEmpty())
        break Fail25593;
      o_4240 = m_4240;
      term = fatal_err_0_1.instance.invoke(context, o_4240, generator.const7108);
      if(term == null)
        break Fail25593;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}