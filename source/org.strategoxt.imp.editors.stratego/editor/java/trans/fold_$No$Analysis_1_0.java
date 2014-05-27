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

@SuppressWarnings("all") public class fold_$No$Analysis_1_0 extends Strategy 
{ 
  public static fold_$No$Analysis_1_0 instance = new fold_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4856)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_NoAnalysis_1_0");
    Fail23542:
    { 
      IStrategoTerm q_4856 = null;
      IStrategoTerm s_4856 = null;
      s_4856 = term;
      Success12616:
      { 
        Fail23543:
        { 
          IStrategoTerm t_4856 = null;
          IStrategoTerm v_4856 = null;
          IStrategoTerm w_4856 = null;
          v_4856 = term;
          t_4856 = trans.const4559;
          w_4856 = v_4856;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4856, t_4856, trans.constCons2047);
          if(term == null)
            break Fail23543;
          if(true)
            break Success12616;
        }
        term = trans.constNil4;
      }
      q_4856 = term;
      term = s_4856;
      term = termFactory.makeTuple(q_4856, term);
      term = p_4856.invoke(context, term, lifted7022.instance);
      if(term == null)
        break Fail23542;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}