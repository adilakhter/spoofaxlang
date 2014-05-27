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

@SuppressWarnings("all") final class lifted9389 extends Strategy 
{ 
  TermReference e_4311;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28682:
    { 
      IStrategoTerm s_4688 = null;
      IStrategoTerm t_4688 = null;
      term = collect_all_keywords_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28682;
      term = map_1_0.instance.invoke(context, term, keyword_to_completion_rule_0_0.instance);
      if(term == null)
        break Fail28682;
      if(e_4311.value == null)
        e_4311.value = term;
      else
        if(e_4311.value != term && !e_4311.value.match(term))
          break Fail28682;
      t_4688 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7293);
      if(term == null)
        break Fail28682;
      s_4688 = term;
      term = t_4688;
      if(e_4311.value == null)
        break Fail28682;
      IStrategoList list396;
      list396 = checkListTail(e_4311.value);
      if(list396 == null)
        break Fail28682;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{s_4688, generator.constNoImports0, (IStrategoTerm)termFactory.makeListCons(generator.constCompletions2, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{generator.const7000, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(generator.constCommentLine65, termFactory.makeListCons(generator.constEmptyLine0, list396)))}), (IStrategoList)generator.constNil7))});
      if(true)
        return term;
    }
    return null;
  }
}