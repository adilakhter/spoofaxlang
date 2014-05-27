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
    Fail21645:
    { 
      term = map_1_0.instance.invoke(context, trans.constCons2020, lifted6591.instance);
      if(term == null)
        break Fail21645;
      IStrategoTerm term11740 = term;
      Success11655:
      { 
        Fail21646:
        { 
          IStrategoTerm v_4231 = null;
          v_4231 = term;
          term = $Source$Dir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21646;
          term = v_4231;
          { 
            IStrategoTerm c_4232 = null;
            IStrategoTerm e_4232 = null;
            IStrategoTerm d_4232 = null;
            IStrategoTerm f_4232 = null;
            e_4232 = term;
            term = $Source$Dir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21645;
            c_4232 = term;
            term = e_4232;
            f_4232 = e_4232;
            d_4232 = term;
            term = f_4232;
            IStrategoList list186;
            list186 = checkListTail(d_4232);
            if(list186 == null)
              break Fail21645;
            term = (IStrategoTerm)termFactory.makeListCons(c_4232, list186);
            if(true)
              break Success11655;
          }
        }
        term = term11740;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}