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

@SuppressWarnings("all") final class lifted7108 extends Strategy 
{ 
  TermReference a_4897;

  TermReference b_4897;

  TermReference c_4897;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23793:
    { 
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, term, a_4897.value, b_4897.value);
      if(term == null)
        break Fail23793;
      if(c_4897.value == null)
        c_4897.value = term;
      else
        if(c_4897.value != term && !c_4897.value.match(term))
          break Fail23793;
      if(true)
        return term;
    }
    return null;
  }
}