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

@SuppressWarnings("all") final class lifted24733 extends Strategy 
{ 
  public static final lifted24733 instance = new lifted24733();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail87896:
    { 
      IStrategoTerm j_17558 = null;
      IStrategoList annos2673 = term.getAnnotations();
      if(annos2673.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos2673).isEmpty())
        break Fail87896;
      j_17558 = ((IStrategoList)annos2673).head();
      IStrategoTerm arg29980 = ((IStrategoList)annos2673).tail();
      if(arg29980.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg29980).isEmpty())
        break Fail87896;
      term = j_17558;
      IStrategoTerm term47234 = term;
      Success47332:
      { 
        Fail87897:
        { 
          term = termFactory.makeTuple(trans.const17853, term);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87897;
          { 
            if(true)
              break Fail87896;
            if(true)
              break Success47332;
          }
        }
        term = term47234;
      }
      if(true)
        return term;
    }
    return null;
  }
}