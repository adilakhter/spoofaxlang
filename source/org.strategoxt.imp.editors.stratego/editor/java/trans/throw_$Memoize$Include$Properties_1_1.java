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

@SuppressWarnings("all") public class throw_$Memoize$Include$Properties_1_1 extends Strategy 
{ 
  public static throw_$Memoize$Include$Properties_1_1 instance = new throw_$Memoize$Include$Properties_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4327, IStrategoTerm o_4327)
  { 
    context.push("throw_MemoizeIncludeProperties_1_1");
    Fail22211:
    { 
      IStrategoTerm r_4327 = null;
      r_4327 = term;
      term = dr_throw_1_2.instance.invoke(context, r_4327, p_4327, o_4327, trans.const4374);
      if(term == null)
        break Fail22211;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}