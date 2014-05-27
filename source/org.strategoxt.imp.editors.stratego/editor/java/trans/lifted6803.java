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

@SuppressWarnings("all") final class lifted6803 extends Strategy 
{ 
  TermReference r_4747;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24110:
    { 
      IStrategoList annos706 = term.getAnnotations();
      if(annos706.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos706).isEmpty())
        break Fail24110;
      if(r_4747.value == null)
        r_4747.value = ((IStrategoList)annos706).head();
      else
        if(r_4747.value != ((IStrategoList)annos706).head() && !r_4747.value.match(((IStrategoList)annos706).head()))
          break Fail24110;
      IStrategoTerm arg8141 = ((IStrategoList)annos706).tail();
      if(arg8141.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8141).isEmpty())
        break Fail24110;
      if(true)
        return term;
    }
    return null;
  }
}