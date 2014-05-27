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
    Fail22793:
    { 
      IStrategoTerm u_4614 = null;
      IStrategoTerm v_4614 = null;
      IStrategoTerm y_4614 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSpxProjects_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22793;
      u_4614 = term.getSubterm(0);
      y_4614 = term;
      IStrategoTerm term12150 = term;
      Success12141:
      { 
        Fail22794:
        { 
          term = map_1_0.instance.invoke(context, u_4614, annotate_project_location_0_0.instance);
          if(term == null)
            break Fail22794;
          v_4614 = term;
          if(true)
            break Success12141;
        }
        term = term12150;
        IStrategoTerm w_4614 = null;
        IStrategoTerm x_4614 = null;
        IStrategoTerm a_4615 = null;
        w_4614 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail22793;
        x_4614 = term;
        a_4615 = w_4614;
        term = report_with_failure_0_2.instance.invoke(context, a_4615, trans.const4470, x_4614);
        if(term == null)
          break Fail22793;
      }
      term = y_4614;
      if(v_4614 == null)
        break Fail22793;
      term = termFactory.makeAppl(Main._consSpxProjects_1, new IStrategoTerm[]{v_4614});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}