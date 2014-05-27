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

@SuppressWarnings("all") public class $C$O$N$S_1_0 extends Strategy 
{ 
  public static $C$O$N$S_1_0 instance = new $C$O$N$S_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_92076)
  { 
    context.push("CONS_1_0");
    Fail76103:
    { 
      lifted21579 lifted215790 = new lifted21579();
      lifted215790.d_92076 = d_92076;
      term = term_1_0.instance.invoke(context, term, lifted215790);
      if(term == null)
        break Fail76103;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}