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

@SuppressWarnings("all") final class lifted21515 extends Strategy 
{ 
  TermReference u_92024;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76505:
    { 
      if(u_92024.value == null)
        u_92024.value = term;
      else
        if(u_92024.value != term && !u_92024.value.match(term))
          break Fail76505;
      if(true)
        return term;
    }
    return null;
  }
}