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
    Fail22869:
    { 
      IStrategoTerm a_4747 = null;
      IStrategoTerm b_4747 = null;
      b_4747 = term;
      a_4747 = term;
      term = $Declaration_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      term = signature_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      term = $Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22869;
      term = equal_0_1.instance.invoke(context, term, a_4747);
      if(term == null)
        break Fail22869;
      term = b_4747;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}