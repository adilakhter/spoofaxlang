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

@SuppressWarnings("all") final class lifted6774 extends Strategy 
{ 
  Strategy d_4737;

  Strategy e_4737;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24150:
    { 
      term = parse_affected_ast_or_none_2_0.instance.invoke(context, term, d_4737, e_4737);
      if(term == null)
        break Fail24150;
      if(true)
        return term;
    }
    return null;
  }
}