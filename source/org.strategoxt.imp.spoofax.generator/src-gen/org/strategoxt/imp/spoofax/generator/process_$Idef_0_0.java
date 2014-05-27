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

@SuppressWarnings("all") public class process_$Idef_0_0 extends Strategy 
{ 
  public static process_$Idef_0_0 instance = new process_$Idef_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("process_Idef_0_0");
    Fail25513:
    { 
      TermReference g_4228 = new TermReference();
      IStrategoTerm h_4228 = null;
      IStrategoTerm m_4228 = null;
      IStrategoTerm n_4228 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25513;
      if(g_4228.value == null)
        g_4228.value = term.getSubterm(0);
      else
        if(g_4228.value != term.getSubterm(0) && !g_4228.value.match(term.getSubterm(0)))
          break Fail25513;
      if(g_4228.value == null)
        break Fail25513;
      term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{g_4228.value});
      term = xtc_temp_files_1_0.instance.invoke(context, term, lifted9057.instance);
      if(term == null)
        break Fail25513;
      term = collect_om_1_0.instance.invoke(context, term, lifted9060.instance);
      if(term == null)
        break Fail25513;
      term = map_1_0.instance.invoke(context, term, lifted9061.instance);
      if(term == null)
        break Fail25513;
      h_4228 = term;
      lifted9062 lifted90620 = new lifted9062();
      lifted90620.g_4228 = g_4228;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90620);
      if(term == null)
        break Fail25513;
      term = h_4228;
      n_4228 = h_4228;
      m_4228 = term;
      term = n_4228;
      if(g_4228.value == null)
        break Fail25513;
      term = termFactory.makeAppl(SpoofaxGenerator._consIncludeDef_2, new IStrategoTerm[]{g_4228.value, m_4228});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}