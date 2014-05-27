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

@SuppressWarnings("all") final class lifted6931 extends Strategy 
{ 
  TermReference s_4814;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23974:
    { 
      IStrategoTerm term12580 = term;
      Success12723:
      { 
        Fail23975:
        { 
          if(s_4814.value == null)
            break Fail23975;
          term = $Is$Imported$Failed_0_0.instance.invoke(context, s_4814.value);
          if(term == null)
            break Fail23975;
          { 
            if(true)
              break Fail23974;
            if(true)
              break Success12723;
          }
        }
        term = term12580;
      }
      if(true)
        return term;
    }
    return null;
  }
}