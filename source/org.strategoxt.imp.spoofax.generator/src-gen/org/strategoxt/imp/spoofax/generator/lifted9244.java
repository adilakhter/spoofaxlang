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

@SuppressWarnings("all") final class lifted9244 extends Strategy 
{ 
  TermReference e_4261;

  TermReference f_4261;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28814:
    { 
      if(f_4261.value == null)
        f_4261.value = term;
      else
        if(f_4261.value != term && !f_4261.value.match(term))
          break Fail28814;
      term = main_descriptor_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28814;
      term = termFactory.makeTuple(term, generator.const7144);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28814;
      if(e_4261.value == null)
        e_4261.value = term;
      else
        if(e_4261.value != term && !e_4261.value.match(term))
          break Fail28814;
      if(e_4261.value == null || f_4261.value == null)
        break Fail28814;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{e_4261.value, termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consImport_1, new IStrategoTerm[]{f_4261.value}), (IStrategoList)generator.constNil7)}), generator.constNil7});
      term = fetch_imports_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28814;
      if(true)
        return term;
    }
    return null;
  }
}