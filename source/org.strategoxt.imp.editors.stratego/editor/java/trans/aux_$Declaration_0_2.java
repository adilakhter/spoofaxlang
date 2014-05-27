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

@SuppressWarnings("all") public class aux_$Declaration_0_2 extends Strategy 
{ 
  public static aux_$Declaration_0_2 instance = new aux_$Declaration_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4314, IStrategoTerm k_4314)
  { 
    Fail22132:
    { 
      IStrategoTerm l_4314 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22132;
      IStrategoTerm arg7932 = term.getSubterm(0);
      if(arg7932.getTermType() != IStrategoTerm.STRING || !"-415135".equals(((IStrategoString)arg7932).stringValue()))
        break Fail22132;
      l_4314 = term.getSubterm(1);
      term = l_4314;
      if(true)
        return term;
    }
    context.push("aux_Declaration_0_2");
    context.popOnFailure();
    return null;
  }
}