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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4633)
  { 
    context.push("continue_to_label_get_config_reference_0_1");
    Fail22953:
    { 
      IStrategoTerm m_4633 = null;
      m_4633 = term;
      term = dr_continue_0_2.instance.invoke(context, m_4633, trans.const4482, k_4633);
      if(term == null)
        break Fail22953;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}