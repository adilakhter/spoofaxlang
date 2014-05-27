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

@SuppressWarnings("all") final class lifted21557 extends Strategy 
{ 
  public static final lifted21557 instance = new lifted21557();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76423:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consrange_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76423;
      if(true)
        return term;
    }
    return null;
  }
}