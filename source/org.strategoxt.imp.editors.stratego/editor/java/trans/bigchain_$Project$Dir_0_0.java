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

@SuppressWarnings("all") public class bigchain_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Project$Dir_0_0 instance = new bigchain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ProjectDir_0_0");
    Fail23388:
    { 
      IStrategoTerm y_4830 = null;
      IStrategoTerm a_4831 = null;
      a_4831 = term;
      Success12575:
      { 
        Fail23389:
        { 
          IStrategoTerm b_4831 = null;
          IStrategoTerm d_4831 = null;
          IStrategoTerm e_4831 = null;
          d_4831 = term;
          b_4831 = trans.const4475;
          e_4831 = d_4831;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4831, b_4831, trans.constCons2047);
          if(term == null)
            break Fail23389;
          if(true)
            break Success12575;
        }
        term = trans.constNil4;
      }
      y_4830 = term;
      term = a_4831;
      term = termFactory.makeTuple(y_4830, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6969.instance);
      if(term == null)
        break Fail23388;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}