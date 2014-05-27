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

@SuppressWarnings("all") public class constraint_error_bad_match_0_0 extends Strategy 
{ 
  public static constraint_error_bad_match_0_0 instance = new constraint_error_bad_match_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("constraint_error_bad_match_0_0");
    Fail21835:
    { 
      IStrategoTerm z_4266 = null;
      term = collect_1_0.instance.invoke(context, term, lifted6669.instance);
      if(term == null)
        break Fail21835;
      term = filter_1_0.instance.invoke(context, term, lifted6670.instance);
      if(term == null)
        break Fail21835;
      term = map_1_0.instance.invoke(context, term, lifted6671.instance);
      if(term == null)
        break Fail21835;
      z_4266 = term;
      IStrategoTerm term11944 = term;
      Success11817:
      { 
        Fail21836:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail21836;
          { 
            if(true)
              break Fail21835;
            if(true)
              break Success11817;
          }
        }
        term = term11944;
      }
      term = z_4266;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}