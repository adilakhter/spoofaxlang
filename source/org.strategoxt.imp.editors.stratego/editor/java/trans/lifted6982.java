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

@SuppressWarnings("all") final class lifted6982 extends Strategy 
{ 
  TermReference r_4836;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23919:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, r_4836.value);
      if(term == null)
        break Fail23919;
      if(true)
        return term;
    }
    return null;
  }
}