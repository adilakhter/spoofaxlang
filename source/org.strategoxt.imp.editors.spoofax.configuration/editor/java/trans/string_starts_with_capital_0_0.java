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

@SuppressWarnings("all") public class string_starts_with_capital_0_0 extends Strategy 
{ 
  public static string_starts_with_capital_0_0 instance = new string_starts_with_capital_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("string_starts_with_capital_0_0");
    Fail87680:
    { 
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87680;
      term = $Hd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87680;
      term = is_upper_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87680;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}