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

@SuppressWarnings("all") public class aux_$Is$Imported_0_2 extends Strategy 
{ 
  public static aux_$Is$Imported_0_2 instance = new aux_$Is$Imported_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_4287, IStrategoTerm y_4287)
  { 
    Fail21976:
    { 
      IStrategoTerm z_4287 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21976;
      IStrategoTerm arg7904 = term.getSubterm(0);
      if(arg7904.getTermType() != IStrategoTerm.STRING || !"-597601".equals(((IStrategoString)arg7904).stringValue()))
        break Fail21976;
      z_4287 = term.getSubterm(1);
      term = z_4287;
      if(true)
        return term;
    }
    context.push("aux_IsImported_0_2");
    context.popOnFailure();
    return null;
  }
}