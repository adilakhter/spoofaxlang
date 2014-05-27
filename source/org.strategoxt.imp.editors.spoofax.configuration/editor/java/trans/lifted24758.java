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

@SuppressWarnings("all") final class lifted24758 extends Strategy 
{ 
  public static final lifted24758 instance = new lifted24758();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87866:
    { 
      IStrategoList annos2675 = term.getAnnotations();
      term = SRTS_one.instance.invoke(context, annos2675, lifted24759.instance);
      if(term == null)
        break Fail87866;
      if(true)
        return term;
    }
    return null;
  }
}