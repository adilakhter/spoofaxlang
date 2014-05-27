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

@SuppressWarnings("all") public class module_to_module_name_0_0 extends Strategy 
{ 
  public static module_to_module_name_0_0 instance = new module_to_module_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("module_to_module_name_0_0");
    Fail25498:
    { 
      IStrategoTerm x_4225 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25498;
      IStrategoTerm arg5898 = term.getSubterm(0);
      if(arg5898.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5898).getConstructor())
        break Fail25498;
      IStrategoTerm arg5900 = arg5898.getSubterm(1);
      if(arg5900.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5900).getConstructor())
        break Fail25498;
      IStrategoTerm arg5901 = arg5900.getSubterm(0);
      if(arg5901.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5901).getConstructor())
        break Fail25498;
      IStrategoTerm arg5902 = arg5901.getSubterm(0);
      if(arg5902.getTermType() != IStrategoTerm.STRING || !"Module".equals(((IStrategoString)arg5902).stringValue()))
        break Fail25498;
      IStrategoTerm arg5904 = term.getSubterm(1);
      if(arg5904.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5904).isEmpty())
        break Fail25498;
      IStrategoTerm arg5906 = ((IStrategoList)arg5904).tail();
      if(arg5906.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5906).isEmpty())
        break Fail25498;
      IStrategoTerm arg5908 = ((IStrategoList)arg5906).tail();
      if(arg5908.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5908).isEmpty())
        break Fail25498;
      x_4225 = ((IStrategoList)arg5908).head();
      term = get_module_name_0_0.instance.invoke(context, x_4225);
      if(term == null)
        break Fail25498;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}