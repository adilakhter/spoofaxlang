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

@SuppressWarnings("all") public class throw_$Declaration_1_1 extends Strategy 
{ 
  public static throw_$Declaration_1_1 instance = new throw_$Declaration_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_92102, IStrategoTerm t_92102)
  { 
    context.push("throw_Declaration_1_1");
    Fail76270:
    { 
      IStrategoTerm w_92102 = null;
      w_92102 = term;
      term = dr_throw_1_2.instance.invoke(context, w_92102, u_92102, t_92102, trans.const15522);
      if(term == null)
        break Fail76270;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}