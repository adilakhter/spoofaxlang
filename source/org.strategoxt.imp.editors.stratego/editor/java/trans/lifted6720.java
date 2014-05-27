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

@SuppressWarnings("all") final class lifted6720 extends Strategy 
{ 
  TermReference e_4287;

  TermReference f_4287;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22434:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, e_4287.value, f_4287.value);
      if(term == null)
        break Fail22434;
      if(true)
        return term;
    }
    return null;
  }
}