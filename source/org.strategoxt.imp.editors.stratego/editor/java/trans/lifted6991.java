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

@SuppressWarnings("all") final class lifted6991 extends Strategy 
{ 
  TermReference w_4840;

  TermReference x_4840;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23910:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, w_4840.value, x_4840.value);
      if(term == null)
        break Fail23910;
      if(true)
        return term;
    }
    return null;
  }
}