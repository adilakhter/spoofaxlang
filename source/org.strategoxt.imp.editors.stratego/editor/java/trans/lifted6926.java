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

@SuppressWarnings("all") final class lifted6926 extends Strategy 
{ 
  public static final lifted6926 instance = new lifted6926();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23981:
    { 
      IStrategoTerm y_4807 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23981;
      y_4807 = term.getSubterm(1);
      term = y_4807;
      if(true)
        return term;
    }
    return null;
  }
}