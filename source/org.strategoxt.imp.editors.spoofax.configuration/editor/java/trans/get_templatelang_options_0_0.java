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

@SuppressWarnings("all") public class get_templatelang_options_0_0 extends Strategy 
{ 
  public static get_templatelang_options_0_0 instance = new get_templatelang_options_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_templatelang_options_0_0");
    Fail22908:
    { 
      term = collect_all_2_0.instance.invoke(context, term, lifted6883.instance, conc_0_0.instance);
      if(term == null)
        break Fail22908;
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22908;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}