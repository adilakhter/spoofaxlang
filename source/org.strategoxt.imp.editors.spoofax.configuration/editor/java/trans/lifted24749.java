package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24749 extends Strategy 
{ 
  TermReference f_17565;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87889:
    { 
      if(f_17565.value == null)
        f_17565.value = term;
      else
        if(f_17565.value != term && !f_17565.value.match(term))
          break Fail87889;
      if(true)
        return term;
    }
    return null;
  }
}