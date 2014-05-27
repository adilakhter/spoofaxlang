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

@SuppressWarnings("all") public class continue_to_label_get_config_reference_0_1 extends Strategy 
{ 
  public static continue_to_label_get_config_reference_0_1 instance = new continue_to_label_get_config_reference_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_17577)
  { 
    context.push("continue_to_label_get_config_reference_0_1");
    Fail87761:
    { 
      IStrategoTerm j_17577 = null;
      j_17577 = term;
      term = dr_continue_0_2.instance.invoke(context, j_17577, trans.const17869, h_17577);
      if(term == null)
        break Fail87761;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}