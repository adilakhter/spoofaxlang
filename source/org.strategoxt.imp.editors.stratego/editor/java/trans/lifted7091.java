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

@SuppressWarnings("all") final class lifted7091 extends Strategy 
{ 
  TermReference z_4888;

  TermReference a_4889;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23810:
    { 
      term = aux_$Outer$Cookie_0_2.instance.invoke(context, term, z_4888.value, a_4889.value);
      if(term == null)
        break Fail23810;
      if(true)
        return term;
    }
    return null;
  }
}