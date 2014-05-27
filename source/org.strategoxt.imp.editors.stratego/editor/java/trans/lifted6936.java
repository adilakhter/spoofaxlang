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

@SuppressWarnings("all") final class lifted6936 extends Strategy 
{ 
  TermReference g_4817;

  TermReference h_4817;

  TermReference i_4817;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23967:
    { 
      IStrategoTerm term12617 = term;
      Success12719:
      { 
        Fail23968:
        { 
          if(g_4817.value == null)
            break Fail23968;
          term = $Declaration_0_0.instance.invoke(context, g_4817.value);
          if(term == null)
            break Fail23968;
          if(h_4817.value == null)
            h_4817.value = term;
          else
            if(h_4817.value != term && !h_4817.value.match(term))
              break Fail23968;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
            break Fail23968;
          if(i_4817.value == null)
            i_4817.value = term.getSubterm(0);
          else
            if(i_4817.value != term.getSubterm(0) && !i_4817.value.match(term.getSubterm(0)))
              break Fail23968;
          { 
            if(true)
              break Fail23967;
            if(true)
              break Success12719;
          }
        }
        term = term12617;
      }
      if(true)
        return term;
    }
    return null;
  }
}