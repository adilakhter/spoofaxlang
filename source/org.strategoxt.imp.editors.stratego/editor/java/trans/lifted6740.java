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

@SuppressWarnings("all") final class lifted6740 extends Strategy 
{ 
  Strategy f_4728;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24201:
    { 
      lifted6741 lifted67410 = new lifted6741();
      lifted67410.f_4728 = f_4728;
      term = filter_1_0.instance.invoke(context, term, lifted67410);
      if(term == null)
        break Fail24201;
      if(true)
        return term;
    }
    return null;
  }
}