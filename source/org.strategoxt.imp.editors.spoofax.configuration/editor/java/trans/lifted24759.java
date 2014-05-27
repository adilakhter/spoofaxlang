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

@SuppressWarnings("all") final class lifted24759 extends Strategy 
{ 
  public static final lifted24759 instance = new lifted24759();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87867:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consMARKER_0 != ((IStrategoAppl)term).getConstructor())
        break Fail87867;
      if(true)
        return term;
    }
    return null;
  }
}