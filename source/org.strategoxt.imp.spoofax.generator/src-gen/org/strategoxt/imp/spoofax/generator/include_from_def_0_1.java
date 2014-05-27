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

@SuppressWarnings("all") public class include_from_def_0_1 extends Strategy 
{ 
  public static include_from_def_0_1 instance = new include_from_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_4223)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_4223 = new TermReference(ref_d_4223);
    context.push("include_from_def_0_1");
    Fail25477:
    { 
      IStrategoTerm e_4223 = null;
      IStrategoTerm f_4223 = null;
      TermReference g_4223 = new TermReference();
      IStrategoTerm h_4223 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25477;
      if(g_4223.value == null)
        g_4223.value = term.getSubterm(0);
      else
        if(g_4223.value != term.getSubterm(0) && !g_4223.value.match(term.getSubterm(0)))
          break Fail25477;
      e_4223 = term.getSubterm(1);
      h_4223 = term;
      term = e_4223;
      lifted9026 lifted90260 = new lifted9026();
      lifted90260.d_4223 = d_4223;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted90260);
      if(term == null)
        break Fail25477;
      f_4223 = term;
      lifted9027 lifted90270 = new lifted9027();
      lifted90270.d_4223 = d_4223;
      lifted90270.g_4223 = g_4223;
      term = if_verbose1_1_0.instance.invoke(context, term, lifted90270);
      if(term == null)
        break Fail25477;
      if(g_4223.value == null)
        break Fail25477;
      term = register_source_pathname_0_1.instance.invoke(context, g_4223.value, d_4223.value);
      if(term == null)
        break Fail25477;
      term = h_4223;
      if(g_4223.value == null)
        break Fail25477;
      term = termFactory.makeTuple(g_4223.value, termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod0, (IStrategoTerm)termFactory.makeListCons(generator.constappl1, termFactory.makeListCons(f_4223, (IStrategoList)generator.constCons4559))}));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}