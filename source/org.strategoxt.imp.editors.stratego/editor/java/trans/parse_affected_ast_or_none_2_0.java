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

@SuppressWarnings("all") public class parse_affected_ast_or_none_2_0 extends Strategy 
{ 
  public static parse_affected_ast_or_none_2_0 instance = new parse_affected_ast_or_none_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4737, Strategy l_4737)
  { 
    context.push("parse_affected_ast_or_none_2_0");
    Fail22826:
    { 
      IStrategoTerm i_4737 = null;
      i_4737 = term;
      term = i_4737;
      IStrategoTerm term12197 = term;
      Success12164:
      { 
        Fail22827:
        { 
          term = reject_ast_from_cache_2_0.instance.invoke(context, term, k_4737, l_4737);
          if(term == null)
            break Fail22827;
          if(true)
            break Success12164;
        }
        term = reject_or_get_ast_from_parsing_1_0.instance.invoke(context, term12197, k_4737);
        if(term == null)
          break Fail22826;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}