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

@SuppressWarnings("all") public class chain_$Declaration_0_0 extends Strategy 
{ 
  public static chain_$Declaration_0_0 instance = new chain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Declaration_0_0");
    Fail76283:
    { 
      IStrategoTerm v_92104 = null;
      IStrategoTerm y_92104 = null;
      IStrategoTerm a_92105 = null;
      v_92104 = term;
      a_92105 = term;
      Success41851:
      { 
        Fail76284:
        { 
          IStrategoTerm c_92105 = null;
          c_92105 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_92105, trans.const15522, v_92104);
          if(term == null)
            break Fail76284;
          if(true)
            break Success41851;
        }
        term = trans.constNil11;
      }
      y_92104 = term;
      term = a_92105;
      term = termFactory.makeTuple(y_92104, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21644.instance);
      if(term == null)
        break Fail76283;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}