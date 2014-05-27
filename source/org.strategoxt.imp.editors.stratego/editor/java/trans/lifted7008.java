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

@SuppressWarnings("all") final class lifted7008 extends Strategy 
{ 
  TermReference y_4848;

  TermReference z_4848;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23893:
    { 
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, term, y_4848.value);
      if(term == null)
        break Fail23893;
      if(z_4848.value == null)
        z_4848.value = term;
      else
        if(z_4848.value != term && !z_4848.value.match(term))
          break Fail23893;
      if(true)
        return term;
    }
    return null;
  }
}