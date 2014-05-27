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

@SuppressWarnings("all") final class lifted21510 extends Strategy 
{ 
  Strategy h_92023;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76510:
    { 
      lifted21511 lifted215110 = new lifted21511();
      lifted215110.h_92023 = h_92023;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted215110);
      if(term == null)
        break Fail76510;
      if(true)
        return term;
    }
    return null;
  }
}