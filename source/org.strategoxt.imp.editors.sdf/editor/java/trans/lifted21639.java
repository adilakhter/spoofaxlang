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

@SuppressWarnings("all") final class lifted21639 extends Strategy 
{ 
  TermReference z_92101;

  TermReference a_92102;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76340:
    { 
      term = aux_$Declaration$File_0_2.instance.invoke(context, term, z_92101.value, a_92102.value);
      if(term == null)
        break Fail76340;
      if(true)
        return term;
    }
    return null;
  }
}