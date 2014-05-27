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

@SuppressWarnings("all") public class continue_to_label_$Source$Dir_0_1 extends Strategy 
{ 
  public static continue_to_label_$Source$Dir_0_1 instance = new continue_to_label_$Source$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4842)
  { 
    context.push("continue_to_label_SourceDir_0_1");
    Fail23456:
    { 
      IStrategoTerm d_4842 = null;
      d_4842 = term;
      term = dr_continue_0_2.instance.invoke(context, d_4842, trans.const4552, b_4842);
      if(term == null)
        break Fail23456;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}