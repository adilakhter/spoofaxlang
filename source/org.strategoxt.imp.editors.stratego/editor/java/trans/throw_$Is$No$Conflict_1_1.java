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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4894, IStrategoTerm h_4894)
  { 
    context.push("throw_IsNoConflict_1_1");
    Fail23766:
    { 
      IStrategoTerm k_4894 = null;
      k_4894 = term;
      term = dr_throw_1_2.instance.invoke(context, k_4894, i_4894, h_4894, trans.const4637);
      if(term == null)
        break Fail23766;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}