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

@SuppressWarnings("all") final class lifted6737 extends Strategy 
{ 
  TermReference y_4727;

  TermReference z_4727;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24204:
    { 
      lifted6738 lifted67380 = new lifted6738();
      lifted67380.y_4727 = y_4727;
      lifted67380.z_4727 = z_4727;
      term = try_1_0.instance.invoke(context, term, lifted67380);
      if(term == null)
        break Fail24204;
      if(true)
        return term;
    }
    return null;
  }
}