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

@SuppressWarnings("all") final class lifted21596 extends Strategy 
{ 
  public static final lifted21596 instance = new lifted21596();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76383:
    { 
      IStrategoTerm z_92081 = null;
      IStrategoTerm i_92082 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail76383;
      i_92082 = term.getSubterm(0);
      IStrategoTerm arg26197 = term.getSubterm(1);
      z_92081 = arg26197;
      term = aux_$Is$Imported_0_2.instance.invoke(context, i_92082, arg26197, z_92081);
      if(term == null)
        break Fail76383;
      if(true)
        return term;
    }
    return null;
  }
}