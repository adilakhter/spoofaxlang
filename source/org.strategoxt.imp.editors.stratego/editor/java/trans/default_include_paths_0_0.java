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

@SuppressWarnings("all") public class default_include_paths_0_0 extends Strategy 
{ 
  public static default_include_paths_0_0 instance = new default_include_paths_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_include_paths_0_0");
    Fail23121:
    { 
      term = map_1_0.instance.invoke(context, trans.constCons2101, lifted6862.instance);
      if(term == null)
        break Fail23121;
      IStrategoTerm term12449 = term;
      Success12364:
      { 
        Fail23122:
        { 
          IStrategoTerm n_4785 = null;
          n_4785 = term;
          term = $Source$Dir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23122;
          term = n_4785;
          { 
            IStrategoTerm u_4785 = null;
            IStrategoTerm w_4785 = null;
            IStrategoTerm v_4785 = null;
            IStrategoTerm x_4785 = null;
            w_4785 = term;
            term = $Source$Dir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23121;
            u_4785 = term;
            term = w_4785;
            x_4785 = w_4785;
            v_4785 = term;
            term = x_4785;
            IStrategoList list197;
            list197 = checkListTail(v_4785);
            if(list197 == null)
              break Fail23121;
            term = (IStrategoTerm)termFactory.makeListCons(u_4785, list197);
            if(true)
              break Success12364;
          }
        }
        term = term12449;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}