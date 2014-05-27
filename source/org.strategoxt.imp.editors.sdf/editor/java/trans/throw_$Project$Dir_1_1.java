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

@SuppressWarnings("all") public class throw_$Project$Dir_1_1 extends Strategy 
{ 
  public static throw_$Project$Dir_1_1 instance = new throw_$Project$Dir_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_92085, IStrategoTerm i_92085)
  { 
    context.push("throw_ProjectDir_1_1");
    Fail76166:
    { 
      IStrategoTerm l_92085 = null;
      l_92085 = term;
      term = dr_throw_1_2.instance.invoke(context, l_92085, j_92085, i_92085, trans.const15517);
      if(term == null)
        break Fail76166;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}