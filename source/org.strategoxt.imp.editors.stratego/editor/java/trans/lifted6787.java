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

@SuppressWarnings("all") final class lifted6787 extends Strategy 
{ 
  TermReference y_4320;

  TermReference z_4320;

  TermReference a_4321;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22367:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, y_4320.value, z_4320.value);
      if(term == null)
        break Fail22367;
      if(a_4321.value == null)
        a_4321.value = term;
      else
        if(a_4321.value != term && !a_4321.value.match(term))
          break Fail22367;
      if(true)
        return term;
    }
    return null;
  }
}