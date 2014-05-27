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

@SuppressWarnings("all") public class fail_if_no_config_found_0_0 extends Strategy 
{ 
  public static fail_if_no_config_found_0_0 instance = new fail_if_no_config_found_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("fail_if_no_config_found_0_0");
    Fail87596:
    { 
      IStrategoTerm term47236 = term;
      Success47227:
      { 
        Fail87597:
        { 
          term = is_spx_config_exist_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87597;
          if(true)
            break Success47227;
        }
        term = throw_config_not_found_exception_1_0.instance.invoke(context, term47236, _Fail.instance);
        if(term == null)
          break Fail87596;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}