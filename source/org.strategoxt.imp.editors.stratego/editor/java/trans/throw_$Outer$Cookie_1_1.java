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

@SuppressWarnings("all") public class throw_$Outer$Cookie_1_1 extends Strategy 
{ 
  public static throw_$Outer$Cookie_1_1 instance = new throw_$Outer$Cookie_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4332, IStrategoTerm f_4332)
  { 
    context.push("throw_OuterCookie_1_1");
    Fail22238:
    { 
      IStrategoTerm i_4332 = null;
      i_4332 = term;
      term = dr_throw_1_2.instance.invoke(context, i_4332, g_4332, f_4332, trans.const4394);
      if(term == null)
        break Fail22238;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}