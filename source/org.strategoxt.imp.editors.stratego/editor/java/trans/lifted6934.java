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

@SuppressWarnings("all") final class lifted6934 extends Strategy 
{ 
  TermReference c_4813;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23972:
    { 
      IStrategoTerm term12595 = term;
      Success12722:
      { 
        Fail23973:
        { 
          if(c_4813.value == null)
            break Fail23973;
          term = $Declaration_0_0.instance.invoke(context, c_4813.value);
          if(term == null)
            break Fail23973;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
            break Fail23973;
          if(true)
            break Success12722;
        }
        term = $Is$No$Conflict_0_0.instance.invoke(context, term12595);
        if(term == null)
          break Fail23972;
      }
      if(true)
        return term;
    }
    return null;
  }
}