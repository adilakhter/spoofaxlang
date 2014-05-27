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

@SuppressWarnings("all") public class throw_$Current$Dir_1_1 extends Strategy 
{ 
  public static throw_$Current$Dir_1_1 instance = new throw_$Current$Dir_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_92089, IStrategoTerm p_92089)
  { 
    context.push("throw_CurrentDir_1_1");
    Fail76192:
    { 
      IStrategoTerm s_92089 = null;
      s_92089 = term;
      term = dr_throw_1_2.instance.invoke(context, s_92089, q_92089, p_92089, trans.const15515);
      if(term == null)
        break Fail76192;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}