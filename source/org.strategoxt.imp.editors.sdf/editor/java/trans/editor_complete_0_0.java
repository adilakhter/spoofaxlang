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

@SuppressWarnings("all") public class editor_complete_0_0 extends Strategy 
{ 
  public static editor_complete_0_0 instance = new editor_complete_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_complete_0_0");
    Fail75908:
    { 
      IStrategoTerm f_92056 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail75908;
      f_92056 = term.getSubterm(0);
      term = f_92056;
      Success41629:
      { 
        Fail75909:
        { 
          term = propose_completion_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75909;
          if(true)
            break Success41629;
        }
        term = trans.constNil11;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}