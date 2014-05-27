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

@SuppressWarnings("all") public class bigchain_$Declaration_0_0 extends Strategy 
{ 
  public static bigchain_$Declaration_0_0 instance = new bigchain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Declaration_0_0");
    Fail23596:
    { 
      IStrategoTerm x_4865 = null;
      IStrategoTerm a_4866 = null;
      IStrategoTerm c_4866 = null;
      x_4865 = term;
      c_4866 = term;
      Success12631:
      { 
        Fail23597:
        { 
          IStrategoTerm e_4866 = null;
          e_4866 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4866, trans.const4570, x_4865);
          if(term == null)
            break Fail23597;
          if(true)
            break Success12631;
        }
        term = trans.constNil4;
      }
      a_4866 = term;
      term = c_4866;
      term = termFactory.makeTuple(a_4866, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7041.instance);
      if(term == null)
        break Fail23596;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}