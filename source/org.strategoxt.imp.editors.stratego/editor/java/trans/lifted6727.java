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

@SuppressWarnings("all") final class lifted6727 extends Strategy 
{ 
  TermReference a_4726;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24212:
    { 
      lifted6728 lifted67280 = new lifted6728();
      lifted67280.a_4726 = a_4726;
      term = try_1_0.instance.invoke(context, term, lifted67280);
      if(term == null)
        break Fail24212;
      if(true)
        return term;
    }
    return null;
  }
}