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

@SuppressWarnings("all") public class create_permissive_grammar_0_0 extends Strategy 
{ 
  public static create_permissive_grammar_0_0 instance = new create_permissive_grammar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_permissive_grammar_0_0");
    Fail26590:
    { 
      IStrategoTerm u_4364 = null;
      IStrategoTerm v_4364 = null;
      IStrategoTerm y_4364 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26590;
      u_4364 = term.getSubterm(0);
      y_4364 = term;
      IStrategoTerm term10954 = term;
      Success10810:
      { 
        Fail26591:
        { 
          IStrategoTerm term10955 = term;
          Success10811:
          { 
            Fail26592:
            { 
              IStrategoTerm c_4365 = null;
              term = permissive_grammar_target_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26592;
              v_4364 = term;
              c_4365 = term;
              term = print_filename_0_2.instance.invoke(context, c_4365, generator.constNil7, v_4364);
              if(term == null)
                break Fail26592;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7051, termFactory.makeListCons(u_4364, termFactory.makeListCons(generator.const6985, termFactory.makeListCons(v_4364, (IStrategoList)generator.constCons4972))));
              term = termFactory.makeTuple(generator.const7666, term);
              term = call_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26592;
              if(true)
                break Success10811;
            }
            term = term10955;
            IStrategoTerm e_4365 = null;
            e_4365 = term;
            term = warn_0_1.instance.invoke(context, e_4365, generator.const7667);
            if(term == null)
              break Fail26591;
            term = u_4364;
            v_4364 = u_4364;
          }
          if(true)
            break Success10810;
        }
        term = term10954;
        IStrategoTerm w_4364 = null;
        IStrategoTerm x_4364 = null;
        IStrategoTerm g_4365 = null;
        w_4364 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26590;
        x_4364 = term;
        g_4365 = w_4364;
        term = report_with_failure_0_2.instance.invoke(context, g_4365, generator.const7668, x_4364);
        if(term == null)
          break Fail26590;
      }
      term = y_4364;
      if(v_4364 == null)
        break Fail26590;
      term = termFactory.makeAppl(SpoofaxGenerator._consFILE_1, new IStrategoTerm[]{v_4364});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}