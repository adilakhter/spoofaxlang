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

@SuppressWarnings("all") final class lifted6915 extends Strategy 
{ 
  TermReference f_4807;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail23994:
    { 
      IStrategoTerm i_4807 = null;
      IStrategoTerm j_4807 = null;
      i_4807 = term;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23994;
      j_4807 = term.getSubterm(0);
      term = termFactory.makeTuple(j_4807, trans.const4437, trans.const4437);
      if(f_4807.value == null)
        f_4807.value = term;
      else
        if(f_4807.value != term && !f_4807.value.match(term))
          break Fail23994;
      term = $Declare$Cookie_0_0.instance.invoke(context, i_4807);
      if(term == null)
        break Fail23994;
      if(true)
        return term;
    }
    return null;
  }
}