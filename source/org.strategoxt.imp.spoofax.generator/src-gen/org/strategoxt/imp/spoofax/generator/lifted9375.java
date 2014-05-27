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

@SuppressWarnings("all") final class lifted9375 extends Strategy 
{ 
  public static final lifted9375 instance = new lifted9375();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28691:
    { 
      IStrategoTerm i_4688 = null;
      IStrategoTerm j_4688 = null;
      IStrategoTerm k_4688 = null;
      IStrategoTerm l_4688 = null;
      term = heuristic_folding_productions_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28691;
      term = map_1_0.instance.invoke(context, term, create_folding_or_outliner_rule_0_0.instance);
      if(term == null)
        break Fail28691;
      j_4688 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7268);
      if(term == null)
        break Fail28691;
      i_4688 = term;
      term = j_4688;
      l_4688 = j_4688;
      k_4688 = term;
      term = l_4688;
      IStrategoList list395;
      list395 = checkListTail(k_4688);
      if(list395 == null)
        break Fail28691;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{i_4688, generator.constNoImports0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consFolding_2, new IStrategoTerm[]{generator.const7269, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(generator.constCommentLine32, termFactory.makeListCons(generator.constCommentLine31, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine22, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine21, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine20, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine30, termFactory.makeListCons(generator.constCommentLine29, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine28, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine27, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine26, termFactory.makeListCons(generator.constEmptyLine0, list395)))))))))))))))))))}), (IStrategoList)generator.constNil7)});
      if(true)
        return term;
    }
    return null;
  }
}