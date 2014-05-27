package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Is$Imported_0_2 extends Strategy 
{ 
  public static aux_$Is$Imported_0_2 instance = new aux_$Is$Imported_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_4646, IStrategoTerm e_4646)
  { 
    Fail23027:
    { 
      IStrategoTerm f_4646 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23027;
      IStrategoTerm arg8055 = term.getSubterm(0);
      if(arg8055.getTermType() != IStrategoTerm.STRING || !"-597601".equals(((IStrategoString)arg8055).stringValue()))
        break Fail23027;
      f_4646 = term.getSubterm(1);
      term = f_4646;
      if(true)
        return term;
    }
    context.push("aux_IsImported_0_2");
    context.popOnFailure();
    return null;
  }
}