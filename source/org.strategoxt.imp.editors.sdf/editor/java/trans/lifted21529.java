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

@SuppressWarnings("all") final class lifted21529 extends Strategy 
{ 
  public static final lifted21529 instance = new lifted21529();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76496:
    { 
      IStrategoTerm term41523 = term;
      Success41928:
      { 
        Fail76497:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 60 != ((IStrategoInt)term).intValue())
            break Fail76497;
          if(true)
            break Success41928;
        }
        term = term41523;
        if(term.getTermType() != IStrategoTerm.INT || 62 != ((IStrategoInt)term).intValue())
          break Fail76496;
      }
      if(true)
        return term;
    }
    return null;
  }
}