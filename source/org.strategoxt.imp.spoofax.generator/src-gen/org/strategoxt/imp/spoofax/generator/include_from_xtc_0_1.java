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

@SuppressWarnings("all") public class include_from_xtc_0_1 extends Strategy 
{ 
  public static include_from_xtc_0_1 instance = new include_from_xtc_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_4222)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_4222 = new TermReference(ref_z_4222);
    context.push("include_from_xtc_0_1");
    Fail25476:
    { 
      IStrategoTerm a_4223 = null;
      IStrategoTerm b_4223 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeXTC_0 != ((IStrategoAppl)term).getConstructor())
        break Fail25476;
      if(z_4222.value == null)
        break Fail25476;
      term = termFactory.makeTuple(z_4222.value, generator.const7008);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25476;
      term = xtc_find_loc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25476;
      b_4223 = term;
      lifted9024 lifted90240 = new lifted9024();
      lifted90240.z_4222 = z_4222;
      term = if_verbose1_1_0.instance.invoke(context, term, lifted90240);
      if(term == null)
        break Fail25476;
      term = parse_sdf2_module_to_asfix_0_1.instance.invoke(context, b_4223, z_4222.value);
      if(term == null)
        break Fail25476;
      a_4223 = term;
      term = register_source_pathname_0_1.instance.invoke(context, b_4223, z_4222.value);
      if(term == null)
        break Fail25476;
      term = termFactory.makeTuple(b_4223, a_4223);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}