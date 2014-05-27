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

@SuppressWarnings("all") public class get_all_includes_0_0 extends Strategy 
{ 
  public static get_all_includes_0_0 instance = new get_all_includes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_all_includes_0_0");
    Fail87571:
    { 
      IStrategoTerm x_17554 = null;
      IStrategoTerm z_17554 = null;
      IStrategoTerm b_17555 = null;
      z_17554 = term;
      b_17555 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87571;
      term = get_all_sources_0_1.instance.invoke(context, b_17555, term);
      if(term == null)
        break Fail87571;
      x_17554 = term;
      term = z_17554;
      term = get_sources_from_external_projects_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87571;
      term = termFactory.makeTuple(x_17554, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87571;
      term = make_set_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87571;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}