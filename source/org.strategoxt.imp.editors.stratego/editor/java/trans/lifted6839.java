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

@SuppressWarnings("all") final class lifted6839 extends Strategy 
{ 
  TermReference y_4343;

  TermReference z_4343;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22315:
    { 
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, term, y_4343.value, z_4343.value);
      if(term == null)
        break Fail22315;
      if(true)
        return term;
    }
    return null;
  }
}