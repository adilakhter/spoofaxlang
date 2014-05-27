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

@SuppressWarnings("all") public class start_prod2tree_0_0 extends Strategy 
{ 
  public static start_prod2tree_0_0 instance = new start_prod2tree_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("start_prod2tree_0_0");
    Fail25614:
    { 
      IStrategoTerm g_4241 = null;
      IStrategoTerm h_4241 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25614;
      g_4241 = term.getSubterm(0);
      IStrategoTerm arg6037 = term.getSubterm(1);
      if(arg6037.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consstart_0 != ((IStrategoAppl)arg6037).getConstructor())
        break Fail25614;
      term = syms2trees_0_0.instance.invoke(context, g_4241);
      if(term == null)
        break Fail25614;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail25614;
      h_4241 = ((IStrategoList)term).head();
      IStrategoTerm arg6039 = ((IStrategoList)term).tail();
      if(arg6039.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6039).isEmpty())
        break Fail25614;
      term = h_4241;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}