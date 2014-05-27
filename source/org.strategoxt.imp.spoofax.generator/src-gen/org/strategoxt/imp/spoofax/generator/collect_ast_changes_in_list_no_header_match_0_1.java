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

@SuppressWarnings("all") public class collect_ast_changes_in_list_no_header_match_0_1 extends Strategy 
{ 
  public static collect_ast_changes_in_list_no_header_match_0_1 instance = new collect_ast_changes_in_list_no_header_match_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_4541 = new TermReference(ref_r_4541);
    context.push("collect_ast_changes_in_list_no_header_match_0_1");
    Fail25901:
    { 
      IStrategoTerm term10324 = term;
      Success10253:
      { 
        Fail25902:
        { 
          TermReference j_4276 = new TermReference();
          IStrategoTerm k_4276 = null;
          IStrategoTerm l_4276 = null;
          IStrategoTerm o_4276 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25902;
          k_4276 = term.getSubterm(0);
          if(j_4276.value == null)
            j_4276.value = term.getSubterm(1);
          else
            if(j_4276.value != term.getSubterm(1) && !j_4276.value.match(term.getSubterm(1)))
              break Fail25902;
          term = k_4276;
          lifted9294 lifted92940 = new lifted9294();
          lifted92940.r_4541 = r_4541;
          lifted92940.j_4276 = j_4276;
          term = at_suffix_1_0.instance.invoke(context, term, lifted92940);
          if(term == null)
            break Fail25902;
          l_4276 = term;
          term = init_0_0.instance.invoke(context, l_4276);
          if(term == null)
            break Fail25902;
          o_4276 = term;
          term = last_0_0.instance.invoke(context, l_4276);
          if(term == null)
            break Fail25902;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consDETETION_1, new IStrategoTerm[]{o_4276}), termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
          term = flatten_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25902;
          if(true)
            break Success10253;
        }
        term = term10324;
        IStrategoTerm d_4276 = null;
        IStrategoTerm e_4276 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail25901;
        d_4276 = term.getSubterm(0);
        e_4276 = term.getSubterm(1);
        IStrategoTerm term10325 = term;
        Success10254:
        { 
          Fail25903:
          { 
            term = at_least_one_match_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25903;
            { 
              if(true)
                break Fail25901;
              if(true)
                break Success10254;
            }
          }
          term = term10325;
        }
        term = termFactory.makeTuple(generator.constNil7, e_4276);
        term = collect_ast_changes_in_list_insert_at_end_0_1.instance.invoke(context, term, r_4541.value);
        if(term == null)
          break Fail25901;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consDETETION_1, new IStrategoTerm[]{d_4276}), termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
        term = flatten_list_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25901;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}