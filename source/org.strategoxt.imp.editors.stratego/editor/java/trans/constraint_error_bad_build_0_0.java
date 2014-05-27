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

@SuppressWarnings("all") public class constraint_error_bad_build_0_0 extends Strategy 
{ 
  public static constraint_error_bad_build_0_0 instance = new constraint_error_bad_build_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("constraint_error_bad_build_0_0");
    Fail21833:
    { 
      IStrategoTerm u_4266 = null;
      term = collect_1_0.instance.invoke(context, term, lifted6666.instance);
      if(term == null)
        break Fail21833;
      term = filter_1_0.instance.invoke(context, term, lifted6667.instance);
      if(term == null)
        break Fail21833;
      term = map_1_0.instance.invoke(context, term, lifted6668.instance);
      if(term == null)
        break Fail21833;
      u_4266 = term;
      IStrategoTerm term11936 = term;
      Success11816:
      { 
        Fail21834:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail21834;
          { 
            if(true)
              break Fail21833;
            if(true)
              break Success11816;
          }
        }
        term = term11936;
      }
      term = u_4266;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}