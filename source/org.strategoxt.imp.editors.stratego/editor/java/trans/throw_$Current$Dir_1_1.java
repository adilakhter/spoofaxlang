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

@SuppressWarnings("all") public class throw_$Current$Dir_1_1 extends Strategy 
{ 
  public static throw_$Current$Dir_1_1 instance = new throw_$Current$Dir_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4306, IStrategoTerm h_4306)
  { 
    context.push("throw_CurrentDir_1_1");
    Fail22083:
    { 
      IStrategoTerm k_4306 = null;
      k_4306 = term;
      term = dr_throw_1_2.instance.invoke(context, k_4306, i_4306, h_4306, trans.const4346);
      if(term == null)
        break Fail22083;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}