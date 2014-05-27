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

@SuppressWarnings("all") final class lifted6928 extends Strategy 
{ 
  TermReference x_4809;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23978:
    { 
      term = string_starts_with_0_1.instance.invoke(context, term, x_4809.value);
      if(term == null)
        break Fail23978;
      IStrategoTerm term12550 = term;
      Success12724:
      { 
        Fail23979:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"".equals(((IStrategoString)term).stringValue()))
            break Fail23979;
          { 
            if(true)
              break Fail23978;
            if(true)
              break Success12724;
          }
        }
        term = term12550;
      }
      if(true)
        return term;
    }
    return null;
  }
}