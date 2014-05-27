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

@SuppressWarnings("all") final class lifted6737 extends Strategy 
{ 
  TermReference g_4295;

  TermReference h_4295;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22417:
    { 
      term = aux_$Decorated$Ast_0_1.instance.invoke(context, term, g_4295.value);
      if(term == null)
        break Fail22417;
      if(h_4295.value == null)
        h_4295.value = term;
      else
        if(h_4295.value != term && !h_4295.value.match(term))
          break Fail22417;
      if(true)
        return term;
    }
    return null;
  }
}