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

@SuppressWarnings("all") public class continue_to_label_$Project$Dir_0_1 extends Strategy 
{ 
  public static continue_to_label_$Project$Dir_0_1 instance = new continue_to_label_$Project$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4829)
  { 
    context.push("continue_to_label_ProjectDir_0_1");
    Fail23378:
    { 
      IStrategoTerm m_4829 = null;
      m_4829 = term;
      term = dr_continue_0_2.instance.invoke(context, m_4829, trans.const4475, k_4829);
      if(term == null)
        break Fail23378;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}