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

@SuppressWarnings("all") public class all_keys_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static all_keys_$Memoize$Include$Properties_0_0 instance = new all_keys_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("all_keys_MemoizeIncludeProperties_0_0");
    Fail23693:
    { 
      IStrategoTerm x_4881 = null;
      x_4881 = term;
      term = dr_all_keys_0_1.instance.invoke(context, x_4881, trans.const4584);
      if(term == null)
        break Fail23693;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}