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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4886)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_OuterCookie_1_0");
    Fail23721:
    { 
      IStrategoTerm q_4886 = null;
      IStrategoTerm u_4886 = null;
      IStrategoTerm w_4886 = null;
      q_4886 = term;
      w_4886 = term;
      Success12681:
      { 
        Fail23722:
        { 
          IStrategoTerm y_4886 = null;
          y_4886 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4886, trans.const4604, q_4886);
          if(term == null)
            break Fail23722;
          if(true)
            break Success12681;
        }
        term = trans.constNil4;
      }
      u_4886 = term;
      term = w_4886;
      term = termFactory.makeTuple(u_4886, term);
      term = t_4886.invoke(context, term, lifted7085.instance);
      if(term == null)
        break Fail23721;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}