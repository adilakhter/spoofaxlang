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

@SuppressWarnings("all") final class lifted6944 extends Strategy 
{ 
  TermReference b_4821;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail23944:
    { 
      IStrategoTerm d_4821 = null;
      IStrategoTerm f_4821 = null;
      f_4821 = term;
      if(b_4821.value == null)
        break Fail23944;
      term = base_filename_0_0.instance.invoke(context, b_4821.value);
      if(term == null)
        break Fail23944;
      d_4821 = term;
      term = f_4821;
      term = $Current$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23944;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23944;
      term = remove_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23944;
      term = termFactory.makeTuple(d_4821, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23944;
      if(true)
        return term;
    }
    return null;
  }
}