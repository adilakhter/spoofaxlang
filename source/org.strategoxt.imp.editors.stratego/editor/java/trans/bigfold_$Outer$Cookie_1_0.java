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

@SuppressWarnings("all") public class bigfold_$Outer$Cookie_1_0 extends Strategy 
{ 
  public static bigfold_$Outer$Cookie_1_0 instance = new bigfold_$Outer$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_OuterCookie_1_0");
    Fail22245:
    { 
      IStrategoTerm y_4332 = null;
      IStrategoTerm c_4333 = null;
      IStrategoTerm e_4333 = null;
      y_4332 = term;
      e_4333 = term;
      Success11972:
      { 
        Fail22246:
        { 
          IStrategoTerm g_4333 = null;
          g_4333 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4333, trans.const4394, y_4332);
          if(term == null)
            break Fail22246;
          if(true)
            break Success11972;
        }
        term = trans.constNil3;
      }
      c_4333 = term;
      term = e_4333;
      term = termFactory.makeTuple(c_4333, term);
      term = b_4333.invoke(context, term, lifted6814.instance);
      if(term == null)
        break Fail22245;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}