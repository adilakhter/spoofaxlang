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

@SuppressWarnings("all") final class lifted21583 extends Strategy 
{ 
  Strategy d_92076;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76395:
    { 
      lifted21584 lifted215840 = new lifted21584();
      lifted215840.d_92076 = d_92076;
      term = $Cons_2_0.instance.invoke(context, term, lifted215840, $Nil_0_0.instance);
      if(term == null)
        break Fail76395;
      if(true)
        return term;
    }
    return null;
  }
}