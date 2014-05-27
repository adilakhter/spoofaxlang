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

@SuppressWarnings("all") public class bigfold_$Project$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Project$Dir_1_0 instance = new bigfold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4830)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ProjectDir_1_0");
    Fail23384:
    { 
      IStrategoTerm b_4830 = null;
      IStrategoTerm d_4830 = null;
      d_4830 = term;
      Success12573:
      { 
        Fail23385:
        { 
          IStrategoTerm e_4830 = null;
          IStrategoTerm g_4830 = null;
          IStrategoTerm h_4830 = null;
          g_4830 = term;
          e_4830 = trans.const4475;
          h_4830 = g_4830;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4830, e_4830, trans.constCons2047);
          if(term == null)
            break Fail23385;
          if(true)
            break Success12573;
        }
        term = trans.constNil4;
      }
      b_4830 = term;
      term = d_4830;
      term = termFactory.makeTuple(b_4830, term);
      term = a_4830.invoke(context, term, lifted6967.instance);
      if(term == null)
        break Fail23384;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}