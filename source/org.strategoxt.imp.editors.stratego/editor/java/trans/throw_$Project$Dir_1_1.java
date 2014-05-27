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

@SuppressWarnings("all") public class throw_$Project$Dir_1_1 extends Strategy 
{ 
  public static throw_$Project$Dir_1_1 instance = new throw_$Project$Dir_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4275, IStrategoTerm o_4275)
  { 
    context.push("throw_ProjectDir_1_1");
    Fail21901:
    { 
      IStrategoTerm r_4275 = null;
      r_4275 = term;
      term = dr_throw_1_2.instance.invoke(context, r_4275, p_4275, o_4275, trans.const4265);
      if(term == null)
        break Fail21901;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}