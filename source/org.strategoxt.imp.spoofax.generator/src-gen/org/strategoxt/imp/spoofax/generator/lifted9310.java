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

@SuppressWarnings("all") final class lifted9310 extends Strategy 
{ 
  TermReference g_4281;

  TermReference h_4281;

  TermReference i_4281;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28742:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPP_Entry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28742;
      IStrategoTerm arg6251 = term.getSubterm(0);
      if(arg6251.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPath_2 != ((IStrategoAppl)arg6251).getConstructor())
        break Fail28742;
      if(g_4281.value == null)
        g_4281.value = arg6251.getSubterm(0);
      else
        if(g_4281.value != arg6251.getSubterm(0) && !g_4281.value.match(arg6251.getSubterm(0)))
          break Fail28742;
      IStrategoTerm arg6252 = arg6251.getSubterm(1);
      if(arg6252.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6252).isEmpty())
        break Fail28742;
      IStrategoTerm arg6253 = ((IStrategoList)arg6252).head();
      if(arg6253.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consselector_2 != ((IStrategoAppl)arg6253).getConstructor())
        break Fail28742;
      if(h_4281.value == null)
        h_4281.value = arg6253.getSubterm(0);
      else
        if(h_4281.value != arg6253.getSubterm(0) && !h_4281.value.match(arg6253.getSubterm(0)))
          break Fail28742;
      IStrategoTerm arg6254 = arg6253.getSubterm(1);
      if(arg6254.getTermType() != IStrategoTerm.STRING || !"iter-star-sep".equals(((IStrategoString)arg6254).stringValue()))
        break Fail28742;
      IStrategoTerm arg6255 = ((IStrategoList)arg6252).tail();
      if(arg6255.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6255).isEmpty())
        break Fail28742;
      if(i_4281.value == null)
        i_4281.value = term.getSubterm(1);
      else
        if(i_4281.value != term.getSubterm(1) && !i_4281.value.match(term.getSubterm(1)))
          break Fail28742;
      if(true)
        return term;
    }
    return null;
  }
}