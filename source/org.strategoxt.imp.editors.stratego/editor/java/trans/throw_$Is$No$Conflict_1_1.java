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

@SuppressWarnings("all") public class throw_$Is$No$Conflict_1_1 extends Strategy 
{ 
  public static throw_$Is$No$Conflict_1_1 instance = new throw_$Is$No$Conflict_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4340, IStrategoTerm p_4340)
  { 
    context.push("throw_IsNoConflict_1_1");
    Fail22290:
    { 
      IStrategoTerm s_4340 = null;
      s_4340 = term;
      term = dr_throw_1_2.instance.invoke(context, s_4340, q_4340, p_4340, trans.const4427);
      if(term == null)
        break Fail22290;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}