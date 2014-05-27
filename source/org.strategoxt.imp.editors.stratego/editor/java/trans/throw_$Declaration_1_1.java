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

@SuppressWarnings("all") public class throw_$Declaration_1_1 extends Strategy 
{ 
  public static throw_$Declaration_1_1 instance = new throw_$Declaration_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4310, IStrategoTerm o_4310)
  { 
    context.push("throw_Declaration_1_1");
    Fail22109:
    { 
      IStrategoTerm r_4310 = null;
      r_4310 = term;
      term = dr_throw_1_2.instance.invoke(context, r_4310, p_4310, o_4310, trans.const4360);
      if(term == null)
        break Fail22109;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}