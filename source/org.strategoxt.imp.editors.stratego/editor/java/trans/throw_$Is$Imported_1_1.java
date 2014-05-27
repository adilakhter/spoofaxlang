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

@SuppressWarnings("all") public class throw_$Is$Imported_1_1 extends Strategy 
{ 
  public static throw_$Is$Imported_1_1 instance = new throw_$Is$Imported_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4284, IStrategoTerm c_4284)
  { 
    context.push("throw_IsImported_1_1");
    Fail21953:
    { 
      IStrategoTerm f_4284 = null;
      f_4284 = term;
      term = dr_throw_1_2.instance.invoke(context, f_4284, d_4284, c_4284, trans.const4327);
      if(term == null)
        break Fail21953;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}