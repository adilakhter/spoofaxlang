package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class normalized_spxproject_reference_0_0 extends Strategy 
{ 
  public static normalized_spxproject_reference_0_0 instance = new normalized_spxproject_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("normalized_spxproject_reference_0_0");
    Fail87601:
    { 
      IStrategoTerm r_17558 = null;
      IStrategoTerm s_17558 = null;
      IStrategoTerm v_17558 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSpxProjects_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87601;
      r_17558 = term.getSubterm(0);
      v_17558 = term;
      IStrategoTerm term47237 = term;
      Success47228:
      { 
        Fail87602:
        { 
          term = map_1_0.instance.invoke(context, r_17558, annotate_project_location_0_0.instance);
          if(term == null)
            break Fail87602;
          s_17558 = term;
          if(true)
            break Success47228;
        }
        term = term47237;
        IStrategoTerm t_17558 = null;
        IStrategoTerm u_17558 = null;
        IStrategoTerm x_17558 = null;
        t_17558 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail87601;
        u_17558 = term;
        x_17558 = t_17558;
        term = report_with_failure_0_2.instance.invoke(context, x_17558, trans.const17857, u_17558);
        if(term == null)
          break Fail87601;
      }
      term = v_17558;
      if(s_17558 == null)
        break Fail87601;
      term = termFactory.makeAppl(Main._consSpxProjects_1, new IStrategoTerm[]{s_17558});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}