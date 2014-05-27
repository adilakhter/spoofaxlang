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

@SuppressWarnings("all") public class collect_ast_changes_in_list_insert_at_end_0_1 extends Strategy 
{ 
  public static collect_ast_changes_in_list_insert_at_end_0_1 instance = new collect_ast_changes_in_list_insert_at_end_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4276)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25904:
    { 
      IStrategoTerm t_4276 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25904;
      IStrategoTerm arg6248 = term.getSubterm(0);
      if(arg6248.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6248).isEmpty())
        break Fail25904;
      t_4276 = term.getSubterm(1);
      Success10255:
      { 
        Fail25905:
        { 
          IStrategoTerm u_4276 = null;
          u_4276 = term;
          term = t_4276;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25905;
          term = u_4276;
          { 
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_2, new IStrategoTerm[]{s_4276, t_4276}), (IStrategoList)generator.constNil7);
            if(true)
              break Success10255;
          }
        }
        term = generator.constNil7;
      }
      if(true)
        return term;
    }
    context.push("collect_ast_changes_in_list_insert_at_end_0_1");
    context.popOnFailure();
    return null;
  }
}