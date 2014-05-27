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

@SuppressWarnings("all") final class lifted6929 extends Strategy 
{ 
  TermReference z_4809;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail23976:
    { 
      IStrategoTerm b_4810 = null;
      IStrategoTerm e_4810 = null;
      IStrategoTerm f_4810 = null;
      b_4810 = term;
      f_4810 = term;
      term = int_to_string_0_0.instance.invoke(context, b_4810);
      if(term == null)
        break Fail23976;
      e_4810 = term;
      term = f_4810;
      if(z_4809.value == null)
        break Fail23976;
      term = termFactory.makeTuple(z_4809.value, e_4810);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23976;
      if(true)
        return term;
    }
    return null;
  }
}