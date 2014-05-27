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

@SuppressWarnings("all") final class lifted21520 extends Strategy 
{ 
  TermReference r_92026;

  TermReference s_92026;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76502:
    { 
      term = sym_to_template_elem_0_2.instance.invoke(context, term, r_92026.value, s_92026.value);
      if(term == null)
        break Fail76502;
      if(true)
        return term;
    }
    return null;
  }
}