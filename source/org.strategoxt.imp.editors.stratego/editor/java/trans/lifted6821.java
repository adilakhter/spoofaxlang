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

@SuppressWarnings("all") final class lifted6821 extends Strategy 
{ 
  public static final lifted6821 instance = new lifted6821();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24086:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consMARKER_0 != ((IStrategoAppl)term).getConstructor())
        break Fail24086;
      if(true)
        return term;
    }
    return null;
  }
}