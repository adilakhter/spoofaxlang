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

@SuppressWarnings("all") final class lifted21635 extends Strategy 
{ 
  public static final lifted21635 instance = new lifted21635();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76344:
    { 
      IStrategoTerm t_92100 = null;
      IStrategoTerm b_92101 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76344;
      b_92101 = term.getSubterm(0);
      IStrategoTerm arg26219 = term.getSubterm(1);
      t_92100 = arg26219;
      term = aux_$Declaration$File_0_2.instance.invoke(context, b_92101, arg26219, t_92100);
      if(term == null)
        break Fail76344;
      if(true)
        return term;
    }
    return null;
  }
}