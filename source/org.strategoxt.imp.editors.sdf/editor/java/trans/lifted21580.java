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

@SuppressWarnings("all") final class lifted21580 extends Strategy 
{ 
  Strategy d_92076;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76394:
    { 
      lifted21583 lifted215830 = new lifted21583();
      lifted215830.d_92076 = d_92076;
      term = appl_2_0.instance.invoke(context, term, lifted21581.instance, lifted215830);
      if(term == null)
        break Fail76394;
      if(true)
        return term;
    }
    return null;
  }
}