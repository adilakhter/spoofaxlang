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

@SuppressWarnings("all") public class lit_tree_0_0 extends Strategy 
{ 
  public static lit_tree_0_0 instance = new lit_tree_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lit_tree_0_0");
    Fail25701:
    { 
      IStrategoTerm s_4249 = null;
      IStrategoTerm t_4249 = null;
      s_4249 = term;
      term = explode_string_0_0.instance.invoke(context, s_4249);
      if(term == null)
        break Fail25701;
      t_4249 = term;
      term = map_1_0.instance.invoke(context, term, lifted9200.instance);
      if(term == null)
        break Fail25701;
      term = termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consprod_3, new IStrategoTerm[]{term, termFactory.makeAppl(SpoofaxGenerator._conslit_1, new IStrategoTerm[]{s_4249}), generator.constno_attrs0}), t_4249});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}