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

@SuppressWarnings("all") public class fail_if_no_directory_found_0_0 extends Strategy 
{ 
  public static fail_if_no_directory_found_0_0 instance = new fail_if_no_directory_found_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("fail_if_no_directory_found_0_0");
    Fail22786:
    { 
      IStrategoTerm term12148 = term;
      Success12139:
      { 
        Fail22787:
        { 
          term = is_dir_exist_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22787;
          if(true)
            break Success12139;
        }
        term = throw_directory_not_found_exception_1_0.instance.invoke(context, term12148, _Fail.instance);
        if(term == null)
          break Fail22786;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}