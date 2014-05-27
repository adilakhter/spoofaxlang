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

@SuppressWarnings("all") public class collect_ast_changes_in_list_0_0 extends Strategy 
{ 
  public static collect_ast_changes_in_list_0_0 instance = new collect_ast_changes_in_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_ast_changes_in_list_0_0");
    Fail25887:
    { 
      IStrategoTerm term10313 = term;
      Success10244:
      { 
        Fail25888:
        { 
          IStrategoTerm d_4275 = null;
          IStrategoTerm e_4275 = null;
          IStrategoTerm f_4275 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25888;
          d_4275 = term.getSubterm(0);
          e_4275 = term.getSubterm(1);
          term = collect_ast_changes_in_list_0_1.instance.invoke(context, term, d_4275);
          if(term == null)
            break Fail25888;
          f_4275 = term;
          term = termFactory.makeTuple(d_4275, e_4275);
          term = at_least_one_match_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25888;
          term = f_4275;
          if(true)
            break Success10244;
        }
        term = term10313;
        IStrategoTerm a_4275 = null;
        IStrategoTerm b_4275 = null;
        IStrategoTerm c_4275 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail25887;
        a_4275 = term.getSubterm(0);
        b_4275 = term.getSubterm(1);
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{a_4275, b_4275}), (IStrategoList)generator.constNil7);
        c_4275 = term;
        term = is_list_0_0.instance.invoke(context, a_4275);
        if(term == null)
          break Fail25887;
        term = is_list_0_0.instance.invoke(context, b_4275);
        if(term == null)
          break Fail25887;
        term = termFactory.makeTuple(a_4275, b_4275);
        IStrategoTerm term10314 = term;
        Success10245:
        { 
          Fail25889:
          { 
            term = at_least_one_match_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25889;
            { 
              if(true)
                break Fail25887;
              if(true)
                break Success10245;
            }
          }
          term = term10314;
        }
        term = c_4275;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}