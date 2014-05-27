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

@SuppressWarnings("all") public class reject_ast_from_cache_2_0 extends Strategy 
{ 
  public static reject_ast_from_cache_2_0 instance = new reject_ast_from_cache_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4737, Strategy q_4737)
  { 
    context.push("reject_ast_from_cache_2_0");
    Fail22828:
    { 
      IStrategoTerm n_4737 = null;
      n_4737 = term;
      term = q_4737.invoke(context, n_4737);
      if(term == null)
        break Fail22828;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22828;
      IStrategoTerm term12198 = term;
      Success12165:
      { 
        Fail22829:
        { 
          term = p_4737.invoke(context, term);
          if(term == null)
            break Fail22829;
          { 
            if(true)
              break Fail22828;
            if(true)
              break Success12165;
          }
        }
        term = term12198;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}