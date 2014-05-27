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

@SuppressWarnings("all") public class chain_$Usage_0_0 extends Strategy 
{ 
  public static chain_$Usage_0_0 instance = new chain_$Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Usage_0_0");
    Fail76310:
    { 
      IStrategoTerm c_92109 = null;
      IStrategoTerm f_92109 = null;
      IStrategoTerm h_92109 = null;
      c_92109 = term;
      h_92109 = term;
      Success41859:
      { 
        Fail76311:
        { 
          IStrategoTerm j_92109 = null;
          j_92109 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_92109, trans.const15535, c_92109);
          if(term == null)
            break Fail76311;
          if(true)
            break Success41859;
        }
        term = trans.constNil11;
      }
      f_92109 = term;
      term = h_92109;
      term = termFactory.makeTuple(f_92109, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21653.instance);
      if(term == null)
        break Fail76310;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}