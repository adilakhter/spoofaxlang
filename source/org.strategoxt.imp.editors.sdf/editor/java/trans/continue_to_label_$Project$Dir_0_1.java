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

@SuppressWarnings("all") public class continue_to_label_$Project$Dir_0_1 extends Strategy 
{ 
  public static continue_to_label_$Project$Dir_0_1 instance = new continue_to_label_$Project$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_92085)
  { 
    context.push("continue_to_label_ProjectDir_0_1");
    Fail76167:
    { 
      IStrategoTerm o_92085 = null;
      o_92085 = term;
      term = dr_continue_0_2.instance.invoke(context, o_92085, trans.const15517, m_92085);
      if(term == null)
        break Fail76167;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}