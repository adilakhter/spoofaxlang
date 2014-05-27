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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4183, Strategy t_4183)
  { 
    context.push("parse_affected_ast_or_none_2_0");
    Fail21350:
    { 
      IStrategoTerm q_4183 = null;
      q_4183 = term;
      term = q_4183;
      IStrategoTerm term11488 = term;
      Success11455:
      { 
        Fail21351:
        { 
          term = reject_ast_from_cache_2_0.instance.invoke(context, term, s_4183, t_4183);
          if(term == null)
            break Fail21351;
          if(true)
            break Success11455;
        }
        term = reject_or_get_ast_from_parsing_1_0.instance.invoke(context, term11488, s_4183);
        if(term == null)
          break Fail21350;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}