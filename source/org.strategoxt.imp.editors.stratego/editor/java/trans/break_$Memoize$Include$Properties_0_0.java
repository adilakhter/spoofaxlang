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

@SuppressWarnings("all") public class break_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static break_$Memoize$Include$Properties_0_0 instance = new break_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_MemoizeIncludeProperties_0_0");
    Fail22216:
    { 
      IStrategoTerm d_4328 = null;
      d_4328 = term;
      term = dr_break_0_1.instance.invoke(context, d_4328, trans.const4374);
      if(term == null)
        break Fail22216;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}