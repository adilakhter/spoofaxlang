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

@SuppressWarnings("all") public class throw_$Is$Imported$Failed_1_1 extends Strategy 
{ 
  public static throw_$Is$Imported$Failed_1_1 instance = new throw_$Is$Imported$Failed_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4877, IStrategoTerm d_4877)
  { 
    context.push("throw_IsImportedFailed_1_1");
    Fail23661:
    { 
      IStrategoTerm g_4877 = null;
      g_4877 = term;
      term = dr_throw_1_2.instance.invoke(context, g_4877, e_4877, d_4877, trans.const4576);
      if(term == null)
        break Fail23661;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}