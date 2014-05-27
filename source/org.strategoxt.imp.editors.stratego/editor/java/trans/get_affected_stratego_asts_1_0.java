package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_affected_stratego_asts_1_0 extends Strategy 
{ 
  public static get_affected_stratego_asts_1_0 instance = new get_affected_stratego_asts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4177)
  { 
    context.push("get_affected_stratego_asts_1_0");
    Fail21330:
    { 
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21330;
      term = get_affected_asts_4_0.instance.invoke(context, term, lifted6481.instance, lifted6482.instance, n_4177, get_cache_path_0_0.instance);
      if(term == null)
        break Fail21330;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}