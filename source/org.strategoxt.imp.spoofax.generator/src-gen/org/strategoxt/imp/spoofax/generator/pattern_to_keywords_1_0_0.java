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

@SuppressWarnings("all") public class pattern_to_keywords_1_0_0 extends Strategy 
{ 
  public static pattern_to_keywords_1_0_0 instance = new pattern_to_keywords_1_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pattern_to_keywords_1_0_0");
    Fail26195:
    { 
      IStrategoTerm s_4311 = null;
      IStrategoTerm t_4311 = null;
      IStrategoTerm u_4311 = null;
      IStrategoTerm v_4311 = null;
      IStrategoTerm w_4311 = null;
      IStrategoTerm z_4311 = null;
      IStrategoTerm a_4312 = null;
      IStrategoTerm g_4312 = null;
      IStrategoTerm h_4312 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail26195;
      IStrategoTerm arg6331 = ((IStrategoList)term).head();
      if(arg6331.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslit_1 != ((IStrategoAppl)arg6331).getConstructor())
        break Fail26195;
      s_4311 = arg6331.getSubterm(0);
      v_4311 = ((IStrategoList)term).tail();
      z_4311 = term;
      term = is_prefixed_keyword_0_0.instance.invoke(context, s_4311);
      if(term == null)
        break Fail26195;
      term = z_4311;
      a_4312 = z_4311;
      IStrategoTerm term10567 = term;
      Success10487:
      { 
        Fail26196:
        { 
          IStrategoTerm d_4312 = null;
          term = take_while_1_0.instance.invoke(context, v_4311, lifted9395.instance);
          if(term == null)
            break Fail26196;
          t_4311 = term;
          IStrategoList list397;
          list397 = checkListTail(t_4311);
          if(list397 == null)
            break Fail26196;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._conslit_1, new IStrategoTerm[]{s_4311}), list397);
          term = map_1_0.instance.invoke(context, term, lifted9397.instance);
          if(term == null)
            break Fail26196;
          d_4312 = term;
          term = separate_by_0_1.instance.invoke(context, d_4312, generator.const7064);
          if(term == null)
            break Fail26196;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26196;
          u_4311 = term;
          term = drop_while_1_0.instance.invoke(context, v_4311, lifted9398.instance);
          if(term == null)
            break Fail26196;
          w_4311 = term;
          if(true)
            break Success10487;
        }
        term = term10567;
        IStrategoTerm x_4311 = null;
        IStrategoTerm y_4311 = null;
        IStrategoTerm f_4312 = null;
        x_4311 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26195;
        y_4311 = term;
        f_4312 = x_4311;
        term = report_with_failure_0_2.instance.invoke(context, f_4312, generator.const7330, y_4311);
        if(term == null)
          break Fail26195;
      }
      term = a_4312;
      h_4312 = a_4312;
      if(w_4311 == null)
        break Fail26195;
      term = w_4311;
      IStrategoTerm term10568 = term;
      Success10488:
      { 
        Fail26197:
        { 
          term = this.invoke(context, term);
          if(term == null)
            break Fail26197;
          if(true)
            break Success10488;
        }
        term = term10568;
        IStrategoTerm term10569 = term;
        Success10489:
        { 
          Fail26198:
          { 
            term = pattern_to_keywords_2_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26198;
            if(true)
              break Success10489;
          }
          term = term10569;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail26195;
        }
      }
      g_4312 = term;
      term = h_4312;
      if(u_4311 == null)
        break Fail26195;
      IStrategoList list398;
      list398 = checkListTail(g_4312);
      if(list398 == null)
        break Fail26195;
      term = (IStrategoTerm)termFactory.makeListCons(u_4311, list398);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}