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

@SuppressWarnings("all") public class create_parse_table_0_0 extends Strategy 
{ 
  public static create_parse_table_0_0 instance = new create_parse_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_parse_table_0_0");
    Fail26585:
    { 
      IStrategoTerm n_4363 = null;
      IStrategoTerm o_4363 = null;
      IStrategoTerm p_4363 = null;
      IStrategoTerm s_4363 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26585;
      n_4363 = term.getSubterm(0);
      s_4363 = term;
      IStrategoTerm term10951 = term;
      Success10807:
      { 
        Fail26586:
        { 
          IStrategoTerm w_4363 = null;
          term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{n_4363});
          term = create_permissive_grammar_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26586;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
            break Fail26586;
          o_4363 = term.getSubterm(0);
          term = parse_table_target_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26586;
          p_4363 = term;
          w_4363 = term;
          term = print_filename_0_2.instance.invoke(context, w_4363, generator.constNil7, p_4363);
          if(term == null)
            break Fail26586;
          term = termFactory.makeTuple(o_4363, p_4363, generator.constNil7);
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26586;
          term = sdf2table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26586;
          if(true)
            break Success10807;
        }
        term = term10951;
        IStrategoTerm q_4363 = null;
        IStrategoTerm r_4363 = null;
        IStrategoTerm y_4363 = null;
        q_4363 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26585;
        r_4363 = term;
        y_4363 = q_4363;
        term = report_with_failure_0_2.instance.invoke(context, y_4363, generator.const7659, r_4363);
        if(term == null)
          break Fail26585;
      }
      term = s_4363;
      if(p_4363 == null)
        break Fail26585;
      term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{p_4363});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}