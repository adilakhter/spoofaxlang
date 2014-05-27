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

@SuppressWarnings("all") final class lifted6863 extends Strategy 
{ 
  public static final lifted6863 instance = new lifted6863();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24047:
    { 
      term = java_interpolate_environment_variables_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24047;
      term = try_1_0.instance.invoke(context, term, expand_relative_path_0_0.instance);
      if(term == null)
        break Fail24047;
      if(true)
        return term;
    }
    return null;
  }
}