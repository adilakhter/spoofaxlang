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

@SuppressWarnings("all") public class break_bp_$Is$Imported_0_0 extends Strategy 
{ 
  public static break_bp_$Is$Imported_0_0 instance = new break_bp_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_IsImported_0_0");
    Fail76143:
    { 
      IStrategoTerm p_92081 = null;
      p_92081 = term;
      term = dr_break_bp_0_1.instance.invoke(context, p_92081, trans.const15450);
      if(term == null)
        break Fail76143;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}