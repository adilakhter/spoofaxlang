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

@SuppressWarnings("all") final class lifted6840 extends Strategy 
{ 
  TermReference c_4765;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24069:
    { 
      if(c_4765.value == null)
        c_4765.value = term;
      else
        if(c_4765.value != term && !c_4765.value.match(term))
          break Fail24069;
      if(true)
        return term;
    }
    return null;
  }
}