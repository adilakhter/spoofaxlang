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

@SuppressWarnings("all") public class aux_$Current$File_0_1 extends Strategy 
{ 
  public static aux_$Current$File_0_1 instance = new aux_$Current$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_4283)
  { 
    Fail21950:
    { 
      IStrategoTerm w_4283 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21950;
      IStrategoTerm arg7899 = term.getSubterm(0);
      if(arg7899.getTermType() != IStrategoTerm.STRING || !"99705".equals(((IStrategoString)arg7899).stringValue()))
        break Fail21950;
      w_4283 = term.getSubterm(1);
      term = w_4283;
      if(true)
        return term;
    }
    context.push("aux_CurrentFile_0_1");
    context.popOnFailure();
    return null;
  }
}