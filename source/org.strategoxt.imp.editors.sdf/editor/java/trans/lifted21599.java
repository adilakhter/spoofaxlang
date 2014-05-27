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

@SuppressWarnings("all") final class lifted21599 extends Strategy 
{ 
  public static final lifted21599 instance = new lifted21599();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76380:
    { 
      IStrategoTerm i_92083 = null;
      IStrategoTerm q_92083 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76380;
      q_92083 = term.getSubterm(0);
      IStrategoTerm arg26200 = term.getSubterm(1);
      i_92083 = arg26200;
      term = aux_$Is$Imported_0_2.instance.invoke(context, q_92083, arg26200, i_92083);
      if(term == null)
        break Fail76380;
      if(true)
        return term;
    }
    return null;
  }
}