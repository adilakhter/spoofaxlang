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

@SuppressWarnings("all") public class collect_vars_0_0 extends Strategy 
{ 
  public static collect_vars_0_0 instance = new collect_vars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("collect_vars_0_0");
    Fail21312:
    { 
      term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
      if(term == null)
        break Fail21312;
      term = collect_om_1_0.instance.invoke(context, term, lifted6464.instance);
      if(term == null)
        break Fail21312;
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21312;
      term = make_set_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21312;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}