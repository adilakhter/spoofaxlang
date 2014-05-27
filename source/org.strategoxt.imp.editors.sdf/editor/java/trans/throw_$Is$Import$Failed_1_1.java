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

@SuppressWarnings("all") public class throw_$Is$Import$Failed_1_1 extends Strategy 
{ 
  public static throw_$Is$Import$Failed_1_1 instance = new throw_$Is$Import$Failed_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_92093, IStrategoTerm w_92093)
  { 
    context.push("throw_IsImportFailed_1_1");
    Fail76218:
    { 
      IStrategoTerm z_92093 = null;
      z_92093 = term;
      term = dr_throw_1_2.instance.invoke(context, z_92093, x_92093, w_92093, trans.const15520);
      if(term == null)
        break Fail76218;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}