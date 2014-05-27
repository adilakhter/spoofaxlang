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

@SuppressWarnings("all") public class fold_$Declaration_1_0 extends Strategy 
{ 
  public static fold_$Declaration_1_0 instance = new fold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_92104)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Declaration_1_0");
    Fail76279:
    { 
      IStrategoTerm y_92103 = null;
      IStrategoTerm c_92104 = null;
      IStrategoTerm e_92104 = null;
      y_92103 = term;
      e_92104 = term;
      Success41849:
      { 
        Fail76280:
        { 
          IStrategoTerm g_92104 = null;
          g_92104 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_92104, trans.const15522, y_92103);
          if(term == null)
            break Fail76280;
          if(true)
            break Success41849;
        }
        term = trans.constNil11;
      }
      c_92104 = term;
      term = e_92104;
      term = termFactory.makeTuple(c_92104, term);
      term = b_92104.invoke(context, term, lifted21642.instance);
      if(term == null)
        break Fail76279;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}