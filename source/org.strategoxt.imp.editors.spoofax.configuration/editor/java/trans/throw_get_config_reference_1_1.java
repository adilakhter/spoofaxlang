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

@SuppressWarnings("all") public class throw_get_config_reference_1_1 extends Strategy 
{ 
  public static throw_get_config_reference_1_1 instance = new throw_get_config_reference_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4633, IStrategoTerm g_4633)
  { 
    context.push("throw_get_config_reference_1_1");
    Fail22952:
    { 
      IStrategoTerm j_4633 = null;
      j_4633 = term;
      term = dr_throw_1_2.instance.invoke(context, j_4633, h_4633, g_4633, trans.const4482);
      if(term == null)
        break Fail22952;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}