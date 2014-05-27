package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Is$Imported_0_2 extends Strategy 
{ 
  public static aux_$Is$Imported_0_2 instance = new aux_$Is$Imported_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_92085, IStrategoTerm b_92085)
  { 
    Fail76163:
    { 
      IStrategoTerm c_92085 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76163;
      IStrategoTerm arg26201 = term.getSubterm(0);
      if(arg26201.getTermType() != IStrategoTerm.STRING || !"-597601".equals(((IStrategoString)arg26201).stringValue()))
        break Fail76163;
      c_92085 = term.getSubterm(1);
      term = c_92085;
      if(true)
        return term;
    }
    context.push("aux_IsImported_0_2");
    context.popOnFailure();
    return null;
  }
}