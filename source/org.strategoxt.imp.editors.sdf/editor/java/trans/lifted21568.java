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

@SuppressWarnings("all") final class lifted21568 extends Strategy 
{ 
  public static final lifted21568 instance = new lifted21568();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76414:
    { 
      IStrategoTerm term41830 = term;
      Success41864:
      { 
        Fail76415:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"\"\"".equals(((IStrategoString)term).stringValue()))
            break Fail76415;
          { 
            if(true)
              break Fail76414;
            if(true)
              break Success41864;
          }
        }
        term = term41830;
      }
      if(true)
        return term;
    }
    return null;
  }
}