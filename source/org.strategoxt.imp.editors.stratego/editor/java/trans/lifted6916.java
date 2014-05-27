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

@SuppressWarnings("all") final class lifted6916 extends Strategy 
{ 
  TermReference v_4808;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23993:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23993;
      if(v_4808.value == null)
        v_4808.value = term.getSubterm(0);
      else
        if(v_4808.value != term.getSubterm(0) && !v_4808.value.match(term.getSubterm(0)))
          break Fail23993;
      if(true)
        return term;
    }
    return null;
  }
}