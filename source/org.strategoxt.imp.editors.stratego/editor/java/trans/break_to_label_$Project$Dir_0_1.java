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

@SuppressWarnings("all") public class break_to_label_$Project$Dir_0_1 extends Strategy 
{ 
  public static break_to_label_$Project$Dir_0_1 instance = new break_to_label_$Project$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4275)
  { 
    context.push("break_to_label_ProjectDir_0_1");
    Fail21905:
    { 
      IStrategoTerm b_4276 = null;
      b_4276 = term;
      term = dr_break_0_2.instance.invoke(context, b_4276, trans.const4265, z_4275);
      if(term == null)
        break Fail21905;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}