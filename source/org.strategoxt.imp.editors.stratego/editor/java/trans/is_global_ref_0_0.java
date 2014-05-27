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

@SuppressWarnings("all") public class is_global_ref_0_0 extends Strategy 
{ 
  public static is_global_ref_0_0 instance = new is_global_ref_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_global_ref_0_0");
    Fail21393:
    { 
      IStrategoTerm i_4193 = null;
      IStrategoTerm j_4193 = null;
      j_4193 = term;
      i_4193 = term;
      term = $Declaration_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21393;
      term = signature_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21393;
      term = $Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21393;
      term = equal_0_1.instance.invoke(context, term, i_4193);
      if(term == null)
        break Fail21393;
      term = j_4193;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}