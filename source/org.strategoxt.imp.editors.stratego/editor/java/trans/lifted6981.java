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

@SuppressWarnings("all") final class lifted6981 extends Strategy 
{ 
  TermReference h_4836;

  TermReference i_4836;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23920:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, h_4836.value);
      if(term == null)
        break Fail23920;
      if(i_4836.value == null)
        i_4836.value = term;
      else
        if(i_4836.value != term && !i_4836.value.match(term))
          break Fail23920;
      if(true)
        return term;
    }
    return null;
  }
}