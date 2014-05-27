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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4860, IStrategoTerm z_4859)
  { 
    context.push("throw_CurrentDir_1_1");
    Fail23559:
    { 
      IStrategoTerm c_4860 = null;
      c_4860 = term;
      term = dr_throw_1_2.instance.invoke(context, c_4860, a_4860, z_4859, trans.const4556);
      if(term == null)
        break Fail23559;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}