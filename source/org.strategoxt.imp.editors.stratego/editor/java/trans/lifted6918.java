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

@SuppressWarnings("all") final class lifted6918 extends Strategy 
{ 
  public static final lifted6918 instance = new lifted6918();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23989:
    { 
      term = filter_1_0.instance.invoke(context, term, lifted6919.instance);
      if(term == null)
        break Fail23989;
      IStrategoTerm term12541 = term;
      Success12728:
      { 
        Fail23990:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail23990;
          { 
            if(true)
              break Fail23989;
            if(true)
              break Success12728;
          }
        }
        term = term12541;
      }
      if(true)
        return term;
    }
    return null;
  }
}