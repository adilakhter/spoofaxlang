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

@SuppressWarnings("all") final class lifted7059 extends Strategy 
{ 
  TermReference e_4874;

  TermReference f_4874;

  TermReference g_4874;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23842:
    { 
      term = aux_$Declare$Cookie_0_2.instance.invoke(context, term, e_4874.value, f_4874.value);
      if(term == null)
        break Fail23842;
      if(g_4874.value == null)
        g_4874.value = term;
      else
        if(g_4874.value != term && !g_4874.value.match(term))
          break Fail23842;
      if(true)
        return term;
    }
    return null;
  }
}