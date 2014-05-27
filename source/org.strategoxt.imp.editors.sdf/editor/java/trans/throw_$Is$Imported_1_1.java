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

@SuppressWarnings("all") public class throw_$Is$Imported_1_1 extends Strategy 
{ 
  public static throw_$Is$Imported_1_1 instance = new throw_$Is$Imported_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_92081, IStrategoTerm f_92081)
  { 
    context.push("throw_IsImported_1_1");
    Fail76140:
    { 
      IStrategoTerm i_92081 = null;
      i_92081 = term;
      term = dr_throw_1_2.instance.invoke(context, i_92081, g_92081, f_92081, trans.const15450);
      if(term == null)
        break Fail76140;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}