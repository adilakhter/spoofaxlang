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

@SuppressWarnings("all") public class include_from_dir_0_1 extends Strategy 
{ 
  public static include_from_dir_0_1 instance = new include_from_dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_4222)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("include_from_dir_0_1");
    Fail25475:
    { 
      IStrategoTerm v_4222 = null;
      IStrategoTerm x_4222 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDir_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25475;
      v_4222 = term.getSubterm(0);
      term = (IStrategoTerm)termFactory.makeListCons(v_4222, termFactory.makeListCons(generator.const7009, termFactory.makeListCons(u_4222, (IStrategoList)generator.constCons4546)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25475;
      term = file_exists_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25475;
      x_4222 = term;
      term = if_verbose1_1_0.instance.invoke(context, term, lifted9022.instance);
      if(term == null)
        break Fail25475;
      term = parse_sdf2_module_to_asfix_0_1.instance.invoke(context, x_4222, u_4222);
      if(term == null)
        break Fail25475;
      term = register_source_pathname_0_1.instance.invoke(context, x_4222, u_4222);
      if(term == null)
        break Fail25475;
      term = include_pathname_0_0.instance.invoke(context, x_4222);
      if(term == null)
        break Fail25475;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}