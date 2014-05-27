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

@SuppressWarnings("all") final class lifted6927 extends Strategy 
{ 
  TermReference x_4809;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23977:
    { 
      lifted6928 lifted69280 = new lifted6928();
      lifted69280.x_4809 = x_4809;
      term = SRTS_one.instance.invoke(context, term, lifted69280);
      if(term == null)
        break Fail23977;
      if(true)
        return term;
    }
    return null;
  }
}