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

@SuppressWarnings("all") final class lifted21560 extends Strategy 
{ 
  public static final lifted21560 instance = new lifted21560();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76419:
    { 
      IStrategoTerm term41826 = term;
      Success41866:
      { 
        Fail76420:
        { 
          term = is_iter_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76420;
          if(true)
            break Success41866;
        }
        term = term41826;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)term).getConstructor())
          break Fail76419;
      }
      if(true)
        return term;
    }
    return null;
  }
}