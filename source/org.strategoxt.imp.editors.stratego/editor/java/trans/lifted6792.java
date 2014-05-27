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

@SuppressWarnings("all") final class lifted6792 extends Strategy 
{ 
  TermReference y_4321;

  TermReference x_4321;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22362:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, y_4321.value, x_4321.value);
      if(term == null)
        break Fail22362;
      if(true)
        return term;
    }
    return null;
  }
}