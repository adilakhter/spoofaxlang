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

@SuppressWarnings("all") final class lifted21565 extends Strategy 
{ 
  public static final lifted21565 instance = new lifted21565();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76417:
    { 
      IStrategoTerm term41829 = term;
      Success41865:
      { 
        Fail76418:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)term).stringValue()))
            break Fail76418;
          if(true)
            break Success41865;
        }
        term = term41829;
        if(term.getTermType() != IStrategoTerm.STRING || !"ast".equals(((IStrategoString)term).stringValue()))
          break Fail76417;
      }
      if(true)
        return term;
    }
    return null;
  }
}