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

@SuppressWarnings("all") final class lifted21503 extends Strategy 
{ 
  TermReference o_92017;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76530:
    { 
      if(o_92017.value == null)
        o_92017.value = term;
      else
        if(o_92017.value != term && !o_92017.value.match(term))
          break Fail76530;
      if(true)
        return term;
    }
    return null;
  }
}