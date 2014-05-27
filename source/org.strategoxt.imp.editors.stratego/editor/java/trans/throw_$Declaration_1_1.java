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

@SuppressWarnings("all") public class throw_$Declaration_1_1 extends Strategy 
{ 
  public static throw_$Declaration_1_1 instance = new throw_$Declaration_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4864, IStrategoTerm g_4864)
  { 
    context.push("throw_Declaration_1_1");
    Fail23585:
    { 
      IStrategoTerm j_4864 = null;
      j_4864 = term;
      term = dr_throw_1_2.instance.invoke(context, j_4864, h_4864, g_4864, trans.const4570);
      if(term == null)
        break Fail23585;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}