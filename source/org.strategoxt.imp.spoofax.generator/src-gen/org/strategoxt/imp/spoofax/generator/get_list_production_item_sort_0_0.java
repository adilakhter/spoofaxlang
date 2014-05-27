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

@SuppressWarnings("all") public class get_list_production_item_sort_0_0 extends Strategy 
{ 
  public static get_list_production_item_sort_0_0 instance = new get_list_production_item_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26316:
    { 
      IStrategoTerm j_4328 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26316;
      IStrategoTerm arg6407 = term.getSubterm(1);
      if(arg6407.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6407).isEmpty())
        break Fail26316;
      IStrategoTerm arg6408 = ((IStrategoList)arg6407).head();
      if(arg6408.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAppl_2 != ((IStrategoAppl)arg6408).getConstructor())
        break Fail26316;
      IStrategoTerm arg6409 = arg6408.getSubterm(0);
      if(arg6409.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consConsTerm_0 != ((IStrategoAppl)arg6409).getConstructor())
        break Fail26316;
      IStrategoTerm arg6410 = arg6408.getSubterm(1);
      if(arg6410.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6410).isEmpty())
        break Fail26316;
      IStrategoTerm arg6411 = ((IStrategoList)arg6410).head();
      if(arg6411.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6411).getConstructor())
        break Fail26316;
      IStrategoTerm arg6412 = arg6411.getSubterm(0);
      if(arg6412.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6412).getConstructor())
        break Fail26316;
      j_4328 = arg6412.getSubterm(0);
      IStrategoTerm arg6413 = ((IStrategoList)arg6410).tail();
      if(arg6413.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6413).isEmpty())
        break Fail26316;
      IStrategoTerm arg6415 = ((IStrategoList)arg6413).tail();
      if(arg6415.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6415).isEmpty())
        break Fail26316;
      IStrategoTerm arg6416 = ((IStrategoList)arg6407).tail();
      if(arg6416.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6416).isEmpty())
        break Fail26316;
      term = j_4328;
      if(true)
        return term;
    }
    context.push("get_list_production_item_sort_0_0");
    context.popOnFailure();
    return null;
  }
}