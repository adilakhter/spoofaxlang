package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class set_total_work_units_0_0 extends Strategy 
{ 
  public static set_total_work_units_0_0 instance = new set_total_work_units_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail75711:
    { 
      term = context.invokePrimitive("SSL_EXT_set_total_work_units", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail75711;
      if(true)
        return term;
    }
    context.push("set_total_work_units_0_0");
    context.popOnFailure();
    return null;
  }
}