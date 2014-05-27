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

@SuppressWarnings("all") public class collect_ast_changes_in_list_match_header_0_1 extends Strategy 
{ 
  public static collect_ast_changes_in_list_match_header_0_1 instance = new collect_ast_changes_in_list_match_header_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_4275)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_ast_changes_in_list_match_header_0_1");
    Fail25895:
    { 
      IStrategoTerm m_4275 = null;
      IStrategoTerm n_4275 = null;
      IStrategoTerm o_4275 = null;
      IStrategoTerm p_4275 = null;
      TermReference q_4275 = new TermReference();
      IStrategoTerm r_4275 = null;
      IStrategoTerm s_4275 = null;
      IStrategoTerm v_4275 = null;
      IStrategoTerm x_4685 = null;
      IStrategoTerm y_4685 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25895;
      IStrategoTerm arg6247 = term.getSubterm(0);
      if(arg6247.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6247).isEmpty())
        break Fail25895;
      if(q_4275.value == null)
        q_4275.value = ((IStrategoList)arg6247).head();
      else
        if(q_4275.value != ((IStrategoList)arg6247).head() && !q_4275.value.match(((IStrategoList)arg6247).head()))
          break Fail25895;
      o_4275 = ((IStrategoList)arg6247).tail();
      m_4275 = term.getSubterm(1);
      term = m_4275;
      lifted9293 lifted92930 = new lifted9293();
      lifted92930.q_4275 = q_4275;
      term = split_fetch_keep_1_0.instance.invoke(context, term, lifted92930);
      if(term == null)
        break Fail25895;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail25895;
      r_4275 = term.getSubterm(0);
      n_4275 = term.getSubterm(1);
      p_4275 = term.getSubterm(2);
      if(q_4275.value == null)
        break Fail25895;
      term = termFactory.makeTuple(q_4275.value, n_4275);
      term = collect_ast_changes_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25895;
      v_4275 = term;
      term = termFactory.makeTuple(o_4275, p_4275);
      y_4685 = term;
      x_4685 = l_4275;
      term = y_4685;
      IStrategoTerm term10320 = term;
      Success10249:
      { 
        Fail25896:
        { 
          term = collect_ast_changes_in_list_insert_at_end_0_1.instance.invoke(context, term, x_4685);
          if(term == null)
            break Fail25896;
          if(true)
            break Success10249;
        }
        term = term10320;
        IStrategoTerm term10321 = term;
        Success10250:
        { 
          Fail25897:
          { 
            term = this.invoke(context, term, x_4685);
            if(term == null)
              break Fail25897;
            if(true)
              break Success10250;
          }
          term = collect_ast_changes_in_list_no_header_match_0_1.instance.invoke(context, term10321, x_4685);
          if(term == null)
            break Fail25895;
        }
      }
      term = (IStrategoTerm)termFactory.makeListCons(v_4275, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25895;
      s_4275 = term;
      IStrategoTerm term10322 = term;
      Success10251:
      { 
        Fail25898:
        { 
          IStrategoTerm u_4275 = null;
          u_4275 = term;
          term = r_4275;
          IStrategoTerm term10323 = term;
          Success10252:
          { 
            Fail25899:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail25899;
              { 
                if(true)
                  break Fail25898;
                if(true)
                  break Success10252;
              }
            }
            term = term10323;
          }
          term = u_4275;
          { 
            if(q_4275.value == null)
              break Fail25895;
            IStrategoList list391;
            list391 = checkListTail(s_4275);
            if(list391 == null)
              break Fail25895;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_2, new IStrategoTerm[]{q_4275.value, r_4275}), list391);
            if(true)
              break Success10251;
          }
        }
        term = term10322;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}