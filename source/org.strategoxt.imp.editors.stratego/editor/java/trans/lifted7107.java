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

@SuppressWarnings("all") final class lifted7107 extends Strategy 
{ 
  TermReference t_4896;

  TermReference u_4896;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23794:
    { 
      term = aux_$Is$No$Conflict_0_2.instance.invoke(context, term, t_4896.value, u_4896.value);
      if(term == null)
        break Fail23794;
      if(true)
        return term;
    }
    return null;
  }
}