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

@SuppressWarnings("all") public class throw_$Usage_1_1 extends Strategy 
{ 
  public static throw_$Usage_1_1 instance = new throw_$Usage_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_92107, IStrategoTerm a_92107)
  { 
    context.push("throw_Usage_1_1");
    Fail76297:
    { 
      IStrategoTerm d_92107 = null;
      d_92107 = term;
      term = dr_throw_1_2.instance.invoke(context, d_92107, b_92107, a_92107, trans.const15535);
      if(term == null)
        break Fail76297;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}