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

@SuppressWarnings("all") public class throw_directory_not_found_exception_1_0 extends Strategy 
{ 
  public static throw_directory_not_found_exception_1_0 instance = new throw_directory_not_found_exception_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4614)
  { 
    context.push("throw_directory_not_found_exception_1_0");
    Fail22790:
    { 
      term = debug_1_0.instance.invoke(context, term, lifted6852.instance);
      if(term == null)
        break Fail22790;
      term = p_4614.invoke(context, term);
      if(term == null)
        break Fail22790;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}