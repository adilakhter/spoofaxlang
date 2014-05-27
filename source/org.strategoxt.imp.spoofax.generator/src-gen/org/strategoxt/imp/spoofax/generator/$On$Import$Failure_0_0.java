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

@SuppressWarnings("all") public class $On$Import$Failure_0_0 extends Strategy 
{ 
  public static $On$Import$Failure_0_0 instance = new $On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("OnImportFailure_0_0");
    Fail27371:
    { 
      TermReference c_4475 = new TermReference();
      TermReference d_4475 = new TermReference();
      IStrategoTerm g_4475 = null;
      IStrategoTerm i_4475 = null;
      IStrategoTerm j_4475 = null;
      if(d_4475.value == null)
        d_4475.value = term;
      else
        if(d_4475.value != term && !d_4475.value.match(term))
          break Fail27371;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27371;
      if(c_4475.value == null)
        c_4475.value = term.getSubterm(0);
      else
        if(c_4475.value != term.getSubterm(0) && !c_4475.value.match(term.getSubterm(0)))
          break Fail27371;
      i_4475 = term;
      g_4475 = generator.const7458;
      j_4475 = i_4475;
      term = dr_lookup_rule_0_2.instance.invoke(context, j_4475, g_4475, generator.const7459);
      if(term == null)
        break Fail27371;
      lifted10140 lifted101400 = new lifted10140();
      lifted101400.c_4475 = c_4475;
      lifted101400.d_4475 = d_4475;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101400);
      if(term == null)
        break Fail27371;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}