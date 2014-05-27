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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4868, IStrategoTerm c_4868)
  { 
    Fail23608:
    { 
      IStrategoTerm d_4868 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23608;
      IStrategoTerm arg8399 = term.getSubterm(0);
      if(arg8399.getTermType() != IStrategoTerm.STRING || !"-415135".equals(((IStrategoString)arg8399).stringValue()))
        break Fail23608;
      d_4868 = term.getSubterm(1);
      term = d_4868;
      if(true)
        return term;
    }
    context.push("aux_Declaration_0_2");
    context.popOnFailure();
    return null;
  }
}