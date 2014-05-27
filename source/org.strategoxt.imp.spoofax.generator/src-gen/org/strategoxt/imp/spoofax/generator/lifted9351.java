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

@SuppressWarnings("all") final class lifted9351 extends Strategy 
{ 
  public static final lifted9351 instance = new lifted9351();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28710:
    { 
      IStrategoTerm y_4687 = null;
      IStrategoTerm z_4687 = null;
      IStrategoTerm a_4688 = null;
      IStrategoTerm b_4688 = null;
      term = heuristic_outliner_productions_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28710;
      term = map_1_0.instance.invoke(context, term, create_folding_or_outliner_rule_0_0.instance);
      if(term == null)
        break Fail28710;
      z_4687 = term;
      term = descriptor_name_0_0.instance.invoke(context, generator.const7234);
      if(term == null)
        break Fail28710;
      y_4687 = term;
      term = z_4687;
      b_4688 = z_4687;
      a_4688 = term;
      term = b_4688;
      IStrategoList list394;
      list394 = checkListTail(a_4688);
      if(list394 == null)
        break Fail28710;
      term = termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{y_4687, generator.constNoImports0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consOutliner_2, new IStrategoTerm[]{generator.const7235, (IStrategoTerm)termFactory.makeListCons(generator.constEmptyLine0, termFactory.makeListCons(generator.constCommentLine24, termFactory.makeListCons(generator.constCommentLine23, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine22, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine21, termFactory.makeListCons(generator.constCommentLine1, termFactory.makeListCons(generator.constCommentLine20, termFactory.makeListCons(generator.constEmptyLine0, list394))))))))))}), (IStrategoList)generator.constNil7)});
      if(true)
        return term;
    }
    return null;
  }
}