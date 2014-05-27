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

@SuppressWarnings("all") final class pp_sdf_string_0_0_override extends pp_sdf_string_0_0 
{ 
  private static final pp_sdf_string_0_0 proceed = new pp_sdf_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail75651:
    { 
      if(true)
        break Fail75651;
      if(true)
        return term;
    }
    context.push("pp_sdf_string_0_0");
    context.popOnFailure();
    return null;
  }

  @Override public String getName()
  { 
    return "pp_sdf_string_0_0";
  }
}