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

@SuppressWarnings("all") final class lifted7025 extends Strategy 
{ 
  TermReference z_4857;

  TermReference a_4858;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23876:
    { 
      term = aux_$No$Analysis_0_2.instance.invoke(context, term, z_4857.value, a_4858.value);
      if(term == null)
        break Fail23876;
      if(true)
        return term;
    }
    return null;
  }
}