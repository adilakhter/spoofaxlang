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

@SuppressWarnings("all") public class break_to_label_$Is$Import$Failed_0_1 extends Strategy 
{ 
  public static break_to_label_$Is$Import$Failed_0_1 instance = new break_to_label_$Is$Import$Failed_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_92094)
  { 
    context.push("break_to_label_IsImportFailed_0_1");
    Fail76222:
    { 
      IStrategoTerm j_92094 = null;
      j_92094 = term;
      term = dr_break_0_2.instance.invoke(context, j_92094, trans.const15520, h_92094);
      if(term == null)
        break Fail76222;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}