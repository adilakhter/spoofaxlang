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
    Fail22763:
    { 
      IStrategoTerm a_4611 = null;
      IStrategoTerm c_4611 = null;
      IStrategoTerm e_4611 = null;
      c_4611 = term;
      e_4611 = term;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22763;
      term = get_all_sources_0_1.instance.invoke(context, e_4611, term);
      if(term == null)
        break Fail22763;
      a_4611 = term;
      term = c_4611;
      term = get_sources_from_external_projects_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22763;
      term = termFactory.makeTuple(a_4611, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22763;
      term = make_set_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22763;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}